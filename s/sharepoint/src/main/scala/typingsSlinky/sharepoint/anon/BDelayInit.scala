package typingsSlinky.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BDelayInit extends js.Object {
  var bDelayInit: Boolean = js.native
  var separatorChar: String = js.native
  var singleValuePropTypeID: String = js.native
}

object BDelayInit {
  @scala.inline
  def apply(bDelayInit: Boolean, separatorChar: String, singleValuePropTypeID: String): BDelayInit = {
    val __obj = js.Dynamic.literal(bDelayInit = bDelayInit.asInstanceOf[js.Any], separatorChar = separatorChar.asInstanceOf[js.Any], singleValuePropTypeID = singleValuePropTypeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BDelayInit]
  }
  @scala.inline
  implicit class BDelayInitOps[Self <: BDelayInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBDelayInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bDelayInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparatorChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleValuePropTypeID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValuePropTypeID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

