package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Leftshift
import typingsSlinky.vexflow.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Bend")
@js.native
class Bend protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Bend {
  def this(text: String) = this()
  def this(text: String, release: Boolean) = this()
  def this(text: String, release: Boolean, phrase: js.Array[Text]) = this()
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
  override def getText(): String = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsSlinky.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setFont(font: String): typingsSlinky.vexflow.Vex.Flow.Bend = js.native
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
  /* CompleteClass */
  override def updateWidth(): typingsSlinky.vexflow.Vex.Flow.Bend = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Bend")
@js.native
object Bend extends js.Object {
  val CATEGORY: String = js.native
  var DOWN: Double = js.native
  var UP: Double = js.native
  def format(bends: js.Array[typingsSlinky.vexflow.Vex.Flow.Bend], state: Leftshift): Boolean = js.native
}

