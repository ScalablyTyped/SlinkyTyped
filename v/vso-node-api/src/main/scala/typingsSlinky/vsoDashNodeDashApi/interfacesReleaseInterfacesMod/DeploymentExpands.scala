package typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentExpands extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentExpands")
@js.native
object DeploymentExpands extends js.Object {
  @js.native
  sealed trait All extends DeploymentExpands
  
  @js.native
  sealed trait Approvals extends DeploymentExpands
  
  @js.native
  sealed trait Artifacts extends DeploymentExpands
  
  @js.native
  sealed trait DeploymentOnly extends DeploymentExpands
  
  /* 0 */ val All: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentExpands.All with Double = js.native
  /* 2 */ val Approvals: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentExpands.Approvals with Double = js.native
  /* 4 */ val Artifacts: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentExpands.Artifacts with Double = js.native
  /* 1 */ val DeploymentOnly: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentExpands.DeploymentOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentExpands with Double] = js.native
}

