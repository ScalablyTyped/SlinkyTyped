package typingsSlinky.testingLibraryDom.getQueriesForElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[/ * text * / js.Any, js.UndefOr[js.Any], js.Any]
  - js.Function3[
/ * text * / js.Any, 
/ * options * / js.UndefOr[js.Any], 
/ * waitForElementOptions * / js.UndefOr[js.Any], 
js.Any]
*/
trait BoundFunction[T] extends js.Object

object BoundFunction {
  @scala.inline
  implicit def apply[T](value: js.Function2[/* text */ js.Any, js.UndefOr[js.Any], js.Any]): BoundFunction[T] = value.asInstanceOf[BoundFunction[T]]
  @scala.inline
  implicit def apply[T](
    value: js.Function3[
      /* text */ js.Any, 
      /* options */ js.UndefOr[js.Any], 
      /* waitForElementOptions */ js.UndefOr[js.Any], 
      js.Any
    ]
  ): BoundFunction[T] = value.asInstanceOf[BoundFunction[T]]
}

