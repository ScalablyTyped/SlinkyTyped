package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.placeholderImageMod.PlaceholderImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PlaceholderImage {
  @JSImport("semantic-ui-react", "PlaceholderImage")
  @js.native
  object component extends js.Object
  
  def withProps(p: PlaceholderImageProps): SharedBuilder_PlaceholderImageProps758767587 = new SharedBuilder_PlaceholderImageProps758767587(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PlaceholderImage.type): SharedBuilder_PlaceholderImageProps758767587 = new SharedBuilder_PlaceholderImageProps758767587(js.Array(this.component, js.Dictionary.empty))()
}

