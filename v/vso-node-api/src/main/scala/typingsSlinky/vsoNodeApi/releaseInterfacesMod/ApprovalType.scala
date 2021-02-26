package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalType")
@js.native
object ApprovalType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalType with Double] = js.native
  
  @js.native
  sealed trait All extends ApprovalType
  /* 3 */ val All: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalType.All with Double = js.native
  
  @js.native
  sealed trait PostDeploy extends ApprovalType
  /* 2 */ val PostDeploy: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalType.PostDeploy with Double = js.native
  
  @js.native
  sealed trait PreDeploy extends ApprovalType
  /* 1 */ val PreDeploy: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalType.PreDeploy with Double = js.native
  
  @js.native
  sealed trait Undefined extends ApprovalType
  /* 0 */ val Undefined: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalType.Undefined with Double = js.native
}
