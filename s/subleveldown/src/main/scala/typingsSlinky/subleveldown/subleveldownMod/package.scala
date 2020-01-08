package typingsSlinky.subleveldown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subleveldownMod {
  import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback

  /** @see {@link SubDownOptions#open} */
  type SubDownOpenHook = js.Function1[/* callback */ ErrorCallback, Unit]
}
