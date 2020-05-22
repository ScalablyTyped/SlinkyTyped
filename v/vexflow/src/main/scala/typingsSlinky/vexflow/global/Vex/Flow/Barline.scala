package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Barline")
@js.native
class Barline protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Barline {
  def this(`type`: typingsSlinky.vexflow.Vex.Flow.Barline.`type`, x: Double) = this()
  /* CompleteClass */
  override def addEndModifier(): Unit = js.native
  /* CompleteClass */
  override def addModifier(): Unit = js.native
  /* CompleteClass */
  override def addToStave(stave: typingsSlinky.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsSlinky.vexflow.Vex.Flow.StaveModifier = js.native
  /* CompleteClass */
  override def addToStaveEnd(stave: typingsSlinky.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsSlinky.vexflow.Vex.Flow.StaveModifier = js.native
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
}

@JSGlobal("Vex.Flow.Barline")
@js.native
object Barline extends js.Object {
  @js.native
  object `type` extends js.Object {
    /* 0 */ val DOUBLE: typingsSlinky.vexflow.Vex.Flow.Barline.`type`.DOUBLE with Double = js.native
    /* 1 */ val END: typingsSlinky.vexflow.Vex.Flow.Barline.`type`.END with Double = js.native
    /* 5 */ val NONE: typingsSlinky.vexflow.Vex.Flow.Barline.`type`.NONE with Double = js.native
    /* 2 */ val REPEAT_BEGIN: typingsSlinky.vexflow.Vex.Flow.Barline.`type`.REPEAT_BEGIN with Double = js.native
    /* 4 */ val REPEAT_BOTH: typingsSlinky.vexflow.Vex.Flow.Barline.`type`.REPEAT_BOTH with Double = js.native
    /* 3 */ val REPEAT_END: typingsSlinky.vexflow.Vex.Flow.Barline.`type`.REPEAT_END with Double = js.native
    /* 1 */ val SINGLE: typingsSlinky.vexflow.Vex.Flow.Barline.`type`.SINGLE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.Barline.`type` with Double] = js.native
  }
  
}

