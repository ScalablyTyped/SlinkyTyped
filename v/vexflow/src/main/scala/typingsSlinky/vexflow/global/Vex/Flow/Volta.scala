package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Volta")
@js.native
class Volta protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Volta {
  def this(`type`: typingsSlinky.vexflow.Vex.Flow.Volta.`type`, number: Double, x: Double, y_shift: Double) = this()
  /* CompleteClass */
  override def addEndModifier(): Unit = js.native
  /* CompleteClass */
  override def addModifier(): Unit = js.native
  /* CompleteClass */
  override def addToStave(stave: typingsSlinky.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsSlinky.vexflow.Vex.Flow.StaveModifier = js.native
  /* CompleteClass */
  override def addToStaveEnd(stave: typingsSlinky.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsSlinky.vexflow.Vex.Flow.StaveModifier = js.native
  /* CompleteClass */
  override def draw(stave: typingsSlinky.vexflow.Vex.Flow.Stave, x: Double): typingsSlinky.vexflow.Vex.Flow.Volta = js.native
  /* CompleteClass */
  override def getCategory(): String = js.native
  /* CompleteClass */
  override def getPadding(index: Double): Double = js.native
  /* CompleteClass */
  override def getPosition(): Double = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def makeSpacer(padding: Double): GetContext = js.native
  /* CompleteClass */
  override def placeGlyphOnLine(
    glyph: typingsSlinky.vexflow.Vex.Flow.Glyph,
    stave: typingsSlinky.vexflow.Vex.Flow.Stave,
    line: Double
  ): Unit = js.native
  /* CompleteClass */
  override def setPadding(padding: Double): Unit = js.native
  /* CompleteClass */
  override def setShiftY(y: Double): typingsSlinky.vexflow.Vex.Flow.Volta = js.native
}

@JSGlobal("Vex.Flow.Volta")
@js.native
object Volta extends js.Object {
  @js.native
  object `type` extends js.Object {
    /* 0 */ val BEGIN: typingsSlinky.vexflow.Vex.Flow.Volta.`type`.BEGIN with Double = js.native
    /* 3 */ val BEGIN_END: typingsSlinky.vexflow.Vex.Flow.Volta.`type`.BEGIN_END with Double = js.native
    /* 2 */ val END: typingsSlinky.vexflow.Vex.Flow.Volta.`type`.END with Double = js.native
    /* 1 */ val MID: typingsSlinky.vexflow.Vex.Flow.Volta.`type`.MID with Double = js.native
    /* 1 */ val NONE: typingsSlinky.vexflow.Vex.Flow.Volta.`type`.NONE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.Volta.`type` with Double] = js.native
  }
  
}

