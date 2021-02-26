package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentExpands extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentExpands")
@js.native
object DeploymentExpands extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentExpands with Double] = js.native
  
  @js.native
  sealed trait All extends DeploymentExpands
  /* 0 */ val All: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentExpands.All with Double = js.native
  
  @js.native
  sealed trait Approvals extends DeploymentExpands
  /* 2 */ val Approvals: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentExpands.Approvals with Double = js.native
  
  @js.native
  sealed trait Artifacts extends DeploymentExpands
  /* 4 */ val Artifacts: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentExpands.Artifacts with Double = js.native
  
  @js.native
  sealed trait DeploymentOnly extends DeploymentExpands
  /* 1 */ val DeploymentOnly: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentExpands.DeploymentOnly with Double = js.native
}
