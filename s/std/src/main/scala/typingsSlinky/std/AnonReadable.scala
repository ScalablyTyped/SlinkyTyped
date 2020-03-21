package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadable[R, T] extends js.Object {
  var readable: org.scalajs.dom.experimental.ReadableStream[T]
  var writable: WritableStream[R]
}

object AnonReadable {
  @scala.inline
  def apply[R, T](readable: org.scalajs.dom.experimental.ReadableStream[T], writable: WritableStream[R]): AnonReadable[R, T] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReadable[R, T]]
  }
}

