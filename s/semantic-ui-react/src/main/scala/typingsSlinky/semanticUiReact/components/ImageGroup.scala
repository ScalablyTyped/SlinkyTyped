package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.imageGroupMod.ImageGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImageGroup {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Image/ImageGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ImageGroupProps): SharedBuilder_ImageGroupProps13496868 = new SharedBuilder_ImageGroupProps13496868(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ImageGroup.type): SharedBuilder_ImageGroupProps13496868 = new SharedBuilder_ImageGroupProps13496868(js.Array(this.component, js.Dictionary.empty))()
}

