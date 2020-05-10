package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStoriesConfigured extends js.Object {
  var storiesConfigured: Boolean = js.native
  var storyId: String = js.native
  var viewMode: String = js.native
}

object AnonStoriesConfigured {
  @scala.inline
  def apply(storiesConfigured: Boolean, storyId: String, viewMode: String): AnonStoriesConfigured = {
    val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStoriesConfigured]
  }
  @scala.inline
  implicit class AnonStoriesConfiguredOps[Self <: AnonStoriesConfigured] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStoriesConfigured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesConfigured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

