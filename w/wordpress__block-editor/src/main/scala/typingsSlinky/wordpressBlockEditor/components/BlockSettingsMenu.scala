package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlockEditor.blockSettingsMenuMod.BlockSettingsMenu.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockSettingsMenu {
  
  @scala.inline
  def apply(clientIds: js.Array[String]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(clientIds = clientIds.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor", "BlockSettingsMenu")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
