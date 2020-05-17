package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type`
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Firstnote
import typingsSlinky.vexflow.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveHairpin")
@js.native
class StaveHairpin protected ()
  extends typingsSlinky.vexflow.Vex.Flow.StaveHairpin {
  def this(notes: Firstnote, `type`: typingsSlinky.vexflow.Vex.Flow.StaveHairpin.`type`) = this()
}

/* static members */
@JSGlobal("Vex.Flow.StaveHairpin")
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
}

