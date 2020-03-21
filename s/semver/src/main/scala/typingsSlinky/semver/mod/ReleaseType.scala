package typingsSlinky.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.semver.semverStrings.major
  - typingsSlinky.semver.semverStrings.premajor
  - typingsSlinky.semver.semverStrings.minor
  - typingsSlinky.semver.semverStrings.preminor
  - typingsSlinky.semver.semverStrings.patch
  - typingsSlinky.semver.semverStrings.prepatch
  - typingsSlinky.semver.semverStrings.prerelease
*/
trait ReleaseType extends js.Object

object ReleaseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def major: typingsSlinky.semver.semverStrings.major = this.cast("major")
  @scala.inline
  def minor: typingsSlinky.semver.semverStrings.minor = this.cast("minor")
  @scala.inline
  def patch: typingsSlinky.semver.semverStrings.patch = this.cast("patch")
  @scala.inline
  def premajor: typingsSlinky.semver.semverStrings.premajor = this.cast("premajor")
  @scala.inline
  def preminor: typingsSlinky.semver.semverStrings.preminor = this.cast("preminor")
  @scala.inline
  def prepatch: typingsSlinky.semver.semverStrings.prepatch = this.cast("prepatch")
  @scala.inline
  def prerelease: typingsSlinky.semver.semverStrings.prerelease = this.cast("prerelease")
}

