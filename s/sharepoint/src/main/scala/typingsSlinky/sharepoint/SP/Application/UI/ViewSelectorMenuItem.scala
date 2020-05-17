package typingsSlinky.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewSelectorMenuItem extends js.Object {
  var ActionScriptText: String = js.native
  var Description: String = js.native
  var GroupId: Double = js.native
  var Id: String = js.native
  var ImageSourceUrl: String = js.native
  var ItemType: String = js.native
  var NavigateUrl: String = js.native
  var Sequence: Double = js.native
  var Text: String = js.native
}

object ViewSelectorMenuItem {
  @scala.inline
  def apply(
    ActionScriptText: String,
    Description: String,
    GroupId: Double,
    Id: String,
    ImageSourceUrl: String,
    ItemType: String,
    NavigateUrl: String,
    Sequence: Double,
    Text: String
  ): ViewSelectorMenuItem = {
    val __obj = js.Dynamic.literal(ActionScriptText = ActionScriptText.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ImageSourceUrl = ImageSourceUrl.asInstanceOf[js.Any], ItemType = ItemType.asInstanceOf[js.Any], NavigateUrl = NavigateUrl.asInstanceOf[js.Any], Sequence = Sequence.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSelectorMenuItem]
  }
  @scala.inline
  implicit class ViewSelectorMenuItemOps[Self <: ViewSelectorMenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionScriptText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionScriptText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageSourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageSourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NavigateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

