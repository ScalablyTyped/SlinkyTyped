package typingsSlinky.vexflow.mod.Flow

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vexflow.Vex.Flow.Tickable
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.TextNote")
@js.native
class TextNote protected ()
  extends typingsSlinky.vexflow.Vex.Flow.TextNote {
  def this(text_struct: typingsSlinky.vexflow.anon.Font) = this()
  /* CompleteClass */
  override def addModifier(mod: typingsSlinky.vexflow.Vex.Flow.Modifier): Tickable = js.native
  /* CompleteClass */
  override def addToModifierContext(mc: typingsSlinky.vexflow.Vex.Flow.ModifierContext): Unit = js.native
  /* CompleteClass */
  override def applyTickMultiplier(numerator: Double, denominator: Double): Unit = js.native
  /* CompleteClass */
  override def getBoundingBox(): typingsSlinky.vexflow.Vex.Flow.BoundingBox = js.native
  /* CompleteClass */
  override def getCenterXShift(): Double = js.native
  /* CompleteClass */
  override def getIntrinsicTicks(): typingsSlinky.vexflow.Vex.Flow.Fraction = js.native
  /* CompleteClass */
  override def getTickMultiplier(): typingsSlinky.vexflow.Vex.Flow.Fraction = js.native
  /* CompleteClass */
  override def getTicks(): typingsSlinky.vexflow.Vex.Flow.Fraction = js.native
  /* CompleteClass */
  override def getTuplet(): typingsSlinky.vexflow.Vex.Flow.Tuplet = js.native
  /* CompleteClass */
  override def getVoice(): typingsSlinky.vexflow.Vex.Flow.Voice = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def isCenterAligned(): Boolean = js.native
  /* CompleteClass */
  override def postFormat(): Tickable = js.native
  /* CompleteClass */
  override def preFormat(): Unit = js.native
  /* CompleteClass */
  override def setCenterAlignment(align_center: Boolean): Tickable = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): Unit = js.native
  /* CompleteClass */
  override def setDuration(duration: typingsSlinky.vexflow.Vex.Flow.Fraction): Unit = js.native
  /* CompleteClass */
  override def setIntrinsicTicks(intrinsicTicks: typingsSlinky.vexflow.Vex.Flow.Fraction): Unit = js.native
  /* CompleteClass */
  override def setTickContext(tc: typingsSlinky.vexflow.Vex.Flow.TickContext): Unit = js.native
  /* CompleteClass */
  override def setTuplet(tuplet: typingsSlinky.vexflow.Vex.Flow.Tuplet): Tickable = js.native
  /* CompleteClass */
  override def setVoice(voice: typingsSlinky.vexflow.Vex.Flow.Voice): Unit = js.native
  /* CompleteClass */
  override def setXShift(x: Double): Tickable = js.native
  /* CompleteClass */
  override def shouldIgnoreTicks(): Boolean = js.native
}

@JSImport("vexflow", "Flow.TextNote")
@js.native
object TextNote extends js.Object {
  @js.native
  object GLYPHS extends /* name */ StringDictionary[Point]
  
  @js.native
  object Justification extends js.Object {
    /* 0 */ val CENTER: typingsSlinky.vexflow.Vex.Flow.TextNote.Justification.CENTER with Double = js.native
    /* 1 */ val LEFT: typingsSlinky.vexflow.Vex.Flow.TextNote.Justification.LEFT with Double = js.native
    /* 1 */ val RIGHT: typingsSlinky.vexflow.Vex.Flow.TextNote.Justification.RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.TextNote.Justification with Double] = js.native
  }
  
}

