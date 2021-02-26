package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "RelationQueryBuilder")
@js.native
class RelationQueryBuilder[Entity] protected ()
  extends typingsSlinky.typeorm.queryBuilderRelationQueryBuilderMod.RelationQueryBuilder[Entity] {
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(connection: typingsSlinky.typeorm.connectionConnectionMod.Connection) = this()
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(queryBuilder: typingsSlinky.typeorm.queryBuilderQueryBuilderMod.QueryBuilder[_]) = this()
  def this(connection: typingsSlinky.typeorm.connectionConnectionMod.Connection, queryRunner: QueryRunner) = this()
}
