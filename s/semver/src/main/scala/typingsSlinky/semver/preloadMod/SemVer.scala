package typingsSlinky.semver.preloadMod

import typingsSlinky.semver.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/preload", "SemVer")
@js.native
class SemVer protected ()
  extends typingsSlinky.semver.mod.SemVer {
  def this(version: String) = this()
  def this(version: typingsSlinky.semver.semverMod.SemVer) = this()
  def this(version: String, optionsOrLoose: Boolean) = this()
  def this(version: String, optionsOrLoose: Options) = this()
  def this(version: typingsSlinky.semver.semverMod.SemVer, optionsOrLoose: Boolean) = this()
  def this(version: typingsSlinky.semver.semverMod.SemVer, optionsOrLoose: Options) = this()
}

