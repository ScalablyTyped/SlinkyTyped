package typingsSlinky.zchatBrowser

import typingsSlinky.zchatBrowser.mod.ChatEvent.Button
import typingsSlinky.zchatBrowser.mod.ChatEvent.Panel
import typingsSlinky.zchatBrowser.mod.ChatEvent.StructuredMessage
import typingsSlinky.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtons extends StructuredMessage {
  var buttons: js.Array[Button]
  var panel: Panel
  var `type`: PANEL_TEMPLATE
}

object AnonButtons {
  @scala.inline
  def apply(buttons: js.Array[Button], panel: Panel, `type`: PANEL_TEMPLATE): AnonButtons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtons]
  }
}

