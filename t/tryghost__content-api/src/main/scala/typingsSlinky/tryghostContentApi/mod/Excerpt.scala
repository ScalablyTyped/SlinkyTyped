package typingsSlinky.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Excerpt extends js.Object {
  var custom_excerpt: js.UndefOr[String] = js.native
  var excerpt: js.UndefOr[String] = js.native
}

object Excerpt {
  @scala.inline
  def apply(): Excerpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Excerpt]
  }
  @scala.inline
  implicit class ExcerptOps[Self <: Excerpt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom_excerpt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_excerpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_excerpt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_excerpt")(js.undefined)
        ret
    }
    @scala.inline
    def withExcerpt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excerpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcerpt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excerpt")(js.undefined)
        ret
    }
  }
  
}

