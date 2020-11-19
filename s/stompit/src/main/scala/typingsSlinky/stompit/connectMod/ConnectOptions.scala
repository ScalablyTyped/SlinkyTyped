package typingsSlinky.stompit.connectMod

import typingsSlinky.stompit.stompitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stompit.connectMod.NetTcpConnectOptions
  - typingsSlinky.stompit.connectMod.NetIpcConnectOptions
  - typingsSlinky.stompit.connectMod.SslConnectOptions
*/
trait ConnectOptions extends js.Object
object ConnectOptions {
  
  @scala.inline
  def NetTcpConnectOptions(port: Double): ConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  def NetIpcConnectOptions(path: String): ConnectOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  def SslConnectOptions(ssl: `true`): ConnectOptions = {
    val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}
