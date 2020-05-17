package typingsSlinky.swToolbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
*/
trait URLPattern extends js.Object

object URLPattern {
  @scala.inline
  implicit def apply(value: js.RegExp): URLPattern = value.asInstanceOf[URLPattern]
  @scala.inline
  implicit def apply(value: String): URLPattern = value.asInstanceOf[URLPattern]
}

