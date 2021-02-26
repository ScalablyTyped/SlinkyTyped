package typingsSlinky.typeorm

import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import typingsSlinky.typeorm.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nestedSetSubjectExecutorMod {
  
  @JSImport("typeorm/browser/persistence/tree/NestedSetSubjectExecutor", "NestedSetSubjectExecutor")
  @js.native
  class NestedSetSubjectExecutor protected () extends StObject {
    def this(queryRunner: QueryRunner) = this()
    
    /**
      * Gets escaped table name with schema name if SqlServer or Postgres driver used with custom
      * schema name, otherwise returns escaped table name.
      */
    /* protected */ def getTableName(tablePath: String): String = js.native
    
    /**
      * Executes operations when subject is being inserted.
      */
    def insert(subject: Subject): js.Promise[Unit] = js.native
    
    var queryRunner: QueryRunner = js.native
  }
}
