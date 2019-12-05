package typingsSlinky.web3DashShh.web3DashShhMod

import typingsSlinky.web3DashShh.web3DashShhStrings.data
import typingsSlinky.web3DashShh.web3DashShhStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribe extends js.Object {
  @JSName("on")
  def on_data(`type`: data, handler: js.Function1[/* data */ Notification, Unit]): Unit = js.native
  @JSName("on")
  def on_error(`type`: error, handler: js.Function1[/* data */ js.Error, Unit]): Unit = js.native
}

