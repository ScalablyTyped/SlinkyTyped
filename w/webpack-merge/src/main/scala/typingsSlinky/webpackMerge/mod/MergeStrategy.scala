package typingsSlinky.webpackMerge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webpackMerge.webpackMergeStrings.prepend
  - typingsSlinky.webpackMerge.webpackMergeStrings.append
  - typingsSlinky.webpackMerge.webpackMergeStrings.replace
*/
trait MergeStrategy extends js.Object

object MergeStrategy {
  @scala.inline
  def append: typingsSlinky.webpackMerge.webpackMergeStrings.append = this.cast("append")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def prepend: typingsSlinky.webpackMerge.webpackMergeStrings.prepend = this.cast("prepend")
  @scala.inline
  def replace: typingsSlinky.webpackMerge.webpackMergeStrings.replace = this.cast("replace")
}

