package typingsSlinky.styleSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styleSearch.styleSearchStrings.skip
  - typingsSlinky.styleSearch.styleSearchStrings.check
  - typingsSlinky.styleSearch.styleSearchStrings.only
*/
trait SyntaxFeatureOption extends js.Object

object SyntaxFeatureOption {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def check: typingsSlinky.styleSearch.styleSearchStrings.check = this.cast("check")
  @scala.inline
  def only: typingsSlinky.styleSearch.styleSearchStrings.only = this.cast("only")
  @scala.inline
  def skip: typingsSlinky.styleSearch.styleSearchStrings.skip = this.cast("skip")
}

