package typingsSlinky.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsDataFormat extends StObject
/** This enumerated type identifies the format of a given protocol description unit (PDU) buffer. */
@JSGlobal("Windows.Devices.Sms.SmsDataFormat")
@js.native
object SmsDataFormat extends StObject {
  
  /** The data format is CDMA WMT format of type deliver. */
  @js.native
  sealed trait cdmaDeliver extends SmsDataFormat
  
  /** The data format is CDMA WMT format of type submit. */
  @js.native
  sealed trait cdmaSubmit extends SmsDataFormat
  
  /** The data format is GSM of type deliver. */
  @js.native
  sealed trait gsmDeliver extends SmsDataFormat
  
  /** The data format is GSM of type submit. */
  @js.native
  sealed trait gsmSubmit extends SmsDataFormat
  
  /** The data format is unknown. */
  @js.native
  sealed trait unknown extends SmsDataFormat
}
