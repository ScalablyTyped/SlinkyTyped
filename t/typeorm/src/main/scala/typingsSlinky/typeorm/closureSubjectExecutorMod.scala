package typingsSlinky.typeorm

import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import typingsSlinky.typeorm.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/persistence/tree/ClosureSubjectExecutor", JSImport.Namespace)
@js.native
object closureSubjectExecutorMod extends js.Object {
  
  @js.native
  class ClosureSubjectExecutor protected () extends js.Object {
    def this(queryRunner: QueryRunner) = this()
    
    /**
      * Gets escaped table name with schema name if SqlServer or Postgres driver used with custom
      * schema name, otherwise returns escaped table name.
      */
    /* protected */ def getTableName(tablePath: String): String = js.native
    
    /**
      * Removes all children of the given subject's entity.
      async deleteChildrenOf(subject: Subject) {
      // const relationValue = subject.metadata.treeParentRelation.getEntityValue(subject.databaseEntity);
      // console.log("relationValue: ", relationValue);
      // this.queryRunner.manager
      //     .createQueryBuilder()
      //     .from(subject.metadata.closureJunctionTable.target, "tree")
      //     .where("tree.");
      }*/
    /**
      * Executes operations when subject is being inserted.
      */
    def insert(subject: Subject): js.Promise[Unit] = js.native
    
    var queryRunner: QueryRunner = js.native
  }
}
