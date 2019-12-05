package typingsSlinky.atTestingDashLibraryCypress.atTestingDashLibraryCypressMod

import typingsSlinky.atTestingDashLibraryDom.configMod.Config
import typingsSlinky.atTestingDashLibraryDom.configMod.ConfigFn
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/cypress", "configure")
@js.native
object configure extends js.Object {
  def apply(configDelta: ConfigFn): Unit = js.native
  def apply(configDelta: Partial[Config]): Unit = js.native
}

