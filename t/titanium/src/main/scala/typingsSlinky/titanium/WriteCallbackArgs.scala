package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.IOStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the write callback when an asynchronous
  * [write](Titanium.Stream.write) operation
  * finishes.
  */
@js.native
trait WriteCallbackArgs extends ErrorResponse {
  /**
  	 * Number of bytes processed, or -1 in the event of an error or end of stream.
  	 */
  var bytesProcessed: js.UndefOr[Double] = js.native
  /**
  	 * Stream being written to.
  	 */
  var source: js.UndefOr[IOStream] = js.native
}

object WriteCallbackArgs {
  @scala.inline
  def apply(): WriteCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteCallbackArgs]
  }
  @scala.inline
  implicit class WriteCallbackArgsOps[Self <: WriteCallbackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesProcessed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: IOStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

