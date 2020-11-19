package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// maybe combinator
//
@js.native
trait Maybe_[T] extends Type[Unit | T] {
  
  @JSName("meta")
  var meta_Maybe_ : typingsSlinky.tcomb.anon.Type[T] = js.native
  
  def update(instance: T, spec: UpdatePatch): Unit | T = js.native
  def update(instance: Unit, spec: UpdatePatch): Unit | T = js.native
  @JSName("update")
  var update_Original: Update_[Unit | T] = js.native
}
