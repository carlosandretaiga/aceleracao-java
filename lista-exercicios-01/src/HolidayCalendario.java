import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Holiday {
    private String date;
    private String name;

    public Holiday(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class HolidayCalendar {
    private Map<String, Holiday> holidays;

    public HolidayCalendar() {
        this.holidays = new HashMap<>();
    }

    public void addHoliday(Holiday holiday) {
        holidays.put(holiday.getDate(), holiday);
    }

    public void printAllHolidays() {
        System.out.println("Lista de Feriados:");
        for (Holiday holiday : holidays.values()) {
            System.out.println(holiday.getDate() + " é " + holiday.getName());
        }
    }

    public void checkHoliday(String date) {
        if (holidays.containsKey(date)) {
            System.out.println("Dia " + date + " é " + holidays.get(date).getName() + "! 🎉");
        } else {
            System.out.println("Dia " + date + " não é feriado 🥲");
        }
    }
}

public class HolidayCalendario {
    public static void main(String[] args) {
        HolidayCalendar calendar = new HolidayCalendar();
        
        // Adiciona feriados ao calendário
        calendar.addHoliday(new Holiday("01/01", "Ano Novo"));
        calendar.addHoliday(new Holiday("25/12", "Natal"));
        // Adicione mais feriados conforme necessário

        // Imprime todos os feriados
        calendar.printAllHolidays();

        // Verifica se uma data específica é feriado
        calendar.checkHoliday("25/12");
        calendar.checkHoliday("15/11");
    }
}
