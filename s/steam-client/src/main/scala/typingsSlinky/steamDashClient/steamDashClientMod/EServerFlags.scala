package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EServerFlags extends js.Object

@JSImport("steam-client", "EServerFlags")
@js.native
object EServerFlags extends js.Object {
  @js.native
  sealed trait Active extends EServerFlags
  
  @js.native
  sealed trait Dedicated extends EServerFlags
  
  @js.native
  sealed trait Linux extends EServerFlags
  
  @js.native
  sealed trait None extends EServerFlags
  
  @js.native
  sealed trait Passworded extends EServerFlags
  
  @js.native
  sealed trait Private extends EServerFlags
  
  @js.native
  sealed trait Secure extends EServerFlags
  
  /* 1 */ val Active: typingsSlinky.steamDashClient.steamDashClientMod.EServerFlags.Active with Double = js.native
  /* 4 */ val Dedicated: typingsSlinky.steamDashClient.steamDashClientMod.EServerFlags.Dedicated with Double = js.native
  /* 8 */ val Linux: typingsSlinky.steamDashClient.steamDashClientMod.EServerFlags.Linux with Double = js.native
  /* 0 */ val None: typingsSlinky.steamDashClient.steamDashClientMod.EServerFlags.None with Double = js.native
  /* 16 */ val Passworded: typingsSlinky.steamDashClient.steamDashClientMod.EServerFlags.Passworded with Double = js.native
  /* 32 */ val Private: typingsSlinky.steamDashClient.steamDashClientMod.EServerFlags.Private with Double = js.native
  /* 2 */ val Secure: typingsSlinky.steamDashClient.steamDashClientMod.EServerFlags.Secure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EServerFlags with Double] = js.native
}

