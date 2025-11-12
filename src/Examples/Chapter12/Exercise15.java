package Examples.Chapter12;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise15 {
    public static void main(String[] args) {
        var cats = Stream.of("leopard", "lynx", "ocelot", "puma")
                .parallel();
        var bears = Stream.of("panda", "grizzly", "polar").parallel();
        var data = Stream.of(cats, bears).flatMap(s -> s)
                .collect(Collectors.groupingByConcurrent(
                        s -> (Boolean) !s.startsWith("p")));
        System.out.println(data.get(Optional.of(false)).size()
                + " " + data.get(Optional.of(true)).size());
    }
}
