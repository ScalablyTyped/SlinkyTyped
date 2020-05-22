package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.anon.Arrowheadangle
import typingsSlinky.vexflow.anon.Family
import typingsSlinky.vexflow.anon.Firstindices
import typingsSlinky.vexflow.anon.Lastnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StaveLine")
@js.native
class StaveLine protected ()
  extends typingsSlinky.vexflow.Vex.Flow.StaveLine {
  def this(notes: Firstindices) = this()
  //inconsistent API: this should be set via an options object in the constructor
  /* CompleteClass */
  override var render_options: Arrowheadangle = js.native
  /* CompleteClass */
  override def applyFontStyle(): Unit = js.native
  /* CompleteClass */
  override def applyLineStyle(): Unit = js.native
  /* CompleteClass */
  override def draw(): typingsSlinky.vexflow.Vex.Flow.StaveLine = js.native
  /* CompleteClass */
  override def setContext(context: js.Object): typingsSlinky.vexflow.Vex.Flow.StaveLine = js.native
  /* CompleteClass */
  override def setFont(font: Family): typingsSlinky.vexflow.Vex.Flow.StaveLine = js.native
  /* CompleteClass */
  override def setNotes(notes: Lastnote): typingsSlinky.vexflow.Vex.Flow.StaveLine = js.native
  /* CompleteClass */
  override def setText(text: String): typingsSlinky.vexflow.Vex.Flow.StaveLine = js.native
}

@JSImport("vexflow", "Flow.StaveLine")
@js.native
object StaveLine extends js.Object {
  @js.native
  object TextJustification extends js.Object {
    /* 0 */ val CENTER: typingsSlinky.vexflow.Vex.Flow.StaveLine.TextJustification.CENTER with Double = js.native
    /* 1 */ val LEFT: typingsSlinky.vexflow.Vex.Flow.StaveLine.TextJustification.LEFT with Double = js.native
    /* 1 */ val RIGHT: typingsSlinky.vexflow.Vex.Flow.StaveLine.TextJustification.RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.StaveLine.TextJustification with Double] = js.native
  }
  
  @js.native
  object TextVerticalPosition extends js.Object {
    /* 0 */ val BOTTOM: typingsSlinky.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.BOTTOM with Double = js.native
    /* 1 */ val TOP: typingsSlinky.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.TOP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.StaveLine.TextVerticalPosition with Double] = js.native
  }
  
}

