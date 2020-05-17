package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The msGraphicsTrust() constructor returns an object that provides properties for info on protected video playback. */
@js.native
trait MSGraphicsTrust extends js.Object {
  val constrictionActive: scala.Boolean = js.native
  val status: java.lang.String = js.native
}

object MSGraphicsTrust {
  @scala.inline
  def apply(constrictionActive: scala.Boolean, status: java.lang.String): MSGraphicsTrust = {
    val __obj = js.Dynamic.literal(constrictionActive = constrictionActive.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSGraphicsTrust]
  }
  @scala.inline
  implicit class MSGraphicsTrustOps[Self <: MSGraphicsTrust] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstrictionActive(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrictionActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

