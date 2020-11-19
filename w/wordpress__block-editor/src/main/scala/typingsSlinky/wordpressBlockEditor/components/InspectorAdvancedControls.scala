package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlockEditor.anon.OmitPropsname
import typingsSlinky.wordpressBlockEditor.inspectorAdvancedControlsMod.InspectorAdvancedControls.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InspectorAdvancedControls {
  
  @JSImport("@wordpress/block-editor", "InspectorAdvancedControls")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: InspectorAdvancedControls.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  object Slot {
    
    @JSImport("@wordpress/block-editor", "InspectorAdvancedControls.Slot")
    @js.native
    object component extends js.Object
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, js.Dictionary.empty))()
  }
}
