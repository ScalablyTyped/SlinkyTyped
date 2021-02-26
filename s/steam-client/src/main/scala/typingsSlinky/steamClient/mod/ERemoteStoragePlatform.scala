package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERemoteStoragePlatform extends StObject
@JSImport("steam-client", "ERemoteStoragePlatform")
@js.native
object ERemoteStoragePlatform extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteStoragePlatform with Double] = js.native
  
  @js.native
  sealed trait All extends ERemoteStoragePlatform
  /* -1 */ val All: typingsSlinky.steamClient.mod.ERemoteStoragePlatform.All with Double = js.native
  
  @js.native
  sealed trait Linux extends ERemoteStoragePlatform
  /* 8 */ val Linux: typingsSlinky.steamClient.mod.ERemoteStoragePlatform.Linux with Double = js.native
  
  @js.native
  sealed trait None extends ERemoteStoragePlatform
  /* 0 */ val None: typingsSlinky.steamClient.mod.ERemoteStoragePlatform.None with Double = js.native
  
  @js.native
  sealed trait OSX extends ERemoteStoragePlatform
  /* 2 */ val OSX: typingsSlinky.steamClient.mod.ERemoteStoragePlatform.OSX with Double = js.native
  
  @js.native
  sealed trait PS3 extends ERemoteStoragePlatform
  /* 4 */ val PS3: typingsSlinky.steamClient.mod.ERemoteStoragePlatform.PS3 with Double = js.native
  
  @js.native
  sealed trait Reserved1 extends ERemoteStoragePlatform
  /* 8 */ val Reserved1: typingsSlinky.steamClient.mod.ERemoteStoragePlatform.Reserved1 with Double = js.native
  
  // removed
  @js.native
  sealed trait Reserved2 extends ERemoteStoragePlatform
  /* 16 */ val Reserved2: typingsSlinky.steamClient.mod.ERemoteStoragePlatform.Reserved2 with Double = js.native
  
  @js.native
  sealed trait Windows extends ERemoteStoragePlatform
  /* 1 */ val Windows: typingsSlinky.steamClient.mod.ERemoteStoragePlatform.Windows with Double = js.native
}
