package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Firstnote
import typingsSlinky.vexflow.anon.Firstx
import typingsSlinky.vexflow.anon.Leftshiftpx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaveHairpin extends StObject {
  
  def draw(): Boolean = js.native
  
  def renderHairpin(params: Firstx): Unit = js.native
  
  def setContext(context: IRenderContext): StaveHairpin = js.native
  
  def setNotes(notes: Firstnote): StaveHairpin = js.native
  
  def setPosition(position: Position): StaveHairpin = js.native
  
  def setRenderOptions(options: Leftshiftpx): StaveHairpin = js.native
}
object StaveHairpin {
  
  @scala.inline
  def apply(
    draw: () => Boolean,
    renderHairpin: Firstx => Unit,
    setContext: IRenderContext => StaveHairpin,
    setNotes: Firstnote => StaveHairpin,
    setPosition: Position => StaveHairpin,
    setRenderOptions: Leftshiftpx => StaveHairpin
  ): StaveHairpin = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction0(draw), renderHairpin = js.Any.fromFunction1(renderHairpin), setContext = js.Any.fromFunction1(setContext), setNotes = js.Any.fromFunction1(setNotes), setPosition = js.Any.fromFunction1(setPosition), setRenderOptions = js.Any.fromFunction1(setRenderOptions))
    __obj.asInstanceOf[StaveHairpin]
  }
  
  @scala.inline
  implicit class StaveHairpinMutableBuilder[Self <: StaveHairpin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraw(value: () => Boolean): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderHairpin(value: Firstx => Unit): Self = StObject.set(x, "renderHairpin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContext(value: IRenderContext => StaveHairpin): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNotes(value: Firstnote => StaveHairpin): Self = StObject.set(x, "setNotes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPosition(value: Position => StaveHairpin): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRenderOptions(value: Leftshiftpx => StaveHairpin): Self = StObject.set(x, "setRenderOptions", js.Any.fromFunction1(value))
  }
  
  @js.native
  sealed trait `type` extends StObject
  @JSGlobal("Vex.Flow.StaveHairpin.type")
  @js.native
  object `type` extends StObject {
    
    @js.native
    sealed trait CRESC extends `type`
    
    @js.native
    sealed trait DECRESC extends `type`
  }
}
