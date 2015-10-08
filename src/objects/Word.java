package objects;

/**
 * Created by piotrek on 10/3/2015.
 */
public class Word implements Comparable<Word> {
    private String name;

    public Word(String name) {
        this.name = name;
    }

    public String getWord() {
        return name;
    }

    public void setWord(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Word{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word name1 = (Word) o;

        return !(name != null ? !name.equals(name1.name) : name1.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public int compareTo(Word o) {
        return o.name.compareTo(this.name);
    }


}
