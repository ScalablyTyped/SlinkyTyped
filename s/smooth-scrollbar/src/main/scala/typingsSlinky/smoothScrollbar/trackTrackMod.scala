package typingsSlinky.smoothScrollbar

import typingsSlinky.smoothScrollbar.directionMod.TrackDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/track/track", JSImport.Namespace)
@js.native
object trackTrackMod extends js.Object {
  
  @js.native
  class ScrollbarTrack protected ()
    extends typingsSlinky.smoothScrollbar.trackMod.ScrollbarTrack {
    def this(direction: TrackDirection) = this()
    def this(direction: TrackDirection, thumbMinSize: Double) = this()
    
    var _isShown: js.Any = js.native
  }
}
