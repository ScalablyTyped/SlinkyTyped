package typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseDefinitionSource extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionSource")
@js.native
object ReleaseDefinitionSource extends js.Object {
  @js.native
  sealed trait Ibiza extends ReleaseDefinitionSource
  
  @js.native
  sealed trait PortalExtensionApi extends ReleaseDefinitionSource
  
  @js.native
  sealed trait RestApi extends ReleaseDefinitionSource
  
  @js.native
  sealed trait Undefined extends ReleaseDefinitionSource
  
  @js.native
  sealed trait UserInterface extends ReleaseDefinitionSource
  
  /* 4 */ val Ibiza: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionSource.Ibiza with Double = js.native
  /* 8 */ val PortalExtensionApi: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionSource.PortalExtensionApi with Double = js.native
  /* 1 */ val RestApi: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionSource.RestApi with Double = js.native
  /* 0 */ val Undefined: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionSource.Undefined with Double = js.native
  /* 2 */ val UserInterface: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionSource.UserInterface with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionSource with Double] = js.native
}

