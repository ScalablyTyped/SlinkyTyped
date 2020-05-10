package typingsSlinky.zchatBrowser.mod

import typingsSlinky.zchatBrowser.AnonJwtfn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitProps extends js.Object {
  var account_key: String = js.native
  var authentication: js.UndefOr[AnonJwtfn] = js.native
}

object InitProps {
  @scala.inline
  def apply(account_key: String): InitProps = {
    val __obj = js.Dynamic.literal(account_key = account_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitProps]
  }
  @scala.inline
  implicit class InitPropsOps[Self <: InitProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthentication(value: AnonJwtfn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(js.undefined)
        ret
    }
  }
  
}

