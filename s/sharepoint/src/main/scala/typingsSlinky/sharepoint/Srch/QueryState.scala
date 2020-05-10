package typingsSlinky.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryState extends js.Object {
  var e: Double = js.native
  var k: String = js.native
  var r: js.Array[RefinementCategory] = js.native
}

object QueryState {
  @scala.inline
  def apply(e: Double, k: String, r: js.Array[RefinementCategory]): QueryState = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryState]
  }
  @scala.inline
  implicit class QueryStateOps[Self <: QueryState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withK(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: js.Array[RefinementCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

