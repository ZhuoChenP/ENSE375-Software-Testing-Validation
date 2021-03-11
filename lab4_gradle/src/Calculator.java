
import org.mariuszgromada.math.mxparser.*;
/*I use exparser labrary to create a formula function calculating gravity for different planets with different values of input Mass and Raduis
However, some planets have uncertainties for its mass and reduis, so I use round number for both expected value in test file and return value in Calculator file.
so all numbers are rounded, they may not exact same as wiki or other souces, but they should be very close to it. 
in build.gradle file I add the dependency for mxparser and junit, the inputs and output path.
The project should be built successfully by using gradle build command. and pass all tests. 

*/


public class Calculator {
public Function Gravity=new Function ("Gravity(m2,r) = ([G.]*m2)/r^2");


    public double cal_Earth(){
         Argument m2=new Argument("m2=5.98*(10^24)");
         Argument r=new Argument("r=6.38*(10^6)");
         Expression earth=new Expression("Gravity(m2,r)",Gravity,m2,r);
        return Math.round(earth.calculate());
    }
    public double cal_Mercury(){
        Argument m2=new Argument("m2=3.3*(10^23)");
        Argument r=new Argument("r=2.44*(10^6)");
        Expression Mercury=new Expression("Gravity(m2,r)",Gravity,m2,r);
       return Math.round(Mercury.calculate());
    }
    public double cal_Venus(){
     Argument m2=new Argument("m2=4.8675*(10^24)");
     Argument r=new Argument("r=6.0518*(10^6)");
     Expression Venus=new Expression("Gravity(m2,r)",Gravity,m2,r);
    return Math.round(Venus.calculate());
    }
    public double cal_Moon(){
        Argument m2=new Argument("m2=7.3477*(10^22)");
        Argument r=new Argument("r=1.737*(10^6)");
        Expression Moon=new Expression("Gravity(m2,r)",Gravity,m2,r);
       return Math.round(Moon.calculate());
    }
    public double cal_Mars(){
        Argument m2=new Argument("m2=6.4171*(10^23)");
        Argument r=new Argument("r=3.389*(10^6)");
        Expression Mars=new Expression("Gravity(m2,r)",Gravity,m2,r);
       return Math.round(Mars.calculate());
    }
    public double cal_Jupiter(){
       Argument m2=new Argument("m2=1.898*(10^27)");
       Argument r=new Argument("r=6.9911*(10^7)");
       Expression Jupiter=new Expression("Gravity(m2,r)",Gravity,m2,r);
      return Math.round(Jupiter.calculate());
    }
    public double cal_Saturn(){
    Argument m2=new Argument("m2=5.683*(10^26)");
    Argument r=new Argument("r=5.8232*(10^7)");
    Expression Saturn=new Expression("Gravity(m2,r)",Gravity,m2,r);
    return Math.round(Saturn.calculate());
    }
    public double cal_Uranus(){
    Argument m2=new Argument("m2=8.681*(10^25)");
    Argument r=new Argument("r=2.5362*(10^7)");
    Expression Uranus=new Expression("Gravity(m2,r)",Gravity,m2,r);
    return Math.round(Uranus.calculate());
    }
    public double cal_Neptune(){
        Argument m2=new Argument("m2=1.024*(10^26)");
        Argument r=new Argument("r=2.4641*(10^7)");
        Expression Neptune=new Expression("Gravity(m2,r)",Gravity,m2,r);
        return Math.round(Neptune.calculate());
        }
}