package typingsSlinky.tensorflowTfjsCore.reduceUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReduceInfo extends js.Object {
  var batchSize: Double = js.native
  var inSize: Double = js.native
  var windowSize: Double = js.native
}

object ReduceInfo {
  @scala.inline
  def apply(batchSize: Double, inSize: Double, windowSize: Double): ReduceInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], inSize = inSize.asInstanceOf[js.Any], windowSize = windowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReduceInfo]
  }
  @scala.inline
  implicit class ReduceInfoOps[Self <: ReduceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

