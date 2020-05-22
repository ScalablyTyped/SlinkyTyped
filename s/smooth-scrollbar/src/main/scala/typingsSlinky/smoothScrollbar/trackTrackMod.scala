package typingsSlinky.smoothScrollbar

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.smoothScrollbar.directionMod.TrackDirection
import typingsSlinky.smoothScrollbar.trackMod.ScrollbarThumb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/track/track", JSImport.Namespace)
@js.native
object trackTrackMod extends js.Object {
  @js.native
  class ScrollbarTrack protected ()
    extends typingsSlinky.smoothScrollbar.trackMod.ScrollbarTrack {
    def this(direction: TrackDirection) = this()
    def this(direction: TrackDirection, thumbMinSize: Double) = this()
    var _isShown: js.Any = js.native
    /* CompleteClass */
    override val element: HTMLElement = js.native
    /* CompleteClass */
    override val thumb: ScrollbarThumb = js.native
    /* CompleteClass */
    override def attachTo(container: HTMLElement): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
    /* CompleteClass */
    override def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
  }
  
}

