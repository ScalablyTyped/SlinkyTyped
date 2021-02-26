package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repetition extends StaveModifier {
  
  def draw(stave: Stave, x: Double): Repetition = js.native
  
  def drawCodaFixed(stave: Stave, x: Double): Repetition = js.native
  
  def drawSignoFixed(stave: Stave, x: Double): Repetition = js.native
  
  //inconsistent name: drawSignoFixed -> drawSegnoFixed
  def drawSymbolText(stave: Stave, x: Double, text: String, draw_coda: Boolean): Repetition = js.native
  
  def setShiftX(x: Double): Repetition = js.native
  
  def setShiftY(y: Double): Repetition = js.native
}
object Repetition {
  
  @scala.inline
  def apply(
    addEndModifier: () => Unit,
    addModifier: () => Unit,
    addToStave: (Stave, Boolean) => StaveModifier,
    addToStaveEnd: (Stave, Boolean) => StaveModifier,
    draw: (Stave, Double) => Repetition,
    drawCodaFixed: (Stave, Double) => Repetition,
    drawSignoFixed: (Stave, Double) => Repetition,
    drawSymbolText: (Stave, Double, String, Boolean) => Repetition,
    getCategory: () => String,
    getPadding: Double => Double,
    getPosition: () => Double,
    getWidth: () => Double,
    makeSpacer: Double => GetContext,
    placeGlyphOnLine: (Glyph, Stave, Double) => Unit,
    setPadding: Double => Unit,
    setShiftX: Double => Repetition,
    setShiftY: Double => Repetition
  ): Repetition = {
    val __obj = js.Dynamic.literal(addEndModifier = js.Any.fromFunction0(addEndModifier), addModifier = js.Any.fromFunction0(addModifier), addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), draw = js.Any.fromFunction2(draw), drawCodaFixed = js.Any.fromFunction2(drawCodaFixed), drawSignoFixed = js.Any.fromFunction2(drawSignoFixed), drawSymbolText = js.Any.fromFunction4(drawSymbolText), getCategory = js.Any.fromFunction0(getCategory), getPadding = js.Any.fromFunction1(getPadding), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3(placeGlyphOnLine), setPadding = js.Any.fromFunction1(setPadding), setShiftX = js.Any.fromFunction1(setShiftX), setShiftY = js.Any.fromFunction1(setShiftY))
    __obj.asInstanceOf[Repetition]
  }
  
  @scala.inline
  implicit class RepetitionMutableBuilder[Self <: Repetition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraw(value: (Stave, Double) => Repetition): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDrawCodaFixed(value: (Stave, Double) => Repetition): Self = StObject.set(x, "drawCodaFixed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDrawSignoFixed(value: (Stave, Double) => Repetition): Self = StObject.set(x, "drawSignoFixed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDrawSymbolText(value: (Stave, Double, String, Boolean) => Repetition): Self = StObject.set(x, "drawSymbolText", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetShiftX(value: Double => Repetition): Self = StObject.set(x, "setShiftX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetShiftY(value: Double => Repetition): Self = StObject.set(x, "setShiftY", js.Any.fromFunction1(value))
  }
  
  @js.native
  sealed trait `type` extends StObject
  @JSGlobal("Vex.Flow.Repetition.type")
  @js.native
  object `type` extends StObject {
    
    @js.native
    sealed trait CODA_LEFT extends `type`
    
    @js.native
    sealed trait CODA_RIGHT extends `type`
    
    @js.native
    sealed trait DC extends `type`
    
    @js.native
    sealed trait DC_AL_CODA extends `type`
    
    @js.native
    sealed trait DC_AL_FINE extends `type`
    
    @js.native
    sealed trait DS extends `type`
    
    @js.native
    sealed trait DS_AL_CODA extends `type`
    
    @js.native
    sealed trait DS_AL_FINE extends `type`
    
    @js.native
    sealed trait FINE extends `type`
    
    @js.native
    sealed trait NONE extends `type`
    
    @js.native
    sealed trait SEGNO_LEFT extends `type`
    
    @js.native
    sealed trait SEGNO_RIGHT extends `type`
  }
}
