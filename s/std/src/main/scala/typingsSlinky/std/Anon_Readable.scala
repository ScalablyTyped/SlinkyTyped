package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Readable[R, T] extends js.Object {
  var readable: org.scalajs.dom.experimental.ReadableStream[T]
  var writable: WritableStream[R]
}

object Anon_Readable {
  @scala.inline
  def apply[R, T](readable: org.scalajs.dom.experimental.ReadableStream[T], writable: WritableStream[R]): Anon_Readable[R, T] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Readable[R, T]]
  }
}

