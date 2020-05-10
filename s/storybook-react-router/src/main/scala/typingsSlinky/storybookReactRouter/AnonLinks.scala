package typingsSlinky.storybookReactRouter

import typingsSlinky.reactRouter.mod.MemoryRouterProps
import typingsSlinky.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLinks extends js.Object {
  var links: js.Object = js.native
  var routerProps: MemoryRouterProps = js.native
  var story: StoryApi[_] = js.native
}

object AnonLinks {
  @scala.inline
  def apply(links: js.Object, routerProps: MemoryRouterProps, story: StoryApi[_]): AnonLinks = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLinks]
  }
  @scala.inline
  implicit class AnonLinksOps[Self <: AnonLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinks(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouterProps(value: MemoryRouterProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStory(value: StoryApi[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

