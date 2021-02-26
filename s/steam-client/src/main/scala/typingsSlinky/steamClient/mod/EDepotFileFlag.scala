package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDepotFileFlag extends StObject
@JSImport("steam-client", "EDepotFileFlag")
@js.native
object EDepotFileFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepotFileFlag with Double] = js.native
  
  @js.native
  sealed trait CustomExecutable extends EDepotFileFlag
  /* 128 */ val CustomExecutable: typingsSlinky.steamClient.mod.EDepotFileFlag.CustomExecutable with Double = js.native
  
  @js.native
  sealed trait Directory extends EDepotFileFlag
  /* 64 */ val Directory: typingsSlinky.steamClient.mod.EDepotFileFlag.Directory with Double = js.native
  
  @js.native
  sealed trait Encrypted extends EDepotFileFlag
  /* 4 */ val Encrypted: typingsSlinky.steamClient.mod.EDepotFileFlag.Encrypted with Double = js.native
  
  @js.native
  sealed trait Executable extends EDepotFileFlag
  /* 32 */ val Executable: typingsSlinky.steamClient.mod.EDepotFileFlag.Executable with Double = js.native
  
  @js.native
  sealed trait Hidden extends EDepotFileFlag
  /* 16 */ val Hidden: typingsSlinky.steamClient.mod.EDepotFileFlag.Hidden with Double = js.native
  
  @js.native
  sealed trait InstallScript extends EDepotFileFlag
  /* 256 */ val InstallScript: typingsSlinky.steamClient.mod.EDepotFileFlag.InstallScript with Double = js.native
  
  @js.native
  sealed trait ReadOnly extends EDepotFileFlag
  /* 8 */ val ReadOnly: typingsSlinky.steamClient.mod.EDepotFileFlag.ReadOnly with Double = js.native
  
  @js.native
  sealed trait Symlink extends EDepotFileFlag
  /* 512 */ val Symlink: typingsSlinky.steamClient.mod.EDepotFileFlag.Symlink with Double = js.native
  
  @js.native
  sealed trait UserConfig extends EDepotFileFlag
  /* 1 */ val UserConfig: typingsSlinky.steamClient.mod.EDepotFileFlag.UserConfig with Double = js.native
  
  @js.native
  sealed trait VersionedUserConfig extends EDepotFileFlag
  /* 2 */ val VersionedUserConfig: typingsSlinky.steamClient.mod.EDepotFileFlag.VersionedUserConfig with Double = js.native
}
