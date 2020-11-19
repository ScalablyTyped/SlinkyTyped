package typingsSlinky.soupbintcp.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.soupbintcp.anon.Address
import typingsSlinky.soupbintcp.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soupbintcp", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(options: Host) = this()
  def this(options: Host, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]) = this()
  
  def address(): Address = js.native
  
  def close(callback: js.Function0[Unit]): Unit = js.native
}
