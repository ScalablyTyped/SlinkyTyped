package typingsSlinky.tslint

import typingsSlinky.tslint.tagExclusionMod.IContentTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContent extends js.Object {
  var content: IContentTags = js.native
  var existence: js.Array[String] = js.native
}

object AnonContent {
  @scala.inline
  def apply(content: IContentTags, existence: js.Array[String]): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], existence = existence.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
  @scala.inline
  implicit class AnonContentOps[Self <: AnonContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: IContentTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExistence(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existence")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

