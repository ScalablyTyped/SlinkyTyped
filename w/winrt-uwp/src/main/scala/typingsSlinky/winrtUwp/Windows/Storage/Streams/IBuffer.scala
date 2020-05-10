package typingsSlinky.winrtUwp.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a referenced array of bytes used by byte stream read and write interfaces. Buffer is the class implementation of this interface. */
@js.native
trait IBuffer extends js.Object {
  /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: Double = js.native
  /** Gets the number of bytes currently in use in the buffer. */
  var length: Double = js.native
}

object IBuffer {
  @scala.inline
  def apply(capacity: Double, length: Double): IBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBuffer]
  }
  @scala.inline
  implicit class IBufferOps[Self <: IBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

