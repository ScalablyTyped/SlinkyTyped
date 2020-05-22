package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type`
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Firstnote
import typingsSlinky.vexflow.anon.Firstx
import typingsSlinky.vexflow.anon.Height
import typingsSlinky.vexflow.anon.Leftshiftpx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
class StaveHairpin protected ()
  extends typingsSlinky.vexflow.Vex.Flow.StaveHairpin {
  def this(notes: Firstnote, `type`: typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type`) = this()
  /* CompleteClass */
  override def draw(): Boolean = js.native
  /* CompleteClass */
  override def renderHairpin(params: Firstx): Unit = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsSlinky.vexflow.Vex.Flow.StaveHairpin = js.native
  /* CompleteClass */
  override def setNotes(notes: Firstnote): typingsSlinky.vexflow.Vex.Flow.StaveHairpin = js.native
  /* CompleteClass */
  override def setPosition(position: Position): typingsSlinky.vexflow.Vex.Flow.StaveHairpin = js.native
  /* CompleteClass */
  override def setRenderOptions(options: Leftshiftpx): typingsSlinky.vexflow.Vex.Flow.StaveHairpin = js.native
}

/* static members */
@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
object StaveHairpin extends js.Object {
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typingsSlinky.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position
  ): Unit = js.native
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typingsSlinky.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position,
    options: Height
  ): Unit = js.native
  @js.native
  object `type` extends js.Object {
    /* 1 */ val CRESC: typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type`.CRESC with Double = js.native
    /* 0 */ val DECRESC: typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type`.DECRESC with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type` with Double] = js.native
  }
  
}

