package programacionfuncional;

import java.util.ArrayList;
import java.util.List;

public class ejercicio1 {

	public static void main(String[] args) {
		
		
		//FORMA IMPERATIVA
        List<Integer> numbers = new ArrayList<>();
        int count = 0;
        Long count2;
        
        numbers.add(18);
        numbers.add(6);
        numbers.add(4);
        numbers.add(15);
        numbers.add(55);
        numbers.add(78);
        numbers.add(12);
        numbers.add(9);
        numbers.add(8);
        
        for(int num:numbers){
            if(num>10){
                count++;
            }
        }
        System.out.println("Contador forma imperativa: " + count);
        
        
        //FORMA FUNCIONAL
        count2 = numbers.stream().filter(num -> num > 10).count();
        System.out.println("Contador forma funcional: " + count2);
    }

	}

	