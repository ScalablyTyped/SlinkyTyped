package typingsSlinky.zchatBrowser.mod

import typingsSlinky.zchatBrowser.zchatBrowserStrings.closed
import typingsSlinky.zchatBrowser.zchatBrowserStrings.connected
import typingsSlinky.zchatBrowser.zchatBrowserStrings.connecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "getConnectionStatus")
@js.native
object getConnectionStatus extends js.Object {
  def apply(): connected | connecting | closed = js.native
}

