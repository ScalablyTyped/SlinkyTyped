package typingsSlinky.tabris.global

import typingsSlinky.tabris.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("fetch")
@js.native
object fetch extends js.Object {
  // fetch
  def apply(url: String): js.Promise[typingsSlinky.tabris.Response] = js.native
  def apply(url: String, init: RequestInit): js.Promise[typingsSlinky.tabris.Response] = js.native
  def apply(url: typingsSlinky.tabris.Request): js.Promise[typingsSlinky.tabris.Response] = js.native
  def apply(url: typingsSlinky.tabris.Request, init: RequestInit): js.Promise[typingsSlinky.tabris.Response] = js.native
}

