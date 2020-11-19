package typingsSlinky.winrtUwp.global.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Possible results when access to protected content is requested or queried. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult")
@js.native
object ProtectionPolicyEvaluationResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult with Double
  ] = js.native
  
  /* 0 */ val allowed: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.allowed with Double = js.native
  
  /* 1 */ val blocked: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.blocked with Double = js.native
  
  /* 2 */ val consentRequired: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.consentRequired with Double = js.native
}
