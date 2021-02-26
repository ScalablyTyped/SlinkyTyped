package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type`
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Firstnote
import typingsSlinky.vexflow.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
class StaveHairpin protected ()
  extends typingsSlinky.vexflow.Vex.Flow.StaveHairpin {
  def this(notes: Firstnote, `type`: typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type`) = this()
}
object StaveHairpin {
  
  /* static member */
  @JSImport("vexflow", "Flow.StaveHairpin.FormatByTicksAndDraw")
  @js.native
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typingsSlinky.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position
  ): Unit = js.native
  @JSImport("vexflow", "Flow.StaveHairpin.FormatByTicksAndDraw")
  @js.native
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typingsSlinky.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position,
    options: Height
  ): Unit = js.native
  
  @JSImport("vexflow", "Flow.StaveHairpin.type")
  @js.native
  object `type` extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type` with Double] = js.native
    
    /* 1 */ val CRESC: typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type`.CRESC with Double = js.native
    
    /* 0 */ val DECRESC: typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type`.DECRESC with Double = js.native
  }
}
