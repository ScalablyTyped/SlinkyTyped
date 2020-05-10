package typingsSlinky.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerOptions extends IWsdlBaseOptions {
  var callback: js.UndefOr[js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]] = js.native
  /** A boolean for controlling chunked transfer encoding in response. Some client (such as Windows 10's MDM enrollment SOAP client) is sensitive to transfer-encoding mode and can't accept chunked response. This option let user disable chunked transfer encoding for such a client. Default to true for backward compatibility. */
  var enableChunkedEncoding: js.UndefOr[Boolean] = js.native
  var oneWay: js.UndefOr[IOneWayOptions] = js.native
  var path: String = js.native
  var services: IServices = js.native
  /** suppress the full stack trace for error messages. */
  var suppressStack: js.UndefOr[Boolean] = js.native
  var uri: js.UndefOr[String] = js.native
  var xml: js.UndefOr[String] = js.native
}

object IServerOptions {
  @scala.inline
  def apply(path: String, services: IServices): IServerOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServerOptions]
  }
  @scala.inline
  implicit class IServerOptionsOps[Self <: IServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServices(value: IServices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: (/* err */ js.Any, /* res */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableChunkedEncoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableChunkedEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableChunkedEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableChunkedEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withOneWay(value: IOneWayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneWay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneWay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneWay")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressStack")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withXml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(js.undefined)
        ret
    }
  }
  
}

