package typingsSlinky.soap.typesMod

import typingsSlinky.request.mod.CoreOptions
import typingsSlinky.request.mod.Request
import typingsSlinky.request.mod.RequestAPI
import typingsSlinky.request.mod.RequiredUriUrl
import typingsSlinky.soap.httpMod.HttpClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends IWsdlBaseOptions {
  var customDeserializer: js.UndefOr[js.Any] = js.native
  /** don't cache WSDL files, request them every time. */
  var disableCache: js.UndefOr[Boolean] = js.native
  /** override the SOAP service's host specified in the .wsdl file. */
  var endpoint: js.UndefOr[String] = js.native
  /** set specific key instead of <pre><soap:Body></soap:Body></pre>. */
  var envelopeKey: js.UndefOr[String] = js.native
  /** provide your own http client that implements request(rurl, data, callback, exheaders, exoptions) */
  var httpClient: js.UndefOr[HttpClient] = js.native
  /** if your wsdl operations contains names with Async suffix, you will need to override the default promise suffix to a custom one, default: Async. */
  var overridePromiseSuffix: js.UndefOr[String] = js.native
  /** override the request module. */
  var request: js.UndefOr[RequestAPI[Request, CoreOptions, RequiredUriUrl]] = js.native
  var stream: js.UndefOr[Boolean] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomDeserializer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDeserializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDeserializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDeserializer")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCache")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvelopeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelopeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvelopeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelopeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpClient(value: HttpClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpClient")(js.undefined)
        ret
    }
    @scala.inline
    def withOverridePromiseSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridePromiseSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverridePromiseSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridePromiseSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: RequestAPI[Request, CoreOptions, RequiredUriUrl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
  }
  
}

