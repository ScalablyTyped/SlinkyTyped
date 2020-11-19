package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlockEditor.anon.OmitPropsname
import typingsSlinky.wordpressBlockEditor.blockFormatControlsMod.BlockFormatControls.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockFormatControls {
  
  @JSImport("@wordpress/editor", "BlockFormatControls")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: BlockFormatControls.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  object Slot {
    
    @JSImport("@wordpress/editor", "BlockFormatControls.Slot")
    @js.native
    object component extends js.Object
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname_1930388973 = new SharedBuilder_OmitPropsname_1930388973(js.Array(this.component, js.Dictionary.empty))()
  }
}
