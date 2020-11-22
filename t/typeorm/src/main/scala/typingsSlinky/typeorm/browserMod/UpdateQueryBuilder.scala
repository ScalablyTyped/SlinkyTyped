package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "UpdateQueryBuilder")
@js.native
class UpdateQueryBuilder[Entity] protected ()
  extends typingsSlinky.typeorm.updateQueryBuilderMod.UpdateQueryBuilder[Entity] {
  def this(connectionOrQueryBuilder: typingsSlinky.typeorm.connectionMod.Connection) = this()
  def this(connectionOrQueryBuilder: typingsSlinky.typeorm.queryBuilderMod.QueryBuilder[_]) = this()
  def this(connectionOrQueryBuilder: typingsSlinky.typeorm.connectionMod.Connection, queryRunner: QueryRunner) = this()
  def this(
    connectionOrQueryBuilder: typingsSlinky.typeorm.queryBuilderMod.QueryBuilder[_],
    queryRunner: QueryRunner
  ) = this()
}
