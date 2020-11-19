package typingsSlinky.semver

import typingsSlinky.semver.mod.Options
import typingsSlinky.semver.semverMod.^
import typingsSlinky.semver.semverNumbers.`-1`
import typingsSlinky.semver.semverNumbers.`0`
import typingsSlinky.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/functions/rcompare", JSImport.Namespace)
@js.native
object rcompareMod extends js.Object {
  
  /**
    * The reverse of compare.
    *
    * Sorts in descending order when passed to `Array.sort()`.
    */
  def apply(v1: String, v2: String): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: ^): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: String): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: ^): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
}
