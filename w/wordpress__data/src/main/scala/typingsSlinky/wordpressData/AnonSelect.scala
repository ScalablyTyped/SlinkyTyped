package typingsSlinky.wordpressData

import typingsSlinky.wordpressData.mod.SelectorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelect extends js.Object {
  var select: js.Function1[/* key */ String, SelectorMap] = js.native
}

object AnonSelect {
  @scala.inline
  def apply(select: /* key */ String => SelectorMap): AnonSelect = {
    val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[AnonSelect]
  }
  @scala.inline
  implicit class AnonSelectOps[Self <: AnonSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelect(value: /* key */ String => SelectorMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

