package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BaseTaxonomy[T]
  - typingsSlinky.std.Pick[
typingsSlinky.wordpressApiFetch.mod.Schema.BaseTaxonomy[T], 
typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Taxonomy]
*/
trait Taxonomy[T /* <: Context */] extends js.Object

object Taxonomy {
  @scala.inline
  implicit def apply[T](value: BaseTaxonomy[T]): Taxonomy[T] = value.asInstanceOf[Taxonomy[T]]
  @scala.inline
  implicit def apply[T](
    value: Pick[
      BaseTaxonomy[T], 
      typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Taxonomy
    ]
  ): Taxonomy[T] = value.asInstanceOf[Taxonomy[T]]
}

