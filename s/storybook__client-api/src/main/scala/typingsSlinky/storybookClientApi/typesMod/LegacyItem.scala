package typingsSlinky.storybookClientApi.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.storybookClientApi.anon.StoryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyItem extends js.Object {
  var fileName: String = js.native
  var index: Double = js.native
  var kind: String = js.native
  var revision: js.UndefOr[Double] = js.native
  var selection: js.UndefOr[StoryId] = js.native
  var stories: StringDictionary[js.Any] = js.native
}

object LegacyItem {
  @scala.inline
  def apply(fileName: String, index: Double, kind: String, stories: StringDictionary[js.Any]): LegacyItem = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyItem]
  }
  @scala.inline
  implicit class LegacyItemOps[Self <: LegacyItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStories(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: StoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
  }
  
}

