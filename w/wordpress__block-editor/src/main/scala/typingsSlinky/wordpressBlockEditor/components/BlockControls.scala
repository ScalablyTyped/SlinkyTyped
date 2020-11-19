package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.anon.OmitPropsname
import typingsSlinky.wordpressBlockEditor.blockControlsMod.BlockControls.Props
import typingsSlinky.wordpressComponents.toolbarMod.Toolbar.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockControls {
  
  @JSImport("@wordpress/block-editor", "BlockControls")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def controlsVarargs(value: (js.Array[Control] | Control)*): this.type = set("controls", js.Array(value :_*))
    
    @scala.inline
    def controls(value: js.Array[js.Array[Control] | Control]): this.type = set("controls", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: BlockControls.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Slot {
    
    @JSImport("@wordpress/block-editor", "BlockControls.Slot")
    @js.native
    object component extends js.Object
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, js.Dictionary.empty))()
  }
}
