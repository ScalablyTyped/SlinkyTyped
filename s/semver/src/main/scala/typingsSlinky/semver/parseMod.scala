package typingsSlinky.semver

import typingsSlinky.semver.mod.Options
import typingsSlinky.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver/functions/parse", JSImport.Namespace)
@js.native
object parseMod extends js.Object {
  
  /**
    * Return the parsed version as a SemVer object, or null if it's not valid.
    */
  def apply(): ^  | Null = js.native
  def apply(version: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): ^  | Null = js.native
  def apply(version: js.UndefOr[scala.Nothing], optionsOrLoose: Options): ^  | Null = js.native
  def apply(version: String): ^  | Null = js.native
  def apply(version: String, optionsOrLoose: Boolean): ^  | Null = js.native
  def apply(version: String, optionsOrLoose: Options): ^  | Null = js.native
  def apply(version: Null, optionsOrLoose: Boolean): ^  | Null = js.native
  def apply(version: Null, optionsOrLoose: Options): ^  | Null = js.native
  def apply(version: ^): ^  | Null = js.native
  def apply(version: ^, optionsOrLoose: Boolean): ^  | Null = js.native
  def apply(version: ^, optionsOrLoose: Options): ^  | Null = js.native
}
