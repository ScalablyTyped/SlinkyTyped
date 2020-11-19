package typingsSlinky.tcomb.anon

import typingsSlinky.tcomb.mod.TypeGuardPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kind[T] extends js.Object {
  
  var identity: Boolean = js.native
  
  var kind: String = js.native
  
  var name: String = js.native
  
  def predicate(x: js.Any): /* is T */ Boolean = js.native
  @JSName("predicate")
  var predicate_Original: TypeGuardPredicate[T] = js.native
}
