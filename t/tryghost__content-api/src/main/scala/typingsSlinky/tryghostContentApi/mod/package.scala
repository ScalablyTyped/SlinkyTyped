package typingsSlinky.tryghostContentApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Authors = typingsSlinky.tryghostContentApi.mod.BrowseResults[typingsSlinky.tryghostContentApi.mod.Author]
  type BrowseFunction[T] = js.Function2[
    /* options */ js.UndefOr[typingsSlinky.tryghostContentApi.mod.Params], 
    /* memberToken */ js.UndefOr[typingsSlinky.tryghostContentApi.mod.Nullable[java.lang.String]], 
    js.Promise[T]
  ]
  type FieldParam = java.lang.String
  type FilterParam = java.lang.String
  type OrderParam = java.lang.String
  type PageParam = scala.Double
  type PostsOrPages = typingsSlinky.tryghostContentApi.mod.BrowseResults[typingsSlinky.tryghostContentApi.mod.PostOrPage]
  type ReadFunction[T] = js.Function3[
    /* data */ typingsSlinky.tryghostContentApi.anon.Id | typingsSlinky.tryghostContentApi.anon.Slug, 
    /* options */ js.UndefOr[typingsSlinky.tryghostContentApi.mod.Params], 
    /* memberToken */ js.UndefOr[typingsSlinky.tryghostContentApi.mod.Nullable[java.lang.String]], 
    js.Promise[T]
  ]
  type Tags = typingsSlinky.tryghostContentApi.mod.BrowseResults[typingsSlinky.tryghostContentApi.mod.Tag]
}
