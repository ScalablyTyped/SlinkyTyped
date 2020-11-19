package typingsSlinky.winrtUwp.Windows.Devices.SerialCommunication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SerialStopBitCount extends js.Object
/** Defines values that indicate the number of stop bits used in a transmission. The values are used by the StopBits property on the SerialDevice object. */
@JSGlobal("Windows.Devices.SerialCommunication.SerialStopBitCount")
@js.native
object SerialStopBitCount extends js.Object {
  
  /** One stop bit is used. */
  @js.native
  sealed trait one extends SerialStopBitCount
  
  /** 1.5 stop bits are used. */
  @js.native
  sealed trait onePointFive extends SerialStopBitCount
  
  /** Two stop bits are used. */
  @js.native
  sealed trait two extends SerialStopBitCount
}
