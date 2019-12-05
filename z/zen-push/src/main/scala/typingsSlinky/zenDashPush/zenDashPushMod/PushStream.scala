package typingsSlinky.zenDashPush.zenDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushStream[T] extends js.Object {
  val observable: typingsSlinky.zenDashObservable.zenDashObservableMod.^[T] = js.native
  val observed: Double = js.native
  def complete(): Unit = js.native
  def complete(x: js.Any): Unit = js.native
  def error(e: js.Error): Unit = js.native
  def next(x: T): Unit = js.native
}

