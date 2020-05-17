package typingsSlinky.webpack.mod.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToStringOptionsObject
  extends ToJsonOptionsObject
     with ToStringOptions {
  /** `webpack --colors` equivalent */
  var colors: js.UndefOr[Boolean | String] = js.native
  /**
    * preset for the default values
    */
  var preset: js.UndefOr[Preset] = js.native
}

object ToStringOptionsObject {
  @scala.inline
  def apply(): ToStringOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToStringOptionsObject]
  }
  @scala.inline
  implicit class ToStringOptionsObjectOps[Self <: ToStringOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: Preset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
  }
  
}

