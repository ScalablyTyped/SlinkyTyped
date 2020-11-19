package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.formInputMod.FormInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormInput {
  
  @JSImport("semantic-ui-react", "FormInput")
  @js.native
  object component extends js.Object
  
  def withProps(p: FormInputProps): SharedBuilder_FormInputProps_1386816201 = new SharedBuilder_FormInputProps_1386816201(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FormInput.type): SharedBuilder_FormInputProps_1386816201 = new SharedBuilder_FormInputProps_1386816201(js.Array(this.component, js.Dictionary.empty))()
}
