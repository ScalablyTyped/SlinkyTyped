package typingsSlinky.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.weappApi.weappApiStrings.linear
  - typingsSlinky.weappApi.weappApiStrings.ease
  - typingsSlinky.weappApi.weappApiStrings.`ease-in`
  - typingsSlinky.weappApi.weappApiStrings.`ease-in-out`
  - typingsSlinky.weappApi.weappApiStrings.`ease-out`
  - typingsSlinky.weappApi.weappApiStrings.`step-start`
  - typingsSlinky.weappApi.weappApiStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typingsSlinky.weappApi.weappApiStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typingsSlinky.weappApi.weappApiStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typingsSlinky.weappApi.weappApiStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typingsSlinky.weappApi.weappApiStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typingsSlinky.weappApi.weappApiStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typingsSlinky.weappApi.weappApiStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typingsSlinky.weappApi.weappApiStrings.`step-start` = this.cast("step-start")
}

