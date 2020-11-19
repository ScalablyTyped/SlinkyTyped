package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.anon.Cps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Curve")
@js.native
class Curve protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Curve {
  def this(from: typingsSlinky.vexflow.Vex.Flow.Note, to: typingsSlinky.vexflow.Vex.Flow.Note) = this()
  def this(from: typingsSlinky.vexflow.Vex.Flow.Note, to: typingsSlinky.vexflow.Vex.Flow.Note, options: Cps) = this()
}
/* static members */
@JSGlobal("Vex.Flow.Curve")
@js.native
object Curve extends js.Object {
  
  var DEBUG: Boolean = js.native
  
  @js.native
  object Position extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.Curve.Position with Double] = js.native
    
    /* 1 */ val NEAR_HEAD: typingsSlinky.vexflow.Vex.Flow.Curve.Position.NEAR_HEAD with Double = js.native
    
    /* 0 */ val NEAR_TOP: typingsSlinky.vexflow.Vex.Flow.Curve.Position.NEAR_TOP with Double = js.native
  }
}
