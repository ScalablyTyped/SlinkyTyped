package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentStatus")
@js.native
object DeploymentStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentStatus with Double] = js.native
  
  /**
    * The deployment status is all.
    */
  @js.native
  sealed trait All extends DeploymentStatus
  /* 31 */ val All: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.All with Double = js.native
  
  /**
    * The deployment status is failed.
    */
  @js.native
  sealed trait Failed extends DeploymentStatus
  /* 16 */ val Failed: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.Failed with Double = js.native
  
  /**
    * The deployment status is inprogress.
    */
  @js.native
  sealed trait InProgress extends DeploymentStatus
  /* 2 */ val InProgress: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.InProgress with Double = js.native
  
  /**
    * The deployment status is not deployed.
    */
  @js.native
  sealed trait NotDeployed extends DeploymentStatus
  /* 1 */ val NotDeployed: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.NotDeployed with Double = js.native
  
  /**
    * The deployment status is partiallysucceeded.
    */
  @js.native
  sealed trait PartiallySucceeded extends DeploymentStatus
  /* 8 */ val PartiallySucceeded: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.PartiallySucceeded with Double = js.native
  
  /**
    * The deployment status is succeeded.
    */
  @js.native
  sealed trait Succeeded extends DeploymentStatus
  /* 4 */ val Succeeded: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.Succeeded with Double = js.native
  
  /**
    * The deployment status is undefined.
    */
  @js.native
  sealed trait Undefined extends DeploymentStatus
  /* 0 */ val Undefined: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.Undefined with Double = js.native
}
