package typingsSlinky.storybookAddonStoryshots

import typingsSlinky.storybookAddonStoryshots.anon.Context
import typingsSlinky.storybookAddonStoryshots.anon.Options
import typingsSlinky.storybookAddonStoryshots.anon.RenderTree
import typingsSlinky.storybookAddonStoryshots.anon.Renderer
import typingsSlinky.storybookAddonStoryshots.anon.Story
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots/dist/test-bodies", JSImport.Namespace)
@js.native
object testBodiesMod extends js.Object {
  def multiSnapshotWithOptions(): js.Function1[
    /* hasStoryContextRenderTreeStories2snapsConverter */ RenderTree, 
    Unit | js.Promise[Unit]
  ] = js.native
  def multiSnapshotWithOptions(options: js.Object): js.Function1[
    /* hasStoryContextRenderTreeStories2snapsConverter */ RenderTree, 
    Unit | js.Promise[Unit]
  ] = js.native
  def renderOnly(hasStoryContextRenderTree: Story): js.Any = js.native
  def renderWithOptions(): js.Function1[/* hasStoryContextRenderTree */ Story, _] = js.native
  def renderWithOptions(options: js.Object): js.Function1[/* hasStoryContextRenderTree */ Story, _] = js.native
  def shallowSnapshot(hasStoryContextRenderShallowTreeOptions: Options): Unit = js.native
  def snapshot(hasStoryContextRenderTreeSnapshotFileName: Context): Unit | js.Promise[Unit] = js.native
  def snapshotWithOptions(): js.Function1[/* hasStoryContextRenderTreeSnapshotFileName */ Context, Unit | js.Promise[Unit]] = js.native
  def snapshotWithOptions(options: js.Function): js.Function1[/* hasStoryContextRenderTreeSnapshotFileName */ Context, Unit | js.Promise[Unit]] = js.native
  def snapshotWithOptions(options: Renderer): js.Function1[/* hasStoryContextRenderTreeSnapshotFileName */ Context, Unit | js.Promise[Unit]] = js.native
}

