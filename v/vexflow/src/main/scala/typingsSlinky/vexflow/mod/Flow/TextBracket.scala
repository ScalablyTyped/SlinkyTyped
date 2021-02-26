package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.TextBracket")
@js.native
class TextBracket protected ()
  extends typingsSlinky.vexflow.Vex.Flow.TextBracket {
  def this(bracket_data: Position) = this()
}
object TextBracket {
  
  @JSImport("vexflow", "Flow.TextBracket")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.TextBracket.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.TextBracket.Positions")
  @js.native
  object Positions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.TextBracket.Positions with Double] = js.native
    
    /* -1 */ val BOTTOM: typingsSlinky.vexflow.Vex.Flow.TextBracket.Positions.BOTTOM with Double = js.native
    
    /* 1 */ val TOP: typingsSlinky.vexflow.Vex.Flow.TextBracket.Positions.TOP with Double = js.native
  }
}
