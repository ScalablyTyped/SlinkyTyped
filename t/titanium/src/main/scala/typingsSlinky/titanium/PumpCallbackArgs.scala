package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Buffer
import typingsSlinky.titanium.Titanium.IOStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback each time the
  * [pump](Titanium.Stream.pump) operation has new data to deliver.
  */
@js.native
trait PumpCallbackArgs extends ErrorResponse {
  /**
  	 * Buffer object holding the data currently being pumped to the handler method.
  	 */
  var buffer: js.UndefOr[Buffer] = js.native
  /**
  	 * Number of bytes being passed to this invocation of the handler, or
  	 * -1 in the event of an error or end of stream.
  	 */
  var bytesProcessed: js.UndefOr[Double] = js.native
  /**
  	 * Stream being read from.
  	 */
  var source: js.UndefOr[IOStream] = js.native
  /**
  	 * Total number of bytes read from the stream so far,
  	 * including the data passed to this current invocation of the handler.
  	 */
  var totalBytesProcessed: js.UndefOr[Double] = js.native
}

object PumpCallbackArgs {
  @scala.inline
  def apply(): PumpCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PumpCallbackArgs]
  }
  @scala.inline
  implicit class PumpCallbackArgsOps[Self <: PumpCallbackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
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
    @scala.inline
    def withTotalBytesProcessed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessed")(js.undefined)
        ret
    }
  }
  
}

