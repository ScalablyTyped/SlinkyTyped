package typingsSlinky.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsMessageClass extends StObject
/** This enumerated type specifies the message class of a message. The message class typically originates on the network, not the mobile device. */
@JSGlobal("Windows.Devices.Sms.SmsMessageClass")
@js.native
object SmsMessageClass extends StObject {
  
  /** Message should be immediately displayed. */
  @js.native
  sealed trait class0 extends SmsMessageClass
  
  /** Mobile equipment (ME) specific message. */
  @js.native
  sealed trait class1 extends SmsMessageClass
  
  /** SIM specific message. */
  @js.native
  sealed trait class2 extends SmsMessageClass
  
  /** Terminal equipment (TE) specific message. Note that this message type is not currently supported. */
  @js.native
  sealed trait class3 extends SmsMessageClass
  
  /** No class was specified. */
  @js.native
  sealed trait none extends SmsMessageClass
}
