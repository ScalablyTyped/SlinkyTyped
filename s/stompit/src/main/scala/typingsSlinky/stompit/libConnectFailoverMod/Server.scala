package typingsSlinky.stompit.libConnectFailoverMod

import typingsSlinky.stompit.libConnectDashFailoverGetAddressInfoMod.AddressInfo
import typingsSlinky.stompit.libConnectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var connectOptions: ConnectOptions = js.native
  var remoteAddress: AddressInfo = js.native
  def blacklist(): Unit = js.native
  def blacklist(error: js.Error): Unit = js.native
  def getBlacklistError(): js.Error = js.native
  def isBlacklisted(): Boolean = js.native
}

