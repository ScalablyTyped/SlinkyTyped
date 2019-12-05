package typingsSlinky.zenDashObservableDashTs.zenDashObservableDashTsMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.ArrayLike
import typingsSlinky.zenDashObservableDashTs.libTypesMod.ZenObservable.ObservableLike
import typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", "Observable")
@js.native
object Observable
  extends Instantiable1[
      /* subscriber */ Subscriber[js.Object], 
      typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Observable[js.Object]
    ] {
  def from[R](observable: ArrayLike[R]): typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: ObservableLike[R]): typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Observable[R]): typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
  def of[R](args: R*): typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
}

