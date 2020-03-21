package typingsSlinky.stripejs.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripejs.stripejsStrings.pass
  - typingsSlinky.stripejs.stripejsStrings.fail
  - typingsSlinky.stripejs.stripejsStrings.unavailable
  - typingsSlinky.stripejs.stripejsStrings.unchecked
*/
trait checkStatus extends js.Object

object checkStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fail: typingsSlinky.stripejs.stripejsStrings.fail = this.cast("fail")
  @scala.inline
  def pass: typingsSlinky.stripejs.stripejsStrings.pass = this.cast("pass")
  @scala.inline
  def unavailable: typingsSlinky.stripejs.stripejsStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unchecked: typingsSlinky.stripejs.stripejsStrings.unchecked = this.cast("unchecked")
}

