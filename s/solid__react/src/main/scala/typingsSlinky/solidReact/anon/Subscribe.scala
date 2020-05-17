package typingsSlinky.solidReact.anon

import typingsSlinky.solidReact.solidReactStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribe extends js.Object {
  var subscribe: js.UndefOr[Asterisk | String | js.Array[String]] = js.native
}

object Subscribe {
  @scala.inline
  def apply(): Subscribe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscribe]
  }
  @scala.inline
  implicit class SubscribeOps[Self <: Subscribe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscribe(value: Asterisk | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.undefined)
        ret
    }
  }
  
}

