package typingsSlinky.urllib.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.dnsMod.LookupOneOptions
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.IncomingHttpHeaders
import typingsSlinky.node.netMod.LookupFunction
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  /** HTTP Agent object.Set false if you does not use agent. */
  var agent: js.UndefOr[Agent] = js.native
  /** username:password used in HTTP Basic Authorization. */
  var auth: js.UndefOr[String] = js.native
  /** Before request hook, you can change every thing here. */
  var beforeRequest: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /**
    * An array of strings or Buffers of trusted certificates.
    * If this is omitted several well known "root" CAs will be used, like VeriSign.
    * These are used to authorize connections.
    * Notes: This is necessary only if the server uses the self - signed certificate
    */
  var ca: js.UndefOr[String | Buffer | (js.Array[Buffer | String])] = js.native
  /**
    * A string or Buffer containing the certificate key of the client in PEM format.
    * Notes: This is necessary only if using the client certificate authentication
    */
  var cert: js.UndefOr[String | Buffer] = js.native
  /**
    * check request address to protect from SSRF and similar attacks.
    * It receive two arguments(ip and family) and should return true or false to identified the address is legal or not.
    * It rely on lookup and have the same version requirement.
    */
  var checkAddress: js.UndefOr[js.Function2[/* ip */ String, /* family */ Double | String, Boolean]] = js.native
  /** A string describing the ciphers to use or exclude. */
  var ciphers: js.UndefOr[String] = js.native
  /** consume the writeStream, invoke the callback after writeStream close. */
  var consumeWriteStream: js.UndefOr[Boolean] = js.native
  /** Manually set the content of payload. If set, data will be ignored. */
  var content: js.UndefOr[String | Buffer] = js.native
  /** Type of request data.Could be json.If it's json, will auto set Content-Type: application/json header. */
  var contentType: js.UndefOr[String] = js.native
  /** Data to be sent. Will be stringify automatically. */
  var data: js.UndefOr[js.Any] = js.native
  /** Force convert data to query string. */
  var dataAsQueryString: js.UndefOr[Boolean] = js.native
  /**
    * Type of response data. Could be text or json.
    * If it's text, the callbacked data would be a String.
    * If it's json, the data of callback would be a parsed JSON Object
    * and will auto set Accept: application/json header. Default callbacked data would be a Buffer.
    */
  var dataType: js.UndefOr[String] = js.native
  /** username:password used in HTTP Digest Authorization. */
  var digestAuth: js.UndefOr[String] = js.native
  /** Enable proxy request, default is false. */
  var enableProxy: js.UndefOr[Boolean] = js.native
  /** 
    * The files will send with multipart/form-data format, base on formstream.
    * If method not set, will use POST method by default.
    */
  var files: js.UndefOr[(js.Array[Readable | Buffer | String]) | js.Object | Readable | Buffer | String] = js.native
  /** Fix the control characters (U+0000 through U+001F) before JSON parse response. Default is false. */
  var fixJSONCtlChars: js.UndefOr[Boolean] = js.native
  /** follow HTTP 3xx responses as redirects. defaults to false. */
  var followRedirect: js.UndefOr[Boolean] = js.native
  /** Format the redirect url by your self. Default is url.resolve(from, to). */
  var formatRedirectUrl: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Unit]] = js.native
  /** Accept gzip response content and auto decode it, default is false. */
  var gzip: js.UndefOr[Boolean] = js.native
  /** Request headers. */
  var headers: js.UndefOr[IncomingHttpHeaders] = js.native
  /** HTTPS Agent object. Set false if you does not use agent. */
  var httpsAgent: js.UndefOr[typingsSlinky.node.httpsMod.Agent] = js.native
  /**
    * A string or Buffer containing the private key of the client in PEM format.
    * Notes: This is necessary only if using the client certificate authentication
    */
  var key: js.UndefOr[String | Buffer] = js.native
  /**
    * Custom DNS lookup function, default is dns.lookup.
    * Require node >= 4.0.0(for http protocol) and node >=8(for https protocol)
    */
  var lookup: js.UndefOr[LookupFunction] = js.native
  /** The maximum number of redirects to follow, defaults to 10. */
  var maxRedirects: js.UndefOr[Double] = js.native
  /** Request method, defaults to GET. Could be GET, POST, DELETE or PUT. Alias 'type'. */
  var method: js.UndefOr[HttpMethod] = js.native
  /**
    * urllib default use querystring to stringify form data which don't support nested object,
    * will use qs instead of querystring to support nested object by set this option to true.
    */
  var nestedQuerystring: js.UndefOr[Boolean] = js.native
  /** A string of passphrase for the private key or pfx. */
  var passphrase: js.UndefOr[String] = js.native
  /** A string or Buffer containing the private key, certificate and CA certs of the server in PFX or PKCS12 format. */
  var pfx: js.UndefOr[String | Buffer] = js.native
  /** proxy agent uri or options, default is null. */
  var proxy: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  /**
    * If true, the server certificate is verified against the list of supplied CAs.
    * An 'error' event is emitted if verification fails.Default: true.
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  /** The SSL method to use, e.g.SSLv3_method to force SSL version 3. */
  var secureProtocol: js.UndefOr[String] = js.native
  /** Stream to be pipe to the remote.If set, data and content will be ignored. */
  var stream: js.UndefOr[Readable] = js.native
  /** let you get the res object when request connected, default false. alias customResponse */
  var streaming: js.UndefOr[Boolean] = js.native
  /**
    * Request timeout in milliseconds for connecting phase and response receiving phase.
    * Defaults to exports.
    * TIMEOUT, both are 5s.You can use timeout: 5000 to tell urllib use same timeout on two phase or set them seperately such as
    * timeout: [3000, 5000], which will set connecting timeout to 3s and response 5s.
    */
  var timeout: js.UndefOr[Double | js.Array[Double]] = js.native
  /** Enable timing or not, default is false. */
  var timing: js.UndefOr[Boolean] = js.native
  /** Alias method  */
  var `type`: js.UndefOr[HttpMethod] = js.native
  /**
    * A writable stream to be piped by the response stream.
    * Responding data will be write to this stream and callback
    * will be called with data set null after finished writing.
    */
  var writeStream: js.UndefOr[Writable] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRequest(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withCa(value: String | Buffer | (js.Array[Buffer | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: String | Buffer): Self = {
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
    def withCheckAddress(value: (/* ip */ String, /* family */ Double | String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAddress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCheckAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withCiphers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumeWriteStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumeWriteStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumeWriteStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumeWriteStream")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
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
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataAsQueryString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAsQueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAsQueryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAsQueryString")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withDigestAuth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigestAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: (js.Array[Readable | Buffer | String]) | js.Object | Readable | Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withFixJSONCtlChars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixJSONCtlChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixJSONCtlChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixJSONCtlChars")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowRedirect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatRedirectUrl(value: (/* a */ js.Any, /* b */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatRedirectUrl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatRedirectUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatRedirectUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withGzip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGzip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: IncomingHttpHeaders): Self = {
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
    def withHttpsAgent(value: typingsSlinky.node.httpsMod.Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpsAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.undefined)
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
    def withMethod(value: HttpMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedQuerystring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedQuerystring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedQuerystring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedQuerystring")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withPfx(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPfx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: String | StringDictionary[js.Any]): Self = {
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
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: Readable): Self = {
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
    @scala.inline
    def withStreaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streaming")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTiming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: HttpMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteStream(value: Writable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeStream")(js.undefined)
        ret
    }
  }
  
}

