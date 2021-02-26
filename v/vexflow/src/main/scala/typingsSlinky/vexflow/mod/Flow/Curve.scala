package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.anon.Cps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Curve")
@js.native
class Curve protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Curve {
  def this(from: typingsSlinky.vexflow.Vex.Flow.Note, to: typingsSlinky.vexflow.Vex.Flow.Note) = this()
  def this(from: typingsSlinky.vexflow.Vex.Flow.Note, to: typingsSlinky.vexflow.Vex.Flow.Note, options: Cps) = this()
}
object Curve {
  
  @JSImport("vexflow", "Flow.Curve")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.Curve.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Curve.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.Curve.Position with Double] = js.native
    
    /* 1 */ val NEAR_HEAD: typingsSlinky.vexflow.Vex.Flow.Curve.Position.NEAR_HEAD with Double = js.native
    
    /* 0 */ val NEAR_TOP: typingsSlinky.vexflow.Vex.Flow.Curve.Position.NEAR_TOP with Double = js.native
  }
}
