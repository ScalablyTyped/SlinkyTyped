package typingsSlinky.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.weappApi.weappApiStrings.success
  - typingsSlinky.weappApi.weappApiStrings.loading
  - typingsSlinky.weappApi.weappApiStrings.none
*/
trait icon extends js.Object

object icon {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def loading: typingsSlinky.weappApi.weappApiStrings.loading = this.cast("loading")
  @scala.inline
  def none: typingsSlinky.weappApi.weappApiStrings.none = this.cast("none")
  @scala.inline
  def success: typingsSlinky.weappApi.weappApiStrings.success = this.cast("success")
}

