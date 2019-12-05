package typingsSlinky.webpackDashMerge.webpackDashMergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webpackDashMerge.webpackDashMergeStrings.prepend
  - typings.webpackDashMerge.webpackDashMergeStrings.append
  - typings.webpackDashMerge.webpackDashMergeStrings.replace
*/
trait MergeStrategy extends js.Object

object MergeStrategy {
  @scala.inline
  def append: typingsSlinky.webpackDashMerge.webpackDashMergeStrings.append = this.cast("append")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def prepend: typingsSlinky.webpackDashMerge.webpackDashMergeStrings.prepend = this.cast("prepend")
  @scala.inline
  def replace: typingsSlinky.webpackDashMerge.webpackDashMergeStrings.replace = this.cast("replace")
}

