package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.formRadioMod.FormRadioProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormRadio {
  
  @JSImport("semantic-ui-react", "FormRadio")
  @js.native
  object component extends js.Object
  
  def withProps(p: FormRadioProps): SharedBuilder_FormRadioProps_70699414 = new SharedBuilder_FormRadioProps_70699414(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FormRadio.type): SharedBuilder_FormRadioProps_70699414 = new SharedBuilder_FormRadioProps_70699414(js.Array(this.component, js.Dictionary.empty))()
}
