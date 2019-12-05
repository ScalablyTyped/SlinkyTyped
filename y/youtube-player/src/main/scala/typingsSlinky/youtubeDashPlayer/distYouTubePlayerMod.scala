package typingsSlinky.youtubeDashPlayer

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.youtubeDashPlayer.distTypesMod.EmitterType
import typingsSlinky.youtubeDashPlayer.distTypesMod.YouTubePlayer
import typingsSlinky.youtubeDashPlayer.distYouTubePlayerMod.EventHandlerMapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-player/dist/YouTubePlayer", JSImport.Namespace)
@js.native
object distYouTubePlayerMod extends js.Object {
  @js.native
  object default extends js.Object {
    def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer]): YouTubePlayer = js.native
    def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer], strictState: Boolean): YouTubePlayer = js.native
    def proxyEvents(emitter: EmitterType): EventHandlerMapType = js.native
  }
  
  type EventHandlerMapType = StringDictionary[js.Function1[/* event */ js.Object, Unit]]
}

