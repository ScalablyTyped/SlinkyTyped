package typingsSlinky.semver.preloadMod

import typingsSlinky.semver.mod.Options
import typingsSlinky.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/preload", "patch")
@js.native
object patch extends js.Object {
  
  /**
    * Return the patch version number.
    */
  def apply(version: String): Double = js.native
  def apply(version: String, optionsOrLoose: Boolean): Double = js.native
  def apply(version: String, optionsOrLoose: Options): Double = js.native
  def apply(version: ^): Double = js.native
  def apply(version: ^, optionsOrLoose: Boolean): Double = js.native
  def apply(version: ^, optionsOrLoose: Options): Double = js.native
}
