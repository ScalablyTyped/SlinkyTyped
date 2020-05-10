package typingsSlinky.twilioSync.listitemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemDescriptor extends js.Object {
  var dateExpires: String = js.native
  var dateUpdated: js.Date = js.native
  var index: Double = js.native
  var lastEventId: Double = js.native
  var revision: String = js.native
  var uri: String = js.native
  var value: js.Object = js.native
}

object ListItemDescriptor {
  @scala.inline
  def apply(
    dateExpires: String,
    dateUpdated: js.Date,
    index: Double,
    lastEventId: Double,
    revision: String,
    uri: String,
    value: js.Object
  ): ListItemDescriptor = {
    val __obj = js.Dynamic.literal(dateExpires = dateExpires.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lastEventId = lastEventId.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemDescriptor]
  }
  @scala.inline
  implicit class ListItemDescriptorOps[Self <: ListItemDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateExpires(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateExpires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastEventId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

