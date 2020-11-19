package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.formButtonMod.FormButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormButton {
  
  @JSImport("semantic-ui-react", "FormButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: FormButtonProps): SharedBuilder_FormButtonProps766293977 = new SharedBuilder_FormButtonProps766293977(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FormButton.type): SharedBuilder_FormButtonProps766293977 = new SharedBuilder_FormButtonProps766293977(js.Array(this.component, js.Dictionary.empty))()
}
