package typingsSlinky.typedRestClient.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestOptions extends js.Object {
  var allowRedirectDowngrade: js.UndefOr[Boolean] = js.native
  var allowRedirects: js.UndefOr[Boolean] = js.native
  var allowRetries: js.UndefOr[Boolean] = js.native
  var cert: js.UndefOr[ICertConfiguration] = js.native
  var headers: js.UndefOr[IHeaders] = js.native
  var ignoreSslError: js.UndefOr[Boolean] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var maxRedirects: js.UndefOr[Double] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var maxSockets: js.UndefOr[Double] = js.native
  var presignedUrlPatterns: js.UndefOr[js.Array[js.RegExp]] = js.native
  var proxy: js.UndefOr[IProxyConfiguration] = js.native
  var socketTimeout: js.UndefOr[Double] = js.native
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
    def withAllowRedirectDowngrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRedirectDowngrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRedirectDowngrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRedirectDowngrade")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRedirects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRetries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: ICertConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: IHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSslError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSslError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSslError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSslError")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAlive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRedirects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSockets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSockets")(js.undefined)
        ret
    }
    @scala.inline
    def withPresignedUrlPatterns(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presignedUrlPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresignedUrlPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presignedUrlPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: IProxyConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketTimeout")(js.undefined)
        ret
    }
  }
  
}

