package typingsSlinky.typeorm

import typingsSlinky.typeorm.commonEntityTargetMod.EntityTarget
import typingsSlinky.typeorm.commonObjectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.findOptionsFindOperatorMod.FindOperator
import typingsSlinky.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typingsSlinky.typeorm.queryBuilderAliasMod.Alias
import typingsSlinky.typeorm.queryBuilderBracketsMod.Brackets
import typingsSlinky.typeorm.queryBuilderDeleteQueryBuilderMod.DeleteQueryBuilder
import typingsSlinky.typeorm.queryBuilderInsertQueryBuilderMod.InsertQueryBuilder
import typingsSlinky.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import typingsSlinky.typeorm.queryBuilderQueryPartialEntityMod.QueryDeepPartialEntity
import typingsSlinky.typeorm.queryBuilderRelationQueryBuilderMod.RelationQueryBuilder
import typingsSlinky.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import typingsSlinky.typeorm.queryBuilderSoftDeleteQueryBuilderMod.SoftDeleteQueryBuilder
import typingsSlinky.typeorm.queryBuilderUpdateQueryBuilderMod.UpdateQueryBuilder
import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderQueryBuilderMod {
  
  @JSImport("typeorm/query-builder/QueryBuilder", "QueryBuilder")
  @js.native
  abstract class QueryBuilder[Entity] protected () extends StObject {
    /**
      * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
      */
    def this(connection: Connection) = this()
    /**
      * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
      */
    def this(queryBuilder: QueryBuilder[_]) = this()
    def this(connection: Connection, queryRunner: QueryRunner) = this()
    
    /**
      * Gets the main alias string used in this query builder.
      */
    val alias: String = js.native
    
    /**
      * Indicates if listeners and subscribers must be called before and after query execution.
      * Enabled by default.
      */
    def callListeners(enabled: Boolean): this.type = js.native
    
    /**
      * Includes a Query comment in the query builder.  This is helpful for debugging purposes,
      * such as finding a specific query in the database server's logs, or for categorization using
      * an APM product.
      */
    def comment(comment: String): this.type = js.native
    
    /**
      * Gets SQL needs to be inserted into final query.
      */
    /* protected */ def computeFindOperatorExpression(operator: FindOperator[_], aliasPath: String, parameters: js.Array[_]): String = js.native
    
    /**
      * Computes given where argument - transforms to a where string all forms it can take.
      */
    /* protected */ def computeWhereParameter(where: String): String = js.native
    /* protected */ def computeWhereParameter(where: js.Array[ObjectLiteral]): String = js.native
    /* protected */ def computeWhereParameter(where: js.Function1[/* qb */ this.type, String]): String = js.native
    /* protected */ def computeWhereParameter(where: ObjectLiteral): String = js.native
    /* protected */ def computeWhereParameter(where: Brackets): String = js.native
    
    /**
      * Connection on which QueryBuilder was created.
      */
    val connection: Connection = js.native
    
    /* protected */ def createComment(): String = js.native
    
    /* protected */ def createFromAlias(entityTarget: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]): Alias = js.native
    /* protected */ def createFromAlias(
      entityTarget: js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]],
      aliasName: String
    ): Alias = js.native
    /**
      * Specifies FROM which entity's table select/update/delete will be executed.
      * Also sets a main string alias of the selection data.
      */
    /* protected */ def createFromAlias(entityTarget: EntityTarget[_]): Alias = js.native
    /* protected */ def createFromAlias(entityTarget: EntityTarget[_], aliasName: String): Alias = js.native
    
    /**
      * Creates a completely new query builder.
      * Uses same query runner as current QueryBuilder.
      */
    def createQueryBuilder(): this.type = js.native
    
    /**
      * Creates "RETURNING" / "OUTPUT" expression.
      */
    /* protected */ def createReturningExpression(): String = js.native
    
    /**
      * Creates "WHERE" expression.
      */
    /* protected */ def createWhereExpression(): String = js.native
    
    /**
      * Concatenates all added where expressions into one string.
      */
    /* protected */ def createWhereExpressionString(): String = js.native
    
    /**
      * Creates "WHERE" expression and variables for the given "ids".
      */
    /* protected */ def createWhereIdsExpression(ids: js.Any): String = js.native
    /* protected */ def createWhereIdsExpression(ids: js.Array[_]): String = js.native
    
    /**
      * Creates DELETE query.
      */
    def delete(): DeleteQueryBuilder[Entity] = js.native
    
    /**
      * Disables escaping.
      */
    def disableEscaping(): this.type = js.native
    
    /**
      * Escapes table name, column name or alias name using current database's escaping character.
      */
    def escape(name: String): String = js.native
    
    /**
      * Executes sql generated by query builder and returns raw database results.
      */
    def execute(): js.Promise[_] = js.native
    
    /**
      * Contains all properties of the QueryBuilder that needs to be build a final query.
      */
    val expressionMap: QueryExpressionMap = js.native
    
    /**
      * Gets name of the table where insert should be performed.
      */
    /* protected */ def getMainTableName(): String = js.native
    
    /**
      * Gets all parameters.
      */
    def getParameters(): ObjectLiteral = js.native
    
    /**
      * Gets generated sql query without parameters being replaced.
      */
    def getQuery(): String = js.native
    
    /**
      * Gets query to be executed with all parameters used in it.
      */
    def getQueryAndParameters(): js.Tuple2[String, js.Array[_]] = js.native
    
    /**
      * If returning / output cause is set to array of column names,
      * then this method will return all column metadatas of those column names.
      */
    /* protected */ def getReturningColumns(): js.Array[ColumnMetadata] = js.native
    
    /**
      * Gets generated sql that will be executed.
      * Parameters in the query are escaped for the currently used driver.
      */
    def getSql(): String = js.native
    
    /**
      * Gets escaped table name with schema name if SqlServer driver used with custom
      * schema name, otherwise returns escaped table name.
      */
    /* protected */ def getTableName(tablePath: String): String = js.native
    
    /**
      * Checks if given relation exists in the entity.
      * Returns true if relation exists, false otherwise.
      *
      * todo: move this method to manager? or create a shortcut?
      */
    def hasRelation[T](target: EntityTarget[T], relation: String): Boolean = js.native
    /**
      * Checks if given relations exist in the entity.
      * Returns true if relation exists, false otherwise.
      *
      * todo: move this method to manager? or create a shortcut?
      */
    def hasRelation[T](target: EntityTarget[T], relation: js.Array[String]): Boolean = js.native
    
    /**
      * Creates INSERT query.
      */
    def insert(): InsertQueryBuilder[Entity] = js.native
    
    /**
      * Creates a query builder used to execute sql queries inside this query builder.
      */
    /* protected */ def obtainQueryRunner(): QueryRunner = js.native
    
    /**
      * Prints sql to stdout using console.log.
      */
    def printSql(): this.type = js.native
    
    /**
      * Query runner used to execute query builder query.
      */
    var queryRunner: js.UndefOr[QueryRunner] = js.native
    
    /**
      * Sets entity's relation with which this query builder gonna work.
      */
    def relation(propertyPath: String): RelationQueryBuilder[Entity] = js.native
    /**
      * Sets entity's relation with which this query builder gonna work.
      */
    def relation[T](entityTarget: EntityTarget[T], propertyPath: String): RelationQueryBuilder[T] = js.native
    
    /**
      * Replaces all entity's propertyName to name in the given statement.
      */
    /* protected */ def replacePropertyNames(statement: String): String = js.native
    
    def restore(): SoftDeleteQueryBuilder[_] = js.native
    
    /**
      * Creates SELECT query.
      * Replaces all previous selections if they exist.
      */
    def select(): SelectQueryBuilder[Entity] = js.native
    /**
      * Creates SELECT query and selects given data.
      * Replaces all previous selections if they exist.
      */
    def select(selection: String): SelectQueryBuilder[Entity] = js.native
    def select(selection: String, selectionAliasName: String): SelectQueryBuilder[Entity] = js.native
    /**
      * Creates SELECT query and selects given data.
      * Replaces all previous selections if they exist.
      */
    def select(selection: js.Array[String]): SelectQueryBuilder[Entity] = js.native
    
    /**
      * Adds native parameters from the given object.
      */
    def setNativeParameters(parameters: ObjectLiteral): this.type = js.native
    
    /**
      * Sets parameter name and its value.
      */
    def setParameter(key: String, value: js.Any): this.type = js.native
    
    /**
      * Adds all parameters from the given object.
      */
    def setParameters(parameters: ObjectLiteral): this.type = js.native
    
    /**
      * Sets or overrides query builder's QueryRunner.
      */
    def setQueryRunner(queryRunner: QueryRunner): this.type = js.native
    
    def softDelete(): SoftDeleteQueryBuilder[_] = js.native
    
    /**
      * Creates UPDATE query and applies given update values.
      */
    def update(): UpdateQueryBuilder[Entity] = js.native
    /**
      * Creates UPDATE query for the given table name and applies given update values.
      */
    def update(tableName: String): UpdateQueryBuilder[Entity] = js.native
    def update(tableName: String, updateSet: QueryDeepPartialEntity[Entity]): UpdateQueryBuilder[Entity] = js.native
    /**
      * Creates UPDATE query and applies given update values.
      */
    def update(updateSet: QueryDeepPartialEntity[Entity]): UpdateQueryBuilder[Entity] = js.native
    /**
      * Creates UPDATE query for the given entity and applies given update values.
      */
    def update[Entity](entity: EntityTarget[Entity]): UpdateQueryBuilder[Entity] = js.native
    def update[Entity](entity: EntityTarget[Entity], updateSet: QueryDeepPartialEntity[Entity]): UpdateQueryBuilder[Entity] = js.native
    
    /**
      * If set to true the query will be wrapped into a transaction.
      */
    def useTransaction(enabled: Boolean): this.type = js.native
  }
}
