package typingsSlinky.atStorybookAddonDashStoryshots

import typingsSlinky.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsMod.RenderTree
import typingsSlinky.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsMod.SnapshotOptions
import typingsSlinky.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsMod.StoryContext
import typingsSlinky.atStorybookReact.distClientPreviewTypesMod.IStorybookStory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: StoryContext
  var renderShallowTree: RenderTree
  var renderTree: RenderTree
  var snapshotFileName: String
  var story: IStorybookStory
}

object Anon_Context {
  @scala.inline
  def apply(
    context: StoryContext,
    renderShallowTree: (/* story */ IStorybookStory, /* context */ StoryContext, /* options */ js.UndefOr[SnapshotOptions]) => js.UndefOr[Unit | js.Promise[Unit]],
    renderTree: (/* story */ IStorybookStory, /* context */ StoryContext, /* options */ js.UndefOr[SnapshotOptions]) => js.UndefOr[Unit | js.Promise[Unit]],
    snapshotFileName: String,
    story: IStorybookStory
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], renderShallowTree = js.Any.fromFunction3(renderShallowTree), renderTree = js.Any.fromFunction3(renderTree), snapshotFileName = snapshotFileName.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Context]
  }
}

