package typingsSlinky.winrtUwp.global.Windows.Devices.Sms

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of SmsFilterRule instances. */
@JSGlobal("Windows.Devices.Sms.SmsFilterRules")
@js.native
class SmsFilterRules protected ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterRules {
  /**
    * Creates an instance of SmsFilterRules .
    * @param actionType An enumeration value that specifies which action type is to be associated with the rules for this instance. Action type determines the order in which rules are evaluated, as well as the action to be taken when a rule is matched.
    */
  def this(actionType: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterActionType) = this()
  /** The SmsFilterActionType for this set of filter rules. */
  /* CompleteClass */
  override var actionType: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterActionType = js.native
  /** Gets the list of rules in this SmsFilterRules instance. */
  /* CompleteClass */
  override var rules: IVector[typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsFilterRule] = js.native
}

