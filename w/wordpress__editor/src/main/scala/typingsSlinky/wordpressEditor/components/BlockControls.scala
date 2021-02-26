package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.anon.OmitPropsname
import typingsSlinky.wordpressBlockEditor.blockControlsMod.BlockControls.Props
import typingsSlinky.wordpressComponents.toolbarMod.Toolbar.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockControls {
  
  object Slot {
    
    @JSImport("@wordpress/editor", "BlockControls.Slot")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@wordpress/editor", "BlockControls")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def controls(value: js.Array[js.Array[Control] | Control]): this.type = set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def controlsVarargs(value: (js.Array[Control] | Control)*): this.type = set("controls", js.Array(value :_*))
  }
  
  implicit def make(companion: BlockControls.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
