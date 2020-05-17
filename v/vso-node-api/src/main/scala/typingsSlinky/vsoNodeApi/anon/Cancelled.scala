package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancelled extends js.Object {
  var cancelled: scala.Double = js.native
  var error: scala.Double = js.native
  var published: scala.Double = js.native
  var unpublished: scala.Double = js.native
}

object Cancelled {
  @scala.inline
  def apply(cancelled: scala.Double, error: scala.Double, published: scala.Double, unpublished: scala.Double): Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelled]
  }
  @scala.inline
  implicit class CancelledOps[Self <: Cancelled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublished(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnpublished(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpublished")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

