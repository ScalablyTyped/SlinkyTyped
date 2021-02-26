package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatMemberStateChange extends StObject
@JSImport("steam-client", "EChatMemberStateChange")
@js.native
object EChatMemberStateChange extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatMemberStateChange with Double] = js.native
  
  @js.native
  sealed trait Banned extends EChatMemberStateChange
  /* 0x10 */ val Banned: typingsSlinky.steamClient.mod.EChatMemberStateChange.Banned with Double = js.native
  
  @js.native
  sealed trait Disconnected extends EChatMemberStateChange
  /* 0x04 */ val Disconnected: typingsSlinky.steamClient.mod.EChatMemberStateChange.Disconnected with Double = js.native
  
  @js.native
  sealed trait Entered extends EChatMemberStateChange
  /* 0x01 */ val Entered: typingsSlinky.steamClient.mod.EChatMemberStateChange.Entered with Double = js.native
  
  @js.native
  sealed trait Kicked extends EChatMemberStateChange
  /* 0x08 */ val Kicked: typingsSlinky.steamClient.mod.EChatMemberStateChange.Kicked with Double = js.native
  
  @js.native
  sealed trait Left extends EChatMemberStateChange
  /* 0x02 */ val Left: typingsSlinky.steamClient.mod.EChatMemberStateChange.Left with Double = js.native
  
  @js.native
  sealed trait VoiceDoneSpeaking extends EChatMemberStateChange
  /* 0x2000 */ val VoiceDoneSpeaking: typingsSlinky.steamClient.mod.EChatMemberStateChange.VoiceDoneSpeaking with Double = js.native
  
  @js.native
  sealed trait VoiceSpeaking extends EChatMemberStateChange
  /* 0x1000 */ val VoiceSpeaking: typingsSlinky.steamClient.mod.EChatMemberStateChange.VoiceSpeaking with Double = js.native
}
