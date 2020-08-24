package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.formGroupMod.FormGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormGroup {
  @JSImport("semantic-ui-react", "FormGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: FormGroupProps): SharedBuilder_FormGroupProps1620924271 = new SharedBuilder_FormGroupProps1620924271(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormGroup.type): SharedBuilder_FormGroupProps1620924271 = new SharedBuilder_FormGroupProps1620924271(js.Array(this.component, js.Dictionary.empty))()
}

