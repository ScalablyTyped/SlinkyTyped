package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HP extends js.Object {
  var CommonActions: String = js.native
  var CommonBody: String = js.native
  var CommonHeader: String = js.native
  var ids: HPIds = js.native
  var postActionEventName: String = js.native
  def Close(): Unit = js.native
  def Follow(): Unit = js.native
  def GetAuthorsHtml(): String = js.native
  def GetBodySectionContent(): String = js.native
  def GetBodySectionHeading(): String = js.native
  def GetEmailLink(title: String, path: String, client: String, url: String): String = js.native
  def GetFriendlyNameForFileType(fileType: js.Any): String = js.native
  def GetNowDateTimeDifference(): String = js.native
  def GetPeopleFollowingControl(): String = js.native
  def Hide(): Unit = js.native
  def Init(): Unit = js.native
  def InitPostLoad(): Unit = js.native
  def IsNumeric(): Boolean = js.native
  def Resize(): Unit = js.native
  def SetPreviewOnHideCallback(): Unit = js.native
  def SetWidth(width: Double): Unit = js.native
  def Show(): Unit = js.native
  def ViewDuplicates(): Boolean = js.native
  def getDateString(): String = js.native
  def getStringFromDate(): String = js.native
  def loadSiteViewer(id: String, idinner: String, idviewer: String, path: String, idglass: String): Unit = js.native
  def loadViewer(
    id: String,
    idinner: String,
    idviewer: String,
    idpreview: String,
    embedUrl: String,
    previewUrl: String
  ): Unit = js.native
}

object HP {
  @scala.inline
  def apply(
    Close: () => Unit,
    CommonActions: String,
    CommonBody: String,
    CommonHeader: String,
    Follow: () => Unit,
    GetAuthorsHtml: () => String,
    GetBodySectionContent: () => String,
    GetBodySectionHeading: () => String,
    GetEmailLink: (String, String, String, String) => String,
    GetFriendlyNameForFileType: js.Any => String,
    GetNowDateTimeDifference: () => String,
    GetPeopleFollowingControl: () => String,
    Hide: () => Unit,
    Init: () => Unit,
    InitPostLoad: () => Unit,
    IsNumeric: () => Boolean,
    Resize: () => Unit,
    SetPreviewOnHideCallback: () => Unit,
    SetWidth: Double => Unit,
    Show: () => Unit,
    ViewDuplicates: () => Boolean,
    getDateString: () => String,
    getStringFromDate: () => String,
    ids: HPIds,
    loadSiteViewer: (String, String, String, String, String) => Unit,
    loadViewer: (String, String, String, String, String, String) => Unit,
    postActionEventName: String
  ): HP = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), CommonActions = CommonActions.asInstanceOf[js.Any], CommonBody = CommonBody.asInstanceOf[js.Any], CommonHeader = CommonHeader.asInstanceOf[js.Any], Follow = js.Any.fromFunction0(Follow), GetAuthorsHtml = js.Any.fromFunction0(GetAuthorsHtml), GetBodySectionContent = js.Any.fromFunction0(GetBodySectionContent), GetBodySectionHeading = js.Any.fromFunction0(GetBodySectionHeading), GetEmailLink = js.Any.fromFunction4(GetEmailLink), GetFriendlyNameForFileType = js.Any.fromFunction1(GetFriendlyNameForFileType), GetNowDateTimeDifference = js.Any.fromFunction0(GetNowDateTimeDifference), GetPeopleFollowingControl = js.Any.fromFunction0(GetPeopleFollowingControl), Hide = js.Any.fromFunction0(Hide), Init = js.Any.fromFunction0(Init), InitPostLoad = js.Any.fromFunction0(InitPostLoad), IsNumeric = js.Any.fromFunction0(IsNumeric), Resize = js.Any.fromFunction0(Resize), SetPreviewOnHideCallback = js.Any.fromFunction0(SetPreviewOnHideCallback), SetWidth = js.Any.fromFunction1(SetWidth), Show = js.Any.fromFunction0(Show), ViewDuplicates = js.Any.fromFunction0(ViewDuplicates), getDateString = js.Any.fromFunction0(getDateString), getStringFromDate = js.Any.fromFunction0(getStringFromDate), ids = ids.asInstanceOf[js.Any], loadSiteViewer = js.Any.fromFunction5(loadSiteViewer), loadViewer = js.Any.fromFunction6(loadViewer), postActionEventName = postActionEventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HP]
  }
  @scala.inline
  implicit class HPOps[Self <: HP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCommonActions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Follow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAuthorsHtml(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAuthorsHtml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBodySectionContent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBodySectionContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBodySectionHeading(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBodySectionHeading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEmailLink(value: (String, String, String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetEmailLink")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetFriendlyNameForFileType(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFriendlyNameForFileType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNowDateTimeDifference(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNowDateTimeDifference")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPeopleFollowingControl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPeopleFollowingControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitPostLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitPostLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNumeric(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsNumeric")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPreviewOnHideCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetPreviewOnHideCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetWidth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withViewDuplicates(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewDuplicates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDateString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStringFromDate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStringFromDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIds(value: HPIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadSiteViewer(value: (String, String, String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSiteViewer")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withLoadViewer(value: (String, String, String, String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadViewer")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withPostActionEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postActionEventName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

