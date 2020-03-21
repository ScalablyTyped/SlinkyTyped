package typingsSlinky.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.servicenow.servicenowStrings.Equalssign
  - typingsSlinky.servicenow.servicenowStrings.ExclamationmarkEqualssign
  - typingsSlinky.servicenow.servicenowStrings.Greaterthansign
  - typingsSlinky.servicenow.servicenowStrings.GreaterthansignEqualssign
  - typingsSlinky.servicenow.servicenowStrings.Lessthansign
  - typingsSlinky.servicenow.servicenowStrings.LessthansignEqualssign
  - typingsSlinky.servicenow.servicenowStrings.IN
  - typingsSlinky.servicenow.servicenowStrings.STARTSWITH
  - typingsSlinky.servicenow.servicenowStrings.ENDSWITH
  - typingsSlinky.servicenow.servicenowStrings.CONTAINS
  - typingsSlinky.servicenow.servicenowStrings.DOESNOTCONTAIN
  - typingsSlinky.servicenow.servicenowStrings.INSTANCEOF
*/
trait QueryOperator extends js.Object

object QueryOperator {
  @scala.inline
  def CONTAINS: typingsSlinky.servicenow.servicenowStrings.CONTAINS = this.cast("CONTAINS")
  @scala.inline
  def DOESNOTCONTAIN: typingsSlinky.servicenow.servicenowStrings.DOESNOTCONTAIN = this.cast("DOESNOTCONTAIN")
  @scala.inline
  def ENDSWITH: typingsSlinky.servicenow.servicenowStrings.ENDSWITH = this.cast("ENDSWITH")
  @scala.inline
  def Equalssign: typingsSlinky.servicenow.servicenowStrings.Equalssign = this.cast("=")
  @scala.inline
  def ExclamationmarkEqualssign: typingsSlinky.servicenow.servicenowStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def Greaterthansign: typingsSlinky.servicenow.servicenowStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsSlinky.servicenow.servicenowStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def IN: typingsSlinky.servicenow.servicenowStrings.IN = this.cast("IN")
  @scala.inline
  def INSTANCEOF: typingsSlinky.servicenow.servicenowStrings.INSTANCEOF = this.cast("INSTANCEOF")
  @scala.inline
  def Lessthansign: typingsSlinky.servicenow.servicenowStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsSlinky.servicenow.servicenowStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def STARTSWITH: typingsSlinky.servicenow.servicenowStrings.STARTSWITH = this.cast("STARTSWITH")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

