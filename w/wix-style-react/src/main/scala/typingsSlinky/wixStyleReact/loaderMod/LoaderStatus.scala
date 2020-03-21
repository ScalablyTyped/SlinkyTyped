package typingsSlinky.wixStyleReact.loaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wixStyleReact.wixStyleReactStrings.loading
  - typingsSlinky.wixStyleReact.wixStyleReactStrings.success
  - typingsSlinky.wixStyleReact.wixStyleReactStrings.error
*/
trait LoaderStatus extends js.Object

object LoaderStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.wixStyleReact.wixStyleReactStrings.error = this.cast("error")
  @scala.inline
  def loading: typingsSlinky.wixStyleReact.wixStyleReactStrings.loading = this.cast("loading")
  @scala.inline
  def success: typingsSlinky.wixStyleReact.wixStyleReactStrings.success = this.cast("success")
}

