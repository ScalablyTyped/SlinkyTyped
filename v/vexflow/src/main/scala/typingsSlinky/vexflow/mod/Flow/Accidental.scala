package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Accidental")
@js.native
class Accidental protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Accidental {
  def this(`type`: String) = this()
  /* CompleteClass */
  override def alignSubNotesWithNote(subNotes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note], note: typingsSlinky.vexflow.Vex.Flow.Note): Unit = js.native
   //inconsistent type: void -> Modifier
  /* CompleteClass */
  override def draw(): Unit = js.native
  /* CompleteClass */
  override def getCategory(): String = js.native
  /* CompleteClass */
  override def getContext(): IRenderContext = js.native
  /* CompleteClass */
  override def getIndex(): Double = js.native
  /* CompleteClass */
  override def getModifierContext(): typingsSlinky.vexflow.Vex.Flow.ModifierContext = js.native
  /* CompleteClass */
  override def getNote(): typingsSlinky.vexflow.Vex.Flow.Note = js.native
  /* CompleteClass */
  override def getPosition(): Position = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsSlinky.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setIndex(index: Double): typingsSlinky.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setModifierContext(c: typingsSlinky.vexflow.Vex.Flow.ModifierContext): typingsSlinky.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setNote(note: typingsSlinky.vexflow.Vex.Flow.Note): typingsSlinky.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setPosition(position: Position): typingsSlinky.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setTextLine(line: Double): typingsSlinky.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setWidth(width: Double): typingsSlinky.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setXShift(x: Double): Unit = js.native
  /* CompleteClass */
  override def setYShift(y: Double): typingsSlinky.vexflow.Vex.Flow.Modifier = js.native
}

/* static members */
@JSImport("vexflow", "Flow.Accidental")
@js.native
object Accidental extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  def applyAccidentals(voices: js.Array[typingsSlinky.vexflow.Vex.Flow.Voice]): Unit = js.native
  def applyAccidentals(voices: js.Array[typingsSlinky.vexflow.Vex.Flow.Voice], keySignature: String): Unit = js.native
  def format(accidentals: js.Array[typingsSlinky.vexflow.Vex.Flow.Accidental], state: Leftshift): Unit = js.native
}

