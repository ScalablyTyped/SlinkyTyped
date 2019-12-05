package typingsSlinky.wepy.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wepy.wepyStrings.requestfix
  - typings.wepy.wepyStrings.promisify
*/
trait AddOn extends js.Object

object AddOn {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def promisify: typingsSlinky.wepy.wepyStrings.promisify = this.cast("promisify")
  @scala.inline
  def requestfix: typingsSlinky.wepy.wepyStrings.requestfix = this.cast("requestfix")
}

