package typingsSlinky.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Protection {
  
  /** Represents the method that handles the data passed by the MediaProtectionManager when a load of binary data fails. */
  type ComponentLoadFailedEventHandler = js.Function1[
    /* ev */ typingsSlinky.winrtUwp.Windows.Media.Protection.ComponentLoadFailedEventArgs with typingsSlinky.winrtUwp.Windows.WinRTEvent[typingsSlinky.winrtUwp.Windows.Media.Protection.MediaProtectionManager], 
    scala.Unit
  ]
  
  /** Represents the method that handles the data passed by the MediaProtectionManager that requires a reboot. */
  type RebootNeededEventHandler = js.Function1[
    /* ev */ typingsSlinky.winrtUwp.Windows.WinRTEvent[typingsSlinky.winrtUwp.Windows.Media.Protection.MediaProtectionManager], 
    scala.Unit
  ]
  
  /** Represents the method that handles the data passed by the MediaProtectionManager when the resume operation is completed. */
  type ServiceRequestedEventHandler = js.Function1[
    /* ev */ typingsSlinky.winrtUwp.Windows.Media.Protection.ServiceRequestedEventArgs with typingsSlinky.winrtUwp.Windows.WinRTEvent[typingsSlinky.winrtUwp.Windows.Media.Protection.MediaProtectionManager], 
    scala.Unit
  ]
}
