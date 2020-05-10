package typingsSlinky.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueSelectData extends js.Object {
  var mutableOptions: js.Array[_] = js.native
  var mutableValue: js.Any = js.native
  var open: Boolean = js.native
  var search: String = js.native
}

object VueSelectData {
  @scala.inline
  def apply(mutableOptions: js.Array[_], mutableValue: js.Any, open: Boolean, search: String): VueSelectData = {
    val __obj = js.Dynamic.literal(mutableOptions = mutableOptions.asInstanceOf[js.Any], mutableValue = mutableValue.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueSelectData]
  }
  @scala.inline
  implicit class VueSelectDataOps[Self <: VueSelectData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutableOptions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutableValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

