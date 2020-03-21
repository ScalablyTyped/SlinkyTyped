package typingsSlinky.tslint.formatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tslint.tslintStrings.human
  - typingsSlinky.tslint.tslintStrings.machine
*/
trait ConsumerType extends js.Object

object ConsumerType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def human: typingsSlinky.tslint.tslintStrings.human = this.cast("human")
  @scala.inline
  def machine: typingsSlinky.tslint.tslintStrings.machine = this.cast("machine")
}

