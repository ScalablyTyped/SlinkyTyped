package typingsSlinky.xrm.Xrm.Navigation

import typingsSlinky.xrm.xrmStrings.entitylist
import typingsSlinky.xrm.xrmStrings.savedquery
import typingsSlinky.xrm.xrmStrings.userquery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInputEntityList extends js.Object {
  /**
    * The logical name of the entity to load in the list control.
    * */
  var entityName: String = js.native
  var pageType: entitylist = js.native
  /**
    * The ID of the view to load. If you don't specify it, navigates to the default main view for the entity.
    * */
  var viewId: js.UndefOr[String] = js.native
  /**
    * Type of view to load. Specify "savedquery" or "userquery".
    * */
  var viewType: js.UndefOr[savedquery | userquery] = js.native
}

object PageInputEntityList {
  @scala.inline
  def apply(entityName: String, pageType: entitylist): PageInputEntityList = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], pageType = pageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInputEntityList]
  }
  @scala.inline
  implicit class PageInputEntityListOps[Self <: PageInputEntityList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageType(value: entitylist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewId")(js.undefined)
        ret
    }
    @scala.inline
    def withViewType(value: savedquery | userquery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(js.undefined)
        ret
    }
  }
  
}

