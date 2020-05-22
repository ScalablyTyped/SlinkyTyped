package typingsSlinky.swPrecache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Generate_ = js.Function2[
    /* options */ js.UndefOr[typingsSlinky.swPrecache.mod.Options], 
    /* callback */ js.UndefOr[
      js.Function2[
        /* error */ typingsSlinky.node.NodeJS.ErrnoException, 
        /* serviceWorkerString */ java.lang.String, 
        scala.Unit
      ]
    ], 
    js.Promise[java.lang.String]
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.swPrecache.swPrecacheStrings.networkFirst
    - typingsSlinky.swPrecache.swPrecacheStrings.cacheFirst
    - typingsSlinky.swPrecache.swPrecacheStrings.fastest
    - typingsSlinky.swPrecache.swPrecacheStrings.cacheOnly
    - typingsSlinky.swPrecache.swPrecacheStrings.networkOnly
    - typingsSlinky.swToolbox.mod.Handler
  */
  type Handler = typingsSlinky.swPrecache.mod._Handler | typingsSlinky.swToolbox.mod.Handler
  type Write_ = js.Function3[
    /* filePath */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.swPrecache.mod.Options], 
    /* callback */ js.UndefOr[js.Function1[/* error */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]], 
    js.Promise[java.lang.String]
  ]
}
