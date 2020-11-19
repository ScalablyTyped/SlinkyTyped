package typingsSlinky.winrtUwp.global.Windows.Devices.Sms

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Class used to represent registered message filters. */
@JSGlobal("Windows.Devices.Sms.SmsMessageRegistration")
@js.native
abstract class SmsMessageRegistration ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration
/* static members */
@JSGlobal("Windows.Devices.Sms.SmsMessageRegistration")
@js.native
object SmsMessageRegistration extends js.Object {
  
  /** Static property that gets a list of currently registered message filters.. */
  var allRegistrations: IVectorView[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration] = js.native
  
  /**
    * Registers a message filter.
    * @param id Identifier used to describe this message filter.
    * @param filterRules An object that represents the filter rules to be used for this registered message filter.
    * @return On successful completion, the SmsMessageRegistration object that represents this registered message filter.
    */
  def register(id: String, filterRules: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterRules): typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageRegistration = js.native
}
