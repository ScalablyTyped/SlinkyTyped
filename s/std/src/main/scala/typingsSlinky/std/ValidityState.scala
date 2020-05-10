package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The validity states that an element can be in, with respect to constraint validation. Together, they help explain why an element's value fails to validate, if it's not valid. */
@js.native
trait ValidityState extends js.Object {
  val badInput: scala.Boolean = js.native
  val customError: scala.Boolean = js.native
  val patternMismatch: scala.Boolean = js.native
  val rangeOverflow: scala.Boolean = js.native
  val rangeUnderflow: scala.Boolean = js.native
  val stepMismatch: scala.Boolean = js.native
  val tooLong: scala.Boolean = js.native
  val tooShort: scala.Boolean = js.native
  val typeMismatch: scala.Boolean = js.native
  val valid: scala.Boolean = js.native
  val valueMissing: scala.Boolean = js.native
}

@JSGlobal("ValidityState")
@js.native
object ValidityState
  extends Instantiable0[org.scalajs.dom.raw.ValidityState]

