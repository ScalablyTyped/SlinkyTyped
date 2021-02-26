package typingsSlinky.youtubePlayer

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.youtubePlayer.youtubePlayerStrings.apiChange
import typingsSlinky.youtubePlayer.youtubePlayerStrings.error
import typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackQualityChange
import typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackRateChange
import typingsSlinky.youtubePlayer.youtubePlayerStrings.ready
import typingsSlinky.youtubePlayer.youtubePlayerStrings.stateChange
import typingsSlinky.youtubePlayer.youtubePlayerStrings.volumeChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventNamesMod extends Shortcut {
  
  @JSImport("youtube-player/dist/eventNames", JSImport.Default)
  @js.native
  val default: js.Tuple7[
    ready, 
    stateChange, 
    playbackQualityChange, 
    playbackRateChange, 
    error, 
    apiChange, 
    volumeChange
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.youtubePlayer.youtubePlayerStrings.ready
    - typingsSlinky.youtubePlayer.youtubePlayerStrings.stateChange
    - typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackQualityChange
    - typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackRateChange
    - typingsSlinky.youtubePlayer.youtubePlayerStrings.error
    - typingsSlinky.youtubePlayer.youtubePlayerStrings.apiChange
    - typingsSlinky.youtubePlayer.youtubePlayerStrings.volumeChange
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def apiChange: typingsSlinky.youtubePlayer.youtubePlayerStrings.apiChange = "apiChange".asInstanceOf[typingsSlinky.youtubePlayer.youtubePlayerStrings.apiChange]
    
    @scala.inline
    def error: typingsSlinky.youtubePlayer.youtubePlayerStrings.error = "error".asInstanceOf[typingsSlinky.youtubePlayer.youtubePlayerStrings.error]
    
    @scala.inline
    def playbackQualityChange: typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackQualityChange = "playbackQualityChange".asInstanceOf[typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackQualityChange]
    
    @scala.inline
    def playbackRateChange: typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackRateChange = "playbackRateChange".asInstanceOf[typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackRateChange]
    
    @scala.inline
    def ready: typingsSlinky.youtubePlayer.youtubePlayerStrings.ready = "ready".asInstanceOf[typingsSlinky.youtubePlayer.youtubePlayerStrings.ready]
    
    @scala.inline
    def stateChange: typingsSlinky.youtubePlayer.youtubePlayerStrings.stateChange = "stateChange".asInstanceOf[typingsSlinky.youtubePlayer.youtubePlayerStrings.stateChange]
    
    @scala.inline
    def volumeChange: typingsSlinky.youtubePlayer.youtubePlayerStrings.volumeChange = "volumeChange".asInstanceOf[typingsSlinky.youtubePlayer.youtubePlayerStrings.volumeChange]
  }
  
  type _To = js.Tuple7[
    ready, 
    stateChange, 
    playbackQualityChange, 
    playbackRateChange, 
    error, 
    apiChange, 
    volumeChange
  ]
  
  /* This means you don't have to write `default`, but can instead just say `eventNamesMod.foo` */
  override def _to: js.Tuple7[
    ready, 
    stateChange, 
    playbackQualityChange, 
    playbackRateChange, 
    error, 
    apiChange, 
    volumeChange
  ] = default
}
