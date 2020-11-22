package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "UpdateQueryBuilder")
@js.native
class UpdateQueryBuilder[Entity] protected ()
  extends typingsSlinky.typeorm.queryBuilderUpdateQueryBuilderMod.UpdateQueryBuilder[Entity] {
  def this(connectionOrQueryBuilder: typingsSlinky.typeorm.connectionConnectionMod.Connection) = this()
  def this(connectionOrQueryBuilder: typingsSlinky.typeorm.queryBuilderQueryBuilderMod.QueryBuilder[_]) = this()
  def this(
    connectionOrQueryBuilder: typingsSlinky.typeorm.connectionConnectionMod.Connection,
    queryRunner: QueryRunner
  ) = this()
  def this(
    connectionOrQueryBuilder: typingsSlinky.typeorm.queryBuilderQueryBuilderMod.QueryBuilder[_],
    queryRunner: QueryRunner
  ) = this()
}
