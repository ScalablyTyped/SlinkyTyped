package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.stepGroupMod.StepGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StepGroup {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/StepGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: StepGroupProps): SharedBuilder_StepGroupProps1201670136 = new SharedBuilder_StepGroupProps1201670136(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StepGroup.type): SharedBuilder_StepGroupProps1201670136 = new SharedBuilder_StepGroupProps1201670136(js.Array(this.component, js.Dictionary.empty))()
}

