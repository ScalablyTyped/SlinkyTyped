package typingsSlinky.youtubePlayer

import typingsSlinky.youtubePlayer.anon.AcceptableStates
import typingsSlinky.youtubePlayer.anon.StateChangeRequired
import typingsSlinky.youtubePlayer.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("youtube-player/dist/FunctionStateMap", JSImport.Namespace)
@js.native
object functionStateMapMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    var pauseVideo: AcceptableStates = js.native
    
    var playVideo: StateChangeRequired = js.native
    
    var seekTo: Timeout = js.native
  }
}
