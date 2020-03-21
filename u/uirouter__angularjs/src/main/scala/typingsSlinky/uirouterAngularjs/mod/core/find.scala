package typingsSlinky.uirouterAngularjs.mod.core

import typingsSlinky.uirouterCore.commonCommonMod.Predicate
import typingsSlinky.uirouterCore.commonCommonMod.TypedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.find")
@js.native
object find extends js.Object {
  def apply[T](collection: js.Array[T], callback: Predicate[T]): T = js.native
  def apply[T](collection: TypedMap[T], callback: Predicate[T]): T = js.native
}

