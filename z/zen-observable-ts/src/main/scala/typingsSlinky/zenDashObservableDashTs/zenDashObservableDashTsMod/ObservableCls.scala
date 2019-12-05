package typingsSlinky.zenDashObservableDashTs.zenDashObservableDashTsMod

import typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", "Observable")
@js.native
class ObservableCls[T] protected ()
  extends typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}

