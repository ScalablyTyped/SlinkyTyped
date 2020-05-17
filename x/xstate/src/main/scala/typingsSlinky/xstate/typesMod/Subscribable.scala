package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribable[T] extends Spawnable {
  def subscribe(): Unsubscribable = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit]): Unsubscribable = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): Unsubscribable = js.native
  def subscribe(
    next: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Unsubscribable = js.native
}

