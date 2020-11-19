package typingsSlinky.uirouterAngularjs.mod

import typingsSlinky.uirouterCore.commonCommonMod.TypedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "filter")
@js.native
object filter extends js.Object {
  
  def apply[T](collection: js.Array[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[Double], Boolean]): js.Array[T] = js.native
  def apply[T](collection: TypedMap[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[String], Boolean]): TypedMap[T] = js.native
}
