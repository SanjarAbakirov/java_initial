public class Main {
    private String name; // поле скрыто

    public String getName() { // доступ через геттер
        return name;
    }

    public void setName(String name) { // валидация в сеттере
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
}