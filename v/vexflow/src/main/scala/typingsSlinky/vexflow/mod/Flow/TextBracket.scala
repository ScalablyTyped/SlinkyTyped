package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.anon.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.TextBracket")
@js.native
class TextBracket protected ()
  extends typingsSlinky.vexflow.Vex.Flow.TextBracket {
  def this(bracket_data: Position) = this()
}
/* static members */
@JSImport("vexflow", "Flow.TextBracket")
@js.native
object TextBracket extends js.Object {
  
  var DEBUG: Boolean = js.native
  
  @js.native
  object Positions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.TextBracket.Positions with Double] = js.native
    
    /* -1 */ val BOTTOM: typingsSlinky.vexflow.Vex.Flow.TextBracket.Positions.BOTTOM with Double = js.native
    
    /* 1 */ val TOP: typingsSlinky.vexflow.Vex.Flow.TextBracket.Positions.TOP with Double = js.native
  }
}
