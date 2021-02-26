package typingsSlinky.typeorm

import typingsSlinky.typeorm.columnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.insertResultMod.InsertResult
import typingsSlinky.typeorm.objectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.queryExpressionMapMod.QueryExpressionMap
import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import typingsSlinky.typeorm.updateResultMod.UpdateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object returningResultsEntityUpdatorMod {
  
  @JSImport("typeorm/browser/query-builder/ReturningResultsEntityUpdator", "ReturningResultsEntityUpdator")
  @js.native
  class ReturningResultsEntityUpdator protected () extends StObject {
    def this(queryRunner: QueryRunner, expressionMap: QueryExpressionMap) = this()
    
    var expressionMap: QueryExpressionMap = js.native
    
    /**
      * Columns we need to be returned from the database when we insert entity.
      */
    def getInsertionReturningColumns(): js.Array[ColumnMetadata] = js.native
    
    /**
      * Columns we need to be returned from the database when we update entity.
      */
    def getUpdationReturningColumns(): js.Array[ColumnMetadata] = js.native
    
    /**
      * Updates entities with a special columns after insertion query execution.
      */
    def insert(insertResult: InsertResult, entities: js.Array[ObjectLiteral]): js.Promise[Unit] = js.native
    
    var queryRunner: QueryRunner = js.native
    
    /**
      * Updates entities with a special columns after updation query execution.
      */
    def update(updateResult: UpdateResult, entities: js.Array[ObjectLiteral]): js.Promise[Unit] = js.native
  }
}
