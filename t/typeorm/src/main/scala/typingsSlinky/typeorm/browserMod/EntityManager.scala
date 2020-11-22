package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "EntityManager")
@js.native
class EntityManager protected ()
  extends typingsSlinky.typeorm.entityManagerMod.EntityManager {
  def this(connection: typingsSlinky.typeorm.connectionMod.Connection) = this()
  def this(connection: typingsSlinky.typeorm.connectionMod.Connection, queryRunner: QueryRunner) = this()
}
