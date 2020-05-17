package typingsSlinky.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewSelectorGroups extends js.Object {
  var DefaultView: ViewSelectorMenuItem = js.native
  var ModeratedViews: js.Any = js.native
  var OtherViews: js.Any = js.native
  var PersonalViews: js.Any = js.native
  var PublicViews: js.Any = js.native
  var ViewCreation: js.Any = js.native
}

object ViewSelectorGroups {
  @scala.inline
  def apply(
    DefaultView: ViewSelectorMenuItem,
    ModeratedViews: js.Any,
    OtherViews: js.Any,
    PersonalViews: js.Any,
    PublicViews: js.Any,
    ViewCreation: js.Any
  ): ViewSelectorGroups = {
    val __obj = js.Dynamic.literal(DefaultView = DefaultView.asInstanceOf[js.Any], ModeratedViews = ModeratedViews.asInstanceOf[js.Any], OtherViews = OtherViews.asInstanceOf[js.Any], PersonalViews = PersonalViews.asInstanceOf[js.Any], PublicViews = PublicViews.asInstanceOf[js.Any], ViewCreation = ViewCreation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSelectorGroups]
  }
  @scala.inline
  implicit class ViewSelectorGroupsOps[Self <: ViewSelectorGroups] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultView(value: ViewSelectorMenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModeratedViews(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModeratedViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherViews(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OtherViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonalViews(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonalViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicViews(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewCreation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewCreation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

