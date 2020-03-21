package typingsSlinky.zenObservableTs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ZenObservable {
  type Subscriber[T] = js.Function1[
    /* observer */ typingsSlinky.zenObservableTs.typesMod.ZenObservable.SubscriptionObserver[T], 
    scala.Unit | js.Function0[scala.Unit] | typingsSlinky.zenObservableTs.typesMod.ZenObservable.Subscription
  ]
}
