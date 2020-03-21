package typingsSlinky.stompit.transactionMod

import typingsSlinky.node.streamMod.Writable
import typingsSlinky.stompit.clientMod.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  def abort(): Unit = js.native
  def abort(options: SendOptions): Unit = js.native
  def commit(): Unit = js.native
  def commit(options: SendOptions): Unit = js.native
  def send(): Writable = js.native
  def send(headers: js.Any): Writable = js.native
  def send(headers: js.Any, options: SendOptions): Writable = js.native
}

