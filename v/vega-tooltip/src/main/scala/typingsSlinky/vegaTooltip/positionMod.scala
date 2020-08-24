package typingsSlinky.vegaTooltip

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.vegaTooltip.anon.Height
import typingsSlinky.vegaTooltip.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-tooltip/build/src/position", JSImport.Namespace)
@js.native
object positionMod extends js.Object {
  def calculatePosition(event: MouseEvent, tooltipBox: Height, offsetX: Double, offsetY: Double): X = js.native
}

