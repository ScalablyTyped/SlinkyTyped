package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StaveModifier")
@js.native
class StaveModifier ()
  extends typingsSlinky.vexflow.Vex.Flow.StaveModifier {
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

@JSImport("vexflow", "Flow.StaveModifier")
@js.native
object StaveModifier extends js.Object {
  // @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
  @js.native
  object Position extends js.Object {
    /* 3 */ val ABOVE: typingsSlinky.vexflow.Vex.Flow.StaveModifier.Position.ABOVE with Double = js.native
    /* 5 */ val BEGIN: typingsSlinky.vexflow.Vex.Flow.StaveModifier.Position.BEGIN with Double = js.native
    /* 4 */ val BELOW: typingsSlinky.vexflow.Vex.Flow.StaveModifier.Position.BELOW with Double = js.native
    /* 6 */ val END: typingsSlinky.vexflow.Vex.Flow.StaveModifier.Position.END with Double = js.native
    /* 1 */ val LEFT: typingsSlinky.vexflow.Vex.Flow.StaveModifier.Position.LEFT with Double = js.native
    /* 2 */ val RIGHT: typingsSlinky.vexflow.Vex.Flow.StaveModifier.Position.RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.StaveModifier.Position with Double] = js.native
  }
  
}

