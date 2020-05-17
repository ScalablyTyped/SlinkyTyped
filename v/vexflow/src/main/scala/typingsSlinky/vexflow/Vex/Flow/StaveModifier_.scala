package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaveModifier_ extends js.Object {
  def addEndModifier(): Unit = js.native
  def addModifier(): Unit = js.native
  def addToStave(stave: Stave, firstGlyph: Boolean): StaveModifier = js.native
  def addToStaveEnd(stave: Stave, firstGlyph: Boolean): StaveModifier = js.native
  def getCategory(): String = js.native
  def getPadding(index: Double): Double = js.native
  def getPosition(): Double = js.native
  def getWidth(): Double = js.native
  def makeSpacer(padding: Double): GetContext = js.native
  def placeGlyphOnLine(glyph: Glyph, stave: Stave, line: Double): Unit = js.native
  def setPadding(padding: Double): Unit = js.native
}

object StaveModifier_ {
  @scala.inline
  def apply(
    addEndModifier: () => Unit,
    addModifier: () => Unit,
    addToStave: (Stave, Boolean) => StaveModifier,
    addToStaveEnd: (Stave, Boolean) => StaveModifier,
    getCategory: () => String,
    getPadding: Double => Double,
    getPosition: () => Double,
    getWidth: () => Double,
    makeSpacer: Double => GetContext,
    placeGlyphOnLine: (Glyph, Stave, Double) => Unit,
    setPadding: Double => Unit
  ): StaveModifier_ = {
    val __obj = js.Dynamic.literal(addEndModifier = js.Any.fromFunction0(addEndModifier), addModifier = js.Any.fromFunction0(addModifier), addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), getCategory = js.Any.fromFunction0(getCategory), getPadding = js.Any.fromFunction1(getPadding), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3(placeGlyphOnLine), setPadding = js.Any.fromFunction1(setPadding))
    __obj.asInstanceOf[StaveModifier_]
  }
  @scala.inline
  implicit class StaveModifier_Ops[Self <: StaveModifier_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEndModifier(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEndModifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddModifier(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addModifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddToStave(value: (Stave, Boolean) => StaveModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToStave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddToStaveEnd(value: (Stave, Boolean) => StaveModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToStaveEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCategory(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCategory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPadding(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPadding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMakeSpacer(value: Double => GetContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeSpacer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlaceGlyphOnLine(value: (Glyph, Stave, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeGlyphOnLine")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetPadding(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPadding")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

