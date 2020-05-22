package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Cps
import typingsSlinky.vexflow.anon.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Curve")
@js.native
class Curve protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Curve {
  def this(from: typingsSlinky.vexflow.Vex.Flow.Note, to: typingsSlinky.vexflow.Vex.Flow.Note) = this()
  def this(from: typingsSlinky.vexflow.Vex.Flow.Note, to: typingsSlinky.vexflow.Vex.Flow.Note, options: Cps) = this()
  /* CompleteClass */
  override def draw(): Boolean = js.native
  /* CompleteClass */
  override def isPartial(): Boolean = js.native
  /* CompleteClass */
  override def renderCurve(params: Direction): Unit = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsSlinky.vexflow.Vex.Flow.Curve = js.native
  /* CompleteClass */
  override def setNotes(from: typingsSlinky.vexflow.Vex.Flow.Note, to: typingsSlinky.vexflow.Vex.Flow.Note): typingsSlinky.vexflow.Vex.Flow.Curve = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Curve")
@js.native
object Curve extends js.Object {
  var DEBUG: Boolean = js.native
  @js.native
  object Position extends js.Object {
    /* 1 */ val NEAR_HEAD: typingsSlinky.vexflow.Vex.Flow.Curve.Position.NEAR_HEAD with Double = js.native
    /* 0 */ val NEAR_TOP: typingsSlinky.vexflow.Vex.Flow.Curve.Position.NEAR_TOP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.Curve.Position with Double] = js.native
  }
  
}

