package typingsSlinky.storybookAddonStoryshots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-storyshots.@storybook/addon-storyshots/dist/Stories2SnapsConverter.Stories2SnapsConverterOptions> */
@js.native
trait PartialStories2SnapsConve extends js.Object {
  var snapshotExtension: js.UndefOr[String] = js.native
  var snapshotsDirName: js.UndefOr[String] = js.native
  var storiesExtensions: js.UndefOr[js.Array[String]] = js.native
}

object PartialStories2SnapsConve {
  @scala.inline
  def apply(): PartialStories2SnapsConve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStories2SnapsConve]
  }
  @scala.inline
  implicit class PartialStories2SnapsConveOps[Self <: PartialStories2SnapsConve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshotExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotsDirName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotsDirName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotsDirName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotsDirName")(js.undefined)
        ret
    }
    @scala.inline
    def withStoriesExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoriesExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesExtensions")(js.undefined)
        ret
    }
  }
  
}

