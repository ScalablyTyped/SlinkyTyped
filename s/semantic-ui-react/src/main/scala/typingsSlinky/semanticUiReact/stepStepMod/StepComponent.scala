package typingsSlinky.semanticUiReact.stepStepMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.stepContentMod.StepContentProps
import typingsSlinky.semanticUiReact.stepDescriptionMod.StepDescriptionProps
import typingsSlinky.semanticUiReact.stepGroupMod.StepGroupProps
import typingsSlinky.semanticUiReact.stepTitleMod.StepTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepComponent
  extends ComponentClass[StepProps, js.Object] {
  var Content: ReactComponentClass[StepContentProps] = js.native
  var Description: ReactComponentClass[StepDescriptionProps] = js.native
  var Group: ReactComponentClass[StepGroupProps] = js.native
  var Title: ReactComponentClass[StepTitleProps] = js.native
}

