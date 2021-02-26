package typingsSlinky.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialTappedEventArgs extends StObject {
  
  var interactionSourceKind: js.Any = js.native
  
  /* unmapped type */
  var tapCount: js.Any = js.native
  
  /* unmapped type */
  var tryGetPointerPose: js.Any = js.native
}
object SpatialTappedEventArgs {
  
  @scala.inline
  def apply(interactionSourceKind: js.Any, tapCount: js.Any, tryGetPointerPose: js.Any): SpatialTappedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tapCount = tapCount.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialTappedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialTappedEventArgsMutableBuilder[Self <: SpatialTappedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapCount(value: js.Any): Self = StObject.set(x, "tapCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetPointerPose(value: js.Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
