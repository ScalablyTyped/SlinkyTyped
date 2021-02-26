package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebVR API interface represents all the information needed to render a single frame of a VR scene; constructed by VRDisplay.getFrameData(). */
@js.native
trait VRFrameData extends StObject {
  
  val leftProjectionMatrix: js.typedarray.Float32Array = js.native
  
  val leftViewMatrix: js.typedarray.Float32Array = js.native
  
  val pose: VRPose = js.native
  
  val rightProjectionMatrix: js.typedarray.Float32Array = js.native
  
  val rightViewMatrix: js.typedarray.Float32Array = js.native
  
  val timestamp: Double = js.native
}
object VRFrameData {
  
  @scala.inline
  def apply(
    leftProjectionMatrix: js.typedarray.Float32Array,
    leftViewMatrix: js.typedarray.Float32Array,
    pose: VRPose,
    rightProjectionMatrix: js.typedarray.Float32Array,
    rightViewMatrix: js.typedarray.Float32Array,
    timestamp: Double
  ): VRFrameData = {
    val __obj = js.Dynamic.literal(leftProjectionMatrix = leftProjectionMatrix.asInstanceOf[js.Any], leftViewMatrix = leftViewMatrix.asInstanceOf[js.Any], pose = pose.asInstanceOf[js.Any], rightProjectionMatrix = rightProjectionMatrix.asInstanceOf[js.Any], rightViewMatrix = rightViewMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRFrameData]
  }
  
  @scala.inline
  implicit class VRFrameDataMutableBuilder[Self <: VRFrameData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftProjectionMatrix(value: js.typedarray.Float32Array): Self = StObject.set(x, "leftProjectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftViewMatrix(value: js.typedarray.Float32Array): Self = StObject.set(x, "leftViewMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPose(value: VRPose): Self = StObject.set(x, "pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightProjectionMatrix(value: js.typedarray.Float32Array): Self = StObject.set(x, "rightProjectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightViewMatrix(value: js.typedarray.Float32Array): Self = StObject.set(x, "rightViewMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
