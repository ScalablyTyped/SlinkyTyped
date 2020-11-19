package typingsSlinky.uirouterCore.commonMod

import typingsSlinky.uirouterCore.commonCommonMod.Predicate
import typingsSlinky.uirouterCore.commonCommonMod.TypedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/common", "find")
@js.native
object find extends js.Object {
  
  def apply[T](collection: js.Array[T], callback: Predicate[T]): T = js.native
  def apply[T](collection: TypedMap[T], callback: Predicate[T]): T = js.native
}
