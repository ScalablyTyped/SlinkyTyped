package typingsSlinky.winrtUwp.Windows.Media.Transcoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaVideoProcessingAlgorithm extends js.Object
/** Defines the available algorithms used by the Transcode Video Processor (XVP). */
@JSGlobal("Windows.Media.Transcoding.MediaVideoProcessingAlgorithm")
@js.native
object MediaVideoProcessingAlgorithm extends js.Object {
  
  /** Default video processing algorithm. This algorithm prefers performance, speed, and space over quality. This algorithm will makes use of hardware. */
  @js.native
  sealed trait default extends MediaVideoProcessingAlgorithm
  
  /** Prefers quality over performance. This mode always runs in software and insures that hardware implementations, which may differ from the XVP are not used. */
  @js.native
  sealed trait mrfCrf444 extends MediaVideoProcessingAlgorithm
}
