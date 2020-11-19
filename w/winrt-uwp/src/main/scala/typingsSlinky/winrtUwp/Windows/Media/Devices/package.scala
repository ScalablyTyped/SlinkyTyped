package typingsSlinky.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Devices {
  
  /** Handles the AnswerRequested and AudioTransferRequested events. */
  type CallControlEventHandler = js.Function1[
    /* ev */ typingsSlinky.winrtUwp.Windows.WinRTEvent[typingsSlinky.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
  
  /** Handles the DialRequested event. */
  type DialRequestedEventHandler = js.Function1[
    /* ev */ typingsSlinky.winrtUwp.Windows.Media.Devices.DialRequestedEventArgs with typingsSlinky.winrtUwp.Windows.WinRTEvent[typingsSlinky.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
  
  /** Handles the KeypadPressed event. */
  type KeypadPressedEventHandler = js.Function1[
    /* ev */ typingsSlinky.winrtUwp.Windows.Media.Devices.KeypadPressedEventArgs with typingsSlinky.winrtUwp.Windows.WinRTEvent[typingsSlinky.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
  
  /** Handles the RedialRequested event. */
  type RedialRequestedEventHandler = js.Function1[
    /* ev */ typingsSlinky.winrtUwp.Windows.Media.Devices.RedialRequestedEventArgs with typingsSlinky.winrtUwp.Windows.WinRTEvent[typingsSlinky.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
}
