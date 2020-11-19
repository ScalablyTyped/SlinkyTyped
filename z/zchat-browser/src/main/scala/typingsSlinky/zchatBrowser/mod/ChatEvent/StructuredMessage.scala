package typingsSlinky.zchatBrowser.mod.ChatEvent

import typingsSlinky.zchatBrowser.zchatBrowserStrings.LIST_TEMPLATE
import typingsSlinky.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE
import typingsSlinky.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE_CAROUSEL
import typingsSlinky.zchatBrowser.zchatBrowserStrings.QUICK_REPLIES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zchatBrowser.anon.Msg
  - typingsSlinky.zchatBrowser.anon.Buttons
  - typingsSlinky.zchatBrowser.anon.Items
  - typingsSlinky.zchatBrowser.anon.Type
*/
trait StructuredMessage extends js.Object
object StructuredMessage {
  
  @scala.inline
  def Msg(msg: String, quick_replies: js.Array[Button], `type`: QUICK_REPLIES): StructuredMessage = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], quick_replies = quick_replies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
  
  @scala.inline
  def Buttons(buttons: js.Array[Button], panel: Panel, `type`: PANEL_TEMPLATE): StructuredMessage = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
  
  @scala.inline
  def Items(items: js.Array[PanelTemplate], `type`: PANEL_TEMPLATE_CAROUSEL): StructuredMessage = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
  
  @scala.inline
  def Type(buttons: js.Array[Button], items: js.Array[ListItem], `type`: LIST_TEMPLATE): StructuredMessage = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
}
