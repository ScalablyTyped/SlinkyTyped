package typingsSlinky.vmap.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the player with either an inline ad response or a reference to an ad response
  */
@js.native
trait VMAPAdSource extends js.Object {
  /**
    * Contains a URI to the VAST
    */
  var adTagURI: String = js.native
  /**
    * Indicates whether a VAST ad pod or multple buffet of ads can be served into an ad break
    */
  var allowMultipleAds: Boolean = js.native
  /**
    * Contains custom ad data
    */
  var customData: js.Any = js.native
  /**
    * Indicates whether the video player should honor the redirects within an ad response
    */
  var followRedirects: Boolean = js.native
  /**
    * Ad identifier for the ad source
    */
  var id: String = js.native
  /**
    * Contains an embedded VAST response
    */
  var vastAdData: Element = js.native
}

object VMAPAdSource {
  @scala.inline
  def apply(
    adTagURI: String,
    allowMultipleAds: Boolean,
    customData: js.Any,
    followRedirects: Boolean,
    id: String,
    vastAdData: Element
  ): VMAPAdSource = {
    val __obj = js.Dynamic.literal(adTagURI = adTagURI.asInstanceOf[js.Any], allowMultipleAds = allowMultipleAds.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], followRedirects = followRedirects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], vastAdData = vastAdData.asInstanceOf[js.Any])
    __obj.asInstanceOf[VMAPAdSource]
  }
  @scala.inline
  implicit class VMAPAdSourceOps[Self <: VMAPAdSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdTagURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adTagURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowMultipleAds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleAds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowRedirects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVastAdData(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vastAdData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

