package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.StaveConnector.`type`
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Shiftx
import typingsSlinky.vexflow.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaveConnector extends js.Object {
  
  var bottom_stave: Stave = js.native
  
  def draw(): Unit = js.native
  
  def drawBoldDoubleLine(ctx: js.Object, `type`: `type`, topX: Double, topY: Double, botY: Double): Unit = js.native
  
  def setContext(ctx: IRenderContext): StaveConnector = js.native
  
  def setFont(font: Size): Unit = js.native
  
  def setText(text: String): StaveConnector = js.native
  def setText(text: String, text_options: Shiftx): StaveConnector = js.native
  
  def setType(`type`: `type`): StaveConnector = js.native
  
   //inconsistent type: void -> StaveConnector
  def setXShift(x_shift: Double): StaveConnector = js.native
  
  var thickness: Double = js.native
  
  var top_stave: Stave = js.native
  
  var x_shift: Double = js.native
}
@JSGlobal("Vex.Flow.StaveConnector")
@js.native
object StaveConnector extends js.Object {
  
  @js.native
  sealed trait `type` extends js.Object
  @js.native
  object `type` extends js.Object {
    
    @js.native
    sealed trait BOLD_DOUBLE_LEFT extends `type`
    
    @js.native
    sealed trait BOLD_DOUBLE_RIGHT extends `type`
    
    @js.native
    sealed trait BRACE extends `type`
    
    @js.native
    sealed trait BRACKET extends `type`
    
    @js.native
    sealed trait DOUBLE extends `type`
    
    @js.native
    sealed trait NONE extends `type`
    
    @js.native
    sealed trait SINGLE extends `type`
    
    @js.native
    sealed trait SINGLE_LEFT extends `type`
    
    @js.native
    sealed trait SINGLE_RIGHT extends `type`
    
    @js.native
    sealed trait THIN_DOUBLE extends `type`
  }
}
