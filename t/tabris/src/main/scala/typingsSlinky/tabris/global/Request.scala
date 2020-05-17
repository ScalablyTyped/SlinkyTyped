package typingsSlinky.tabris.global

import typingsSlinky.tabris.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Request
/**
  * Represents an HTTP Request as used by `fetch()`.
  */
@JSGlobal("Request")
@js.native
class Request protected ()
  extends typingsSlinky.tabris.Request {
  def this(input: String) = this()
  def this(input: typingsSlinky.tabris.Request) = this()
  def this(input: String, init: RequestInit) = this()
  def this(input: typingsSlinky.tabris.Request, init: RequestInit) = this()
}

