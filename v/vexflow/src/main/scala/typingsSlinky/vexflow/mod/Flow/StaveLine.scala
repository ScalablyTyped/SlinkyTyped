package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.anon.Firstindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.StaveLine")
@js.native
class StaveLine protected ()
  extends typingsSlinky.vexflow.Vex.Flow.StaveLine {
  def this(notes: Firstindices) = this()
}
object StaveLine {
  
  @JSImport("vexflow", "Flow.StaveLine.TextJustification")
  @js.native
  object TextJustification extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.StaveLine.TextJustification with Double] = js.native
    
    /* 0 */ val CENTER: typingsSlinky.vexflow.Vex.Flow.StaveLine.TextJustification.CENTER with Double = js.native
    
    /* 1 */ val LEFT: typingsSlinky.vexflow.Vex.Flow.StaveLine.TextJustification.LEFT with Double = js.native
    
    /* 1 */ val RIGHT: typingsSlinky.vexflow.Vex.Flow.StaveLine.TextJustification.RIGHT with Double = js.native
  }
  
  @JSImport("vexflow", "Flow.StaveLine.TextVerticalPosition")
  @js.native
  object TextVerticalPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.StaveLine.TextVerticalPosition with Double] = js.native
    
    /* 0 */ val BOTTOM: typingsSlinky.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.BOTTOM with Double = js.native
    
    /* 1 */ val TOP: typingsSlinky.vexflow.Vex.Flow.StaveLine.TextVerticalPosition.TOP with Double = js.native
  }
}
