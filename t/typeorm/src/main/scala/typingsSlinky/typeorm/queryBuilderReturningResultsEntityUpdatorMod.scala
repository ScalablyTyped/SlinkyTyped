package typingsSlinky.typeorm

import typingsSlinky.typeorm.commonObjectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typingsSlinky.typeorm.resultInsertResultMod.InsertResult
import typingsSlinky.typeorm.resultUpdateResultMod.UpdateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-builder/ReturningResultsEntityUpdator", JSImport.Namespace)
@js.native
object queryBuilderReturningResultsEntityUpdatorMod extends js.Object {
  
  @js.native
  class ReturningResultsEntityUpdator protected () extends js.Object {
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
