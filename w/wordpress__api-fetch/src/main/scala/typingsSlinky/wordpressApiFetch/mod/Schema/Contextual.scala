package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.wordpressApiFetch.anon.Raw
import typingsSlinky.wordpressApiFetch.anon.Rendered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.anon.Rendered with TAdditional
  - typingsSlinky.wordpressApiFetch.anon.Raw with TAdditional with TEditAdditional
*/
trait Contextual[T /* <: Context */, TAdditional, TEditAdditional] extends js.Object

object Contextual {
  @scala.inline
  implicit def apply[T, TAdditional, TEditAdditional](value: Rendered with TAdditional): Contextual[T, TAdditional, TEditAdditional] = value.asInstanceOf[Contextual[T, TAdditional, TEditAdditional]]
  @scala.inline
  implicit def apply[T, TAdditional, TEditAdditional](value: Raw with TAdditional with TEditAdditional): Contextual[T, TAdditional, TEditAdditional] = value.asInstanceOf[Contextual[T, TAdditional, TEditAdditional]]
}

