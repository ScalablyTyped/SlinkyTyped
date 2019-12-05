package typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Schema {
  import typingsSlinky.atWordpressApiDashFetch.Anon_Raw
  import typingsSlinky.atWordpressApiDashFetch.Anon_Rendered
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  // prettier-ignore
  type Block[T /* <: Context */] = BaseBlock[T] | (Pick[
    BaseBlock[T], 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Block | typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Block
  ])
  // prettier-ignore
  type Category[T /* <: Context */] = BaseCategory | (Pick[
    BaseCategory, 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Category | typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Category
  ])
  // prettier-ignore
  type Comment[T /* <: Context */] = BaseComment[T] | (Pick[
    BaseComment[T], 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Comment | typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Comment
  ])
  type Contextual[T /* <: Context */, TAdditional, TEditAdditional] = (Anon_Rendered with TAdditional) | (Anon_Raw with TAdditional with TEditAdditional)
  type Decontextualize[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: T[k] extends @wordpress/api-fetch.@wordpress/api-fetch.Schema.Contextual<any, {}, {}>? string : T[k]}
    */ typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.Decontextualize with js.Any
  // prettier-ignore
  type Media[T /* <: Context */] = BaseMedia[T] | (Pick[
    BaseMedia[T], 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Media | typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Media
  ])
  // prettier-ignore
  type Page[T /* <: Context */] = BasePage[T] | (Pick[
    BasePage[T], 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Page | typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Page
  ])
  // prettier-ignore
  type Post[T /* <: Context */] = BasePost[T] | (Pick[
    BasePost[T], 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Post | typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Post
  ])
  // prettier-ignore
  type PostOrPage[T /* <: Context */] = (BasePost[T] with Partial[BasePage[T]]) | ((Pick[
    BasePost[T], 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Post
  ]) with (Partial[
    Pick[
      BasePage[T], 
      typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Page
    ]
  ])) | ((Pick[
    BasePost[T], 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Post
  ]) with (Partial[
    Pick[
      BasePage[T], 
      typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Page
    ]
  ]))
  // prettier-ignore
  type PostRevision[T /* <: Context */] = BasePostRevision[T] | (Pick[
    BasePostRevision[T], 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.PostRevision | typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.PostRevision
  ])
  // prettier-ignore
  type Status[T /* <: Context */] = BaseStatus | (Pick[
    BaseStatus, 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Status | typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Status
  ])
  // prettier-ignore
  type Tag[T /* <: Context */] = BaseTag | (Pick[
    BaseTag, 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Tag
  ])
  // prettier-ignore
  type Taxonomy[T /* <: Context */] = BaseTaxonomy[T] | (Pick[
    BaseTaxonomy[T], 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Taxonomy | typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Taxonomy
  ])
  // prettier-ignore
  type Type[T /* <: Context */] = BaseType[T] | (Pick[
    BaseType[T], 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Type | typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Type
  ])
  // prettier-ignore
  type User[T /* <: Context */] = BaseUser[T] | (Pick[
    BaseUser[T], 
    typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.User | typingsSlinky.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.User
  ])
}
