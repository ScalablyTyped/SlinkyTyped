package typingsSlinky.zchatDashBrowser.zchatDashBrowserMod

import typingsSlinky.zchatDashBrowser.zchatDashBrowserStrings.closed
import typingsSlinky.zchatDashBrowser.zchatDashBrowserStrings.connected
import typingsSlinky.zchatDashBrowser.zchatDashBrowserStrings.connecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "getConnectionStatus")
@js.native
object getConnectionStatus extends js.Object {
  def apply(): connected | connecting | closed = js.native
}

