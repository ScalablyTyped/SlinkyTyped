package typingsSlinky.zenObservableTs.mod

import typingsSlinky.zenObservableTs.zenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", "Observable")
@js.native
class ObservableCls[T] protected ()
  extends typingsSlinky.zenObservableTs.zenObservableMod.Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}

