package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.stepDescriptionMod.StepDescriptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StepDescription {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/StepDescription", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: StepDescriptionProps): SharedBuilder_StepDescriptionProps_1229748384 = new SharedBuilder_StepDescriptionProps_1229748384(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StepDescription.type): SharedBuilder_StepDescriptionProps_1229748384 = new SharedBuilder_StepDescriptionProps_1229748384(js.Array(this.component, js.Dictionary.empty))()
}

