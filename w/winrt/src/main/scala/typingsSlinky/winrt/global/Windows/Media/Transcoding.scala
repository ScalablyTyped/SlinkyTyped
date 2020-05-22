package typingsSlinky.winrt.global.Windows.Media

import typingsSlinky.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsSlinky.winrt.Windows.Media.Transcoding.TranscodeFailureReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Transcoding")
@js.native
object Transcoding extends js.Object {
  @js.native
  class MediaTranscoder ()
    extends typingsSlinky.winrt.Windows.Media.Transcoding.MediaTranscoder
  
  @js.native
  class PrepareTranscodeResult ()
    extends typingsSlinky.winrt.Windows.Media.Transcoding.PrepareTranscodeResult {
    /* CompleteClass */
    override var canTranscode: Boolean = js.native
    /* CompleteClass */
    override var failureReason: TranscodeFailureReason = js.native
    /* CompleteClass */
    override def transcodeAsync(): IAsyncActionWithProgress[Double] = js.native
  }
  
  @js.native
  object TranscodeFailureReason extends js.Object {
    /* 3 */ val codecNotFound: typingsSlinky.winrt.Windows.Media.Transcoding.TranscodeFailureReason.codecNotFound with Double = js.native
    /* 2 */ val invalidProfile: typingsSlinky.winrt.Windows.Media.Transcoding.TranscodeFailureReason.invalidProfile with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.Media.Transcoding.TranscodeFailureReason.none with Double = js.native
    /* 1 */ val unknown: typingsSlinky.winrt.Windows.Media.Transcoding.TranscodeFailureReason.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Media.Transcoding.TranscodeFailureReason with Double] = js.native
  }
  
}

