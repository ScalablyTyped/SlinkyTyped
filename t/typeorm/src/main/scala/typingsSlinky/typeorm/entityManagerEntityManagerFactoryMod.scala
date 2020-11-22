package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.entityManagerEntityManagerMod.EntityManager
import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/entity-manager/EntityManagerFactory", JSImport.Namespace)
@js.native
object entityManagerEntityManagerFactoryMod extends js.Object {
  
  @js.native
  class EntityManagerFactory () extends js.Object {
    
    /**
      * Creates a new entity manager depend on a given connection's driver.
      */
    def create(connection: Connection): EntityManager = js.native
    def create(connection: Connection, queryRunner: QueryRunner): EntityManager = js.native
  }
}
