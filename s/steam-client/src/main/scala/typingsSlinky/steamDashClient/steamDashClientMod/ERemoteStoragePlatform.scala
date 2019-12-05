package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ERemoteStoragePlatform extends js.Object

@JSImport("steam-client", "ERemoteStoragePlatform")
@js.native
object ERemoteStoragePlatform extends js.Object {
  @js.native
  sealed trait All extends ERemoteStoragePlatform
  
  @js.native
  sealed trait Linux extends ERemoteStoragePlatform
  
  @js.native
  sealed trait None extends ERemoteStoragePlatform
  
  @js.native
  sealed trait OSX extends ERemoteStoragePlatform
  
  @js.native
  sealed trait PS3 extends ERemoteStoragePlatform
  
   // removed
  @js.native
  sealed trait Reserved1 extends ERemoteStoragePlatform
  
  @js.native
  sealed trait Reserved2 extends ERemoteStoragePlatform
  
  @js.native
  sealed trait Windows extends ERemoteStoragePlatform
  
  /* -1 */ val All: typingsSlinky.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.All with Double = js.native
  /* 8 */ val Linux: typingsSlinky.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.Linux with Double = js.native
  /* 0 */ val None: typingsSlinky.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.None with Double = js.native
  /* 2 */ val OSX: typingsSlinky.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.OSX with Double = js.native
  /* 4 */ val PS3: typingsSlinky.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.PS3 with Double = js.native
  /* 8 */ val Reserved1: typingsSlinky.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.Reserved1 with Double = js.native
  /* 16 */ val Reserved2: typingsSlinky.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.Reserved2 with Double = js.native
  /* 1 */ val Windows: typingsSlinky.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.Windows with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteStoragePlatform with Double] = js.native
}

