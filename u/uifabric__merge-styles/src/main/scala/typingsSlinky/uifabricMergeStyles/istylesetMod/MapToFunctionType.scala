package typingsSlinky.uifabricMergeStyles.istylesetMod

import typingsSlinky.std.Extract
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Extract[T, js.Function]
  - js.Function1[/ * repeated * / js.Any, typingsSlinky.std.Partial[T]]
*/
trait MapToFunctionType[T] extends js.Object

object MapToFunctionType {
  @scala.inline
  implicit def apply[T](value: Extract[T, js.Function]): MapToFunctionType[T] = value.asInstanceOf[MapToFunctionType[T]]
  @scala.inline
  implicit def apply[T](value: js.Function1[/* repeated */ js.Any, Partial[T]]): MapToFunctionType[T] = value.asInstanceOf[MapToFunctionType[T]]
}

