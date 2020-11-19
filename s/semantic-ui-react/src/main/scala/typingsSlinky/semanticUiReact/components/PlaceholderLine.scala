package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.placeholderLineMod.PlaceholderLineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PlaceholderLine {
  
  @JSImport("semantic-ui-react", "PlaceholderLine")
  @js.native
  object component extends js.Object
  
  def withProps(p: PlaceholderLineProps): SharedBuilder_PlaceholderLineProps_804921993 = new SharedBuilder_PlaceholderLineProps_804921993(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PlaceholderLine.type): SharedBuilder_PlaceholderLineProps_804921993 = new SharedBuilder_PlaceholderLineProps_804921993(js.Array(this.component, js.Dictionary.empty))()
}
