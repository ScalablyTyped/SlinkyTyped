package typingsSlinky.tarDashStream.tarDashStreamMod

import typingsSlinky.node.streamMod.PassThrough
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.streamMod.WritableOptions
import typingsSlinky.tarDashStream.tarDashStreamStrings.entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extract extends Writable {
  @JSName("on")
  def on_entry(
    event: entry,
    listener: js.Function3[/* headers */ Headers, /* stream */ PassThrough, /* next */ js.Function0[Unit], Unit]
  ): this.type = js.native
}

@JSImport("tar-stream", "extract")
@js.native
object extract extends js.Object {
  def apply(): Extract = js.native
  def apply(opts: WritableOptions): Extract = js.native
}

