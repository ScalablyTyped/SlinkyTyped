package typingsSlinky.yandexMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddViaPoints extends js.Object {
  var addViaPoints: js.UndefOr[Boolean] = js.native
  var addWayPoints: js.UndefOr[Boolean] = js.native
  var editViaPoints: js.UndefOr[Boolean] = js.native
  var editWayPoints: js.UndefOr[Boolean] = js.native
  var removeViaPoints: js.UndefOr[Boolean] = js.native
  var removeWayPoints: js.UndefOr[Boolean] = js.native
}

object AnonAddViaPoints {
  @scala.inline
  def apply(): AnonAddViaPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAddViaPoints]
  }
  @scala.inline
  implicit class AnonAddViaPointsOps[Self <: AnonAddViaPoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddViaPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addViaPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddViaPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addViaPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withAddWayPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addWayPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddWayPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addWayPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withEditViaPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editViaPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditViaPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editViaPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withEditWayPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editWayPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditWayPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editWayPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveViaPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeViaPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveViaPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeViaPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveWayPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWayPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveWayPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWayPoints")(js.undefined)
        ret
    }
  }
  
}

