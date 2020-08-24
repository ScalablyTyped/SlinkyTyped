package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.formTextAreaMod.FormTextAreaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormTextArea {
  @JSImport("semantic-ui-react", "FormTextArea")
  @js.native
  object component extends js.Object
  
  def withProps(p: FormTextAreaProps): SharedBuilder_FormTextAreaProps637495390 = new SharedBuilder_FormTextAreaProps637495390(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormTextArea.type): SharedBuilder_FormTextAreaProps637495390 = new SharedBuilder_FormTextAreaProps637495390(js.Array(this.component, js.Dictionary.empty))()
}

