package typingsSlinky.slimerjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Major extends js.Object {
  var major: Double = js.native
  var minor: Double = js.native
  var patch: Double = js.native
}

object Major {
  @scala.inline
  def apply(major: Double, minor: Double, patch: Double): Major = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Major]
  }
  @scala.inline
  implicit class MajorOps[Self <: Major] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMajor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

