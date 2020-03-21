package typingsSlinky.stickyCluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* server */ typingsSlinky.node.httpMod.Server, scala.Unit]
  type InitializeFn = js.Function1[/* callback */ typingsSlinky.stickyCluster.mod.Callback, scala.Unit]
}
