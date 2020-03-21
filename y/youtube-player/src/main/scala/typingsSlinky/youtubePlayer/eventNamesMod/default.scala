package typingsSlinky.youtubePlayer.eventNamesMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.youtubePlayer.youtubePlayerStrings.apiChange
import typingsSlinky.youtubePlayer.youtubePlayerStrings.error
import typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackQualityChange
import typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackRateChange
import typingsSlinky.youtubePlayer.youtubePlayerStrings.ready
import typingsSlinky.youtubePlayer.youtubePlayerStrings.stateChange
import typingsSlinky.youtubePlayer.youtubePlayerStrings.volumeChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-player/dist/eventNames", JSImport.Default)
@js.native
object default
  extends TopLevel[
      js.Tuple7[
        ready, 
        stateChange, 
        playbackQualityChange, 
        playbackRateChange, 
        error, 
        apiChange, 
        volumeChange
      ]
    ]

