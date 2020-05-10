package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteLengthChunk extends js.Object {
  var byteLength: js.UndefOr[Double] = js.native
}

object ByteLengthChunk {
  @scala.inline
  def apply(): ByteLengthChunk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteLengthChunk]
  }
  @scala.inline
  implicit class ByteLengthChunkOps[Self <: ByteLengthChunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteLength")(js.undefined)
        ret
    }
  }
  
}

