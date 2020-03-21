package typingsSlinky.wordpressApiFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Schema {
  // prettier-ignore
  type Block[T /* <: typingsSlinky.wordpressApiFetch.mod.Schema.Context */] = typingsSlinky.wordpressApiFetch.mod.Schema.BaseBlock[T] | (typingsSlinky.std.Pick[
    typingsSlinky.wordpressApiFetch.mod.Schema.BaseBlock[T], 
    typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Block | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Block
  ])
  // prettier-ignore
  type Comment[T /* <: typingsSlinky.wordpressApiFetch.mod.Schema.Context */] = typingsSlinky.wordpressApiFetch.mod.Schema.BaseComment[T] | (typingsSlinky.std.Pick[
    typingsSlinky.wordpressApiFetch.mod.Schema.BaseComment[T], 
    typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Comment | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Comment
  ])
  type Contextual[T /* <: typingsSlinky.wordpressApiFetch.mod.Schema.Context */, TAdditional, TEditAdditional] = (typingsSlinky.wordpressApiFetch.AnonRendered with TAdditional) | (typingsSlinky.wordpressApiFetch.AnonRaw with TAdditional with TEditAdditional)
  type Decontextualize[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: T[k] extends / * Inlined @wordpress/api-fetch.@wordpress/api-fetch.Schema.Contextual<any, {}, {}> * /
  {  rendered  :string}? string : T[k]}
    */ typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.Decontextualize with js.Any
  // prettier-ignore
  type Media[T /* <: typingsSlinky.wordpressApiFetch.mod.Schema.Context */] = typingsSlinky.wordpressApiFetch.mod.Schema.BaseMedia[T] | (typingsSlinky.std.Pick[
    typingsSlinky.wordpressApiFetch.mod.Schema.BaseMedia[T], 
    typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Media | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Media
  ])
  // prettier-ignore
  type Post[T /* <: typingsSlinky.wordpressApiFetch.mod.Schema.Context */] = typingsSlinky.wordpressApiFetch.mod.Schema.BasePost[T] | (typingsSlinky.std.Pick[
    typingsSlinky.wordpressApiFetch.mod.Schema.BasePost[T], 
    typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Post | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Post
  ])
  // prettier-ignore
  type PostRevision[T /* <: typingsSlinky.wordpressApiFetch.mod.Schema.Context */] = typingsSlinky.wordpressApiFetch.mod.Schema.BasePostRevision[T] | (typingsSlinky.std.Pick[
    typingsSlinky.wordpressApiFetch.mod.Schema.BasePostRevision[T], 
    typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.PostRevision
  ])
  // prettier-ignore
  type Taxonomy[T /* <: typingsSlinky.wordpressApiFetch.mod.Schema.Context */] = typingsSlinky.wordpressApiFetch.mod.Schema.BaseTaxonomy[T] | (typingsSlinky.std.Pick[
    typingsSlinky.wordpressApiFetch.mod.Schema.BaseTaxonomy[T], 
    typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Taxonomy
  ])
  // prettier-ignore
  type Type[T /* <: typingsSlinky.wordpressApiFetch.mod.Schema.Context */] = typingsSlinky.wordpressApiFetch.mod.Schema.BaseType[T] | (typingsSlinky.std.Pick[
    typingsSlinky.wordpressApiFetch.mod.Schema.BaseType[T], 
    typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Type | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Type
  ])
  // prettier-ignore
  type User[T /* <: typingsSlinky.wordpressApiFetch.mod.Schema.Context */] = typingsSlinky.wordpressApiFetch.mod.Schema.BaseUser[T] | (typingsSlinky.std.Pick[
    typingsSlinky.wordpressApiFetch.mod.Schema.BaseUser[T], 
    typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.User | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.User
  ])
}
