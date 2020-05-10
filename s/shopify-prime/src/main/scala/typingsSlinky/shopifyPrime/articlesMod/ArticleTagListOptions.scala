package typingsSlinky.shopifyPrime.articlesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArticleTagListOptions extends js.Object {
  /**
    * The number of tags to return.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * A flag to indicate only to a certain number of the most popular tags.
    */
  var popular: js.UndefOr[Double] = js.native
}

object ArticleTagListOptions {
  @scala.inline
  def apply(): ArticleTagListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArticleTagListOptions]
  }
  @scala.inline
  implicit class ArticleTagListOptionsOps[Self <: ArticleTagListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withPopular(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popular")(js.undefined)
        ret
    }
  }
  
}

