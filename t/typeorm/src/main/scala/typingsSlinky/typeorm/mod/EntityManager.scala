package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "EntityManager")
@js.native
class EntityManager protected ()
  extends typingsSlinky.typeorm.entityManagerEntityManagerMod.EntityManager {
  def this(connection: typingsSlinky.typeorm.connectionConnectionMod.Connection) = this()
  def this(connection: typingsSlinky.typeorm.connectionConnectionMod.Connection, queryRunner: QueryRunner) = this()
}
