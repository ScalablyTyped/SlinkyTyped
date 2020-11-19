package typingsSlinky.winrt.global.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
@js.native
class BadgeUpdateManager ()
  extends typingsSlinky.winrt.Windows.UI.Notifications.BadgeUpdateManager
/* static members */
@JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
@js.native
object BadgeUpdateManager extends js.Object {
  
  def createBadgeUpdaterForApplication(): typingsSlinky.winrt.Windows.UI.Notifications.BadgeUpdater = js.native
  def createBadgeUpdaterForApplication(applicationId: String): typingsSlinky.winrt.Windows.UI.Notifications.BadgeUpdater = js.native
  
  def createBadgeUpdaterForSecondaryTile(tileId: String): typingsSlinky.winrt.Windows.UI.Notifications.BadgeUpdater = js.native
  
  def getTemplateContent(`type`: typingsSlinky.winrt.Windows.UI.Notifications.BadgeTemplateType): XmlDocument = js.native
}
