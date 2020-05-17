package typingsSlinky.urlparser.mod

import typingsSlinky.urlparser.anon.Base
import typingsSlinky.urlparser.anon.Hostname
import typingsSlinky.urlparser.anon.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlData extends js.Object {
  var host: Hostname = js.native
  var path: Base = js.native
  var query: Params = js.native
}

object UrlData {
  @scala.inline
  def apply(host: Hostname, path: Base, query: Params): UrlData = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlData]
  }
  @scala.inline
  implicit class UrlDataOps[Self <: UrlData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: Hostname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: Params): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

