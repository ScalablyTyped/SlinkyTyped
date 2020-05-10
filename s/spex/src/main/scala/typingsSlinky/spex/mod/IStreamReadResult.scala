package typingsSlinky.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamReadResult extends js.Object {
  var calls: Double = js.native
  var duration: Double = js.native
  var length: Double = js.native
  var reads: Double = js.native
}

object IStreamReadResult {
  @scala.inline
  def apply(calls: Double, duration: Double, length: Double, reads: Double): IStreamReadResult = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], reads = reads.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamReadResult]
  }
  @scala.inline
  implicit class IStreamReadResultOps[Self <: IStreamReadResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reads")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

