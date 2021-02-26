package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Cache
import typingsSlinky.vexflow.anon.Xmax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Glyph extends StObject {
  
  def getContext(): IRenderContext = js.native
  
  def getMetrics(): Xmax = js.native
  
  def render(ctx: IRenderContext, x_pos: Double, y_pos: Double): Unit = js.native
  
  def renderToStave(x: Double): Unit = js.native
  
  def reset(): Unit = js.native
  
  def setContext(context: IRenderContext): Glyph = js.native
  
  def setOptions(options: Cache): Unit = js.native
  
  def setStave(stave: Stave): Glyph = js.native
  
  def setWidth(width: Double): Glyph = js.native
  
  def setXShift(x_shift: Double): Glyph = js.native
  
  def setYShift(y_shift: Double): Glyph = js.native
}
object Glyph {
  
  @scala.inline
  def apply(
    getContext: () => IRenderContext,
    getMetrics: () => Xmax,
    render: (IRenderContext, Double, Double) => Unit,
    renderToStave: Double => Unit,
    reset: () => Unit,
    setContext: IRenderContext => Glyph,
    setOptions: Cache => Unit,
    setStave: Stave => Glyph,
    setWidth: Double => Glyph,
    setXShift: Double => Glyph,
    setYShift: Double => Glyph
  ): Glyph = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getMetrics = js.Any.fromFunction0(getMetrics), render = js.Any.fromFunction3(render), renderToStave = js.Any.fromFunction1(renderToStave), reset = js.Any.fromFunction0(reset), setContext = js.Any.fromFunction1(setContext), setOptions = js.Any.fromFunction1(setOptions), setStave = js.Any.fromFunction1(setStave), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Glyph]
  }
  
  @scala.inline
  implicit class GlyphMutableBuilder[Self <: Glyph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContext(value: () => IRenderContext): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMetrics(value: () => Xmax): Self = StObject.set(x, "getMetrics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: (IRenderContext, Double, Double) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderToStave(value: Double => Unit): Self = StObject.set(x, "renderToStave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetContext(value: IRenderContext => Glyph): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: Cache => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStave(value: Stave => Glyph): Self = StObject.set(x, "setStave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWidth(value: Double => Glyph): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXShift(value: Double => Glyph): Self = StObject.set(x, "setXShift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYShift(value: Double => Glyph): Self = StObject.set(x, "setYShift", js.Any.fromFunction1(value))
  }
}
