package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationExtensionsClientOutputs extends js.Object {
  var appid: js.UndefOr[scala.Boolean] = js.undefined
  var authnSel: js.UndefOr[scala.Boolean] = js.undefined
  var exts: js.UndefOr[AuthenticationExtensionsSupported] = js.undefined
  var loc: js.UndefOr[org.scalajs.dom.raw.Coordinates] = js.undefined
  var txAuthGeneric: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  var txAuthSimple: js.UndefOr[java.lang.String] = js.undefined
  var uvi: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  var uvm: js.UndefOr[UvmEntries] = js.undefined
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppid(value: scala.Boolean): Self = this.set("appid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppid: Self = this.set("appid", js.undefined)
    @scala.inline
    def setAuthnSel(value: scala.Boolean): Self = this.set("authnSel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthnSel: Self = this.set("authnSel", js.undefined)
    @scala.inline
    def setExts(value: AuthenticationExtensionsSupported): Self = this.set("exts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExts: Self = this.set("exts", js.undefined)
    @scala.inline
    def setLoc(value: org.scalajs.dom.raw.Coordinates): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    @scala.inline
    def setTxAuthGeneric(value: js.typedarray.ArrayBuffer): Self = this.set("txAuthGeneric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTxAuthGeneric: Self = this.set("txAuthGeneric", js.undefined)
    @scala.inline
    def setTxAuthSimple(value: java.lang.String): Self = this.set("txAuthSimple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTxAuthSimple: Self = this.set("txAuthSimple", js.undefined)
    @scala.inline
    def setUvi(value: js.typedarray.ArrayBuffer): Self = this.set("uvi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUvi: Self = this.set("uvi", js.undefined)
    @scala.inline
    def setUvm(value: UvmEntries): Self = this.set("uvm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUvm: Self = this.set("uvm", js.undefined)
  }
  
}

