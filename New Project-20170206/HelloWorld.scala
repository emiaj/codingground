object HelloWorld {
   def main(args: Array[String]) {
       

      println("Hello, world!")
      
      runAppWithProdDependencies();
      runAppWithTestDependencies();
      //runAppWithNoDependenciesSet();
   }
   
   def runAppWithProdDependencies(){
      import ProductionEnvironment._
      
      ProductService.save(new Product(0,"Foo"))
      ProductService.save(new Product(1,"Bar"))
   }
   def runAppWithTestDependencies(){
       import TestEnvironment._
      
      ProductService.save(new Product(0,"Foo"))
      ProductService.save(new Product(1,"Bar"))
   }
   
   /*
   def runAppWithNoDependenciesSet(){
      ProductService.save(new Product(0,"Foo"))
      ProductService.save(new Product(1,"Bar"))
   }
   */
   
}


