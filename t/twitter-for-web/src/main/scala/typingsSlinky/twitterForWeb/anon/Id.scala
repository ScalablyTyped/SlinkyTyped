package typingsSlinky.twitterForWeb.anon

import typingsSlinky.twitterForWeb.TwitterTimelineWidgetListDataSource
import typingsSlinky.twitterForWeb.twitterForWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends TwitterTimelineWidgetListDataSource {
  var id: String = js.native
  var sourceType: list = js.native
}

object Id {
  @scala.inline
  def apply(id: String, sourceType: list): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceType(value: list): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

