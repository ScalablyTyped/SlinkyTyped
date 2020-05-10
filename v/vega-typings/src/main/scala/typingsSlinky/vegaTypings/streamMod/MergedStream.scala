package typingsSlinky.vegaTypings.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergedStream
  extends _Stream
     with StreamParameters {
  var merge: js.Array[Stream] = js.native
}

object MergedStream {
  @scala.inline
  def apply(merge: js.Array[Stream]): MergedStream = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergedStream]
  }
  @scala.inline
  implicit class MergedStreamOps[Self <: MergedStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMerge(value: js.Array[Stream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

