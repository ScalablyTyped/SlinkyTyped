package typingsSlinky.typeorm

import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import typingsSlinky.typeorm.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/persistence/tree/MaterializedPathSubjectExecutor", JSImport.Namespace)
@js.native
object materializedPathSubjectExecutorMod extends js.Object {
  
  @js.native
  class MaterializedPathSubjectExecutor protected () extends js.Object {
    def this(queryRunner: QueryRunner) = this()
    
    /**
      * Executes operations when subject is being inserted.
      */
    def insert(subject: Subject): js.Promise[Unit] = js.native
    
    var queryRunner: QueryRunner = js.native
  }
}
