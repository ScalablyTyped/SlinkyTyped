package typingsSlinky.urqlCore.anon

import org.scalajs.dom.experimental.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions extends js.Object {
  var fetchOptions: RequestInit
  var url: String
}

object FetchOptions {
  @scala.inline
  def apply(fetchOptions: RequestInit, url: String): FetchOptions = {
    val __obj = js.Dynamic.literal(fetchOptions = fetchOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptions]
  }
}

