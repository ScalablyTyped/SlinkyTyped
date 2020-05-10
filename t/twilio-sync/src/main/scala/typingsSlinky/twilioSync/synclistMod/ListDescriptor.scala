package typingsSlinky.twilioSync.synclistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDescriptor extends js.Object {
  var date_expires: String = js.native
  var date_updated: js.Date = js.native
  var last_event_id: Double = js.native
  var links: js.Any = js.native
  var revision: String = js.native
  var sid: String = js.native
  var unique_name: String = js.native
  var url: String = js.native
}

object ListDescriptor {
  @scala.inline
  def apply(
    date_expires: String,
    date_updated: js.Date,
    last_event_id: Double,
    links: js.Any,
    revision: String,
    sid: String,
    unique_name: String,
    url: String
  ): ListDescriptor = {
    val __obj = js.Dynamic.literal(date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], last_event_id = last_event_id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDescriptor]
  }
  @scala.inline
  implicit class ListDescriptorOps[Self <: ListDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate_expires(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate_updated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_event_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_event_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_name")(value.asInstanceOf[js.Any])
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

