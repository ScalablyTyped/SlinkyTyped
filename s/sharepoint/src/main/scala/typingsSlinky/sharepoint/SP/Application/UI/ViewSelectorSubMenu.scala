package typingsSlinky.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewSelectorSubMenu extends js.Object {
  var ImageSourceUrl: String = js.native
  var SubMenuItems: js.Any = js.native
  var Text: String = js.native
}

object ViewSelectorSubMenu {
  @scala.inline
  def apply(ImageSourceUrl: String, SubMenuItems: js.Any, Text: String): ViewSelectorSubMenu = {
    val __obj = js.Dynamic.literal(ImageSourceUrl = ImageSourceUrl.asInstanceOf[js.Any], SubMenuItems = SubMenuItems.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSelectorSubMenu]
  }
  @scala.inline
  implicit class ViewSelectorSubMenuOps[Self <: ViewSelectorSubMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageSourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageSourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubMenuItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubMenuItems")(value.asInstanceOf[js.Any])
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

