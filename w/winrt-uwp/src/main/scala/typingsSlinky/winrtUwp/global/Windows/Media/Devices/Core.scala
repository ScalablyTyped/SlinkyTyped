package typingsSlinky.winrtUwp.global.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.Numerics.Vector2
import typingsSlinky.winrtUwp.Windows.Foundation.Numerics.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Accesses and controls the device for variable photo sequences. */
@JSGlobal("Windows.Media.Devices.Core")
@js.native
object Core extends js.Object {
  
  /** Represents the intrinsics that describe the camera distortion model. */
  @js.native
  class CameraIntrinsics protected ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.CameraIntrinsics {
    /**
      * Initializes a new instance of the CameraIntrinsics class.
      * @param focalLength The focal length of the camera.
      * @param principalPoint The principal point of the camera.
      * @param radialDistortion The radial distortion coefficient of the camera.
      * @param tangentialDistortion The tangential distortion coefficient of the camera.
      * @param imageWidth The image width of the camera, in pixels.
      * @param imageHeight The image height of the camera, in pixels.
      */
    def this(
      focalLength: Vector2,
      principalPoint: Vector2,
      radialDistortion: Vector3,
      tangentialDistortion: Vector2,
      imageWidth: Double,
      imageHeight: Double
    ) = this()
  }
  
  /** Provides information about the variable photo sequence capabilities of the capture device. */
  @js.native
  abstract class FrameControlCapabilities ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameControlCapabilities
  
  /** Represents the settings for a frame in a variable photo sequence. */
  @js.native
  /** Initializes a new instance of the FrameController class. */
  class FrameController ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameController
  
  /** Provides information about the exposure time capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameExposureCapabilities ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameExposureCapabilities
  
  /** Provides information about the exposure compensation capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameExposureCompensationCapabilities ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameExposureCompensationCapabilities
  
  /** Represents the exposure compensation settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameExposureCompensationControl ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameExposureCompensationControl
  
  /** Represents the exposure time settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameExposureControl ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameExposureControl
  
  /** Provides information about the flash capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameFlashCapabilities ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameFlashCapabilities
  
  /** Represents the flash settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameFlashControl ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameFlashControl
  
  /** Specifies the flash mode for a frame in a variable photo sequence. */
  @js.native
  object FrameFlashMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameFlashMode with Double] = js.native
    
    /* 0 */ val disable: typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameFlashMode.disable with Double = js.native
    
    /* 1 */ val enable: typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameFlashMode.enable with Double = js.native
    
    /* 2 */ val global: typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameFlashMode.global with Double = js.native
  }
  
  /** Provides information about the focus capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameFocusCapabilities ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameFocusCapabilities
  
  /** Represents the focus settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameFocusControl ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameFocusControl
  
  /** Provides information about the ISO speed capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameIsoSpeedCapabilities ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameIsoSpeedCapabilities
  
  /** Represents the ISO speed settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameIsoSpeedControl ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.FrameIsoSpeedControl
  
  /** Represents the settings for a variable photo sequence. */
  @js.native
  abstract class VariablePhotoSequenceController ()
    extends typingsSlinky.winrtUwp.Windows.Media.Devices.Core.VariablePhotoSequenceController
}
