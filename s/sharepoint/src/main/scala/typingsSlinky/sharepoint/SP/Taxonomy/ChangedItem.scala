package typingsSlinky.sharepoint.SP.Taxonomy

import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.ChangedItem")
@js.native
class ChangedItem () extends ClientObject {
  def get_changedBy(): String = js.native
  def get_changedTime(): js.Date = js.native
  def get_id(): Guid = js.native
  def get_itemType(): ChangeItemType = js.native
  def get_operation(): ChangeOperationType = js.native
}

