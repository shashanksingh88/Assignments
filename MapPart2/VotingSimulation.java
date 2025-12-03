
import java.util.*;

public class VotingSimulation {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        // Candidates (ensure at least 3)
        List<String> candidates = List.of("Alice", "Bob", "Charlie");

        // Initialize counts (optional)
        for (String c : candidates) votes.put(c, 0);

        // Simulate 10 votes (randomly for demo) — you can replace with specific sequence
        String[] simulatedVotes = {
            "Alice", "Bob", "Alice", "Charlie", "Bob",
            "Bob", "Alice", "Charlie", "Alice", "Bob"
        };

        for (String v : simulatedVotes) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }

        // Print totals
        System.out.println("Vote totals:");
        votes.forEach((k,v) -> System.out.println(k + " : " + v));

        // Find highest votes (handle ties)
        int max = Collections.max(votes.values());
        List<String> winners = new ArrayList<>();
        for (var e : votes.entrySet()) {
            if (e.getValue() == max) winners.add(e.getKey());
        }

        if (winners.size() == 1) {
            System.out.println("\nWinner: " + winners.get(0) + " (" + max + " votes)");
        } else {
            System.out.println("\nTie between: " + String.join(", ", winners) + " (" + max + " votes each)");
        }
    }
}

