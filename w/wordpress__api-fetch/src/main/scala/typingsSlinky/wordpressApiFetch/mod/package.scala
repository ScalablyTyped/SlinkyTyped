package typingsSlinky.wordpressApiFetch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
