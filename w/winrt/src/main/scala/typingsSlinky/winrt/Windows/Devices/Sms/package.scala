package typingsSlinky.winrt.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Sms {
  
  type SmsDeviceStatusChangedEventHandler = js.Function1[/* sender */ typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice, scala.Unit]
  
  type SmsMessageReceivedEventHandler = js.Function2[
    /* sender */ typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice, 
    /* e */ typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageReceivedEventArgs, 
    scala.Unit
  ]
}
