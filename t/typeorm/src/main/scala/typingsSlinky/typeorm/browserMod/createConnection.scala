package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.connectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "createConnection")
@js.native
object createConnection extends js.Object {
  
  def apply(): js.Promise[typingsSlinky.typeorm.connectionMod.Connection] = js.native
  def apply(name: String): js.Promise[typingsSlinky.typeorm.connectionMod.Connection] = js.native
  def apply(options: ConnectionOptions): js.Promise[typingsSlinky.typeorm.connectionMod.Connection] = js.native
}
