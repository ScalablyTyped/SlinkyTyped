package typingsSlinky.xrm.Xrm.Url

import typingsSlinky.xrm.XrmEnum.ViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for defining parameters on a request to open a view with main.aspx (as with
  * window.open). Useful for parsing the keys and values into a string of the format:
  * "&key=value".
  * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
  * @remarks  A member for "pagetype" is not provided.  The value "entitylist" is required in
  *           the URL, for views. Example:  "pagetype=entitylist"
  */
@js.native
trait ViewOpenParameters extends js.Object {
  /**
    * Controls whether the command bar is displayed.
    * @remarks **Accepted values are**:
    * * "true"    (The command bar is displayed.)
    * * "false"   (The command bar is not displayed.)
    */
  var cmdbar: js.UndefOr[CmdBarDisplay] = js.native
  /**
    * The logical name of the entity.
    */
  var etn: String = js.native
  /**
    * Controls whether the Navigation bar is displayed on the form.
    * @remarks **Accepted values are**:
    * * "on"      (The navigation bar is displayed.)
    * * "off"     (The navigation bar is not displayed.)
    * * "entity"  (On an entity form, only the navigation options for related entities are available.)
    */
  var navbar: js.UndefOr[NavBarDisplay] = js.native
  /**
    * The unique identifier of a view, in Guid format, which is valid for the entity described by
    * {@link etn}.
    */
  var viewid: String = js.native
  /**
    * The type of view identified by {@link viewid}.
    * @remarks **Accepted values are**:
    * * 1039    System View
    * * 4230    User View.
    */
  var viewtype: ViewType = js.native
}

object ViewOpenParameters {
  @scala.inline
  def apply(etn: String, viewid: String, viewtype: ViewType): ViewOpenParameters = {
    val __obj = js.Dynamic.literal(etn = etn.asInstanceOf[js.Any], viewid = viewid.asInstanceOf[js.Any], viewtype = viewtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOpenParameters]
  }
  @scala.inline
  implicit class ViewOpenParametersOps[Self <: ViewOpenParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewtype(value: ViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmdbar(value: CmdBarDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmdbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmdbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmdbar")(js.undefined)
        ret
    }
    @scala.inline
    def withNavbar(value: NavBarDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbar")(js.undefined)
        ret
    }
  }
  
}

