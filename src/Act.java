import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Act extends Showroom{

    enum TypeOfWork {
        INSPECTION,
        REPAIR
    }

    int act_number, price;
    TypeOfWork work;

    Locale loc = new Locale("ru", "RU");
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);
    String date = dateFormat.format(new Date());

    public Act(int act_number, int vin, CarType type, String brand, String model, TypeOfWork work, String date) {
        super(vin, type, brand, model);
        this.act_number = act_number;
        this.work = work;
        this.date = date;
    }

    public int getAct_number() { return act_number; }

    public void setAct_number(int act_number) { this.act_number = act_number; }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TypeOfWork getWork() {
        return work;
    }

    public void setWork(TypeOfWork work) {
        this.work = work;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
