package typingsSlinky.youtubePlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("youtube-player/dist/constants/PlayerStates", JSImport.Namespace)
@js.native
object playerStatesMod extends js.Object {
  
  @js.native
  sealed trait PlayerStates extends js.Object
  @js.native
  object PlayerStates extends js.Object {
    
    @js.native
    sealed trait BUFFERING extends PlayerStates
    
    @js.native
    sealed trait ENDED extends PlayerStates
    
    @js.native
    sealed trait PAUSED extends PlayerStates
    
    @js.native
    sealed trait PLAYING extends PlayerStates
    
    @js.native
    sealed trait UNSTARTED extends PlayerStates
    
    @js.native
    sealed trait VIDEO_CUED extends PlayerStates
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PlayerStates with Double] = js.native
    
    /* 3 */ val BUFFERING: typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.BUFFERING with Double = js.native
    
    /* 0 */ val ENDED: typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.ENDED with Double = js.native
    
    /* 2 */ val PAUSED: typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.PAUSED with Double = js.native
    
    /* 1 */ val PLAYING: typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.PLAYING with Double = js.native
    
    /* -1 */ val UNSTARTED: typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.UNSTARTED with Double = js.native
    
    /* 5 */ val VIDEO_CUED: typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.VIDEO_CUED with Double = js.native
  }
}
