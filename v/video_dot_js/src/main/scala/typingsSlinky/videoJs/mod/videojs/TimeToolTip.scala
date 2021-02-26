package typingsSlinky.videoJs.mod.videojs

import org.scalajs.dom.raw.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time tooltips display a time above the progress bar.
  */
@js.native
trait TimeToolTip extends Component {
  
  /**
    * Updates the position of the time tooltip relative to the `SeekBar`.
    *
    * @param seekBarRect
    *        The `ClientRect` for the {@link SeekBar} element.
    *
    * @param seekBarPoint
    *        A number from 0 to 1, representing a horizontal reference point
    *        from the left edge of the {@link SeekBar}
    *
    * @param content
    */
  def update(seekBarRect: ClientRect, seekBarPoint: Double, content: String): Unit = js.native
}
