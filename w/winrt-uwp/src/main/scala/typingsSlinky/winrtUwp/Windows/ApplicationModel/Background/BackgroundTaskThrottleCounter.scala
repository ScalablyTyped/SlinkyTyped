package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundTaskThrottleCounter extends StObject
/** Indicates the type of throttle count to check for in a GetThrottleCount request. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter")
@js.native
object BackgroundTaskThrottleCounter extends StObject {
  
  /** Indicates a request for all throttle counts (CPU and network). */
  @js.native
  sealed trait all extends BackgroundTaskThrottleCounter
  
  /** Indicates a request for CPU throttle count. */
  @js.native
  sealed trait cpu extends BackgroundTaskThrottleCounter
  
  /** Indicates a request for network throttle count. */
  @js.native
  sealed trait network extends BackgroundTaskThrottleCounter
}
