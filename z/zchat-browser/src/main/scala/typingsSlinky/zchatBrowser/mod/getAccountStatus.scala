package typingsSlinky.zchatBrowser.mod

import typingsSlinky.zchatBrowser.zchatBrowserStrings.away
import typingsSlinky.zchatBrowser.zchatBrowserStrings.offline
import typingsSlinky.zchatBrowser.zchatBrowserStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zchat-browser", "getAccountStatus")
@js.native
object getAccountStatus extends js.Object {
  
  def apply(): online | offline | away = js.native
}
