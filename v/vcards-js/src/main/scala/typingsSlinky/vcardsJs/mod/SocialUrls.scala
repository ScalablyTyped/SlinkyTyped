package typingsSlinky.vcardsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialUrls extends js.Object {
  var facebook: String = js.native
  var flickr: String = js.native
  var linkedIn: String = js.native
  var twitter: String = js.native
}

object SocialUrls {
  @scala.inline
  def apply(facebook: String, flickr: String, linkedIn: String, twitter: String): SocialUrls = {
    val __obj = js.Dynamic.literal(facebook = facebook.asInstanceOf[js.Any], flickr = flickr.asInstanceOf[js.Any], linkedIn = linkedIn.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialUrls]
  }
  @scala.inline
  implicit class SocialUrlsOps[Self <: SocialUrls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacebook(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlickr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkedIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwitter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

