package typingsSlinky.yogBigpipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefault extends js.Object {
  var _default: js.UndefOr[String] = js.native
  var quickling: js.UndefOr[String] = js.native
}

object AnonDefault {
  @scala.inline
  def apply(): AnonDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefault]
  }
  @scala.inline
  implicit class AnonDefaultOps[Self <: AnonDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_default(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_default: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_default")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickling(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickling")(js.undefined)
        ret
    }
  }
  
}

