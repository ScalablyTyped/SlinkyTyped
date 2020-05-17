package typingsSlinky.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tern.ternMod.TypeQuery
  - typingsSlinky.tern.ternMod.FilesQuery
  - typingsSlinky.tern.ternMod.RefsQuery
  - typingsSlinky.tern.ternMod.RenameQuery
  - typingsSlinky.tern.ternMod.DefinitionQuery
  - typingsSlinky.tern.ternMod.CompletionsQuery
  - typingsSlinky.tern.ternMod.PropertiesQuery
  - typingsSlinky.tern.ternMod.DocumentationQuery
*/
trait Query extends js.Object

object Query {
  @scala.inline
  implicit def apply(value: CompletionsQuery): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: DefinitionQuery): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: DocumentationQuery): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: FilesQuery): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: PropertiesQuery): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: RefsQuery): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: RenameQuery): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: TypeQuery): Query = value.asInstanceOf[Query]
}

