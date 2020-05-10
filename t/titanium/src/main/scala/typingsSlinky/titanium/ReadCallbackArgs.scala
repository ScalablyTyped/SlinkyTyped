package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.IOStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the read callback when an asynchronous [read](Titanium.Stream.read) operation
  * finishes.
  */
@js.native
trait ReadCallbackArgs extends ErrorResponse {
  /**
  	 * Number of bytes processed, or -1 in the event of an error or end of stream.
  	 */
  var bytesProcessed: js.UndefOr[Double] = js.native
  /**
  	 * Stream being read.
  	 */
  var source: js.UndefOr[IOStream] = js.native
}

object ReadCallbackArgs {
  @scala.inline
  def apply(): ReadCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadCallbackArgs]
  }
  @scala.inline
  implicit class ReadCallbackArgsOps[Self <: ReadCallbackArgs] (val x: Self) extends AnyVal {
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

