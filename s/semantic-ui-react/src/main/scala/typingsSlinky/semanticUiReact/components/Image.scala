package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.imageGroupMod.ImageGroupProps
import typingsSlinky.semanticUiReact.imageImageMod.ImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  @JSImport("semantic-ui-react", "Image")
  @js.native
  object component extends js.Object
  
  def withProps(p: ImageProps): SharedBuilder_ItemImageProps_1694285179 = new SharedBuilder_ItemImageProps_1694285179(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Image.type): SharedBuilder_ItemImageProps_1694285179 = new SharedBuilder_ItemImageProps_1694285179(js.Array(this.component, js.Dictionary.empty))()
  
  object Group {
    
    @JSImport("semantic-ui-react", "Image.Group")
    @js.native
    object component extends js.Object
    
    def withProps(p: ImageGroupProps): SharedBuilder_ImageGroupProps13496868 = new SharedBuilder_ImageGroupProps13496868(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Group.type): SharedBuilder_ImageGroupProps13496868 = new SharedBuilder_ImageGroupProps13496868(js.Array(this.component, js.Dictionary.empty))()
  }
}
