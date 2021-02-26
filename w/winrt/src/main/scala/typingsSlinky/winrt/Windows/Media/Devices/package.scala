package typingsSlinky.winrt.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Devices {
  
  type CallControlEventHandler = js.Function1[/* sender */ typingsSlinky.winrt.Windows.Media.Devices.CallControl, scala.Unit]
  
  type DialRequestedEventHandler = js.Function2[
    /* sender */ typingsSlinky.winrt.Windows.Media.Devices.CallControl, 
    /* e */ typingsSlinky.winrt.Windows.Media.Devices.DialRequestedEventArgs, 
    scala.Unit
  ]
  
  type KeypadPressedEventHandler = js.Function2[
    /* sender */ typingsSlinky.winrt.Windows.Media.Devices.CallControl, 
    /* e */ typingsSlinky.winrt.Windows.Media.Devices.KeypadPressedEventArgs, 
    scala.Unit
  ]
  
  type RedialRequestedEventHandler = js.Function2[
    /* sender */ typingsSlinky.winrt.Windows.Media.Devices.CallControl, 
    /* e */ typingsSlinky.winrt.Windows.Media.Devices.RedialRequestedEventArgs, 
    scala.Unit
  ]
}
