package Module2.Lessons9;

class Programmer {
    private final String name;
    private int age;
    private Experience experience;

    Programmer(String name, int age) {
        this.name = name;
        this.age = age;
        experience = new Experience();
    }

    public static class Stack {
        private String threatLevel;
        private String[] skills;

        Stack(String... skills) {
            this.skills = skills;
            chooseThreatLever(skills.length);
        }

        private void chooseThreatLever(int range) {
            if (range == 0) {
                threatLevel = "Is absent";
            } else if (range >= 1 && range <= 4) {
                threatLevel = "Weak";
            } else if (range >= 5 && range <= 8) {
                threatLevel = "Serious, establish surveillance!";
            } else if (range >= 8 && range <= 12) {
                threatLevel = "Dangerous, send Smith to him!";
            } else {
                threatLevel = "He is the chosen one...";
            }

        }

    }


    private class Experience {
        private int summary;

        Experience() {
            summary = (age - 20) / 2 < 0 ? 0 : (age - 20) / 2;
        }
    }

    public String analysis(Stack stack) {
        return String.format("In the matrix there is a new programmer named %s, he is %d years old.\n" +
                "Approximate work experience - %d years.\n" +
                "Threat level: %s", name, age, experience.summary, stack.threatLevel);
    }




    public static class Test_lessons9 {
        public static void main(String[] args) {
            Programmer programmer = new Programmer("Steve", 20);
            Stack stack = new Stack("SQL", "Java", "Postsql");
            System.out.println(programmer.analysis(stack));

        }
    }
}
