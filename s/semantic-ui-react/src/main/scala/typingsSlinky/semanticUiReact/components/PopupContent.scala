package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.popupContentMod.PopupContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopupContent {
  
  @JSImport("semantic-ui-react", "PopupContent")
  @js.native
  object component extends js.Object
  
  def withProps(p: PopupContentProps): SharedBuilder_PopupContentProps183580496 = new SharedBuilder_PopupContentProps183580496(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PopupContent.type): SharedBuilder_PopupContentProps183580496 = new SharedBuilder_PopupContentProps183580496(js.Array(this.component, js.Dictionary.empty))()
}
