package typingsSlinky.sipJs.publisherOptionsMod

import typingsSlinky.sipJs.AnonFromTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublisherOptions extends js.Object {
  /** @deprecated TODO: provide alternative. */
  var body: js.UndefOr[String] = js.native
  /** @deprecated TODO: provide alternative. */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Expire value for the published event.
    * @defaultValue 3600
    */
  var expires: js.UndefOr[Double] = js.native
  /**
    * Array of extra headers added to the PUBLISH request message.
    */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[AnonFromTag] = js.native
  /**
    * If set true, UA will gracefully unpublish for the event on UA close.
    * @defaultValue true
    */
  var unpublishOnClose: js.UndefOr[Boolean] = js.native
}

object PublisherOptions {
  @scala.inline
  def apply(): PublisherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherOptions]
  }
  @scala.inline
  implicit class PublisherOptionsOps[Self <: PublisherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: AnonFromTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withUnpublishOnClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpublishOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnpublishOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpublishOnClose")(js.undefined)
        ret
    }
  }
  
}

