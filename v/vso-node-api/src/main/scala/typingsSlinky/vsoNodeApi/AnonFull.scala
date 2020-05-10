package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFull extends js.Object {
  var full: Double = js.native
  var none: Double = js.native
  var oneLevel: Double = js.native
  var oneLevelPlusNestedEmptyFolders: Double = js.native
}

object AnonFull {
  @scala.inline
  def apply(full: Double, none: Double, oneLevel: Double, oneLevelPlusNestedEmptyFolders: Double): AnonFull = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], oneLevel = oneLevel.asInstanceOf[js.Any], oneLevelPlusNestedEmptyFolders = oneLevelPlusNestedEmptyFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFull]
  }
  @scala.inline
  implicit class AnonFullOps[Self <: AnonFull] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFull(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneLevelPlusNestedEmptyFolders(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneLevelPlusNestedEmptyFolders")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

