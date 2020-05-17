package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.wordpressApiFetch.anon.PickBaseCategoryCategory
import typingsSlinky.wordpressApiFetch.anon.PickBaseCategoryCategoryCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BaseCategory
  - typingsSlinky.wordpressApiFetch.anon.PickBaseCategoryCategoryCount
  - typingsSlinky.wordpressApiFetch.anon.PickBaseCategoryCategory
*/
trait Category[T /* <: Context */] extends js.Object

object Category {
  @scala.inline
  implicit def apply[T](value: BaseCategory): Category[T] = value.asInstanceOf[Category[T]]
  @scala.inline
  implicit def apply[T](value: PickBaseCategoryCategory): Category[T] = value.asInstanceOf[Category[T]]
  @scala.inline
  implicit def apply[T](value: PickBaseCategoryCategoryCount): Category[T] = value.asInstanceOf[Category[T]]
}

