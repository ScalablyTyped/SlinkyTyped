package typingsSlinky.typedRestClient.restClientMod

import typingsSlinky.typedRestClient.interfacesMod.IHeaders
import typingsSlinky.typedRestClient.interfacesMod.IRequestQueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestOptions extends js.Object {
  var acceptHeader: js.UndefOr[String] = js.native
  var additionalHeaders: js.UndefOr[IHeaders] = js.native
  var deserializeDates: js.UndefOr[Boolean] = js.native
  var queryParameters: js.UndefOr[IRequestQueryParams] = js.native
  var responseProcessor: js.UndefOr[js.Function] = js.native
}

object IRequestOptions {
  @scala.inline
  def apply(): IRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequestOptions]
  }
  @scala.inline
  implicit class IRequestOptionsOps[Self <: IRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalHeaders(value: IHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withDeserializeDates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserializeDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeserializeDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserializeDates")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParameters(value: IRequestQueryParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseProcessor(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseProcessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseProcessor")(js.undefined)
        ret
    }
  }
  
}

