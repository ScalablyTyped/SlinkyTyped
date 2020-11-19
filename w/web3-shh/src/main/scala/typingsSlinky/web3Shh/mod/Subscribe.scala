package typingsSlinky.web3Shh.mod

import typingsSlinky.web3Shh.web3ShhStrings.data
import typingsSlinky.web3Shh.web3ShhStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscribe extends js.Object {
  
  @JSName("on")
  def on_data(`type`: data, handler: js.Function1[/* data */ Notification, Unit]): Unit = js.native
  @JSName("on")
  def on_error(`type`: error, handler: js.Function1[/* data */ js.Error, Unit]): Unit = js.native
}
