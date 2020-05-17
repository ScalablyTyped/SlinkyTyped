package typingsSlinky.webrtc.W3C

import typingsSlinky.webrtc.ConstrainNumberRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.webrtc.ConstrainNumberRange
*/
trait ConstrainNumber extends js.Object

object ConstrainNumber {
  @scala.inline
  implicit def apply(value: ConstrainNumberRange): ConstrainNumber = value.asInstanceOf[ConstrainNumber]
  @scala.inline
  implicit def apply(value: Double): ConstrainNumber = value.asInstanceOf[ConstrainNumber]
}

