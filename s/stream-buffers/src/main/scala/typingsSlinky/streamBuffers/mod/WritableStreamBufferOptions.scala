package typingsSlinky.streamBuffers.mod

import typingsSlinky.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStreamBufferOptions extends WritableOptions {
  var incrementAmount: js.UndefOr[Double] = js.native
  var initialSize: js.UndefOr[Double] = js.native
}

object WritableStreamBufferOptions {
  @scala.inline
  def apply(): WritableStreamBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritableStreamBufferOptions]
  }
  @scala.inline
  implicit class WritableStreamBufferOptionsOps[Self <: WritableStreamBufferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncrementAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSize")(js.undefined)
        ret
    }
  }
  
}

