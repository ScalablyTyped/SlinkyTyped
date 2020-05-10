package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.IOStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback when an asynchronous
  * [writeStream](Titanium.Stream.writeStream) operation finishes.
  */
@js.native
trait WriteStreamCallbackArgs extends ErrorResponse {
  /**
  	 * Number of bytes processed, or -1 in the event of an error or end of stream.
  	 */
  var bytesProcessed: js.UndefOr[Double] = js.native
  /**
  	 * Stream being read from.
  	 */
  var fromStream: js.UndefOr[IOStream] = js.native
  /**
  	 * Stream being written to.
  	 */
  var toStream: js.UndefOr[IOStream] = js.native
}

object WriteStreamCallbackArgs {
  @scala.inline
  def apply(): WriteStreamCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteStreamCallbackArgs]
  }
  @scala.inline
  implicit class WriteStreamCallbackArgsOps[Self <: WriteStreamCallbackArgs] (val x: Self) extends AnyVal {
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
    def withFromStream(value: IOStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromStream")(js.undefined)
        ret
    }
    @scala.inline
    def withToStream(value: IOStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toStream")(js.undefined)
        ret
    }
  }
  
}

