package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.blockControlsMod.BlockControls.Props
import typingsSlinky.wordpressComponents.toolbarMod.Toolbar.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BlockControls {
  @JSImport("@wordpress/block-editor/components/block-controls", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def controls(value: js.Array[js.Array[Control] | Control]): this.type = set("controls", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BlockControls.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

