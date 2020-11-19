package typingsSlinky.semver.preloadMod

import typingsSlinky.semver.mod.Options
import typingsSlinky.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/preload", "ltr")
@js.native
object ltr extends js.Object {
  
  /**
    * Return true if version is less than all the versions possible in the range.
    */
  def apply(version: String, range: String): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: ^): Boolean = js.native
  def apply(version: String, range: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: ^, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: String): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: String, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: ^): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: ^, optionsOrLoose: Options): Boolean = js.native
}
