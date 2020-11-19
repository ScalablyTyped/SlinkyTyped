package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a phone event that triggers a background task. */
@JSGlobal("Windows.ApplicationModel.Background.PhoneTrigger")
@js.native
class PhoneTrigger protected ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.PhoneTrigger {
  /**
    * Initializes a new instance of the PhoneTrigger class.
    * @param type Specifies the type of phone event.
    * @param oneShot Indicates if the trigger is a one-shot notification. If you weren't subscribed when a one-shot notification was sent, you get nothing. If you weren't connected when you fired a one-shot notification, nothing happens.
    */
  def this(`type`: PhoneTriggerType, oneShot: Boolean) = this()
}
