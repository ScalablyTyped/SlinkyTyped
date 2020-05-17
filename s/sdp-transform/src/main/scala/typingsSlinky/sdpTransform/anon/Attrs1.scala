package typingsSlinky.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attrs1 extends js.Object {
  var attrs1: String = js.native
  var attrs2: js.UndefOr[String] = js.native
  var dir1: String = js.native
  var dir2: js.UndefOr[String] = js.native
  var pt: Double | String = js.native
}

object Attrs1 {
  @scala.inline
  def apply(attrs1: String, dir1: String, pt: Double | String): Attrs1 = {
    val __obj = js.Dynamic.literal(attrs1 = attrs1.asInstanceOf[js.Any], dir1 = dir1.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs1]
  }
  @scala.inline
  implicit class Attrs1Ops[Self <: Attrs1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPt(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrs2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs2")(js.undefined)
        ret
    }
    @scala.inline
    def withDir2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir2")(js.undefined)
        ret
    }
  }
  
}

