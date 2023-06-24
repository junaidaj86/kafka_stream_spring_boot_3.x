package learning.kafka.spring.boot.stream.topology;

import learning.kafka.spring.boot.stream.model.Order;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.Produced;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.serializer.JsonSerde;
import org.springframework.stereotype.Component;

@Component
public class KafkaStreamTopology {

  public static String SOURCE = "source";
  public static String DESTINATION_OR_SINK = "destination";

  @Autowired
  public void process(StreamsBuilder streamsBuilder) {
    var jsonSerde = new JsonSerde<>(Order.class);
    var streams = streamsBuilder.stream(SOURCE, Consumed.with(Serdes.String(), jsonSerde));

    var modifiedStream =
        streams.mapValues(
            (key, value) -> {
              value.getAddress().setCity(value.getAddress().getCity().toUpperCase());
              return value;
            });
    modifiedStream.to(DESTINATION_OR_SINK, Produced.with(Serdes.String(), jsonSerde));
    var modifiedStream1 =
        streams.mapValues(
            (key, value) -> {
              value.getAddress().setCity("Pandora");
              return value;
            });
    modifiedStream1.to(DESTINATION_OR_SINK, Produced.with(Serdes.String(), jsonSerde));
  }
}
