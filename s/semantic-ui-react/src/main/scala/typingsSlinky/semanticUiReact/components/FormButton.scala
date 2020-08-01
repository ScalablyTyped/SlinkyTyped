package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.formButtonMod.FormButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormButton {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormButton", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FormButtonProps): SharedBuilder_FormButtonProps766293977 = new SharedBuilder_FormButtonProps766293977(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormButton.type): SharedBuilder_FormButtonProps766293977 = new SharedBuilder_FormButtonProps766293977(js.Array(this.component, js.Dictionary.empty))()
}

