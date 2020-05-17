package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Blob
  - typingsSlinky.std.BufferSource
  - typingsSlinky.std.FormData
  - typingsSlinky.std.URLSearchParams
  - typingsSlinky.std.ReadableStream[typingsSlinky.std.Uint8Array]
  - java.lang.String
*/
trait BodyInit extends js.Object

object BodyInit {
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.Blob): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: BufferSource): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.FormData): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.experimental.ReadableStream[js.typedarray.Uint8Array]): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: java.lang.String): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: URLSearchParams): BodyInit = value.asInstanceOf[BodyInit]
}

