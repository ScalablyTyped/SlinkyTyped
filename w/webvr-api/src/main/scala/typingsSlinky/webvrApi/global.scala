package typingsSlinky.webvrApi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class VRDisplay ()
    extends typingsSlinky.webvrApi.VRDisplay
  
  @js.native
  class VRDisplayCapabilities ()
    extends typingsSlinky.webvrApi.VRDisplayCapabilities {
    /* CompleteClass */
    override val canPresent: Boolean = js.native
    /* CompleteClass */
    override val hasExternalDisplay: Boolean = js.native
    /* CompleteClass */
    override val hasOrientation: Boolean = js.native
    /* CompleteClass */
    override val hasPosition: Boolean = js.native
    /* CompleteClass */
    override val maxLayers: Double = js.native
  }
  
  @js.native
  class VRDisplayEvent protected ()
    extends typingsSlinky.webvrApi.VRDisplayEvent {
    def this(`type`: String, eventInitDict: VRDisplayEventInit) = this()
  }
  
  @js.native
  class VREyeParameters ()
    extends typingsSlinky.webvrApi.VREyeParameters {
    /** @deprecated */
    /* CompleteClass */
    override val fieldOfView: typingsSlinky.webvrApi.VRFieldOfView = js.native
    /* CompleteClass */
    override val offset: js.typedarray.Float32Array = js.native
    /* CompleteClass */
    override val renderHeight: Double = js.native
    /* CompleteClass */
    override val renderWidth: Double = js.native
  }
  
  @js.native
  class VRFieldOfView ()
    extends typingsSlinky.webvrApi.VRFieldOfView {
    /* CompleteClass */
    override val downDegrees: Double = js.native
    /* CompleteClass */
    override val leftDegrees: Double = js.native
    /* CompleteClass */
    override val rightDegrees: Double = js.native
    /* CompleteClass */
    override val upDegrees: Double = js.native
  }
  
  @js.native
  class VRFrameData ()
    extends typingsSlinky.webvrApi.VRFrameData {
    /* CompleteClass */
    override val leftProjectionMatrix: js.typedarray.Float32Array = js.native
    /* CompleteClass */
    override val leftViewMatrix: js.typedarray.Float32Array = js.native
    /* CompleteClass */
    override val pose: typingsSlinky.webvrApi.VRPose = js.native
    /* CompleteClass */
    override val rightProjectionMatrix: js.typedarray.Float32Array = js.native
    /* CompleteClass */
    override val rightViewMatrix: js.typedarray.Float32Array = js.native
    /* CompleteClass */
    override val timestamp: Double = js.native
  }
  
  @js.native
  class VRPose ()
    extends typingsSlinky.webvrApi.VRPose {
    /* CompleteClass */
    override val angularAcceleration: js.typedarray.Float32Array | Null = js.native
    /* CompleteClass */
    override val angularVelocity: js.typedarray.Float32Array | Null = js.native
    /* CompleteClass */
    override val linearAcceleration: js.typedarray.Float32Array | Null = js.native
    /* CompleteClass */
    override val linearVelocity: js.typedarray.Float32Array | Null = js.native
    /* CompleteClass */
    override val orientation: js.typedarray.Float32Array | Null = js.native
    /* CompleteClass */
    override val position: js.typedarray.Float32Array | Null = js.native
    /* CompleteClass */
    override val timestamp: Double = js.native
  }
  
  @js.native
  object VRDisplay
    extends Instantiable0[typingsSlinky.webvrApi.VRDisplay]
  
  @js.native
  object VRDisplayCapabilities
    extends Instantiable0[typingsSlinky.webvrApi.VRDisplayCapabilities]
  
  @js.native
  object VRDisplayEvent
    extends Instantiable2[
          /* type */ String, 
          /* eventInitDict */ VRDisplayEventInit, 
          typingsSlinky.webvrApi.VRDisplayEvent
        ]
  
  @js.native
  object VREyeParameters
    extends Instantiable0[typingsSlinky.webvrApi.VREyeParameters]
  
  @js.native
  object VRFieldOfView
    extends Instantiable0[typingsSlinky.webvrApi.VRFieldOfView]
  
  @js.native
  object VRFrameData
    extends Instantiable0[typingsSlinky.webvrApi.VRFrameData]
  
  @js.native
  object VRPose
    extends Instantiable0[typingsSlinky.webvrApi.VRPose]
  
}

