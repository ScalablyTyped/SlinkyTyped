package typingsSlinky.vimeoPlayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallbackFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type EventCallback = js.Function1[/* data */ js.Any, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.play
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.pause
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.ended
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.timeupdate
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.progress
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.seeked
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.seeking
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.texttrackchange
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.cuechange
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.cuepoint
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.volumechange
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.playbackratechange
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.bufferstart
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.bufferend
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.error
    - typingsSlinky.vimeoPlayer.vimeoPlayerStrings.loaded
    - java.lang.String
  */
  type EventName = typingsSlinky.vimeoPlayer.mod._EventName | java.lang.String
  
  type VimeoCuePointData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type VimeoTimeRange = js.Tuple2[scala.Double, scala.Double]
}
