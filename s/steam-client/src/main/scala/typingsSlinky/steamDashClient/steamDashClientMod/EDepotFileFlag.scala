package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDepotFileFlag extends js.Object

@JSImport("steam-client", "EDepotFileFlag")
@js.native
object EDepotFileFlag extends js.Object {
  @js.native
  sealed trait CustomExecutable extends EDepotFileFlag
  
  @js.native
  sealed trait Directory extends EDepotFileFlag
  
  @js.native
  sealed trait Encrypted extends EDepotFileFlag
  
  @js.native
  sealed trait Executable extends EDepotFileFlag
  
  @js.native
  sealed trait Hidden extends EDepotFileFlag
  
  @js.native
  sealed trait InstallScript extends EDepotFileFlag
  
  @js.native
  sealed trait ReadOnly extends EDepotFileFlag
  
  @js.native
  sealed trait Symlink extends EDepotFileFlag
  
  @js.native
  sealed trait UserConfig extends EDepotFileFlag
  
  @js.native
  sealed trait VersionedUserConfig extends EDepotFileFlag
  
  /* 128 */ val CustomExecutable: typingsSlinky.steamDashClient.steamDashClientMod.EDepotFileFlag.CustomExecutable with Double = js.native
  /* 64 */ val Directory: typingsSlinky.steamDashClient.steamDashClientMod.EDepotFileFlag.Directory with Double = js.native
  /* 4 */ val Encrypted: typingsSlinky.steamDashClient.steamDashClientMod.EDepotFileFlag.Encrypted with Double = js.native
  /* 32 */ val Executable: typingsSlinky.steamDashClient.steamDashClientMod.EDepotFileFlag.Executable with Double = js.native
  /* 16 */ val Hidden: typingsSlinky.steamDashClient.steamDashClientMod.EDepotFileFlag.Hidden with Double = js.native
  /* 256 */ val InstallScript: typingsSlinky.steamDashClient.steamDashClientMod.EDepotFileFlag.InstallScript with Double = js.native
  /* 8 */ val ReadOnly: typingsSlinky.steamDashClient.steamDashClientMod.EDepotFileFlag.ReadOnly with Double = js.native
  /* 512 */ val Symlink: typingsSlinky.steamDashClient.steamDashClientMod.EDepotFileFlag.Symlink with Double = js.native
  /* 1 */ val UserConfig: typingsSlinky.steamDashClient.steamDashClientMod.EDepotFileFlag.UserConfig with Double = js.native
  /* 2 */ val VersionedUserConfig: typingsSlinky.steamDashClient.steamDashClientMod.EDepotFileFlag.VersionedUserConfig with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepotFileFlag with Double] = js.native
}

