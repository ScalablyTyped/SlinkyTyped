package typingsSlinky.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialIndex extends js.Object {
  var count: Double = js.native
  var materialIndex: js.UndefOr[Double] = js.native
  var start: Double = js.native
}

object MaterialIndex {
  @scala.inline
  def apply(count: Double, start: Double): MaterialIndex = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialIndex]
  }
  @scala.inline
  implicit class MaterialIndexOps[Self <: MaterialIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaterialIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materialIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterialIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materialIndex")(js.undefined)
        ret
    }
  }
  
}

