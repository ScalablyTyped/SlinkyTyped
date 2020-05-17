package typingsSlinky.xRay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xRay.mod.ScalarSelector
  - typingsSlinky.xRay.mod.SelectorArray
*/
trait Selector extends js.Object

object Selector {
  @scala.inline
  implicit def apply(value: ScalarSelector): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: SelectorArray): Selector = value.asInstanceOf[Selector]
}

