package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.mongodbTypingsMod.DbCreateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Db")
@js.native
class Db protected ()
  extends typingsSlinky.typeorm.mongodbTypingsMod.Db {
  def this(databaseName: String, serverConfig: typingsSlinky.typeorm.mongodbTypingsMod.Mongos) = this()
  def this(databaseName: String, serverConfig: typingsSlinky.typeorm.mongodbTypingsMod.ReplSet) = this()
  /**
    *
    * @param databaseName The name of the database this instance represents.
    * @param serverConfig The server topology for the database.
    * @param options Optional.
    */
  def this(databaseName: String, serverConfig: typingsSlinky.typeorm.mongodbTypingsMod.Server) = this()
  def this(
    databaseName: String,
    serverConfig: typingsSlinky.typeorm.mongodbTypingsMod.Mongos,
    options: DbCreateOptions
  ) = this()
  def this(
    databaseName: String,
    serverConfig: typingsSlinky.typeorm.mongodbTypingsMod.ReplSet,
    options: DbCreateOptions
  ) = this()
  def this(
    databaseName: String,
    serverConfig: typingsSlinky.typeorm.mongodbTypingsMod.Server,
    options: DbCreateOptions
  ) = this()
}
