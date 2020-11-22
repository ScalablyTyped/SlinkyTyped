package typingsSlinky.typeorm

import typingsSlinky.std.Map
import typingsSlinky.typeorm.aliasMod.Alias
import typingsSlinky.typeorm.driverMod.Driver
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.objectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.queryExpressionMapMod.QueryExpressionMap
import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import typingsSlinky.typeorm.relationCountLoadResultMod.RelationCountLoadResult
import typingsSlinky.typeorm.relationIdLoadResultMod.RelationIdLoadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/query-builder/transformer/RawSqlResultsToEntityTransformer", JSImport.Namespace)
@js.native
object rawSqlResultsToEntityTransformerMod extends js.Object {
  
  @js.native
  class RawSqlResultsToEntityTransformer protected () extends js.Object {
    def this(
      expressionMap: QueryExpressionMap,
      driver: Driver,
      rawRelationIdResults: js.Array[RelationIdLoadResult],
      rawRelationCountResults: js.Array[RelationCountLoadResult]
    ) = this()
    def this(
      expressionMap: QueryExpressionMap,
      driver: Driver,
      rawRelationIdResults: js.Array[RelationIdLoadResult],
      rawRelationCountResults: js.Array[RelationCountLoadResult],
      queryRunner: QueryRunner
    ) = this()
    
    var createValueMapFromJoinColumns: js.Any = js.native
    
    var driver: Driver = js.native
    
    var expressionMap: QueryExpressionMap = js.native
    
    var extractEntityPrimaryIds: js.Any = js.native
    
    /**
      * Groups given raw results by ids of given alias.
      */
    /* protected */ def group(rawResults: js.Array[_], alias: Alias): Map[String, js.Array[_]] = js.native
    
    var queryRunner: js.UndefOr[QueryRunner] = js.native
    
    var rawRelationCountResults: js.Array[RelationCountLoadResult] = js.native
    
    var rawRelationIdResults: js.Array[RelationIdLoadResult] = js.native
    
    /**
      * Since db returns a duplicated rows of the data where accuracies of the same object can be duplicated
      * we need to group our result and we must have some unique id (primary key in our case)
      */
    def transform(rawResults: js.Array[_], alias: Alias): js.Array[_] = js.native
    
    /* protected */ def transformColumns(rawResults: js.Array[_], alias: Alias, entity: ObjectLiteral, metadata: EntityMetadata): Boolean = js.native
    
    /**
      * Transforms joined entities in the given raw results by a given alias and stores to the given (parent) entity
      */
    /* protected */ def transformJoins(rawResults: js.Array[_], entity: ObjectLiteral, alias: Alias, metadata: EntityMetadata): Boolean = js.native
    
    /**
      * Transforms set of data results into single entity.
      */
    /* protected */ def transformRawResultsGroup(rawResults: js.Array[_], alias: Alias): js.UndefOr[ObjectLiteral] = js.native
    
    /* protected */ def transformRelationCounts(rawSqlResults: js.Array[_], alias: Alias, entity: ObjectLiteral): Boolean = js.native
    
    /* protected */ def transformRelationIds(rawSqlResults: js.Array[_], alias: Alias, entity: ObjectLiteral, metadata: EntityMetadata): Boolean = js.native
  }
}
