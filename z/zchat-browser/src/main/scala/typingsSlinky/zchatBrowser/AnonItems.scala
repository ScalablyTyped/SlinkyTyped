package typingsSlinky.zchatBrowser

import typingsSlinky.zchatBrowser.mod.ChatEvent.PanelTemplate
import typingsSlinky.zchatBrowser.mod.ChatEvent.StructuredMessage
import typingsSlinky.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE_CAROUSEL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItems extends StructuredMessage {
  var items: js.Array[PanelTemplate] = js.native
  var `type`: PANEL_TEMPLATE_CAROUSEL = js.native
}

object AnonItems {
  @scala.inline
  def apply(items: js.Array[PanelTemplate], `type`: PANEL_TEMPLATE_CAROUSEL): AnonItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
  @scala.inline
  implicit class AnonItemsOps[Self <: AnonItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[PanelTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PANEL_TEMPLATE_CAROUSEL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

