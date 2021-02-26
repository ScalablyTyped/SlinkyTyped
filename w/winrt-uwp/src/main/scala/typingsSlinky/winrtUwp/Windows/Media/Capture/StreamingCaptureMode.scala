package typingsSlinky.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreamingCaptureMode extends StObject
/** Specifies the streaming mode for a media capture device. */
@JSGlobal("Windows.Media.Capture.StreamingCaptureMode")
@js.native
object StreamingCaptureMode extends StObject {
  
  /** Capture audio only. */
  @js.native
  sealed trait audio extends StreamingCaptureMode
  
  /** Capture audio and video. */
  @js.native
  sealed trait audioAndVideo extends StreamingCaptureMode
  
  /** Capture video only. */
  @js.native
  sealed trait video extends StreamingCaptureMode
}
