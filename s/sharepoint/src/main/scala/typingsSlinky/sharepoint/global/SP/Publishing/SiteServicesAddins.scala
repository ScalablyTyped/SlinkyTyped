package typingsSlinky.sharepoint.global.SP.Publishing

import typingsSlinky.sharepoint.SP.ClientContext
import typingsSlinky.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.SiteServicesAddins")
@js.native
class SiteServicesAddins ()
  extends typingsSlinky.sharepoint.SP.Publishing.SiteServicesAddins

/* static members */
@JSGlobal("SP.Publishing.SiteServicesAddins")
@js.native
object SiteServicesAddins extends js.Object {
  def deletePlugin(context: ClientContext, pluginName: String): Unit = js.native
  def deleteSettings(context: ClientContext, addinId: Guid): Unit = js.native
  def getPlugin(context: ClientContext, pluginName: String): typingsSlinky.sharepoint.SP.Publishing.AddinPlugin = js.native
  def getSettings(context: ClientContext, addinId: Guid): typingsSlinky.sharepoint.SP.Publishing.AddinSettings = js.native
  def setPlugin(context: ClientContext, addin: typingsSlinky.sharepoint.SP.Publishing.AddinPlugin): Unit = js.native
  def setSettings(context: ClientContext, addin: typingsSlinky.sharepoint.SP.Publishing.AddinSettings): Unit = js.native
}

