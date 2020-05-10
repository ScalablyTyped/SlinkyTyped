package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitSortableOptions extends js.Object {
  var animation: js.UndefOr[Double] = js.native
  var `cls-base`: js.UndefOr[String] = js.native
  var `cls-custom`: String = js.native
  var `cls-drag`: js.UndefOr[String] = js.native
  var `cls-drag-state`: js.UndefOr[String] = js.native
  var `cls-empty`: js.UndefOr[String] = js.native
  var `cls-item`: js.UndefOr[String] = js.native
  var `cls-no-drag`: js.UndefOr[String] = js.native
  var `cls-placeholder`: js.UndefOr[String] = js.native
  var group: js.UndefOr[String] = js.native
  var handle: js.UndefOr[String] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object UIkitSortableOptions {
  @scala.inline
  def apply(`cls-custom`: String): UIkitSortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cls-custom")(`cls-custom`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitSortableOptions]
  }
  @scala.inline
  implicit class UIkitSortableOptionsOps[Self <: UIkitSortableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCls-custom`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def `withCls-base`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCls-base`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-base")(js.undefined)
        ret
    }
    @scala.inline
    def `withCls-drag`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCls-drag`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-drag")(js.undefined)
        ret
    }
    @scala.inline
    def `withCls-drag-state`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-drag-state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCls-drag-state`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-drag-state")(js.undefined)
        ret
    }
    @scala.inline
    def `withCls-empty`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCls-empty`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-empty")(js.undefined)
        ret
    }
    @scala.inline
    def `withCls-item`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCls-item`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-item")(js.undefined)
        ret
    }
    @scala.inline
    def `withCls-no-drag`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-no-drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCls-no-drag`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-no-drag")(js.undefined)
        ret
    }
    @scala.inline
    def `withCls-placeholder`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCls-placeholder`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

