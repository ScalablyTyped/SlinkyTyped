package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.std.Element
import typingsSlinky.vexflow.anon.Left
import typingsSlinky.vexflow.anon.Linethickness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiMeasureRest extends Element {
  
  def draw(): Unit = js.native
  
  def drawLine(ctx: js.Any, left: js.Any, right: js.Any, sbl: js.Any): Unit = js.native
  
  def drawSymbols(ctx: js.Any, left: js.Any, right: js.Any, sbl: js.Any): Unit = js.native
  
  def getStave(): js.Any = js.native
  
  def getXs(): Left = js.native
  
  var number_of_measures: js.Any = js.native
  
  var render_options: Linethickness = js.native
  
  def setStave(stave: js.Any): MultiMeasureRest = js.native
  
  var stave: js.Any = js.native
  
  var xs: Left = js.native
}
