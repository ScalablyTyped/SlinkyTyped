package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBadgeUpdater extends js.Object {
  
  def clear(): Unit = js.native
  
  def startPeriodicUpdate(badgeContent: Uri, requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  def startPeriodicUpdate(badgeContent: Uri, startTime: js.Date, requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  
  def stopPeriodicUpdate(): Unit = js.native
  
  def update(notification: BadgeNotification): Unit = js.native
}
