package typingsSlinky.vegaTooltip.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.vegaTooltip.anon.Height
import typingsSlinky.vegaTooltip.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-tooltip", "calculatePosition")
@js.native
object calculatePosition extends js.Object {
  
  /**
    * Position the tooltip
    *
    * @param event The mouse event.
    * @param tooltipBox
    * @param offsetX Horizontal offset.
    * @param offsetY Vertical offset.
    */
  def apply(event: MouseEvent, tooltipBox: Height, offsetX: Double, offsetY: Double): X = js.native
}
