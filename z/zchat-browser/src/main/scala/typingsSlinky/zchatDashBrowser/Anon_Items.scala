package typingsSlinky.zchatDashBrowser

import typingsSlinky.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.PanelTemplate
import typingsSlinky.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.StructuredMessage
import typingsSlinky.zchatDashBrowser.zchatDashBrowserStrings.PANEL_TEMPLATE_CAROUSEL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends StructuredMessage {
  var items: js.Array[PanelTemplate]
  var `type`: PANEL_TEMPLATE_CAROUSEL
}

object Anon_Items {
  @scala.inline
  def apply(items: js.Array[PanelTemplate], `type`: PANEL_TEMPLATE_CAROUSEL): Anon_Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Items]
  }
}

