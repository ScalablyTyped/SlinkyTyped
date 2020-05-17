package typingsSlinky.winrtUwp.Windows.Media.Transcoding

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an asynchronous media transcode deferral operation which can be used to start the transcode operation. */
@js.native
trait PrepareTranscodeResult extends js.Object {
  /** Indicates whether the trancode operation can be performed successfully. */
  var canTranscode: Boolean = js.native
  /** Specifies the reason for the transcode failure. */
  var failureReason: TranscodeFailureReason = js.native
  /**
    * Creates an object to perform an asynchronous media transcode operation on media data.
    * @return An object that is used to control the asynchronous operation.
    */
  def transcodeAsync(): IPromiseWithIAsyncActionWithProgress[Double] = js.native
}

object PrepareTranscodeResult {
  @scala.inline
  def apply(
    canTranscode: Boolean,
    failureReason: TranscodeFailureReason,
    transcodeAsync: () => IPromiseWithIAsyncActionWithProgress[Double]
  ): PrepareTranscodeResult = {
    val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], transcodeAsync = js.Any.fromFunction0(transcodeAsync))
    __obj.asInstanceOf[PrepareTranscodeResult]
  }
  @scala.inline
  implicit class PrepareTranscodeResultOps[Self <: PrepareTranscodeResult] (val x: Self) extends AnyVal {
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
    def withTranscodeAsync(value: () => IPromiseWithIAsyncActionWithProgress[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcodeAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

