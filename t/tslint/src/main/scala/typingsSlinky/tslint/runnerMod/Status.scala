package typingsSlinky.tslint.runnerMod

import typingsSlinky.tslint.tslintNumbers.`0`
import typingsSlinky.tslint.tslintNumbers.`1`
import typingsSlinky.tslint.tslintNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tslint.tslintNumbers.`0`
  - typingsSlinky.tslint.tslintNumbers.`1`
  - typingsSlinky.tslint.tslintNumbers.`2`
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def FatalError: `1` = this.cast(1)
  @scala.inline
  def LintError: `2` = this.cast(2)
  @scala.inline
  def Ok: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

