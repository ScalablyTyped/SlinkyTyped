package typingsSlinky.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupScopeType extends js.Object

@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "GroupScopeType")
@js.native
object GroupScopeType extends js.Object {
  @js.native
  sealed trait Generic extends GroupScopeType
  
  @js.native
  sealed trait ServiceHost extends GroupScopeType
  
  @js.native
  sealed trait TeamProject extends GroupScopeType
  
  /* 0 */ val Generic: typingsSlinky.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.GroupScopeType.Generic with Double = js.native
  /* 1 */ val ServiceHost: typingsSlinky.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.GroupScopeType.ServiceHost with Double = js.native
  /* 2 */ val TeamProject: typingsSlinky.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.GroupScopeType.TeamProject with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupScopeType with Double] = js.native
}

