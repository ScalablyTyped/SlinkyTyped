package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.listContentMod.ListContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListContent {
  
  @JSImport("semantic-ui-react", "ListContent")
  @js.native
  object component extends js.Object
  
  def withProps(p: ListContentProps): SharedBuilder_ListContentProps_1399011485 = new SharedBuilder_ListContentProps_1399011485(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ListContent.type): SharedBuilder_ListContentProps_1399011485 = new SharedBuilder_ListContentProps_1399011485(js.Array(this.component, js.Dictionary.empty))()
}
