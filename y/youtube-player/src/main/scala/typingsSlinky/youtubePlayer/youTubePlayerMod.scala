package typingsSlinky.youtubePlayer

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.youtubePlayer.typesMod.EmitterType
import typingsSlinky.youtubePlayer.typesMod.YouTubePlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("youtube-player/dist/YouTubePlayer", JSImport.Namespace)
@js.native
object youTubePlayerMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer]): YouTubePlayer = js.native
    def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer], strictState: Boolean): YouTubePlayer = js.native
    
    def proxyEvents(emitter: EmitterType): EventHandlerMapType = js.native
  }
  
  type EventHandlerMapType = StringDictionary[js.Function1[/* event */ js.Object, Unit]]
}
