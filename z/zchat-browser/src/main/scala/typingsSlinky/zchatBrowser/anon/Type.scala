package typingsSlinky.zchatBrowser.anon

import typingsSlinky.zchatBrowser.mod.ChatEvent.Button
import typingsSlinky.zchatBrowser.mod.ChatEvent.ListItem
import typingsSlinky.zchatBrowser.mod.ChatEvent.StructuredMessage
import typingsSlinky.zchatBrowser.zchatBrowserStrings.LIST_TEMPLATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends StructuredMessage {
  var buttons: js.Array[Button] = js.native
  var items: js.Array[ListItem] = js.native
  var `type`: LIST_TEMPLATE = js.native
}

object Type {
  @scala.inline
  def apply(buttons: js.Array[Button], items: js.Array[ListItem], `type`: LIST_TEMPLATE): Type = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: js.Array[Button]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[ListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: LIST_TEMPLATE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

