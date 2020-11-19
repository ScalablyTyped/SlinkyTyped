package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.TextBracket.Positions
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Family
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBracket extends js.Object {
  
  def applyStyle(context: IRenderContext): TextBracket = js.native
  
  def draw(): Unit = js.native
  
  var position: Positions = js.native
  
  def setContext(context: IRenderContext): TextBracket = js.native
  
  def setDashed(dashed: Boolean): TextBracket = js.native
  def setDashed(dashed: Boolean, dash: js.Array[Double]): TextBracket = js.native
  
  def setFont(font: Family): TextBracket = js.native
  
  def setLine(line: Double): TextBracket = js.native
  
  var start: Note = js.native
  
  var stop: Note = js.native
}
@JSGlobal("Vex.Flow.TextBracket")
@js.native
object TextBracket extends js.Object {
  
  @js.native
  sealed trait Positions extends js.Object
  @js.native
  object Positions extends js.Object {
    
    @js.native
    sealed trait BOTTOM extends Positions
    
    @js.native
    sealed trait TOP extends Positions
  }
}
