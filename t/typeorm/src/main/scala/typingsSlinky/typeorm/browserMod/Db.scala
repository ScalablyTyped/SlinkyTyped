package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.typingsMod.DbCreateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Db")
@js.native
class Db protected ()
  extends typingsSlinky.typeorm.typingsMod.Db {
  def this(databaseName: String, serverConfig: typingsSlinky.typeorm.typingsMod.Mongos) = this()
  def this(databaseName: String, serverConfig: typingsSlinky.typeorm.typingsMod.ReplSet) = this()
  /**
    *
    * @param databaseName The name of the database this instance represents.
    * @param serverConfig The server topology for the database.
    * @param options Optional.
    */
  def this(databaseName: String, serverConfig: typingsSlinky.typeorm.typingsMod.Server) = this()
  def this(
    databaseName: String,
    serverConfig: typingsSlinky.typeorm.typingsMod.Mongos,
    options: DbCreateOptions
  ) = this()
  def this(
    databaseName: String,
    serverConfig: typingsSlinky.typeorm.typingsMod.ReplSet,
    options: DbCreateOptions
  ) = this()
  def this(
    databaseName: String,
    serverConfig: typingsSlinky.typeorm.typingsMod.Server,
    options: DbCreateOptions
  ) = this()
}
