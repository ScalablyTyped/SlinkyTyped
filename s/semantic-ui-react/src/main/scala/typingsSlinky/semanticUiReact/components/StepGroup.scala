package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.stepGroupMod.StepGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StepGroup {
  
  @JSImport("semantic-ui-react", "StepGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: StepGroupProps): SharedBuilder_StepGroupProps1201670136 = new SharedBuilder_StepGroupProps1201670136(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: StepGroup.type): SharedBuilder_StepGroupProps1201670136 = new SharedBuilder_StepGroupProps1201670136(js.Array(this.component, js.Dictionary.empty))()
}
