package typingsSlinky.zchatDashBrowser.zchatDashBrowserMod

import typingsSlinky.zchatDashBrowser.zchatDashBrowserStrings.away
import typingsSlinky.zchatDashBrowser.zchatDashBrowserStrings.offline
import typingsSlinky.zchatDashBrowser.zchatDashBrowserStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "getAccountStatus")
@js.native
object getAccountStatus extends js.Object {
  def apply(): online | offline | away = js.native
}

