package typingsSlinky.slideout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.slideout.slideoutStrings.beforeopen
  - typingsSlinky.slideout.slideoutStrings.open
  - typingsSlinky.slideout.slideoutStrings.beforeclose
  - typingsSlinky.slideout.slideoutStrings.close
  - typingsSlinky.slideout.slideoutStrings.translatestart
  - typingsSlinky.slideout.slideoutStrings.translate
  - typingsSlinky.slideout.slideoutStrings.translateend
*/
trait Events extends js.Object

object Events {
  @scala.inline
  def beforeclose: typingsSlinky.slideout.slideoutStrings.beforeclose = this.cast("beforeclose")
  @scala.inline
  def beforeopen: typingsSlinky.slideout.slideoutStrings.beforeopen = this.cast("beforeopen")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typingsSlinky.slideout.slideoutStrings.close = this.cast("close")
  @scala.inline
  def open: typingsSlinky.slideout.slideoutStrings.open = this.cast("open")
  @scala.inline
  def translate: typingsSlinky.slideout.slideoutStrings.translate = this.cast("translate")
  @scala.inline
  def translateend: typingsSlinky.slideout.slideoutStrings.translateend = this.cast("translateend")
  @scala.inline
  def translatestart: typingsSlinky.slideout.slideoutStrings.translatestart = this.cast("translatestart")
}

