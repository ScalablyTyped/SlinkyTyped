package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowLocalStorage extends js.Object {
  val localStorage: org.scalajs.dom.raw.Storage
}

object WindowLocalStorage {
  @scala.inline
  def apply(localStorage: org.scalajs.dom.raw.Storage): WindowLocalStorage = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowLocalStorage]
  }
}

