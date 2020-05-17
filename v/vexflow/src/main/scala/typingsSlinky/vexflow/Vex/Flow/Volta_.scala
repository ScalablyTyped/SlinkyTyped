package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volta_ extends StaveModifier {
  def draw(stave: Stave, x: Double): Volta = js.native
  def setShiftY(y: Double): Volta = js.native
}

object Volta_ {
  @scala.inline
  def apply(
    addEndModifier: () => Unit,
    addModifier: () => Unit,
    addToStave: (Stave, Boolean) => StaveModifier,
    addToStaveEnd: (Stave, Boolean) => StaveModifier,
    draw: (Stave, Double) => Volta,
    getCategory: () => String,
    getPadding: Double => Double,
    getPosition: () => Double,
    getWidth: () => Double,
    makeSpacer: Double => GetContext,
    placeGlyphOnLine: (Glyph, Stave, Double) => Unit,
    setPadding: Double => Unit,
    setShiftY: Double => Volta
  ): Volta_ = {
    val __obj = js.Dynamic.literal(addEndModifier = js.Any.fromFunction0(addEndModifier), addModifier = js.Any.fromFunction0(addModifier), addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), draw = js.Any.fromFunction2(draw), getCategory = js.Any.fromFunction0(getCategory), getPadding = js.Any.fromFunction1(getPadding), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3(placeGlyphOnLine), setPadding = js.Any.fromFunction1(setPadding), setShiftY = js.Any.fromFunction1(setShiftY))
    __obj.asInstanceOf[Volta_]
  }
  @scala.inline
  implicit class Volta_Ops[Self <: Volta_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraw(value: (Stave, Double) => Volta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetShiftY(value: Double => Volta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShiftY")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

