package typingsSlinky.vastClient.mod

import typingsSlinky.vastClient.anon.FnCall
import typingsSlinky.vastClient.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VASTClientUrlHandler extends js.Object {
  def get(url: String, options: Timeout, cb: FnCall): Unit
}

object VASTClientUrlHandler {
  @scala.inline
  def apply(get: (String, Timeout, FnCall) => Unit): VASTClientUrlHandler = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
    __obj.asInstanceOf[VASTClientUrlHandler]
  }
}

