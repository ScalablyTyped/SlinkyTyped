package typingsSlinky.soap.wssecurityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWSSecurityOptions extends js.Object {
  var actor: js.UndefOr[String] = js.native
  var hasNonce: js.UndefOr[Boolean] = js.native
  var hasTimeStamp: js.UndefOr[Boolean] = js.native
  var hasTokenCreated: js.UndefOr[Boolean] = js.native
  var mustUnderstand: js.UndefOr[js.Any] = js.native
  var passwordType: js.UndefOr[String] = js.native
}

object IWSSecurityOptions {
  @scala.inline
  def apply(): IWSSecurityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWSSecurityOptions]
  }
  @scala.inline
  implicit class IWSSecurityOptionsOps[Self <: IWSSecurityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(js.undefined)
        ret
    }
    @scala.inline
    def withHasNonce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNonce")(js.undefined)
        ret
    }
    @scala.inline
    def withHasTimeStamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTimeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withHasTokenCreated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTokenCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasTokenCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTokenCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withMustUnderstand(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustUnderstand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMustUnderstand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustUnderstand")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordType")(js.undefined)
        ret
    }
  }
  
}

