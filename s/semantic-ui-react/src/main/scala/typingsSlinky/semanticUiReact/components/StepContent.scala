package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.stepContentMod.StepContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StepContent {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/StepContent", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: StepContentProps): SharedBuilder_StepContentProps774867170 = new SharedBuilder_StepContentProps774867170(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StepContent.type): SharedBuilder_StepContentProps774867170 = new SharedBuilder_StepContentProps774867170(js.Array(this.component, js.Dictionary.empty))()
}

