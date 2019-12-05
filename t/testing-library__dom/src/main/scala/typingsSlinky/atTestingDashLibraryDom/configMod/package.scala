package typingsSlinky.atTestingDashLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configMod {
  import typingsSlinky.std.Partial

  type ConfigFn = js.Function1[/* existingConfig */ Config, Partial[Config]]
}
