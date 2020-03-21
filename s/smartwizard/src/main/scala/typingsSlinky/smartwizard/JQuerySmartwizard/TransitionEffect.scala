package typingsSlinky.smartwizard.JQuerySmartwizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.smartwizard.smartwizardStrings.none
  - typingsSlinky.smartwizard.smartwizardStrings.slide
  - typingsSlinky.smartwizard.smartwizardStrings.fade
*/
trait TransitionEffect extends js.Object

object TransitionEffect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fade: typingsSlinky.smartwizard.smartwizardStrings.fade = this.cast("fade")
  @scala.inline
  def none: typingsSlinky.smartwizard.smartwizardStrings.none = this.cast("none")
  @scala.inline
  def slide: typingsSlinky.smartwizard.smartwizardStrings.slide = this.cast("slide")
}

