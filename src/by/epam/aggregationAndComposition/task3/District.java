package by.epam.aggregationAndComposition.task3;

/* Создать объект класса Государство, используя классы
   Область, Район, Город. Методы: вывести на консоль
   столицу, количество областей, площадь, областные центры. */


import java.util.Objects;

public class District {

    private String name;

    public District(String name) {
        this.name = name;
    }

    public String getDistrictName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        District other = (District) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "District [name=" + name + "]";
    }
}
