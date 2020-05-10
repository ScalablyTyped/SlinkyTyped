package typingsSlinky.semanticUiApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'beforeSend'> */
@js.native
trait PickImplbeforeSendBeforeSend extends js.Object {
  var beforeSend: String = js.native
}

object PickImplbeforeSendBeforeSend {
  @scala.inline
  def apply(beforeSend: String): PickImplbeforeSendBeforeSend = {
    val __obj = js.Dynamic.literal(beforeSend = beforeSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbeforeSendBeforeSend]
  }
  @scala.inline
  implicit class PickImplbeforeSendBeforeSendOps[Self <: PickImplbeforeSendBeforeSend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeSend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

