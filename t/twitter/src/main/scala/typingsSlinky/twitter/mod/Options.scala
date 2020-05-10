package typingsSlinky.twitter.mod

import typingsSlinky.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var consumer_key: String = js.native
  var consumer_secret: String = js.native
  var media_base: js.UndefOr[String] = js.native
  var request_options: js.UndefOr[CoreOptions] = js.native
  var rest_base: js.UndefOr[String] = js.native
  var site_stream_base: js.UndefOr[String] = js.native
  var stream_base: js.UndefOr[String] = js.native
  var user_stream_base: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(consumer_key: String, consumer_secret: String): Options = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumer_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumer_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_base(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_base: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_base")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_options(value: CoreOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_options")(js.undefined)
        ret
    }
    @scala.inline
    def withRest_base(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRest_base: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest_base")(js.undefined)
        ret
    }
    @scala.inline
    def withSite_stream_base(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_stream_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite_stream_base: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_stream_base")(js.undefined)
        ret
    }
    @scala.inline
    def withStream_base(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream_base: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_base")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_stream_base(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_stream_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_stream_base: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_stream_base")(js.undefined)
        ret
    }
  }
  
}

