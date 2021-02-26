package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatPermission extends StObject
@JSImport("steam-client", "EChatPermission")
@js.native
object EChatPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatPermission with Double] = js.native
  
  @js.native
  sealed trait Ban extends EChatPermission
  /* 256 */ val Ban: typingsSlinky.steamClient.mod.EChatPermission.Ban with Double = js.native
  
  @js.native
  sealed trait ChangeAccess extends EChatPermission
  /* 512 */ val ChangeAccess: typingsSlinky.steamClient.mod.EChatPermission.ChangeAccess with Double = js.native
  
  @js.native
  sealed trait ChangePermissions extends EChatPermission
  /* 128 */ val ChangePermissions: typingsSlinky.steamClient.mod.EChatPermission.ChangePermissions with Double = js.native
  
  @js.native
  sealed trait Close extends EChatPermission
  /* 1 */ val Close: typingsSlinky.steamClient.mod.EChatPermission.Close with Double = js.native
  
  // 8
  @js.native
  sealed trait EveryoneDefault extends EChatPermission
  /* 8 | 2 */ val EveryoneDefault: typingsSlinky.steamClient.mod.EChatPermission.EveryoneDefault with Double = js.native
  
  @js.native
  sealed trait EveryoneNotInClanDefault extends EChatPermission
  /* 8 */ val EveryoneNotInClanDefault: typingsSlinky.steamClient.mod.EChatPermission.EveryoneNotInClanDefault with Double = js.native
  
  @js.native
  sealed trait Invite extends EChatPermission
  /* 2 */ val Invite: typingsSlinky.steamClient.mod.EChatPermission.Invite with Double = js.native
  
  @js.native
  sealed trait Kick extends EChatPermission
  /* 16 */ val Kick: typingsSlinky.steamClient.mod.EChatPermission.Kick with Double = js.native
  
  // 891
  @js.native
  sealed trait Mask extends EChatPermission
  /* 1019 */ val Mask: typingsSlinky.steamClient.mod.EChatPermission.Mask with Double = js.native
  
  // 10
  // todo: this doesn't seem correct...
  @js.native
  sealed trait MemberDefault extends EChatPermission
  /* 256 | 16 | 8 | 2 */ val MemberDefault: typingsSlinky.steamClient.mod.EChatPermission.MemberDefault with Double = js.native
  
  @js.native
  sealed trait Mute extends EChatPermission
  /* 32 */ val Mute: typingsSlinky.steamClient.mod.EChatPermission.Mute with Double = js.native
  
  // 282
  @js.native
  sealed trait OfficerDefault extends EChatPermission
  /* 256 | 16 | 8 | 2 */ val OfficerDefault: typingsSlinky.steamClient.mod.EChatPermission.OfficerDefault with Double = js.native
  
  // 282
  @js.native
  sealed trait OwnerDefault extends EChatPermission
  /* 512 | 256 | 64 | 32 | 16 | 8 | 2 | 1 */ val OwnerDefault: typingsSlinky.steamClient.mod.EChatPermission.OwnerDefault with Double = js.native
  
  @js.native
  sealed trait SetMetadata extends EChatPermission
  /* 64 */ val SetMetadata: typingsSlinky.steamClient.mod.EChatPermission.SetMetadata with Double = js.native
  
  @js.native
  sealed trait Talk extends EChatPermission
  /* 8 */ val Talk: typingsSlinky.steamClient.mod.EChatPermission.Talk with Double = js.native
}
