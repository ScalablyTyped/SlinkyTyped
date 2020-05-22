package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlockEditor.blockSettingsMenuMod.BlockSettingsMenu.Props
import typingsSlinky.wordpressBlockEditor.mod.BlockSettingsMenu.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BlockSettingsMenu {
  @JSImport("@wordpress/block-editor", "BlockSettingsMenu")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(clientIds: js.Array[String]): Default[tag.type, ^] = {
    val __props = js.Dynamic.literal(clientIds = clientIds.asInstanceOf[js.Any])
    new Default[tag.type, ^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

