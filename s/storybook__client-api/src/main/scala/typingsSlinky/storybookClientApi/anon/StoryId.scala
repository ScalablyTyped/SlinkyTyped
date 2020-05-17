package typingsSlinky.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryId extends js.Object {
  var storyId: String = js.native
}

object StoryId {
  @scala.inline
  def apply(storyId: String): StoryId = {
    val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryId]
  }
  @scala.inline
  implicit class StoryIdOps[Self <: StoryId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

