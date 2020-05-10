package typingsSlinky.useSubscription.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription[T] extends js.Object {
  /**
    * (Synchronously) returns the current value of our subscription.
    */
  def getCurrentValue(): T = js.native
  /**
    * This function is passed an event handler to attach to the subscription.
    * It must return an unsubscribe function that removes the handler.
    */
  def subscribe(callback: js.Function0[Unit]): Unsubscribe = js.native
}

object Subscription {
  @scala.inline
  def apply[T](getCurrentValue: () => T, subscribe: js.Function0[Unit] => Unsubscribe): Subscription[T] = {
    val __obj = js.Dynamic.literal(getCurrentValue = js.Any.fromFunction0(getCurrentValue), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Subscription[T]]
  }
  @scala.inline
  implicit class SubscriptionOps[Self[t] <: Subscription[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetCurrentValue(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: js.Function0[Unit] => Unsubscribe): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

