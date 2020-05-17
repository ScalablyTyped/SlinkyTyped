package typingsSlinky.tabris.global

import typingsSlinky.tabris.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Response
/**
  * Represents an HTTP Response as used by `fetch()`.
  */
@JSGlobal("Response")
@js.native
class Response ()
  extends typingsSlinky.tabris.Response {
  def this(body: String) = this()
  def this(body: typingsSlinky.tabris.Blob) = this()
  def this(body: typingsSlinky.tabris.FormData) = this()
  def this(body: String, init: ResponseInit) = this()
  def this(body: typingsSlinky.tabris.Blob, init: ResponseInit) = this()
  def this(body: typingsSlinky.tabris.FormData, init: ResponseInit) = this()
}

/* static members */
@JSGlobal("Response")
@js.native
object Response extends js.Object {
  def error(): typingsSlinky.tabris.Response = js.native
  def redirect(url: String, status: Double): typingsSlinky.tabris.Response = js.native
}

