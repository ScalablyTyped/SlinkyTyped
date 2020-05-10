package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromPixelsAttrs extends js.Object {
  var numChannels: Double = js.native
}

object FromPixelsAttrs {
  @scala.inline
  def apply(numChannels: Double): FromPixelsAttrs = {
    val __obj = js.Dynamic.literal(numChannels = numChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPixelsAttrs]
  }
  @scala.inline
  implicit class FromPixelsAttrsOps[Self <: FromPixelsAttrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numChannels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

