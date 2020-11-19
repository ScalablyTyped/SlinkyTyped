package typingsSlinky.wonka

import typingsSlinky.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/dist/types/src/web/Wonka_observable.gen", JSImport.Namespace)
@js.native
object wonkaObservableGenMod extends js.Object {
  
  def fromObservable[a](input: observableT[a]): sourceT[a] = js.native
  
  def toObservable[a](source: sourceT[a]): observableT[a] = js.native
  
  type observableObserverT[a] = typingsSlinky.wonka.jsShimMod.observableObserverT[a]
  
  type observableSubscriptionT = typingsSlinky.wonka.jsShimMod.observableSubscriptionT
  
  type observableT[a] = typingsSlinky.wonka.jsShimMod.observableT[a]
}
