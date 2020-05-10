package typingsSlinky.storybookAddonStoryshots.stories2SnapsConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stories2SnapsConverterOptions extends js.Object {
  var snapshotExtension: String = js.native
  var snapshotsDirName: String = js.native
  var storiesExtensions: js.Array[String] = js.native
}

object Stories2SnapsConverterOptions {
  @scala.inline
  def apply(snapshotExtension: String, snapshotsDirName: String, storiesExtensions: js.Array[String]): Stories2SnapsConverterOptions = {
    val __obj = js.Dynamic.literal(snapshotExtension = snapshotExtension.asInstanceOf[js.Any], snapshotsDirName = snapshotsDirName.asInstanceOf[js.Any], storiesExtensions = storiesExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stories2SnapsConverterOptions]
  }
  @scala.inline
  implicit class Stories2SnapsConverterOptionsOps[Self <: Stories2SnapsConverterOptions] (val x: Self) extends AnyVal {
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
    def withSnapshotsDirName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotsDirName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoriesExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesExtensions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

