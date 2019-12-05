package typingsSlinky.stickyDashCluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stickyDashClusterMod {
  import typingsSlinky.node.httpMod.Server

  type Callback = js.Function1[/* server */ Server, Unit]
  type InitializeFn = js.Function1[/* callback */ Callback, Unit]
}
