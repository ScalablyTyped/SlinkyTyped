package typingsSlinky.semver.mod

import typingsSlinky.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver", "minVersion")
@js.native
object minVersion extends js.Object {
  
  /**
    * Return the lowest version that can possibly match the given range.
    */
  def apply(range: String): ^  | Null = js.native
  def apply(range: String, optionsOrLoose: Boolean): ^  | Null = js.native
  def apply(range: String, optionsOrLoose: Options): ^  | Null = js.native
  def apply(range: typingsSlinky.semver.rangeMod.^): ^  | Null = js.native
  def apply(range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Boolean): ^  | Null = js.native
  def apply(range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Options): ^  | Null = js.native
}
