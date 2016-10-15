package com.didispace;

import java.util.Arrays;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import javafx.scene.Parent;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	
    	//runMethod(args);
    	
    	//runMethod2(args);
    	
    	runMethod3(args);
    	
    	//runMethod4(args);
    	
      }
    
    
      //启动方式一 SpringApplication
      //SpringApplication 类是启动 Spring Boot 应用的入口类，你可以创建一个包含 main() 方法的类，来运行 SpringApplication.run 这个静态方法
	  public static void runMethod(String[] args){
	    	SpringApplication.run(Application.class, args); 
	  }
    
    
      //启动方式二  new SpringApplication
  	  //如果默认的SpringApplication不符合你的口味， 你可以创建一个本地的实例并自定义它。 
      //通过在classpath下添加一个banner.txt或设置banner.location来指定相应的文件可以改变启动过程中打印的banner。 
      public static void runMethod2(String[] args){   	
      	  SpringApplication application = new SpringApplication(Application.class);  
          application.setShowBanner(false);  //关闭banner，
          application.run(args); 
        
      }
    
    
    //启动方式三   返回一个ApplicationContext
    public static void runMethod3(String[] args){
        ApplicationContext context = SpringApplication.run(Application.class,args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String beanName : beanNames) {
            System.out.println("* " + beanName);
        }
      
    }
    
   
    //启动方式四  new SpringApplicationBuilder()
    @SuppressWarnings("deprecation")
	public static void runMethod4(String[] args){
    	new SpringApplicationBuilder()
    	.showBanner(false)
        .sources(Parent.class)
        .child(Application.class)
        .run(args);  
    }
    
}