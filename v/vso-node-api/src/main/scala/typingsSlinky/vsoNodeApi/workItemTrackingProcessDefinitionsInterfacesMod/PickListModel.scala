package typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickListModel extends PickListMetadataModel {
  /**
    * A list of PicklistItemModel
    */
  var items: js.Array[PickListItemModel] = js.native
}

object PickListModel {
  @scala.inline
  def apply(
    id: String,
    isSuggested: Boolean,
    items: js.Array[PickListItemModel],
    name: String,
    `type`: String,
    url: String
  ): PickListModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSuggested = isSuggested.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListModel]
  }
  @scala.inline
  implicit class PickListModelOps[Self <: PickListModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[PickListItemModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

