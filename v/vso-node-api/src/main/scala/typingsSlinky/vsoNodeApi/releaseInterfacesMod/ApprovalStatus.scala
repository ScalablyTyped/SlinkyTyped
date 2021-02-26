package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalStatus")
@js.native
object ApprovalStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalStatus with Double] = js.native
  
  @js.native
  sealed trait Approved extends ApprovalStatus
  /* 2 */ val Approved: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Approved with Double = js.native
  
  @js.native
  sealed trait Canceled extends ApprovalStatus
  /* 7 */ val Canceled: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Canceled with Double = js.native
  
  @js.native
  sealed trait Pending extends ApprovalStatus
  /* 1 */ val Pending: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Pending with Double = js.native
  
  @js.native
  sealed trait Reassigned extends ApprovalStatus
  /* 6 */ val Reassigned: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Reassigned with Double = js.native
  
  @js.native
  sealed trait Rejected extends ApprovalStatus
  /* 4 */ val Rejected: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Rejected with Double = js.native
  
  @js.native
  sealed trait Skipped extends ApprovalStatus
  /* 8 */ val Skipped: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Skipped with Double = js.native
  
  @js.native
  sealed trait Undefined extends ApprovalStatus
  /* 0 */ val Undefined: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Undefined with Double = js.native
}
