package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.anon.Cps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Curve")
@js.native
class Curve protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Curve {
  def this(from: typingsSlinky.vexflow.Vex.Flow.Note, to: typingsSlinky.vexflow.Vex.Flow.Note) = this()
  def this(from: typingsSlinky.vexflow.Vex.Flow.Note, to: typingsSlinky.vexflow.Vex.Flow.Note, options: Cps) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Curve")
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

