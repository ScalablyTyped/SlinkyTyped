package typingsSlinky.wpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wpapi.wpapiStrings.GET
  - typingsSlinky.wpapi.wpapiStrings.POST
  - typingsSlinky.wpapi.wpapiStrings.PUT
  - typingsSlinky.wpapi.wpapiStrings.PATCH
  - typingsSlinky.wpapi.wpapiStrings.DELETE
*/
trait HTTPMethod extends js.Object

object HTTPMethod {
  @scala.inline
  def DELETE: typingsSlinky.wpapi.wpapiStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.wpapi.wpapiStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typingsSlinky.wpapi.wpapiStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsSlinky.wpapi.wpapiStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.wpapi.wpapiStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

