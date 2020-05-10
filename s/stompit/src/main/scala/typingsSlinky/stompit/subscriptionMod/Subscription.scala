package typingsSlinky.stompit.subscriptionMod

import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  def getId(): Double = js.native
  def processMessageFrame(error: Null, frame: Writable): Unit = js.native
  def processMessageFrame(error: js.Error, frame: Writable): Unit = js.native
  def unsubscribe(): Unit = js.native
  def unsubscribe(headers: js.Any): Unit = js.native
}

