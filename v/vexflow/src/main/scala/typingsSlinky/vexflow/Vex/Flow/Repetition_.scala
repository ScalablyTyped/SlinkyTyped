package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repetition_ extends StaveModifier {
  def draw(stave: Stave, x: Double): Repetition = js.native
  def drawCodaFixed(stave: Stave, x: Double): Repetition = js.native
  def drawSignoFixed(stave: Stave, x: Double): Repetition = js.native
   //inconsistent name: drawSignoFixed -> drawSegnoFixed
  def drawSymbolText(stave: Stave, x: Double, text: String, draw_coda: Boolean): Repetition = js.native
  def setShiftX(x: Double): Repetition = js.native
  def setShiftY(y: Double): Repetition = js.native
}

object Repetition_ {
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
  ): Repetition_ = {
    val __obj = js.Dynamic.literal(addEndModifier = js.Any.fromFunction0(addEndModifier), addModifier = js.Any.fromFunction0(addModifier), addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), draw = js.Any.fromFunction2(draw), drawCodaFixed = js.Any.fromFunction2(drawCodaFixed), drawSignoFixed = js.Any.fromFunction2(drawSignoFixed), drawSymbolText = js.Any.fromFunction4(drawSymbolText), getCategory = js.Any.fromFunction0(getCategory), getPadding = js.Any.fromFunction1(getPadding), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3(placeGlyphOnLine), setPadding = js.Any.fromFunction1(setPadding), setShiftX = js.Any.fromFunction1(setShiftX), setShiftY = js.Any.fromFunction1(setShiftY))
    __obj.asInstanceOf[Repetition_]
  }
  @scala.inline
  implicit class Repetition_Ops[Self <: Repetition_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraw(value: (Stave, Double) => Repetition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrawCodaFixed(value: (Stave, Double) => Repetition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCodaFixed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrawSignoFixed(value: (Stave, Double) => Repetition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawSignoFixed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrawSymbolText(value: (Stave, Double, String, Boolean) => Repetition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawSymbolText")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetShiftX(value: Double => Repetition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShiftX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetShiftY(value: Double => Repetition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShiftY")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

