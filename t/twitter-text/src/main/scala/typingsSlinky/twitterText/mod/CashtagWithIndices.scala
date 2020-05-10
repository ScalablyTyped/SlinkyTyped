package typingsSlinky.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CashtagWithIndices extends EntityWithIndices {
  var cashtag: String = js.native
  var indices: js.Tuple2[Double, Double] = js.native
}

object CashtagWithIndices {
  @scala.inline
  def apply(cashtag: String, indices: js.Tuple2[Double, Double]): CashtagWithIndices = {
    val __obj = js.Dynamic.literal(cashtag = cashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashtagWithIndices]
  }
  @scala.inline
  implicit class CashtagWithIndicesOps[Self <: CashtagWithIndices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCashtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cashtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndices(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

