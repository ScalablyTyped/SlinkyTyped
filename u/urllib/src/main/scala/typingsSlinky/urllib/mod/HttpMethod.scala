package typingsSlinky.urllib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.urllib.urllibStrings.GET
  - typingsSlinky.urllib.urllibStrings.POST
  - typingsSlinky.urllib.urllibStrings.DELETE
  - typingsSlinky.urllib.urllibStrings.PUT
  - typingsSlinky.urllib.urllibStrings.HEAD
  - typingsSlinky.urllib.urllibStrings.OPTIONS
  - typingsSlinky.urllib.urllibStrings.PATCH
  - typingsSlinky.urllib.urllibStrings.TRACE
  - typingsSlinky.urllib.urllibStrings.CONNECT
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def CONNECT: typingsSlinky.urllib.urllibStrings.CONNECT = this.cast("CONNECT")
  @scala.inline
  def DELETE: typingsSlinky.urllib.urllibStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.urllib.urllibStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsSlinky.urllib.urllibStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typingsSlinky.urllib.urllibStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsSlinky.urllib.urllibStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsSlinky.urllib.urllibStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.urllib.urllibStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typingsSlinky.urllib.urllibStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

