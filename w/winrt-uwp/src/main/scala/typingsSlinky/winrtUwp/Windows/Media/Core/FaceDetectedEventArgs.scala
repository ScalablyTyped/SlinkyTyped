package typingsSlinky.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the FaceDetected event. */
@js.native
trait FaceDetectedEventArgs extends StObject {
  
  /** Gets the FaceDetectionEffectFrame associated with a FaceDetected event. */
  var resultFrame: FaceDetectionEffectFrame = js.native
}
object FaceDetectedEventArgs {
  
  @scala.inline
  def apply(resultFrame: FaceDetectionEffectFrame): FaceDetectedEventArgs = {
    val __obj = js.Dynamic.literal(resultFrame = resultFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceDetectedEventArgs]
  }
  
  @scala.inline
  implicit class FaceDetectedEventArgsMutableBuilder[Self <: FaceDetectedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultFrame(value: FaceDetectionEffectFrame): Self = StObject.set(x, "resultFrame", value.asInstanceOf[js.Any])
  }
}
