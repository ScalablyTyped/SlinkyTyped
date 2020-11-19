package typingsSlinky.winrtUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnforcementLevel extends js.Object
/** A set of enumerated values together describing the possible enterprise data protection (EDP) enforcement levels. EDP enforcement level is one aspect of mobile device management (MDM) policy configuration. */
@JSGlobal("Windows.Security.EnterpriseData.EnforcementLevel")
@js.native
object EnforcementLevel extends js.Object {
  
  /** The policy calls for the user to be blocked. In response to an attempted action such as pasting data into an unauthorized app, your app should block the action, and audit it. */
  @js.native
  sealed trait block extends EnforcementLevel
  
  /** The policy calls for no protection. Your app should disable EDP behavior if data is protected, and unprotect data. */
  @js.native
  sealed trait noProtection extends EnforcementLevel
  
  /** The policy calls for the user to be allowed to override a warning message. In response to an attempted action such as pasting data into an unauthorized app, your app should prompt the user via an overridable warning message. If the user overrides, then your app should perform the action and audit it. */
  @js.native
  sealed trait `override` extends EnforcementLevel
  
  /** The policy calls for silent protection. Your app should not prompt in response to an action such as pasting data into an unauthorized app. Instead, your app should silently allow the action, and audit it. */
  @js.native
  sealed trait silent extends EnforcementLevel
}
