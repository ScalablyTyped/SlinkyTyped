package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatFlags extends StObject
@JSImport("steam-client", "EChatFlags")
@js.native
object EChatFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatFlags with Double] = js.native
  
  @js.native
  sealed trait InvisibleToFriends extends EChatFlags
  /* 2 */ val InvisibleToFriends: typingsSlinky.steamClient.mod.EChatFlags.InvisibleToFriends with Double = js.native
  
  @js.native
  sealed trait Locked extends EChatFlags
  /* 1 */ val Locked: typingsSlinky.steamClient.mod.EChatFlags.Locked with Double = js.native
  
  @js.native
  sealed trait Moderated extends EChatFlags
  /* 4 */ val Moderated: typingsSlinky.steamClient.mod.EChatFlags.Moderated with Double = js.native
  
  @js.native
  sealed trait Unjoinable extends EChatFlags
  /* 8 */ val Unjoinable: typingsSlinky.steamClient.mod.EChatFlags.Unjoinable with Double = js.native
}
