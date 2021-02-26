package typingsSlinky.typeorm

import typingsSlinky.typeorm.persistenceSubjectMod.Subject
import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMaterializedPathSubjectExecutorMod {
  
  @JSImport("typeorm/persistence/tree/MaterializedPathSubjectExecutor", "MaterializedPathSubjectExecutor")
  @js.native
  class MaterializedPathSubjectExecutor protected () extends StObject {
    def this(queryRunner: QueryRunner) = this()
    
    /**
      * Executes operations when subject is being inserted.
      */
    def insert(subject: Subject): js.Promise[Unit] = js.native
    
    var queryRunner: QueryRunner = js.native
  }
}
