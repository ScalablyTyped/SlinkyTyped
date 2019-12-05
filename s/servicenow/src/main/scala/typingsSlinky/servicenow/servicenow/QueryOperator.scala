package typingsSlinky.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.servicenow.servicenowStrings.`=`
  - typings.servicenow.servicenowStrings.`!=`
  - typings.servicenow.servicenowStrings.`>`
  - typings.servicenow.servicenowStrings.`>=`
  - typings.servicenow.servicenowStrings.`<`
  - typings.servicenow.servicenowStrings.`<=`
  - typings.servicenow.servicenowStrings.IN
  - typings.servicenow.servicenowStrings.STARTSWITH
  - typings.servicenow.servicenowStrings.ENDSWITH
  - typings.servicenow.servicenowStrings.CONTAINS
  - typings.servicenow.servicenowStrings.DOESNOTCONTAIN
  - typings.servicenow.servicenowStrings.INSTANCEOF
*/
trait QueryOperator extends js.Object

object QueryOperator {
  @scala.inline
  def `!=`: typingsSlinky.servicenow.servicenowStrings.`!=` = this.cast("!=")
  @scala.inline
  def `<`: typingsSlinky.servicenow.servicenowStrings.`<` = this.cast("<")
  @scala.inline
  def `<=`: typingsSlinky.servicenow.servicenowStrings.`<=` = this.cast("<=")
  @scala.inline
  def `=`: typingsSlinky.servicenow.servicenowStrings.`=` = this.cast("=")
  @scala.inline
  def `>`: typingsSlinky.servicenow.servicenowStrings.`>` = this.cast(">")
  @scala.inline
  def `>=`: typingsSlinky.servicenow.servicenowStrings.`>=` = this.cast(">=")
  @scala.inline
  def CONTAINS: typingsSlinky.servicenow.servicenowStrings.CONTAINS = this.cast("CONTAINS")
  @scala.inline
  def DOESNOTCONTAIN: typingsSlinky.servicenow.servicenowStrings.DOESNOTCONTAIN = this.cast("DOESNOTCONTAIN")
  @scala.inline
  def ENDSWITH: typingsSlinky.servicenow.servicenowStrings.ENDSWITH = this.cast("ENDSWITH")
  @scala.inline
  def IN: typingsSlinky.servicenow.servicenowStrings.IN = this.cast("IN")
  @scala.inline
  def INSTANCEOF: typingsSlinky.servicenow.servicenowStrings.INSTANCEOF = this.cast("INSTANCEOF")
  @scala.inline
  def STARTSWITH: typingsSlinky.servicenow.servicenowStrings.STARTSWITH = this.cast("STARTSWITH")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

