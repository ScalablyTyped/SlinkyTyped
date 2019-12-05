package typingsSlinky.vsoDashNodeDashApi.interfacesPolicyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PolicyEvaluationStatus extends js.Object

@JSImport("vso-node-api/interfaces/PolicyInterfaces", "PolicyEvaluationStatus")
@js.native
object PolicyEvaluationStatus extends js.Object {
  /**
    * The policy has been fulfilled for this pull request.
    */
  @js.native
  sealed trait Approved extends PolicyEvaluationStatus
  
  /**
    * The policy has encountered an unexpected error.
    */
  @js.native
  sealed trait Broken extends PolicyEvaluationStatus
  
  /**
    * The policy does not apply to this pull request.
    */
  @js.native
  sealed trait NotApplicable extends PolicyEvaluationStatus
  
  /**
    * The policy is either queued to run, or is waiting for some event before progressing.
    */
  @js.native
  sealed trait Queued extends PolicyEvaluationStatus
  
  /**
    * The policy has rejected this pull request.
    */
  @js.native
  sealed trait Rejected extends PolicyEvaluationStatus
  
  /**
    * The policy is currently running.
    */
  @js.native
  sealed trait Running extends PolicyEvaluationStatus
  
  /* 2 */ val Approved: typingsSlinky.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Approved with Double = js.native
  /* 5 */ val Broken: typingsSlinky.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Broken with Double = js.native
  /* 4 */ val NotApplicable: typingsSlinky.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.NotApplicable with Double = js.native
  /* 0 */ val Queued: typingsSlinky.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Queued with Double = js.native
  /* 3 */ val Rejected: typingsSlinky.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Rejected with Double = js.native
  /* 1 */ val Running: typingsSlinky.vsoDashNodeDashApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Running with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PolicyEvaluationStatus with Double] = js.native
}

