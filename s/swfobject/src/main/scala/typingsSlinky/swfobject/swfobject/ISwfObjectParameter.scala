package typingsSlinky.swfobject.swfobject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwfObjectParameter extends js.Object {
  var flashvars: js.UndefOr[String] = js.native
}

object ISwfObjectParameter {
  @scala.inline
  def apply(): ISwfObjectParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISwfObjectParameter]
  }
  @scala.inline
  implicit class ISwfObjectParameterOps[Self <: ISwfObjectParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlashvars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashvars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashvars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashvars")(js.undefined)
        ret
    }
  }
  
}

