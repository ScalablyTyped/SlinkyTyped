package typingsSlinky.strange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Date
  - scala.Double
  - java.lang.String
*/
trait Endpoint extends js.Object

object Endpoint {
  @scala.inline
  implicit def apply(value: js.Date): Endpoint = value.asInstanceOf[Endpoint]
  @scala.inline
  implicit def apply(value: Double): Endpoint = value.asInstanceOf[Endpoint]
  @scala.inline
  implicit def apply(value: String): Endpoint = value.asInstanceOf[Endpoint]
}

