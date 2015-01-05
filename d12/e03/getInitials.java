class Person {
    String fullName;

    public Person(String name) {
        fullName = name;
    }

    public String getInitials() {
        String result = "";
        String[] words = this.fullName.split(" ");

        for (int i = 0; i < words.length; i++) {
            String nextInitial = "" + words[i].charAt(0);
            result = result + nextInitial.toUpperCase();
        }
        return result;
    }
}

