trait ProductRepository {
    def insert(product:Product)
    def update(product:Product)
    def remove(product:Product)
}

object InmemoryProductRepository extends ProductRepository {
    def insert(product:Product){
        println("InmemoryProductRepository: Inserting product " + product.name)
    }
    def update(product:Product){
        println("InmemoryProductRepository: Updating product " + product.name)
    }
    def remove(product:Product){
        println("InmemoryProductRepository: Removing product " + product.name)
    }
}


object SqlProductRepository extends ProductRepository {
    def insert(product:Product){
        println("SqlProductRepository: Inserting product " + product.name)
    }
    def update(product:Product){
        println("SqlProductRepository: Updating product " + product.name)
    }
    def remove(product:Product){
        println("InmemoryProductRepository: Removing product " + product.name)
    }
}

object ProductionEnvironment {
    implicit val productRepository = SqlProductRepository
}

object TestEnvironment {
    implicit val productRepository = InmemoryProductRepository
}

