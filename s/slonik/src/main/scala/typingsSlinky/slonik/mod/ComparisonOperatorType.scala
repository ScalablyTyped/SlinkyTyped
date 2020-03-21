package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.slonik.slonikStrings.Lessthansign
  - typingsSlinky.slonik.slonikStrings.Greaterthansign
  - typingsSlinky.slonik.slonikStrings.LessthansignEqualssign
  - typingsSlinky.slonik.slonikStrings.GreaterthansignEqualssign
  - typingsSlinky.slonik.slonikStrings.Equalssign
  - typingsSlinky.slonik.slonikStrings.LessthansignGreaterthansign
  - typingsSlinky.slonik.slonikStrings.ExclamationmarkEqualssign
*/
trait ComparisonOperatorType extends js.Object

object ComparisonOperatorType {
  @scala.inline
  def Equalssign: typingsSlinky.slonik.slonikStrings.Equalssign = this.cast("=")
  @scala.inline
  def ExclamationmarkEqualssign: typingsSlinky.slonik.slonikStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def Greaterthansign: typingsSlinky.slonik.slonikStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsSlinky.slonik.slonikStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsSlinky.slonik.slonikStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsSlinky.slonik.slonikStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def LessthansignGreaterthansign: typingsSlinky.slonik.slonikStrings.LessthansignGreaterthansign = this.cast("<>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

