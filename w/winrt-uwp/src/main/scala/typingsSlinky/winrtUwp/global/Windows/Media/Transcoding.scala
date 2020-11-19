package typingsSlinky.winrtUwp.global.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for transcoding audio and video files. */
@JSGlobal("Windows.Media.Transcoding")
@js.native
object Transcoding extends js.Object {
  
  /** Transcodes audio and video files. */
  @js.native
  /** Creates a new instance of the MediaTranscoder class. */
  class MediaTranscoder ()
    extends typingsSlinky.winrtUwp.Windows.Media.Transcoding.MediaTranscoder
  
  /** Defines the available algorithms used by the Transcode Video Processor (XVP). */
  @js.native
  object MediaVideoProcessingAlgorithm extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm with Double
      ] = js.native
    
    /* 0 */ val default: typingsSlinky.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm.default with Double = js.native
    
    /* 1 */ val mrfCrf444: typingsSlinky.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm.mrfCrf444 with Double = js.native
  }
  
  /** Represents an asynchronous media transcode deferral operation which can be used to start the transcode operation. */
  @js.native
  abstract class PrepareTranscodeResult ()
    extends typingsSlinky.winrtUwp.Windows.Media.Transcoding.PrepareTranscodeResult
  
  /** Specifies the reason the transcode operation failed. */
  @js.native
  object TranscodeFailureReason extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason with Double
      ] = js.native
    
    /* 3 */ val codecNotFound: typingsSlinky.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.codecNotFound with Double = js.native
    
    /* 2 */ val invalidProfile: typingsSlinky.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.invalidProfile with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.none with Double = js.native
    
    /* 1 */ val unknown: typingsSlinky.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.unknown with Double = js.native
  }
}
