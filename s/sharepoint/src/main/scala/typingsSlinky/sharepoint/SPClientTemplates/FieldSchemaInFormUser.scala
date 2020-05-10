package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Number field in list form or in list view in grid mode */
@js.native
trait FieldSchemaInFormUser extends FieldSchemaInForm {
  var DefaultRender: Boolean = js.native
  var EntitySeparator: String = js.native
  /** Server relative Url for ~site/_layouts/listform.aspx */
  var ListFormUrl: String = js.native
  var PictureOnly: Boolean = js.native
  var PictureSize: String = js.native
  var Presence: Boolean = js.native
  /** Server relative Url for ~site/_layouts/userdisp.aspx */
  var UserDisplayUrl: String = js.native
  var WithPicture: Boolean = js.native
  var WithPictureDetail: Boolean = js.native
}

object FieldSchemaInFormUser {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    DefaultRender: Boolean,
    Description: String,
    Direction: String,
    EntitySeparator: String,
    FieldType: String,
    Hidden: Boolean,
    IMEMode: js.Any,
    Id: String,
    ListFormUrl: String,
    Name: String,
    PictureOnly: Boolean,
    PictureSize: String,
    Presence: Boolean,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    Title: String,
    Type: String,
    UseMinWidth: Boolean,
    UserDisplayUrl: String,
    WithPicture: Boolean,
    WithPictureDetail: Boolean
  ): FieldSchemaInFormUser = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], DefaultRender = DefaultRender.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], EntitySeparator = EntitySeparator.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ListFormUrl = ListFormUrl.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PictureOnly = PictureOnly.asInstanceOf[js.Any], PictureSize = PictureSize.asInstanceOf[js.Any], Presence = Presence.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any], UserDisplayUrl = UserDisplayUrl.asInstanceOf[js.Any], WithPicture = WithPicture.asInstanceOf[js.Any], WithPictureDetail = WithPictureDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInFormUser]
  }
  @scala.inline
  implicit class FieldSchemaInFormUserOps[Self <: FieldSchemaInFormUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntitySeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitySeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFormUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListFormUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Presence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserDisplayUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDisplayUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithPicture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithPicture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithPictureDetail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithPictureDetail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

