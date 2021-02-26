package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EServerFlags extends StObject
@JSImport("steam-client", "EServerFlags")
@js.native
object EServerFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EServerFlags with Double] = js.native
  
  @js.native
  sealed trait Active extends EServerFlags
  /* 1 */ val Active: typingsSlinky.steamClient.mod.EServerFlags.Active with Double = js.native
  
  @js.native
  sealed trait Dedicated extends EServerFlags
  /* 4 */ val Dedicated: typingsSlinky.steamClient.mod.EServerFlags.Dedicated with Double = js.native
  
  @js.native
  sealed trait Linux extends EServerFlags
  /* 8 */ val Linux: typingsSlinky.steamClient.mod.EServerFlags.Linux with Double = js.native
  
  @js.native
  sealed trait None extends EServerFlags
  /* 0 */ val None: typingsSlinky.steamClient.mod.EServerFlags.None with Double = js.native
  
  @js.native
  sealed trait Passworded extends EServerFlags
  /* 16 */ val Passworded: typingsSlinky.steamClient.mod.EServerFlags.Passworded with Double = js.native
  
  @js.native
  sealed trait Private extends EServerFlags
  /* 32 */ val Private: typingsSlinky.steamClient.mod.EServerFlags.Private with Double = js.native
  
  @js.native
  sealed trait Secure extends EServerFlags
  /* 2 */ val Secure: typingsSlinky.steamClient.mod.EServerFlags.Secure with Double = js.native
}
