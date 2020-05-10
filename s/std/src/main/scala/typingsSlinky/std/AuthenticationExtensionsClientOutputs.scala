package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationExtensionsClientOutputs extends js.Object {
  var appid: js.UndefOr[scala.Boolean] = js.native
  var authnSel: js.UndefOr[scala.Boolean] = js.native
  var exts: js.UndefOr[AuthenticationExtensionsSupported] = js.native
  var loc: js.UndefOr[org.scalajs.dom.raw.Coordinates] = js.native
  var txAuthGeneric: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  var txAuthSimple: js.UndefOr[java.lang.String] = js.native
  var uvi: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  var uvm: js.UndefOr[UvmEntries] = js.native
}

object AuthenticationExtensionsClientOutputs {
  @scala.inline
  def apply(): AuthenticationExtensionsClientOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsClientOutputs]
  }
  @scala.inline
  implicit class AuthenticationExtensionsClientOutputsOps[Self <: AuthenticationExtensionsClientOutputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppid(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appid")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthnSel(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnSel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthnSel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnSel")(js.undefined)
        ret
    }
    @scala.inline
    def withExts(value: AuthenticationExtensionsSupported): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exts")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc(value: org.scalajs.dom.raw.Coordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(js.undefined)
        ret
    }
    @scala.inline
    def withTxAuthGeneric(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txAuthGeneric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTxAuthGeneric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txAuthGeneric")(js.undefined)
        ret
    }
    @scala.inline
    def withTxAuthSimple(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txAuthSimple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTxAuthSimple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txAuthSimple")(js.undefined)
        ret
    }
    @scala.inline
    def withUvi(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUvi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvi")(js.undefined)
        ret
    }
    @scala.inline
    def withUvm(value: UvmEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUvm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvm")(js.undefined)
        ret
    }
  }
  
}

