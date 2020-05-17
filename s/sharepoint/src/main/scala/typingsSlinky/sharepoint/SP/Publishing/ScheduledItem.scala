package typingsSlinky.sharepoint.SP.Publishing

import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledItem extends ClientObject {
  def get_endDate(): js.Date = js.native
  def get_listItem(): ListItem[_] = js.native
  def get_startDate(): js.Date = js.native
  def schedule(approvalComment: String): Unit = js.native
  def set_endDate(value: js.Date): js.Date = js.native
  def set_startDate(value: js.Date): js.Date = js.native
}

