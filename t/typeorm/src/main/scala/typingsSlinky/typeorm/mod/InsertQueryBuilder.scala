package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "InsertQueryBuilder")
@js.native
class InsertQueryBuilder[Entity] protected ()
  extends typingsSlinky.typeorm.queryBuilderInsertQueryBuilderMod.InsertQueryBuilder[Entity] {
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
