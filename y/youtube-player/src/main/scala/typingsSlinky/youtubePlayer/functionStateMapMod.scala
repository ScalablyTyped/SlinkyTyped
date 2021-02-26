package typingsSlinky.youtubePlayer

import typingsSlinky.youtubePlayer.anon.AcceptableStates
import typingsSlinky.youtubePlayer.anon.StateChangeRequired
import typingsSlinky.youtubePlayer.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionStateMapMod {
  
  object default {
    
    @JSImport("youtube-player/dist/FunctionStateMap", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("youtube-player/dist/FunctionStateMap", "default.pauseVideo")
    @js.native
    def pauseVideo: AcceptableStates = js.native
    @scala.inline
    def pauseVideo_=(x: AcceptableStates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pauseVideo")(x.asInstanceOf[js.Any])
    
    @JSImport("youtube-player/dist/FunctionStateMap", "default.playVideo")
    @js.native
    def playVideo: StateChangeRequired = js.native
    @scala.inline
    def playVideo_=(x: StateChangeRequired): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playVideo")(x.asInstanceOf[js.Any])
    
    @JSImport("youtube-player/dist/FunctionStateMap", "default.seekTo")
    @js.native
    def seekTo: Timeout = js.native
    @scala.inline
    def seekTo_=(x: Timeout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seekTo")(x.asInstanceOf[js.Any])
  }
}
