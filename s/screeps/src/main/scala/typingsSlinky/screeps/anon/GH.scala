package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GH extends js.Object {
  var GH: UpgradeController = js.native
  var GH2O: `4` = js.native
  var LH: Build = js.native
  var LH2O: Repair = js.native
  var UHO2: `0` = js.native
  var UO: Harvest = js.native
  var XGH2O: `5` = js.native
  var XLH2O: BuildRepair = js.native
  var XUHO2: `1` = js.native
  var XZH2O: `3` = js.native
  var ZH: Dismantle = js.native
  var ZH2O: `2` = js.native
}

object GH {
  @scala.inline
  def apply(
    GH: UpgradeController,
    GH2O: `4`,
    LH: Build,
    LH2O: Repair,
    UHO2: `0`,
    UO: Harvest,
    XGH2O: `5`,
    XLH2O: BuildRepair,
    XUHO2: `1`,
    XZH2O: `3`,
    ZH: Dismantle,
    ZH2O: `2`
  ): GH = {
    val __obj = js.Dynamic.literal(GH = GH.asInstanceOf[js.Any], GH2O = GH2O.asInstanceOf[js.Any], LH = LH.asInstanceOf[js.Any], LH2O = LH2O.asInstanceOf[js.Any], UHO2 = UHO2.asInstanceOf[js.Any], UO = UO.asInstanceOf[js.Any], XGH2O = XGH2O.asInstanceOf[js.Any], XLH2O = XLH2O.asInstanceOf[js.Any], XUHO2 = XUHO2.asInstanceOf[js.Any], XZH2O = XZH2O.asInstanceOf[js.Any], ZH = ZH.asInstanceOf[js.Any], ZH2O = ZH2O.asInstanceOf[js.Any])
    __obj.asInstanceOf[GH]
  }
  @scala.inline
  implicit class GHOps[Self <: GH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGH(value: UpgradeController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGH2O(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLH(value: Build): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLH2O(value: Repair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUHO2(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UHO2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUO(value: Harvest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXGH2O(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XGH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXLH2O(value: BuildRepair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XLH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXUHO2(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XUHO2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXZH2O(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XZH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZH(value: Dismantle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZH2O(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZH2O")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

