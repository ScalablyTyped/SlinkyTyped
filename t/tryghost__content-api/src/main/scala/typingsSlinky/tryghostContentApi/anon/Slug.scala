package typingsSlinky.tryghostContentApi.anon

import typingsSlinky.tryghostContentApi.mod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slug extends js.Object {
  var slug: Nullable[String] = js.native
}

object Slug {
  @scala.inline
  def apply(): Slug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slug]
  }
  @scala.inline
  implicit class SlugOps[Self <: Slug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlug(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlugNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(null)
        ret
    }
  }
  
}

