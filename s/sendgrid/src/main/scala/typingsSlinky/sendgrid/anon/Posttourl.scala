package typingsSlinky.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Posttourl extends js.Object {
  var enable: Boolean = js.native
  var post_to_url: String = js.native
  var threshold: Double = js.native
}

object Posttourl {
  @scala.inline
  def apply(enable: Boolean, post_to_url: String, threshold: Double): Posttourl = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], post_to_url = post_to_url.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Posttourl]
  }
  @scala.inline
  implicit class PosttourlOps[Self <: Posttourl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPost_to_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_to_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

