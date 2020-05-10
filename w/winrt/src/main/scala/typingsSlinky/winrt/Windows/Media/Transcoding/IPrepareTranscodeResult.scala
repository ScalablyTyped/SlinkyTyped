package typingsSlinky.winrt.Windows.Media.Transcoding

import typingsSlinky.winrt.Windows.Foundation.IAsyncActionWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrepareTranscodeResult extends js.Object {
  var canTranscode: Boolean = js.native
  var failureReason: TranscodeFailureReason = js.native
  def transcodeAsync(): IAsyncActionWithProgress[Double] = js.native
}

object IPrepareTranscodeResult {
  @scala.inline
  def apply(
    canTranscode: Boolean,
    failureReason: TranscodeFailureReason,
    transcodeAsync: () => IAsyncActionWithProgress[Double]
  ): IPrepareTranscodeResult = {
    val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], transcodeAsync = js.Any.fromFunction0(transcodeAsync))
    __obj.asInstanceOf[IPrepareTranscodeResult]
  }
  @scala.inline
  implicit class IPrepareTranscodeResultOps[Self <: IPrepareTranscodeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanTranscode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canTranscode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureReason(value: TranscodeFailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranscodeAsync(value: () => IAsyncActionWithProgress[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcodeAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

