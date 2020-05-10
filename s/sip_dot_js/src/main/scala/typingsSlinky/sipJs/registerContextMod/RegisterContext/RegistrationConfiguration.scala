package typingsSlinky.sipJs.registerContextMod.RegisterContext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrationConfiguration extends js.Object {
  var expires: js.UndefOr[String] = js.native
  var extraContactHeaderParams: js.UndefOr[js.Array[String]] = js.native
  var instanceId: js.UndefOr[String] = js.native
  var params: js.UndefOr[js.Any] = js.native
  var regId: js.UndefOr[Double] = js.native
  var registrar: js.UndefOr[String] = js.native
}

object RegistrationConfiguration {
  @scala.inline
  def apply(): RegistrationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationConfiguration]
  }
  @scala.inline
  implicit class RegistrationConfigurationOps[Self <: RegistrationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires(value: String): Self = {
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
    def withParams(value: js.Any): Self = {
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
    def withRegistrar(value: String): Self = {
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

