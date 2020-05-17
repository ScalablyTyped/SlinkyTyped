package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconExpanded extends js.Object {
  var container: String = js.native
  var content: String = js.native
  var description: String = js.native
  var icon: String = js.native
  var iconExpanded: String = js.native
  var title: String = js.native
  var titleExpandable: String = js.native
}

object IconExpanded {
  @scala.inline
  def apply(
    container: String,
    content: String,
    description: String,
    icon: String,
    iconExpanded: String,
    title: String,
    titleExpandable: String
  ): IconExpanded = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconExpanded = iconExpanded.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleExpandable = titleExpandable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconExpanded]
  }
  @scala.inline
  implicit class IconExpandedOps[Self <: IconExpanded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconExpanded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleExpandable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleExpandable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

