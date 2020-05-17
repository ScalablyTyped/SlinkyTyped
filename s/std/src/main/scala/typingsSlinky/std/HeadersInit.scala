package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Headers
  - js.Array[js.Array[java.lang.String]]
  - typingsSlinky.std.Record[java.lang.String, java.lang.String]
*/
trait HeadersInit extends js.Object

object HeadersInit {
  @scala.inline
  implicit def apply(value: js.Array[js.Array[java.lang.String]]): HeadersInit = value.asInstanceOf[HeadersInit]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.experimental.Headers): HeadersInit = value.asInstanceOf[HeadersInit]
  @scala.inline
  implicit def apply(value: Record[java.lang.String, java.lang.String]): HeadersInit = value.asInstanceOf[HeadersInit]
}

