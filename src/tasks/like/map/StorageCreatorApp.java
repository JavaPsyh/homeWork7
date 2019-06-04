package tasks.like.map;

public class StorageCreatorApp {

    public static void main(String[] args) {
        Storage<Integer, String> storage;
        storage = new Storage<>();
        storage.put(42, "theAnswerToTheUltimateQuestionOfLifeTheUniverseAndEverything");
        String value = storage.get(42);
        System.out.println(value);
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < 50; i++) {

            if (i == 42) {
                continue;
            }
            stringBuilder.append(i);
            storage.put(i, stringBuilder.toString());
        }
        for (int i = 0; i < storage.getIndexForNextPut(); i++) {
            System.out.println(storage.get(i));
        }

        Storage<Integer, SomethingElse> storage1 = new Storage<>();

        storage1.put(50, new SomethingElse("50"));

        StringBuilder stringBuilder1 = new StringBuilder("");
        for (int i = 0; i <= 50; i++) {

            if (i == 50) {
                continue;
            }
            stringBuilder1.append(i);
            storage1.put(i, new SomethingElse(stringBuilder1.toString()));
        }
        for (int i = 0; i < storage1.getIndexForNextPut(); i++) {
            System.out.println(storage1.get(i));
        }
        System.out.println();
        System.out.println(storage1.get(50));
        System.out.println();
        Storage<String, Integer> storage2 = new Storage<>();
        storage2.put("Katia", 35);
        storage2.put("Zina", 32);
        storage2.put("Vera", 37);
        storage2.put("Sofia", 18);
        System.out.println(storage2.get("Katia"));
        System.out.println(storage2.get("Sofia"));


    }
}
