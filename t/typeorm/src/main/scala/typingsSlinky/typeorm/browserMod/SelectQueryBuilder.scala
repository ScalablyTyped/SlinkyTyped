package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "SelectQueryBuilder")
@js.native
class SelectQueryBuilder[Entity] protected ()
  extends typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[Entity] {
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(connection: typingsSlinky.typeorm.connectionMod.Connection) = this()
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(queryBuilder: typingsSlinky.typeorm.queryBuilderMod.QueryBuilder[_]) = this()
  def this(connection: typingsSlinky.typeorm.connectionMod.Connection, queryRunner: QueryRunner) = this()
}
