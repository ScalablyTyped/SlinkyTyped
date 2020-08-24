package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.stepTitleMod.StepTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StepTitle {
  @JSImport("semantic-ui-react", "StepTitle")
  @js.native
  object component extends js.Object
  
  def withProps(p: StepTitleProps): SharedBuilder_StepTitleProps1252644081 = new SharedBuilder_StepTitleProps1252644081(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StepTitle.type): SharedBuilder_StepTitleProps1252644081 = new SharedBuilder_StepTitleProps1252644081(js.Array(this.component, js.Dictionary.empty))()
}

