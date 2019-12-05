package typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IdentityDisplayFormat extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "IdentityDisplayFormat")
@js.native
object IdentityDisplayFormat extends js.Object {
  /**
    * Display Avatar and Full name
    */
  @js.native
  sealed trait AvatarAndFullName extends IdentityDisplayFormat
  
  /**
    * Display avatar only
    */
  @js.native
  sealed trait AvatarOnly extends IdentityDisplayFormat
  
  /**
    * Display Full name only
    */
  @js.native
  sealed trait FullName extends IdentityDisplayFormat
  
  /* 2 */ val AvatarAndFullName: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.IdentityDisplayFormat.AvatarAndFullName with Double = js.native
  /* 0 */ val AvatarOnly: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.IdentityDisplayFormat.AvatarOnly with Double = js.native
  /* 1 */ val FullName: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.IdentityDisplayFormat.FullName with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IdentityDisplayFormat with Double] = js.native
}

