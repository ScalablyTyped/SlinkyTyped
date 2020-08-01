package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.placeholderHeaderMod.PlaceholderHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PlaceholderHeader {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PlaceholderHeaderProps): SharedBuilder_PlaceholderHeaderProps_1369306081 = new SharedBuilder_PlaceholderHeaderProps_1369306081(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PlaceholderHeader.type): SharedBuilder_PlaceholderHeaderProps_1369306081 = new SharedBuilder_PlaceholderHeaderProps_1369306081(js.Array(this.component, js.Dictionary.empty))()
}

