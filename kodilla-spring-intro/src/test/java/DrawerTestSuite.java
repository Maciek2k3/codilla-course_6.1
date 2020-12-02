import com.kodilla.spring.intro.shape.Circle;
import com.kodilla.spring.intro.shape.Drawer;
import com.kodilla.spring.intro.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDoDrawingCircle(){
        Circle circle=new Circle();
        Drawer drawer=new Drawer(circle);
        String result= drawer.doDrawing();
        Assert.assertEquals(result,"This is a circle");
    }
    @Test
    public void testDoDrawingTriangle(){
        Triangle triangle=new Triangle();
        Drawer drawer=new Drawer(triangle);
        String result=drawer.doDrawing();
        Assert.assertEquals(result,"This is a triangle");
    }

}
