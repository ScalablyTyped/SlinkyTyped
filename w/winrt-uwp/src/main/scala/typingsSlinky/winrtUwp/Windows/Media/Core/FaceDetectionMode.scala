package typingsSlinky.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FaceDetectionMode extends StObject
/** Specifies the mode used for face detection. */
@JSGlobal("Windows.Media.Core.FaceDetectionMode")
@js.native
object FaceDetectionMode extends StObject {
  
  /** The prioritization of detection speed and result quality are balanced. */
  @js.native
  sealed trait balanced extends FaceDetectionMode
  
  /** The speed of face detection is prioritized over the accuracy of the face detection results. */
  @js.native
  sealed trait highPerformance extends FaceDetectionMode
  
  /** The accuracy of face detection results is prioritized over the speed of face detection. */
  @js.native
  sealed trait highQuality extends FaceDetectionMode
}
