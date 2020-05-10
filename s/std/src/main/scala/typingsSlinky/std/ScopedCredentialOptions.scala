package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopedCredentialOptions extends js.Object {
  var excludeList: js.UndefOr[js.Array[ScopedCredentialDescriptor]] = js.native
  var extensions: js.UndefOr[WebAuthnExtensions] = js.native
  var rpId: js.UndefOr[java.lang.String] = js.native
  var timeoutSeconds: js.UndefOr[Double] = js.native
}

object ScopedCredentialOptions {
  @scala.inline
  def apply(): ScopedCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedCredentialOptions]
  }
  @scala.inline
  implicit class ScopedCredentialOptionsOps[Self <: ScopedCredentialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeList(value: js.Array[ScopedCredentialDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeList")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: WebAuthnExtensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withRpId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRpId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpId")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSeconds")(js.undefined)
        ret
    }
  }
  
}

