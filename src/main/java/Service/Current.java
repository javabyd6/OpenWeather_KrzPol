package Service;

import Service.Condition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Current
{
    Condition condition;
    long last_updated_epoch;
    String last_updated;
    int temp_c;
    double temp_f;
    int is_day;
    double wind_mph;
    double wind_kph;
    int wind_degree;
    String wind_dir;
    int pressure_mb;
    int pressure_in;
    int precip_mm;
    int precip_in;
    int humidity;
    int cloud;
    double feelslike_c;
    double feelslike_f;
    int vis_km;
    int vis_miles;
    int uv;
}
