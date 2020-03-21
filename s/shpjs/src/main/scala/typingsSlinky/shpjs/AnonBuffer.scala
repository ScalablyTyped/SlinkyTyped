package typingsSlinky.shpjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var buffer: scala.scalajs.js.typedarray.ArrayBuffer
}

object AnonBuffer {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.ArrayBuffer): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuffer]
  }
}

