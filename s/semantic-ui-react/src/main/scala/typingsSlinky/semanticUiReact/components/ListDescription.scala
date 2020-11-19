package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.listDescriptionMod.ListDescriptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListDescription {
  
  @JSImport("semantic-ui-react", "ListDescription")
  @js.native
  object component extends js.Object
  
  def withProps(p: ListDescriptionProps): SharedBuilder_ListDescriptionProps249326696 = new SharedBuilder_ListDescriptionProps249326696(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ListDescription.type): SharedBuilder_ListDescriptionProps249326696 = new SharedBuilder_ListDescriptionProps249326696(js.Array(this.component, js.Dictionary.empty))()
}
