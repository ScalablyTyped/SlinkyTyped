package typingsSlinky.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.semver.semverStrings.EqualssignEqualssignEqualssign
  - typingsSlinky.semver.semverStrings.ExclamationmarkEqualssignEqualssign
  - typingsSlinky.semver.semverStrings._empty
  - typingsSlinky.semver.semverStrings.Equalssign
  - typingsSlinky.semver.semverStrings.EqualssignEqualssign
  - typingsSlinky.semver.semverStrings.ExclamationmarkEqualssign
  - typingsSlinky.semver.semverStrings.Greaterthansign
  - typingsSlinky.semver.semverStrings.GreaterthansignEqualssign
  - typingsSlinky.semver.semverStrings.Lessthansign
  - typingsSlinky.semver.semverStrings.LessthansignEqualssign
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def Equalssign: typingsSlinky.semver.semverStrings.Equalssign = this.cast("=")
  @scala.inline
  def EqualssignEqualssign: typingsSlinky.semver.semverStrings.EqualssignEqualssign = this.cast("==")
  @scala.inline
  def EqualssignEqualssignEqualssign: typingsSlinky.semver.semverStrings.EqualssignEqualssignEqualssign = this.cast("===")
  @scala.inline
  def ExclamationmarkEqualssign: typingsSlinky.semver.semverStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def ExclamationmarkEqualssignEqualssign: typingsSlinky.semver.semverStrings.ExclamationmarkEqualssignEqualssign = this.cast("!==")
  @scala.inline
  def Greaterthansign: typingsSlinky.semver.semverStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsSlinky.semver.semverStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsSlinky.semver.semverStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsSlinky.semver.semverStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def _empty: typingsSlinky.semver.semverStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

