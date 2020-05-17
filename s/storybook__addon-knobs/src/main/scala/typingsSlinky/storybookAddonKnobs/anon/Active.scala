package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Active extends js.Object {
  var active: Validator[Boolean] = js.native
  var api: Validator[PickAPIonoffemitgetQueryP] = js.native
  var onReset: Validator[js.UndefOr[js.Object]] = js.native
}

object Active {
  @scala.inline
  def apply(
    active: Validator[Boolean],
    api: Validator[PickAPIonoffemitgetQueryP],
    onReset: Validator[js.UndefOr[js.Object]]
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Validator[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApi(value: Validator[PickAPIonoffemitgetQueryP]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReset(value: Validator[js.UndefOr[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

