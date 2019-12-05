package typingsSlinky.swDashPrecache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swDashPrecacheMod {
  import typingsSlinky.node.NodeJS.ErrnoException

  type Generate = js.Function2[
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function2[/* error */ ErrnoException, /* serviceWorkerString */ String, Unit]], 
    js.Promise[String]
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.swDashPrecache.swDashPrecacheStrings.networkFirst
    - typings.swDashPrecache.swDashPrecacheStrings.cacheFirst
    - typings.swDashPrecache.swDashPrecacheStrings.fastest
    - typings.swDashPrecache.swDashPrecacheStrings.cacheOnly
    - typings.swDashPrecache.swDashPrecacheStrings.networkOnly
    - typings.swDashToolbox.swDashToolboxMod.Handler
  */
  type Handler = _Handler | typingsSlinky.swDashToolbox.swDashToolboxMod.Handler
  type Write = js.Function3[
    /* filePath */ String, 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* error */ ErrnoException, Unit]], 
    js.Promise[String]
  ]
}
