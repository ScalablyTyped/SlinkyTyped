package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.placeholderParagraphMod.PlaceholderParagraphProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PlaceholderParagraph {
  
  @JSImport("semantic-ui-react", "PlaceholderParagraph")
  @js.native
  object component extends js.Object
  
  def withProps(p: PlaceholderParagraphProps): SharedBuilder_PlaceholderParagraphProps561623350 = new SharedBuilder_PlaceholderParagraphProps561623350(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PlaceholderParagraph.type): SharedBuilder_PlaceholderParagraphProps561623350 = new SharedBuilder_PlaceholderParagraphProps561623350(js.Array(this.component, js.Dictionary.empty))()
}
