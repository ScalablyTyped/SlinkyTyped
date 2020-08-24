package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.headerContentMod.HeaderContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderContent {
  @JSImport("semantic-ui-react", "HeaderContent")
  @js.native
  object component extends js.Object
  
  def withProps(p: HeaderContentProps): SharedBuilder_HeaderContentProps252036383 = new SharedBuilder_HeaderContentProps252036383(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HeaderContent.type): SharedBuilder_HeaderContentProps252036383 = new SharedBuilder_HeaderContentProps252036383(js.Array(this.component, js.Dictionary.empty))()
}

