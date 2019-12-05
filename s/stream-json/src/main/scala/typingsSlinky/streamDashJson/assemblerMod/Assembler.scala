package typingsSlinky.streamDashJson.assemblerMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assembler extends EventEmitter {
  var current: js.Any = js.native
  val depth: Double = js.native
  val done: Boolean = js.native
  var key: String | Null = js.native
  val path: String = js.native
  var stack: js.Array[Double | String | Null] = js.native
  // events
  @JSName("addListener")
  def addListener_done(
    event: typingsSlinky.streamDashJson.streamDashJsonStrings.done,
    listener: js.Function1[/* asm */ this.type, Unit]
  ): this.type = js.native
  def connectTo(stream: Readable): this.type = js.native
  def consume(chunk: Token): this.type = js.native
  def dropToLevel(level: Double): this.type = js.native
  @JSName("on")
  def on_done(
    event: typingsSlinky.streamDashJson.streamDashJsonStrings.done,
    listener: js.Function1[/* asm */ this.type, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_done(
    event: typingsSlinky.streamDashJson.streamDashJsonStrings.done,
    listener: js.Function1[/* asm */ this.type, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_done(
    event: typingsSlinky.streamDashJson.streamDashJsonStrings.done,
    listener: js.Function1[/* asm */ this.type, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_done(
    event: typingsSlinky.streamDashJson.streamDashJsonStrings.done,
    listener: js.Function1[/* asm */ this.type, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_done(
    event: typingsSlinky.streamDashJson.streamDashJsonStrings.done,
    listener: js.Function1[/* asm */ this.type, Unit]
  ): this.type = js.native
}

