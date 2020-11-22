package typingsSlinky.wonka.wonkaObservableMod

import typingsSlinky.wonka.wonkaTypesMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/web/wonka_observable", "fromObservable")
@js.native
object fromObservable extends js.Object {
  
  def apply[T](observable: JsObservable[T]): Source[T] = js.native
}
