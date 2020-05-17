package typingsSlinky.stompit.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stompit.connectMod.NetTcpConnectOptions
  - typingsSlinky.stompit.connectMod.NetIpcConnectOptions
  - typingsSlinky.stompit.connectMod.SslConnectOptions
*/
trait ConnectOptions extends js.Object

object ConnectOptions {
  @scala.inline
  implicit def apply(value: NetIpcConnectOptions): ConnectOptions = value.asInstanceOf[ConnectOptions]
  @scala.inline
  implicit def apply(value: NetTcpConnectOptions): ConnectOptions = value.asInstanceOf[ConnectOptions]
  @scala.inline
  implicit def apply(value: SslConnectOptions): ConnectOptions = value.asInstanceOf[ConnectOptions]
}

