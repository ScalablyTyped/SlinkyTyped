package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPushRef extends js.Object {
  var _links: js.Any = js.native
  var date: js.Date = js.native
  var pushCorrelationId: String = js.native
  var pushId: Double = js.native
  var pushedBy: IdentityRef = js.native
  var url: String = js.native
}

object GitPushRef {
  @scala.inline
  def apply(
    _links: js.Any,
    date: js.Date,
    pushCorrelationId: String,
    pushId: Double,
    pushedBy: IdentityRef,
    url: String
  ): GitPushRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], pushCorrelationId = pushCorrelationId.asInstanceOf[js.Any], pushId = pushId.asInstanceOf[js.Any], pushedBy = pushedBy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPushRef]
  }
  @scala.inline
  implicit class GitPushRefOps[Self <: GitPushRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushCorrelationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushCorrelationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

