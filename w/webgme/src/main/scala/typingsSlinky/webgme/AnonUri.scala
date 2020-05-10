package typingsSlinky.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUri extends js.Object {
  /**
    * Options for MongoClient.connect
    * config.mongo.options = see config
    */
  var options: String = js.native
  /**
    * MongoDB connection uri
    * config.mongo.uri = 'mongodb://127.0.0.1:27017/multi';
    */
  var uri: String = js.native
}

object AnonUri {
  @scala.inline
  def apply(options: String, uri: String): AnonUri = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUri]
  }
  @scala.inline
  implicit class AnonUriOps[Self <: AnonUri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

