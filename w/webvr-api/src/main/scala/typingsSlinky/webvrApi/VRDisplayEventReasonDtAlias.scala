package typingsSlinky.webvrApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webvrApi.webvrApiStrings.mounted
  - typingsSlinky.webvrApi.webvrApiStrings.navigation
  - typingsSlinky.webvrApi.webvrApiStrings.requested
  - typingsSlinky.webvrApi.webvrApiStrings.unmounted
*/
trait VRDisplayEventReasonDtAlias extends js.Object

object VRDisplayEventReasonDtAlias {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mounted: typingsSlinky.webvrApi.webvrApiStrings.mounted = this.cast("mounted")
  @scala.inline
  def navigation: typingsSlinky.webvrApi.webvrApiStrings.navigation = this.cast("navigation")
  @scala.inline
  def requested: typingsSlinky.webvrApi.webvrApiStrings.requested = this.cast("requested")
  @scala.inline
  def unmounted: typingsSlinky.webvrApi.webvrApiStrings.unmounted = this.cast("unmounted")
}

