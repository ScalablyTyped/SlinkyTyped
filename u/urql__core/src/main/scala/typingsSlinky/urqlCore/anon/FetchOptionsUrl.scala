package typingsSlinky.urqlCore.anon

import org.scalajs.dom.experimental.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptionsUrl extends js.Object {
  var fetchOptions: RequestInit
  var url: String
  var value: js.Error
}

object FetchOptionsUrl {
  @scala.inline
  def apply(fetchOptions: RequestInit, url: String, value: js.Error): FetchOptionsUrl = {
    val __obj = js.Dynamic.literal(fetchOptions = fetchOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptionsUrl]
  }
}

