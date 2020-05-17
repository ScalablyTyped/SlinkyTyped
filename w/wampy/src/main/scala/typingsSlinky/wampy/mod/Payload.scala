package typingsSlinky.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wampy.mod.Args
  - typingsSlinky.wampy.mod.Dict
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Array[js.Any]
  - scala.Null
*/
trait Payload extends js.Object

object Payload {
  @scala.inline
  implicit def apply(value: Args): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: Boolean): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: Dict): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: Double): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: Null): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: String): Payload = value.asInstanceOf[Payload]
}

