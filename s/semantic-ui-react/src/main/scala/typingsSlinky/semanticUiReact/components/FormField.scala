package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.formFieldMod.FormFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormField {
  
  @JSImport("semantic-ui-react", "FormField")
  @js.native
  object component extends js.Object
  
  def withProps(p: FormFieldProps): SharedBuilder_FormFieldProps19006573 = new SharedBuilder_FormFieldProps19006573(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FormField.type): SharedBuilder_FormFieldProps19006573 = new SharedBuilder_FormFieldProps19006573(js.Array(this.component, js.Dictionary.empty))()
}
