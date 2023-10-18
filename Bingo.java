package org.startsteps.week7.Streams_Exercises;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Bingo {

        public static void main(String[] args) {
            Stream<String> streamB = generateLabels('B', 1, 15);
            Stream<String> streamI = generateLabels('I', 16, 30);
            Stream<String> streamN = generateLabels('N', 31, 45);
            Stream<String> streamG = generateLabels('G', 46, 60);
            Stream<String> streamO = generateLabels('O', 61, 75);

            Stream<String> concatenatedStream = Stream.concat(Stream.concat(Stream.concat
                    (Stream.concat(streamB, streamI), streamN), streamG), streamO);

            concatenatedStream.forEach(label -> System.out.print(label + ", "));
        }

        private static Stream<String> generateLabels(char letter, int start, int end) {
            return IntStream.rangeClosed(start, end)
                    .mapToObj(number -> String.format("%c%d", letter, number));
        }
}


