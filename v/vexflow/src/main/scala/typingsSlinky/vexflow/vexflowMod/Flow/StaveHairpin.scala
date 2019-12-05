package typingsSlinky.vexflow.vexflowMod.Flow

import typingsSlinky.vexflow.Anon_Firstnote
import typingsSlinky.vexflow.Anon_HeightLeftshiftticks
import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type`
import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
class StaveHairpin protected ()
  extends typingsSlinky.vexflow.Vex.Flow.StaveHairpin {
  def this(notes: Anon_Firstnote, `type`: `type`) = this()
}

/* static members */
@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
object StaveHairpin extends js.Object {
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typingsSlinky.vexflow.Vex.Flow.Formatter,
    notes: Anon_Firstnote,
    `type`: `type`,
    position: Position
  ): Unit = js.native
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typingsSlinky.vexflow.Vex.Flow.Formatter,
    notes: Anon_Firstnote,
    `type`: `type`,
    position: Position,
    options: Anon_HeightLeftshiftticks
  ): Unit = js.native
}

