package typingsSlinky.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaCaptureOptimization extends js.Object
/** Defines the optimizations that the media capture device can use. */
@JSGlobal("Windows.Media.Devices.MediaCaptureOptimization")
@js.native
object MediaCaptureOptimization extends js.Object {
  
  /** The default driver settings are used. */
  @js.native
  sealed trait default extends MediaCaptureOptimization
  
  /** Low latency is prioritized. */
  @js.native
  sealed trait latency extends MediaCaptureOptimization
  
  /** Low latency is prioritized, with low power consumption prioritized second. */
  @js.native
  sealed trait latencyThenPower extends MediaCaptureOptimization
  
  /** Low latency is prioritized, with high picture quality prioritized second. */
  @js.native
  sealed trait latencyThenQuality extends MediaCaptureOptimization
  
  /** Low power consumption is prioritized. */
  @js.native
  sealed trait power extends MediaCaptureOptimization
  
  /** Low power consumption and high picture quality are prioritized. */
  @js.native
  sealed trait powerAndQuality extends MediaCaptureOptimization
  
  /** High picture quality is prioritized. */
  @js.native
  sealed trait quality extends MediaCaptureOptimization
}
