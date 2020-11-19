package typingsSlinky.semver.mod

import typingsSlinky.semver.semverMod.^
import typingsSlinky.semver.semverNumbers.`-1`
import typingsSlinky.semver.semverNumbers.`0`
import typingsSlinky.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver", "compareBuild")
@js.native
object compareBuild extends js.Object {
  
  /**
    * Compares two versions including build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    *
    * @since 6.1.0
    */
  def apply(a: String, b: String): `1` | `0` | `-1` = js.native
  def apply(a: String, b: ^): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: String): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: ^): `1` | `0` | `-1` = js.native
}
