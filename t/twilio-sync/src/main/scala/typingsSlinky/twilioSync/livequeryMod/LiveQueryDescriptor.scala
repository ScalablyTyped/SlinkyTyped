package typingsSlinky.twilioSync.livequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveQueryDescriptor extends js.Object {
  var indexName: String = js.native
  var queryExpression: String = js.native
  var queryUri: String = js.native
  var sid: String = js.native
}

object LiveQueryDescriptor {
  @scala.inline
  def apply(indexName: String, queryExpression: String, queryUri: String, sid: String): LiveQueryDescriptor = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], queryExpression = queryExpression.asInstanceOf[js.Any], queryUri = queryUri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveQueryDescriptor]
  }
  @scala.inline
  implicit class LiveQueryDescriptorOps[Self <: LiveQueryDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

