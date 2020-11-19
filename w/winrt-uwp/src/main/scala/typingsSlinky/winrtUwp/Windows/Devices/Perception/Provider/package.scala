package typingsSlinky.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Provider {
  
  /** Invoked when a PerceptionFaceAuthenticationGroup enters Face Authentication mode. */
  type PerceptionStartFaceAuthenticationHandler = js.Function1[
    /* sender */ typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup, 
    scala.Unit
  ]
  
  /** Invoked when a PerceptionFaceAuthenticationGroup exits Face Authentication mode. This will only be invoked after the group received a PerceptionStartFaceAuthenticationHandler from which it returned true. */
  type PerceptionStopFaceAuthenticationHandler = js.Function1[
    /* sender */ typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup, 
    scala.Unit
  ]
}
