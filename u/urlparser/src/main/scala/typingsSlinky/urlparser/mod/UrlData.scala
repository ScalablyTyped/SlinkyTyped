package typingsSlinky.urlparser.mod

import typingsSlinky.urlparser.anon.Base
import typingsSlinky.urlparser.anon.Hostname
import typingsSlinky.urlparser.anon.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlData extends js.Object {
  var host: Hostname
  var path: Base
  var query: Params
}

object UrlData {
  @scala.inline
  def apply(host: Hostname, path: Base, query: Params): UrlData = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlData]
  }
}

