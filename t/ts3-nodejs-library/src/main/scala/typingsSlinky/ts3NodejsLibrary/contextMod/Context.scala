package typingsSlinky.ts3NodejsLibrary.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var client_nickname: js.UndefOr[String] = js.native
  var events: js.Array[ActiveEvent] = js.native
  var login: js.UndefOr[LoginInfo] = js.native
  var selectType: SelectType = js.native
  var selected: Double = js.native
}

object Context {
  @scala.inline
  def apply(events: js.Array[ActiveEvent], selectType: SelectType, selected: Double): Context = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: js.Array[ActiveEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectType(value: SelectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_nickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_nickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname")(js.undefined)
        ret
    }
    @scala.inline
    def withLogin(value: LoginInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(js.undefined)
        ret
    }
  }
  
}

