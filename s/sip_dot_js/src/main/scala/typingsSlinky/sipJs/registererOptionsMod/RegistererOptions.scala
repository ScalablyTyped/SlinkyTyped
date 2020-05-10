package typingsSlinky.sipJs.registererOptionsMod

import typingsSlinky.sipJs.AnonFromTag
import typingsSlinky.sipJs.coreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistererOptions extends js.Object {
  /** Registration expiration time in seconds. */
  var expires: js.UndefOr[Double] = js.native
  /** Array of extra Contact header parameters. */
  var extraContactHeaderParams: js.UndefOr[js.Array[String]] = js.native
  /** Array of extra headers added to the REGISTER. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * UUID to provide with "+sip.instance" Contact parameter.
    * @defaultValue a randomly generated uuid
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * If true, constructor logs the registerer configuration.
    * @defaultValue `true`
    */
  var logConfiguration: js.UndefOr[Boolean] = js.native
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[AnonFromTag] = js.native
  /**
    * Value to provide with "reg-id" Contact parameter.
    * @defaultValue 1
    */
  var regId: js.UndefOr[Double] = js.native
  /**
    * The URI of the registrar to send the REGISTER requests.
    * @defaultValue domain portion of the user agent's uri
    */
  var registrar: js.UndefOr[URI] = js.native
}

object RegistererOptions {
  @scala.inline
  def apply(): RegistererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistererOptions]
  }
  @scala.inline
  implicit class RegistererOptionsOps[Self <: RegistererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withExtraContactHeaderParams(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraContactHeaderParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraContactHeaderParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraContactHeaderParams")(js.undefined)
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
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withLogConfiguration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfiguration")(js.undefined)
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
    def withRegId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regId")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrar(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrar")(js.undefined)
        ret
    }
  }
  
}

