package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.headerSubheaderMod.HeaderSubheaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderSubheader {
  @JSImport("semantic-ui-react", "HeaderSubheader")
  @js.native
  object component extends js.Object
  
  def withProps(p: HeaderSubheaderProps): SharedBuilder_HeaderSubheaderProps_656978477 = new SharedBuilder_HeaderSubheaderProps_656978477(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HeaderSubheader.type): SharedBuilder_HeaderSubheaderProps_656978477 = new SharedBuilder_HeaderSubheaderProps_656978477(js.Array(this.component, js.Dictionary.empty))()
}

