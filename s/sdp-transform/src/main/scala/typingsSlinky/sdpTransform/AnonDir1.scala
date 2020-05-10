package typingsSlinky.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDir1 extends js.Object {
  var dir1: String = js.native
  var dir2: js.UndefOr[String] = js.native
  var list1: String = js.native
  var list2: js.UndefOr[String] = js.native
}

object AnonDir1 {
  @scala.inline
  def apply(dir1: String, list1: String): AnonDir1 = {
    val __obj = js.Dynamic.literal(dir1 = dir1.asInstanceOf[js.Any], list1 = list1.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDir1]
  }
  @scala.inline
  implicit class AnonDir1Ops[Self <: AnonDir1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDir1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list1")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withList2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list2")(js.undefined)
        ret
    }
  }
  
}

