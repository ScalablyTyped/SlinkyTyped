package typingsSlinky.superstruct.typingsMod

import typingsSlinky.superstruct.anon.PartialFailure
import typingsSlinky.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  var branch: js.Array[_] = js.native
  
  def check[T, S](value: js.Any, struct: Struct[T, S]): js.Iterable[Failure] = js.native
  def check[T, S](value: js.Any, struct: Struct[T, S], parent: js.UndefOr[scala.Nothing], key: String): js.Iterable[Failure] = js.native
  def check[T, S](value: js.Any, struct: Struct[T, S], parent: js.UndefOr[scala.Nothing], key: Double): js.Iterable[Failure] = js.native
  def check[T, S](value: js.Any, struct: Struct[T, S], parent: js.Any): js.Iterable[Failure] = js.native
  def check[T, S](value: js.Any, struct: Struct[T, S], parent: js.Any, key: String): js.Iterable[Failure] = js.native
  def check[T, S](value: js.Any, struct: Struct[T, S], parent: js.Any, key: Double): js.Iterable[Failure] = js.native
  
  def fail(): Failure = js.native
  def fail(props: PartialFailure): Failure = js.native
  
  var path: js.Array[String | Double] = js.native
  
  var refinement: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
  
  var value: js.Any = js.native
}
