package typingsSlinky.zenObservableTs.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.ArrayLike
import typingsSlinky.zenObservableTs.typesMod.ZenObservable.ObservableLike
import typingsSlinky.zenObservableTs.zenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zen-observable-ts", "Observable")
@js.native
object Observable
  extends Instantiable1[
      /* subscriber */ Subscriber[js.Object], 
      typingsSlinky.zenObservableTs.zenObservableMod.Observable[js.Object]
    ] {
  
  def from[R](observable: ArrayLike[R]): typingsSlinky.zenObservableTs.zenObservableMod.Observable[R] = js.native
  def from[R](observable: ObservableLike[R]): typingsSlinky.zenObservableTs.zenObservableMod.Observable[R] = js.native
  def from[R](observable: typingsSlinky.zenObservableTs.zenObservableMod.Observable[R]): typingsSlinky.zenObservableTs.zenObservableMod.Observable[R] = js.native
  
  def of[R](args: R*): typingsSlinky.zenObservableTs.zenObservableMod.Observable[R] = js.native
}
