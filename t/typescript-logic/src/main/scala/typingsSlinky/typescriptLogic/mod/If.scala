package typingsSlinky.typescriptLogic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - WhenFalse
  - WhenTrue
*/
trait If[Boolean /* <: Boolean */, WhenTrue, WhenFalse] extends js.Object

object If {
  @scala.inline
  implicit def apply[Boolean, WhenTrue, WhenFalse](value: WhenFalse | WhenTrue): If[Boolean, WhenTrue, WhenFalse] = value.asInstanceOf[If[Boolean, WhenTrue, WhenFalse]]
}

