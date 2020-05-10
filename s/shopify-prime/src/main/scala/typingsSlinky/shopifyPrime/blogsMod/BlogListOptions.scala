package typingsSlinky.shopifyPrime.blogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlogListOptions extends js.Object {
  /**
    * Filter by blog handle.
    */
  var handle: js.UndefOr[String] = js.native
  /**
    * Filter results to after the specified ID,
    */
  var since_id: js.UndefOr[Double] = js.native
}

object BlogListOptions {
  @scala.inline
  def apply(): BlogListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlogListOptions]
  }
  @scala.inline
  implicit class BlogListOptionsOps[Self <: BlogListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withSince_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since_id")(js.undefined)
        ret
    }
  }
  
}

