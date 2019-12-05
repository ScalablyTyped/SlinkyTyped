package typingsSlinky.wouter

import typingsSlinky.wouter.wouterMod.LocationHook
import typingsSlinky.wouter.wouterMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/static-location", JSImport.Namespace)
@js.native
object staticDashLocationMod extends js.Object {
  def apply(): LocationHook = js.native
  def apply(path: Path): LocationHook = js.native
}

