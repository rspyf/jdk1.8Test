import java.lang.reflect.Array;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {


    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("u1",1);
        map.put("u2",2);
        map.put("u3",3);
        map.forEach((k,v)->{
            System.out.println("key:"+k+"v:"+v);
            if("u2".equals(k)){
                System.out.println("this is u1 value"+v);
            }

        });

        Instant now = Instant.now();
        System.out.println(now.getEpochSecond());

        Instant parse = Instant.parse("2007-12-03T10:15:30.00Z");
        System.out.println(parse.toString());

    }

    @org.junit.Test
    public void t1(){
        int[] arr={5,11,2,33,6};

    }
}
