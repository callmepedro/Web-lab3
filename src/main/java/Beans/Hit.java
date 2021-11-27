package Beans;

import java.io.Serializable;
import java.util.Date;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
public class Hit implements Serializable {
    private double x;
    private double y;
    private double r;
    private String curTime;
    private double execTime;
    private boolean result;

    private Long id;

    public Hit(double x, double y, double r, String curTime, double execTime, boolean result) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.curTime = curTime;
        this.execTime = execTime;
        this.result = result;
    }
}
