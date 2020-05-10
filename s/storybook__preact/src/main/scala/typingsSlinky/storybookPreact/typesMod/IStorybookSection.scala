package typingsSlinky.storybookPreact.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorybookSection extends js.Object {
  var kind: String = js.native
  var stories: js.Array[IStorybookStory] = js.native
}

object IStorybookSection {
  @scala.inline
  def apply(kind: String, stories: js.Array[IStorybookStory]): IStorybookSection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorybookSection]
  }
  @scala.inline
  implicit class IStorybookSectionOps[Self <: IStorybookSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStories(value: js.Array[IStorybookStory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

