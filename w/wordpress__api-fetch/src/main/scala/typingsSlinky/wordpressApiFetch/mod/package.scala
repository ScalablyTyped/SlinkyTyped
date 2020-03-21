package typingsSlinky.wordpressApiFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Middleware = js.Function2[
    /* options */ typingsSlinky.wordpressApiFetch.mod.APIFetchOptions, 
    /* next */ js.Function1[
      /* options */ typingsSlinky.wordpressApiFetch.mod.APIFetchOptions, 
      js.Promise[js.Any]
    ], 
    js.Promise[js.Any]
  ]
}
