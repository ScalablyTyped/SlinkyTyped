package typingsSlinky.vexflow.mod.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StaveModifier")
@js.native
class StaveModifier ()
  extends typingsSlinky.vexflow.Vex.Flow.StaveModifier

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

