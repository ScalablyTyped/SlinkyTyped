package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Repetition")
@js.native
class Repetition protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Repetition {
  def this(`type`: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`, x: Double, y_shift: Double) = this()
  /* CompleteClass */
  override def addEndModifier(): Unit = js.native
  /* CompleteClass */
  override def addModifier(): Unit = js.native
  /* CompleteClass */
  override def addToStave(stave: typingsSlinky.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsSlinky.vexflow.Vex.Flow.StaveModifier = js.native
  /* CompleteClass */
  override def addToStaveEnd(stave: typingsSlinky.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsSlinky.vexflow.Vex.Flow.StaveModifier = js.native
  /* CompleteClass */
  override def draw(stave: typingsSlinky.vexflow.Vex.Flow.Stave, x: Double): typingsSlinky.vexflow.Vex.Flow.Repetition = js.native
  /* CompleteClass */
  override def drawCodaFixed(stave: typingsSlinky.vexflow.Vex.Flow.Stave, x: Double): typingsSlinky.vexflow.Vex.Flow.Repetition = js.native
  /* CompleteClass */
  override def drawSignoFixed(stave: typingsSlinky.vexflow.Vex.Flow.Stave, x: Double): typingsSlinky.vexflow.Vex.Flow.Repetition = js.native
   //inconsistent name: drawSignoFixed -> drawSegnoFixed
  /* CompleteClass */
  override def drawSymbolText(stave: typingsSlinky.vexflow.Vex.Flow.Stave, x: Double, text: String, draw_coda: Boolean): typingsSlinky.vexflow.Vex.Flow.Repetition = js.native
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
  override def setShiftX(x: Double): typingsSlinky.vexflow.Vex.Flow.Repetition = js.native
  /* CompleteClass */
  override def setShiftY(y: Double): typingsSlinky.vexflow.Vex.Flow.Repetition = js.native
}

@JSGlobal("Vex.Flow.Repetition")
@js.native
object Repetition extends js.Object {
  @js.native
  object `type` extends js.Object {
    /* 0 */ val CODA_LEFT: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.CODA_LEFT with Double = js.native
    /* 1 */ val CODA_RIGHT: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.CODA_RIGHT with Double = js.native
    /* 4 */ val DC: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.DC with Double = js.native
    /* 5 */ val DC_AL_CODA: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.DC_AL_CODA with Double = js.native
    /* 6 */ val DC_AL_FINE: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.DC_AL_FINE with Double = js.native
    /* 7 */ val DS: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.DS with Double = js.native
    /* 8 */ val DS_AL_CODA: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.DS_AL_CODA with Double = js.native
    /* 9 */ val DS_AL_FINE: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.DS_AL_FINE with Double = js.native
    /* 10 */ val FINE: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.FINE with Double = js.native
    /* 1 */ val NONE: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.NONE with Double = js.native
    /* 2 */ val SEGNO_LEFT: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.SEGNO_LEFT with Double = js.native
    /* 3 */ val SEGNO_RIGHT: typingsSlinky.vexflow.Vex.Flow.Repetition.`type`.SEGNO_RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.Repetition.`type` with Double] = js.native
  }
  
}

