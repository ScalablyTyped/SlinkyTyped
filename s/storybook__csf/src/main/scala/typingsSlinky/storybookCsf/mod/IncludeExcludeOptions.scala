package typingsSlinky.storybookCsf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeExcludeOptions extends js.Object {
  var excludeStories: js.UndefOr[StoryDescriptor] = js.native
  var includeStories: js.UndefOr[StoryDescriptor] = js.native
}

object IncludeExcludeOptions {
  @scala.inline
  def apply(): IncludeExcludeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeExcludeOptions]
  }
  @scala.inline
  implicit class IncludeExcludeOptionsOps[Self <: IncludeExcludeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeStoriesRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeStories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeStories(value: StoryDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeStories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeStories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeStories")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeStoriesRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeStories(value: StoryDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeStories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStories")(js.undefined)
        ret
    }
  }
  
}

