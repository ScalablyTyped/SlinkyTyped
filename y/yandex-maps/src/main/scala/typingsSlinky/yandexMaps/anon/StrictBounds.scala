package typingsSlinky.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictBounds extends js.Object {
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var results: js.UndefOr[Double] = js.native
  var strictBounds: js.UndefOr[Boolean] = js.native
}

object StrictBounds {
  @scala.inline
  def apply(): StrictBounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictBounds]
  }
  @scala.inline
  implicit class StrictBoundsOps[Self <: StrictBounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundedBy(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictBounds")(js.undefined)
        ret
    }
  }
  
}

