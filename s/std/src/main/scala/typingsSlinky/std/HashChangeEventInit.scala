package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashChangeEventInit extends EventInit {
  var newURL: js.UndefOr[java.lang.String] = js.native
  var oldURL: js.UndefOr[java.lang.String] = js.native
}

object HashChangeEventInit {
  @scala.inline
  def apply(): HashChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashChangeEventInit]
  }
  @scala.inline
  implicit class HashChangeEventInitOps[Self <: HashChangeEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewURL(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newURL")(js.undefined)
        ret
    }
    @scala.inline
    def withOldURL(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldURL")(js.undefined)
        ret
    }
  }
  
}

