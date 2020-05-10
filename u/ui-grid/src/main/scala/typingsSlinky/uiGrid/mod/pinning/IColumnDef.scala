package typingsSlinky.uiGrid.mod.pinning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnDef extends js.Object {
  /**
    * Enable pinning for the individual column.  Defaults to true
    * @default true
    */
  var enablePinning: js.UndefOr[Boolean] = js.native
  /**
    * Column is pinned left when grid is rendered.  Defaults to false
    * @default false
    */
  var pinnedLeft: js.UndefOr[Boolean] = js.native
  /**
    * Column is pinned right when grid is rendered.  Defaults to false
    * @default false
    */
  var pinnedRight: js.UndefOr[Boolean] = js.native
}

object IColumnDef {
  @scala.inline
  def apply(): IColumnDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDef]
  }
  @scala.inline
  implicit class IColumnDefOps[Self <: IColumnDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnablePinning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePinning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePinning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePinning")(js.undefined)
        ret
    }
    @scala.inline
    def withPinnedLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinnedLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPinnedRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinnedRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedRight")(js.undefined)
        ret
    }
  }
  
}

