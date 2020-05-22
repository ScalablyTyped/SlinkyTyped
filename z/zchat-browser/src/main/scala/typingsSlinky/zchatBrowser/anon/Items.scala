package typingsSlinky.zchatBrowser.anon

import typingsSlinky.zchatBrowser.mod.ChatEvent.PanelTemplate
import typingsSlinky.zchatBrowser.mod.ChatEvent.StructuredMessage
import typingsSlinky.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE_CAROUSEL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items extends StructuredMessage {
  var items: js.Array[PanelTemplate]
  var `type`: PANEL_TEMPLATE_CAROUSEL
}

object Items {
  @scala.inline
  def apply(items: js.Array[PanelTemplate], `type`: PANEL_TEMPLATE_CAROUSEL): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
}

