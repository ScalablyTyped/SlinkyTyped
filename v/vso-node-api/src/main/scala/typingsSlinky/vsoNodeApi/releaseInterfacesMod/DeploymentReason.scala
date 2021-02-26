package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentReason extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentReason")
@js.native
object DeploymentReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentReason with Double] = js.native
  
  /**
    * The deployment reason is automated.
    */
  @js.native
  sealed trait Automated extends DeploymentReason
  /* 2 */ val Automated: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentReason.Automated with Double = js.native
  
  /**
    * The deployment reason is manual.
    */
  @js.native
  sealed trait Manual extends DeploymentReason
  /* 1 */ val Manual: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentReason.Manual with Double = js.native
  
  /**
    * The deployment reason is none.
    */
  @js.native
  sealed trait None extends DeploymentReason
  /* 0 */ val None: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentReason.None with Double = js.native
  
  /**
    * The deployment reason is scheduled.
    */
  @js.native
  sealed trait Scheduled extends DeploymentReason
  /* 4 */ val Scheduled: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentReason.Scheduled with Double = js.native
}
