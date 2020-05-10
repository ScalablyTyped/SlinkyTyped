package typingsSlinky.shopifyPrime.optionsBaseMod

import typingsSlinky.shopifyPrime.publishedStatusMod.PublishedStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishedOptions extends js.Object {
  /**
    * Filter results to those published before date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_max: js.UndefOr[String] = js.native
  /**
    * Filter results to those published after date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_min: js.UndefOr[String] = js.native
  /**
    * Filter results to those with the given publish status.
    */
  var published_status: js.UndefOr[PublishedStatus] = js.native
}

object PublishedOptions {
  @scala.inline
  def apply(): PublishedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishedOptions]
  }
  @scala.inline
  implicit class PublishedOptionsOps[Self <: PublishedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublished_at_max(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished_at_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at_max")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished_at_min(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished_at_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at_min")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished_status(value: PublishedStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_status")(js.undefined)
        ret
    }
  }
  
}

