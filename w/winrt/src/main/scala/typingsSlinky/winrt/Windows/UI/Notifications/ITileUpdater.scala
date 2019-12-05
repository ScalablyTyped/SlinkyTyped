package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.std.Date
import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITileUpdater extends js.Object {
  var setting: NotificationSetting = js.native
  def addToSchedule(scheduledTile: ScheduledTileNotification): Unit = js.native
  def clear(): Unit = js.native
  def enableNotificationQueue(enable: Boolean): Unit = js.native
  def getScheduledTileNotifications(): IVectorView[ScheduledTileNotification] = js.native
  def removeFromSchedule(scheduledTile: ScheduledTileNotification): Unit = js.native
  def startPeriodicUpdate(tileContent: Uri, requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  def startPeriodicUpdate(tileContent: Uri, startTime: Date, requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  def startPeriodicUpdateBatch(tileContents: IIterable[Uri], requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  def startPeriodicUpdateBatch(tileContents: IIterable[Uri], startTime: Date, requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  def stopPeriodicUpdate(): Unit = js.native
  def update(notification: TileNotification): Unit = js.native
}

