package typingsSlinky.storybookClientApi.storyStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryOptions extends js.Object {
  var includeDocsOnly: js.UndefOr[Boolean] = js.native
}

object StoryOptions {
  @scala.inline
  def apply(): StoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoryOptions]
  }
  @scala.inline
  implicit class StoryOptionsOps[Self <: StoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeDocsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDocsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDocsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDocsOnly")(js.undefined)
        ret
    }
  }
  
}

