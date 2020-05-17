package typingsSlinky.webrtc.W3C

import typingsSlinky.webrtc.ConstrainStringParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.webrtc.ConstrainStringParameters
*/
trait ConstrainString extends js.Object

object ConstrainString {
  @scala.inline
  implicit def apply(value: js.Array[String]): ConstrainString = value.asInstanceOf[ConstrainString]
  @scala.inline
  implicit def apply(value: ConstrainStringParameters): ConstrainString = value.asInstanceOf[ConstrainString]
  @scala.inline
  implicit def apply(value: String): ConstrainString = value.asInstanceOf[ConstrainString]
}

