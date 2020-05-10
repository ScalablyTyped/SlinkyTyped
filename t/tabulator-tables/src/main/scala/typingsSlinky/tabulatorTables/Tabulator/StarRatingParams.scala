package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StarRatingParams extends _FormatterParams {
  // Star Rating
  var stars: js.UndefOr[Double] = js.native
}

object StarRatingParams {
  @scala.inline
  def apply(): StarRatingParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StarRatingParams]
  }
  @scala.inline
  implicit class StarRatingParamsOps[Self <: StarRatingParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stars")(js.undefined)
        ret
    }
  }
  
}

