package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.Flow.Stroke.Type
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Allvoices
import typingsSlinky.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Stroke")
@js.native
class Stroke protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Stroke {
  def this(`type`: Type) = this()
  def this(`type`: Type, options: Allvoices) = this()
  /* CompleteClass */
  override def addEndNote(note: typingsSlinky.vexflow.Vex.Flow.Note): typingsSlinky.vexflow.Vex.Flow.Stroke = js.native
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
@JSImport("vexflow", "Flow.Stroke")
@js.native
object Stroke extends js.Object {
  val CATEGORY: String = js.native
  def format(strokes: js.Array[typingsSlinky.vexflow.Vex.Flow.Stroke], state: Leftshift): Boolean = js.native
  @js.native
  object Type extends js.Object {
    /* 5 */ val ARPEGGIO_DIRECTIONLESS: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.ARPEGGIO_DIRECTIONLESS with Double = js.native
    /* 1 */ val BRUSH_DOWN: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.BRUSH_DOWN with Double = js.native
    /* 0 */ val BRUSH_UP: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.BRUSH_UP with Double = js.native
    /* 3 */ val RASQUEDO_DOWN: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_DOWN with Double = js.native
    /* 4 */ val RASQUEDO_UP: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_UP with Double = js.native
    /* 1 */ val ROLL_DOWN: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.ROLL_DOWN with Double = js.native
    /* 2 */ val ROLL_UP: typingsSlinky.vexflow.Vex.Flow.Stroke.Type.ROLL_UP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.Stroke.Type with Double] = js.native
  }
  
}

