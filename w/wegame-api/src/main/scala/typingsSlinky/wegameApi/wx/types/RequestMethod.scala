package typingsSlinky.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wegameApi.wegameApiStrings.GET
  - typingsSlinky.wegameApi.wegameApiStrings.HEAD
  - typingsSlinky.wegameApi.wegameApiStrings.POST
  - typingsSlinky.wegameApi.wegameApiStrings.PUT
  - typingsSlinky.wegameApi.wegameApiStrings.DELETE
  - typingsSlinky.wegameApi.wegameApiStrings.TRACE
  - typingsSlinky.wegameApi.wegameApiStrings.CONNECT
*/
trait RequestMethod extends js.Object

object RequestMethod {
  @scala.inline
  def CONNECT: typingsSlinky.wegameApi.wegameApiStrings.CONNECT = this.cast("CONNECT")
  @scala.inline
  def DELETE: typingsSlinky.wegameApi.wegameApiStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.wegameApi.wegameApiStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsSlinky.wegameApi.wegameApiStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def POST: typingsSlinky.wegameApi.wegameApiStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.wegameApi.wegameApiStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typingsSlinky.wegameApi.wegameApiStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

