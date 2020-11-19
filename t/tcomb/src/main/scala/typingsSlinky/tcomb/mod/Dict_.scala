package typingsSlinky.tcomb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tcomb.anon.Codomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// dict combinator
//
@js.native
trait Dict_[T] extends Type[StringDictionary[T]] {
  
  @JSName("meta")
  var meta_Dict_ : Codomain[T] = js.native
  
  def update(instance: StringDictionary[T], spec: UpdatePatch): StringDictionary[T] = js.native
  @JSName("update")
  var update_Original: Update_[StringDictionary[T]] = js.native
}
