package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlockEditor.anon.OmitPropsname
import typingsSlinky.wordpressBlockEditor.inspectorAdvancedControlsMod.InspectorAdvancedControls.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InspectorAdvancedControls {
  
  object Slot {
    
    @JSImport("@wordpress/block-editor", "InspectorAdvancedControls.Slot")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@wordpress/block-editor", "InspectorAdvancedControls")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: InspectorAdvancedControls.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
