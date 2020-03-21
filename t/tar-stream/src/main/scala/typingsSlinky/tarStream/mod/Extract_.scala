package typingsSlinky.tarStream.mod

import typingsSlinky.node.streamMod.PassThrough
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.tarStream.tarStreamStrings.entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extract_ extends Writable {
  @JSName("on")
  def on_entry(
    event: entry,
    listener: js.Function3[/* headers */ Headers, /* stream */ PassThrough, /* next */ js.Function0[Unit], Unit]
  ): this.type = js.native
}

