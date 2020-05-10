package typingsSlinky.uiRouterExtras

import typingsSlinky.uiRouterExtras.mod.ui.IRedirectParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRedirect extends js.Object {
  var redirect: IRedirectParams = js.native
  var to: IRedirectParams = js.native
}

object AnonRedirect {
  @scala.inline
  def apply(redirect: IRedirectParams, to: IRedirectParams): AnonRedirect = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRedirect]
  }
  @scala.inline
  implicit class AnonRedirectOps[Self <: AnonRedirect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirect(value: IRedirectParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: IRedirectParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

