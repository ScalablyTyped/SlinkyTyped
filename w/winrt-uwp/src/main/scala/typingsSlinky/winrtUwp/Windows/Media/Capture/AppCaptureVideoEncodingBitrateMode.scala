package typingsSlinky.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppCaptureVideoEncodingBitrateMode extends StObject
/** Specifies the app capture video encoding bitrate mode. */
@JSGlobal("Windows.Media.Capture.AppCaptureVideoEncodingBitrateMode")
@js.native
object AppCaptureVideoEncodingBitrateMode extends StObject {
  
  /** Custom bitrate. */
  @js.native
  sealed trait custom extends AppCaptureVideoEncodingBitrateMode
  
  /** High bitrate. */
  @js.native
  sealed trait high extends AppCaptureVideoEncodingBitrateMode
  
  /** Standard bitrate. */
  @js.native
  sealed trait standard extends AppCaptureVideoEncodingBitrateMode
}
