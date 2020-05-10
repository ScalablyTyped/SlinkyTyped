package typingsSlinky.streamBuffers.mod

import typingsSlinky.node.streamMod.ReadableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamBufferOptions extends ReadableOptions {
  var chunkSize: js.UndefOr[Double] = js.native
  var frequency: js.UndefOr[Double] = js.native
  var incrementAmount: js.UndefOr[Double] = js.native
  var initialSize: js.UndefOr[Double] = js.native
}

object ReadableStreamBufferOptions {
  @scala.inline
  def apply(): ReadableStreamBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadableStreamBufferOptions]
  }
  @scala.inline
  implicit class ReadableStreamBufferOptionsOps[Self <: ReadableStreamBufferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
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

