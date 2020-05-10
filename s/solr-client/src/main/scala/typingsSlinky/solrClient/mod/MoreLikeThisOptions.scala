package typingsSlinky.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoreLikeThisOptions extends js.Object {
  var boost: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Double] = js.native
  var fl: js.UndefOr[String | js.Array[String]] = js.native
  var maxntp: js.UndefOr[Double] = js.native
  var maxqt: js.UndefOr[Double] = js.native
  var maxwl: js.UndefOr[Double] = js.native
  var mindf: js.UndefOr[Double] = js.native
  var mintf: js.UndefOr[Double] = js.native
  var minwl: js.UndefOr[Double] = js.native
  var on: Boolean = js.native
  var qf: js.UndefOr[String | js.Object] = js.native
}

object MoreLikeThisOptions {
  @scala.inline
  def apply(on: Boolean): MoreLikeThisOptions = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreLikeThisOptions]
  }
  @scala.inline
  implicit class MoreLikeThisOptionsOps[Self <: MoreLikeThisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withFl(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fl")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxntp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxntp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxntp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxntp")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxqt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxqt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxqt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxqt")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxwl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxwl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxwl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxwl")(js.undefined)
        ret
    }
    @scala.inline
    def withMindf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mindf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMindf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mindf")(js.undefined)
        ret
    }
    @scala.inline
    def withMintf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mintf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMintf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mintf")(js.undefined)
        ret
    }
    @scala.inline
    def withMinwl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minwl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinwl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minwl")(js.undefined)
        ret
    }
    @scala.inline
    def withQf(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qf")(js.undefined)
        ret
    }
  }
  
}

