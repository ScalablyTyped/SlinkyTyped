package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Full extends js.Object {
  var full: scala.Double = js.native
  var none: scala.Double = js.native
  var oneLevel: scala.Double = js.native
  var oneLevelPlusNestedEmptyFolders: scala.Double = js.native
}

object Full {
  @scala.inline
  def apply(
    full: scala.Double,
    none: scala.Double,
    oneLevel: scala.Double,
    oneLevelPlusNestedEmptyFolders: scala.Double
  ): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], oneLevel = oneLevel.asInstanceOf[js.Any], oneLevelPlusNestedEmptyFolders = oneLevelPlusNestedEmptyFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  @scala.inline
  implicit class FullOps[Self <: Full] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFull(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneLevel(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneLevelPlusNestedEmptyFolders(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneLevelPlusNestedEmptyFolders")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

