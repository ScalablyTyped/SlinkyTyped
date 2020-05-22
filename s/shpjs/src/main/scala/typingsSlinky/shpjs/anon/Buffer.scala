package typingsSlinky.shpjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var buffer: js.typedarray.ArrayBuffer
}

object Buffer {
  @scala.inline
  def apply(buffer: js.typedarray.ArrayBuffer): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

