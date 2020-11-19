package typingsSlinky.teechart.Tee

import org.scalajs.dom.raw.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChart extends js.Object {
  
  def addSeries(series: ISeries): ISeries = js.native
  
  def draw(): js.Any = js.native
  def draw(context: CanvasRenderingContext2D): js.Any = js.native
}
