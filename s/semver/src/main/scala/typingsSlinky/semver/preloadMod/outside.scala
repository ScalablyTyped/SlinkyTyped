package typingsSlinky.semver.preloadMod

import typingsSlinky.semver.mod.Options
import typingsSlinky.semver.rangeMod.^
import typingsSlinky.semver.semverStrings.Greaterthansign
import typingsSlinky.semver.semverStrings.Lessthansign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/preload", "outside")
@js.native
object outside extends js.Object {
  /**
    * Return true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  def apply(version: String, range: String, hilo: Greaterthansign): Boolean = js.native
  def apply(version: String, range: String, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: String, hilo: Lessthansign): Boolean = js.native
  def apply(version: String, range: String, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: ^, hilo: Greaterthansign): Boolean = js.native
  def apply(version: String, range: ^, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: ^, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  def apply(version: String, range: ^, hilo: Lessthansign): Boolean = js.native
  def apply(version: String, range: ^, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: ^, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: String, hilo: Greaterthansign): Boolean = js.native
  def apply(
    version: typingsSlinky.semver.semverMod.^,
    range: String,
    hilo: Greaterthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  def apply(
    version: typingsSlinky.semver.semverMod.^,
    range: String,
    hilo: Greaterthansign,
    optionsOrLoose: Options
  ): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: String, hilo: Lessthansign): Boolean = js.native
  def apply(
    version: typingsSlinky.semver.semverMod.^,
    range: String,
    hilo: Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  def apply(
    version: typingsSlinky.semver.semverMod.^,
    range: String,
    hilo: Lessthansign,
    optionsOrLoose: Options
  ): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: ^, hilo: Greaterthansign): Boolean = js.native
  def apply(
    version: typingsSlinky.semver.semverMod.^,
    range: ^,
    hilo: Greaterthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  def apply(
    version: typingsSlinky.semver.semverMod.^,
    range: ^,
    hilo: Greaterthansign,
    optionsOrLoose: Options
  ): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: ^, hilo: Lessthansign): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: ^, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typingsSlinky.semver.semverMod.^, range: ^, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
}

