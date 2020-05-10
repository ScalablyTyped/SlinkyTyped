package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBDelayInit extends js.Object {
  var bDelayInit: Boolean = js.native
  var separatorChar: String = js.native
  var singleValuePropTypeID: String = js.native
}

object AnonBDelayInit {
  @scala.inline
  def apply(bDelayInit: Boolean, separatorChar: String, singleValuePropTypeID: String): AnonBDelayInit = {
    val __obj = js.Dynamic.literal(bDelayInit = bDelayInit.asInstanceOf[js.Any], separatorChar = separatorChar.asInstanceOf[js.Any], singleValuePropTypeID = singleValuePropTypeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBDelayInit]
  }
  @scala.inline
  implicit class AnonBDelayInitOps[Self <: AnonBDelayInit] (val x: Self) extends AnyVal {
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

