package typingsSlinky.sharepoint.global

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTable
import typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTableCollection
import typingsSlinky.sharepoint.SP.ClientRuntimeContext
import typingsSlinky.sharepoint.Srch.RenderFunction
import typingsSlinky.sharepoint.sharepointStrings.Body
import typingsSlinky.sharepoint.sharepointStrings.Group
import typingsSlinky.sharepoint.sharepointStrings.IsFirstPinnedResultBlock
import typingsSlinky.sharepoint.sharepointStrings.IsFirstRankedResultBlock
import typingsSlinky.sharepoint.sharepointStrings.Item
import typingsSlinky.sharepoint.sharepointStrings.ParentTableReference
import typingsSlinky.sharepoint.sharepointStrings.Properties
import typingsSlinky.sharepoint.sharepointStrings.QueryErrors
import typingsSlinky.sharepoint.sharepointStrings.QueryId
import typingsSlinky.sharepoint.sharepointStrings.QueryRuleId
import typingsSlinky.sharepoint.sharepointStrings.RenderTemplateId
import typingsSlinky.sharepoint.sharepointStrings.RenderTemplates
import typingsSlinky.sharepoint.sharepointStrings.ResultRows
import typingsSlinky.sharepoint.sharepointStrings.ResultTables
import typingsSlinky.sharepoint.sharepointStrings.RowCount
import typingsSlinky.sharepoint.sharepointStrings.TableType
import typingsSlinky.sharepoint.sharepointStrings.TotalRows
import typingsSlinky.sharepoint.sharepointStrings.TotalRowsIncludingDuplicates
import typingsSlinky.sharepoint.sharepointStrings.View
import typingsSlinky.sharepoint.sharepointStrings._deepLinks
import typingsSlinky.sharepoint.sharepointStrings._discussions
import typingsSlinky.sharepoint.sharepointStrings._group
import typingsSlinky.sharepoint.sharepointStrings._groupContent
import typingsSlinky.sharepoint.sharepointStrings._groupLink
import typingsSlinky.sharepoint.sharepointStrings._groupTitle
import typingsSlinky.sharepoint.sharepointStrings._hover
import typingsSlinky.sharepoint.sharepointStrings._item
import typingsSlinky.sharepoint.sharepointStrings._itemBody
import typingsSlinky.sharepoint.sharepointStrings._itemIcon
import typingsSlinky.sharepoint.sharepointStrings._itemPath
import typingsSlinky.sharepoint.sharepointStrings._itemPreview
import typingsSlinky.sharepoint.sharepointStrings._itemSummary
import typingsSlinky.sharepoint.sharepointStrings._itemTitle
import typingsSlinky.sharepoint.sharepointStrings._itemTitleLink
import typingsSlinky.sharepoint.sharepointStrings._likes
import typingsSlinky.sharepoint.sharepointStrings._members
import typingsSlinky.sharepoint.sharepointStrings._postInfo
import typingsSlinky.sharepoint.sharepointStrings._replies
import typingsSlinky.sharepoint.sharepointStrings._visualBestBet
import typingsSlinky.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ------- Srch namespace -------
object Srch {
  
  @JSGlobal("Srch.ClientControl")
  @js.native
  class ClientControl protected ()
    extends typingsSlinky.sharepoint.Srch.ClientControl {
    def this(elem: Element) = this()
  }
  object ClientControl {
    
    /** toggles visibility of children controls of the messageContainer */
    /* static member */
    @JSGlobal("Srch.ClientControl.toggleMessageDetails")
    @js.native
    def toggleMessageDetails(messageContainer: Element): Unit = js.native
  }
  
  @JSGlobal("Srch.DataProvider")
  @js.native
  class DataProvider protected ()
    extends typingsSlinky.sharepoint.Srch.DataProvider {
    def this(elem: Element) = this()
  }
  
  @JSGlobal("Srch.DateTimeKind")
  @js.native
  object DateTimeKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.Srch.DateTimeKind with Double] = js.native
    
    /* 2 */ val local: typingsSlinky.sharepoint.Srch.DateTimeKind.local with Double = js.native
    
    /* 0 */ val unspecified: typingsSlinky.sharepoint.Srch.DateTimeKind.unspecified with Double = js.native
    
    /* 1 */ val utc: typingsSlinky.sharepoint.Srch.DateTimeKind.utc with Double = js.native
  }
  
  @JSGlobal("Srch.DisplayControl")
  @js.native
  class DisplayControl ()
    extends typingsSlinky.sharepoint.Srch.DisplayControl
  
  @JSGlobal("Srch.EventType")
  @js.native
  object EventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.Srch.EventType with Double] = js.native
    
    /* 3 */ val batchQueryIssuing: typingsSlinky.sharepoint.Srch.EventType.batchQueryIssuing with Double = js.native
    
    /* 5 */ val batchResultReady: typingsSlinky.sharepoint.Srch.EventType.batchResultReady with Double = js.native
    
    /* 9 */ val load: typingsSlinky.sharepoint.Srch.EventType.load with Double = js.native
    
    /* 0 */ val none: typingsSlinky.sharepoint.Srch.EventType.none with Double = js.native
    
    /* 10 */ val postLoad: typingsSlinky.sharepoint.Srch.EventType.postLoad with Double = js.native
    
    /* 8 */ val preLoad: typingsSlinky.sharepoint.Srch.EventType.preLoad with Double = js.native
    
    /* 2 */ val queryIssuing: typingsSlinky.sharepoint.Srch.EventType.queryIssuing with Double = js.native
    
    /* 1 */ val queryReady: typingsSlinky.sharepoint.Srch.EventType.queryReady with Double = js.native
    
    /* 6 */ val queryStateChanged: typingsSlinky.sharepoint.Srch.EventType.queryStateChanged with Double = js.native
    
    /* 4 */ val resultReady: typingsSlinky.sharepoint.Srch.EventType.resultReady with Double = js.native
    
    /* 7 */ val resultRendered: typingsSlinky.sharepoint.Srch.EventType.resultRendered with Double = js.native
  }
  
  @JSGlobal("Srch.MessageLevel")
  @js.native
  object MessageLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.Srch.MessageLevel with Double] = js.native
    
    /* 2 */ val error: typingsSlinky.sharepoint.Srch.MessageLevel.error with Double = js.native
    
    /* 0 */ val information: typingsSlinky.sharepoint.Srch.MessageLevel.information with Double = js.native
    
    /* 1 */ val warning: typingsSlinky.sharepoint.Srch.MessageLevel.warning with Double = js.native
  }
  
  @JSGlobal("Srch.Refinement")
  @js.native
  class Refinement protected ()
    extends typingsSlinky.sharepoint.Srch.Refinement {
    def this(elem: Element) = this()
  }
  object Refinement {
    
    /* static member */
    @JSGlobal("Srch.Refinement.createRefinementTextbox")
    @js.native
    def createRefinementTextbox(name: String): Element = js.native
    
    /* static member */
    @JSGlobal("Srch.Refinement.ensureUserSpecifiedRefinerValueHasWhiteSpaceQuotes")
    @js.native
    def ensureUserSpecifiedRefinerValueHasWhiteSpaceQuotes(inputText: String): String = js.native
    
    /** Gets expanded state of the specified filter from cookie */
    /* static member */
    @JSGlobal("Srch.Refinement.getExpanded")
    @js.native
    def getExpanded(filterName: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.Refinement.getRefinementLocalizedTitle")
    @js.native
    def getRefinementLocalizedTitle(propertyName: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.Refinement.getRefinementTitle")
    @js.native
    def getRefinementTitle(currentRefinemntControl: typingsSlinky.sharepoint.Srch.RefinementControl): String = js.native
    
    /* static member */
    @JSGlobal("Srch.Refinement.multiRefinerSpecifyOtherFilterValue")
    @js.native
    def multiRefinerSpecifyOtherFilterValue(
      refinerName: String,
      clientControl: typingsSlinky.sharepoint.Srch.Refinement,
      useContains: Boolean,
      useKQL: Boolean
    ): Unit = js.native
    
    /** Save expanded state of the specified filter to cookie */
    /* static member */
    @JSGlobal("Srch.Refinement.setExpanded")
    @js.native
    def setExpanded(filterName: String, value: String): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.Refinement.submitMultiRefinement")
    @js.native
    def submitMultiRefinement(
      name: String,
      control: typingsSlinky.sharepoint.Srch.Refinement,
      useContains: Boolean,
      useKQL: Boolean
    ): Unit = js.native
  }
  
  @JSGlobal("Srch.RefinementControl")
  @js.native
  class RefinementControl protected ()
    extends typingsSlinky.sharepoint.Srch.RefinementControl {
    def this(propertyName: String, spec: String, renderTemplateId: String) = this()
  }
  
  @JSGlobal("Srch.RefinementUtil")
  @js.native
  class RefinementUtil ()
    extends typingsSlinky.sharepoint.Srch.RefinementUtil
  object RefinementUtil {
    
    /* static member */
    @JSGlobal("Srch.RefinementUtil.peoplePickerApplyIdPrefix")
    @js.native
    def peoplePickerApplyIdPrefix(control: typingsSlinky.sharepoint.Srch.ClientControl): String = js.native
    @JSGlobal("Srch.RefinementUtil.peoplePickerApplyIdPrefix")
    @js.native
    def peoplePickerApplyIdPrefix(control: typingsSlinky.sharepoint.Srch.RefinementControl): String = js.native
    
    /* static member */
    @JSGlobal("Srch.RefinementUtil.peoplePickerPrep")
    @js.native
    def peoplePickerPrep(
      id: String,
      refiner: typingsSlinky.sharepoint.Srch.RefinementControl,
      clientControl: typingsSlinky.sharepoint.Srch.Refinement
    ): String = js.native
    
    /* static member */
    @JSGlobal("Srch.RefinementUtil.stringValueToEqualsToken")
    @js.native
    def stringValueToEqualsToken(x: String): String = js.native
  }
  
  @JSGlobal("Srch.Res")
  @js.native
  class Res ()
    extends typingsSlinky.sharepoint.Srch.Res
  object Res {
    
    @JSGlobal("Srch.Res")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.ar_Explanation")
    @js.native
    def arExplanation: String = js.native
    
    @scala.inline
    def arExplanation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_Explanation")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_htv_Follow")
    @js.native
    def arHtvFollow: String = js.native
    
    @scala.inline
    def arHtvFollow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_htv_Follow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_htv_IsFollowed")
    @js.native
    def arHtvIsFollowed: String = js.native
    
    @scala.inline
    def arHtvIsFollowed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_htv_IsFollowed")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_htv_IsNotFollowed")
    @js.native
    def arHtvIsNotFollowed: String = js.native
    
    @scala.inline
    def arHtvIsNotFollowed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_htv_IsNotFollowed")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_htv_StartFollowing")
    @js.native
    def arHtvStartFollowing: String = js.native
    
    @scala.inline
    def arHtvStartFollowing_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_htv_StartFollowing")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_htv_StopFollowing")
    @js.native
    def arHtvStopFollowing: String = js.native
    
    @scala.inline
    def arHtvStopFollowing_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_htv_StopFollowing")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_rec_NoResults")
    @js.native
    def arRecNoResults: String = js.native
    
    @scala.inline
    def arRecNoResults_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_rec_NoResults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_CorrelationIdMessage")
    @js.native
    def ccErrCorrelationIdMessage: String = js.native
    
    @scala.inline
    def ccErrCorrelationIdMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_CorrelationIdMessage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_CustomLocStringWarningDisplayHeaderFormat")
    @js.native
    def ccErrCustomLocStringWarningDisplayHeaderFormat: String = js.native
    
    @scala.inline
    def ccErrCustomLocStringWarningDisplayHeaderFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_CustomLocStringWarningDisplayHeaderFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_DataErrorMessageDisplayHeader")
    @js.native
    def ccErrDataErrorMessageDisplayHeader: String = js.native
    
    @scala.inline
    def ccErrDataErrorMessageDisplayHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_DataErrorMessageDisplayHeader")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_HiddenWithNoResultsWarningMessage")
    @js.native
    def ccErrHiddenWithNoResultsWarningMessage: String = js.native
    
    @scala.inline
    def ccErrHiddenWithNoResultsWarningMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_HiddenWithNoResultsWarningMessage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_HideMessageDetails")
    @js.native
    def ccErrHideMessageDetails: String = js.native
    
    @scala.inline
    def ccErrHideMessageDetails_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_HideMessageDetails")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_MalformedHeader")
    @js.native
    def ccErrMalformedHeader: String = js.native
    
    @scala.inline
    def ccErrMalformedHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_MalformedHeader")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_NoCustomLoadedLocStringWarningDisplayHeaderFormat")
    @js.native
    def ccErrNoCustomLoadedLocStringWarningDisplayHeaderFormat: String = js.native
    
    @scala.inline
    def ccErrNoCustomLoadedLocStringWarningDisplayHeaderFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_NoCustomLoadedLocStringWarningDisplayHeaderFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_QueryThrottledDetailsHeader")
    @js.native
    def ccErrQueryThrottledDetailsHeader: String = js.native
    
    @scala.inline
    def ccErrQueryThrottledDetailsHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_QueryThrottledDetailsHeader")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_RenderingErrorMessageDisplayHeader")
    @js.native
    def ccErrRenderingErrorMessageDisplayHeader: String = js.native
    
    @scala.inline
    def ccErrRenderingErrorMessageDisplayHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_RenderingErrorMessageDisplayHeader")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_ShowMessageDetails")
    @js.native
    def ccErrShowMessageDetails: String = js.native
    
    @scala.inline
    def ccErrShowMessageDetails_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_ShowMessageDetails")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_TemplateNotFoundMessage")
    @js.native
    def ccErrTemplateNotFoundMessage: String = js.native
    
    @scala.inline
    def ccErrTemplateNotFoundMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_TemplateNotFoundMessage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_WebPartErrorMessageDisplayHeader")
    @js.native
    def ccErrWebPartErrorMessageDisplayHeader: String = js.native
    
    @scala.inline
    def ccErrWebPartErrorMessageDisplayHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_WebPartErrorMessageDisplayHeader")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list")
    @js.native
    def ccStsList: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_announcements")
    @js.native
    def ccStsListAnnouncements: String = js.native
    
    @scala.inline
    def ccStsListAnnouncements_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_announcements")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_contacts")
    @js.native
    def ccStsListContacts: String = js.native
    
    @scala.inline
    def ccStsListContacts_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_contacts")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_discussionboard")
    @js.native
    def ccStsListDiscussionboard: String = js.native
    
    @scala.inline
    def ccStsListDiscussionboard_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_discussionboard")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_documentlibrary")
    @js.native
    def ccStsListDocumentlibrary: String = js.native
    
    @scala.inline
    def ccStsListDocumentlibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_documentlibrary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_events")
    @js.native
    def ccStsListEvents: String = js.native
    
    @scala.inline
    def ccStsListEvents_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_events")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_links")
    @js.native
    def ccStsListLinks: String = js.native
    
    @scala.inline
    def ccStsListLinks_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_links")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_picturelibrary")
    @js.native
    def ccStsListPicturelibrary: String = js.native
    
    @scala.inline
    def ccStsListPicturelibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_picturelibrary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_survey")
    @js.native
    def ccStsListSurvey: String = js.native
    
    @scala.inline
    def ccStsListSurvey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_survey")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_tasks")
    @js.native
    def ccStsListTasks: String = js.native
    
    @scala.inline
    def ccStsListTasks_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_tasks")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_xmlform")
    @js.native
    def ccStsListXmlform: String = js.native
    
    @scala.inline
    def ccStsListXmlform_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_xmlform")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ccStsList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_listitem")
    @js.native
    def ccStsListitem: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_listitem_documentlibrary")
    @js.native
    def ccStsListitemDocumentlibrary: String = js.native
    
    @scala.inline
    def ccStsListitemDocumentlibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_listitem_documentlibrary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_listitem_picturelibrary")
    @js.native
    def ccStsListitemPicturelibrary: String = js.native
    
    @scala.inline
    def ccStsListitemPicturelibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_listitem_picturelibrary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ccStsListitem_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_listitem")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_site")
    @js.native
    def ccStsSite: String = js.native
    
    @scala.inline
    def ccStsSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_site")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_web")
    @js.native
    def ccStsWeb: String = js.native
    
    @scala.inline
    def ccStsWeb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_web")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_ValueRenderer_BooleanNo")
    @js.native
    def ccValueRendererBooleanNo: String = js.native
    
    @scala.inline
    def ccValueRendererBooleanNo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_ValueRenderer_BooleanNo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_ValueRenderer_BooleanYes")
    @js.native
    def ccValueRendererBooleanYes: String = js.native
    
    @scala.inline
    def ccValueRendererBooleanYes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_ValueRenderer_BooleanYes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_ValueRenderer_FileSizeGigabyte")
    @js.native
    def ccValueRendererFileSizeGigabyte: String = js.native
    
    @scala.inline
    def ccValueRendererFileSizeGigabyte_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_ValueRenderer_FileSizeGigabyte")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_ValueRenderer_FileSizeKilobyte")
    @js.native
    def ccValueRendererFileSizeKilobyte: String = js.native
    
    @scala.inline
    def ccValueRendererFileSizeKilobyte_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_ValueRenderer_FileSizeKilobyte")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_ValueRenderer_FileSizeMegabyte")
    @js.native
    def ccValueRendererFileSizeMegabyte: String = js.native
    
    @scala.inline
    def ccValueRendererFileSizeMegabyte_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_ValueRenderer_FileSizeMegabyte")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_Content_NoResultsDisplayMode")
    @js.native
    def controlContentNoResultsDisplayMode: String = js.native
    
    @scala.inline
    def controlContentNoResultsDisplayMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_Content_NoResultsDisplayMode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_Content_NoResultsEditMode")
    @js.native
    def controlContentNoResultsEditMode: String = js.native
    
    @scala.inline
    def controlContentNoResultsEditMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_Content_NoResultsEditMode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_Author")
    @js.native
    def controlEDiscAuthor: String = js.native
    
    @scala.inline
    def controlEDiscAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_Author")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_DateModified")
    @js.native
    def controlEDiscDateModified: String = js.native
    
    @scala.inline
    def controlEDiscDateModified_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_DateModified")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_DateSent")
    @js.native
    def controlEDiscDateSent: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_DateSentTooltip")
    @js.native
    def controlEDiscDateSentTooltip: String = js.native
    
    @scala.inline
    def controlEDiscDateSentTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_DateSentTooltip")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def controlEDiscDateSent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_DateSent")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_Recipients")
    @js.native
    def controlEDiscRecipients: String = js.native
    
    @scala.inline
    def controlEDiscRecipients_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_Recipients")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_Sender")
    @js.native
    def controlEDiscSender: String = js.native
    
    @scala.inline
    def controlEDiscSender_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_Sender")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_Subject")
    @js.native
    def controlEDiscSubject: String = js.native
    
    @scala.inline
    def controlEDiscSubject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_Subject")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_Title")
    @js.native
    def controlEDiscTitle: String = js.native
    
    @scala.inline
    def controlEDiscTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_Title")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_NoResultsDisplayMode")
    @js.native
    def controlNoResultsDisplayMode: String = js.native
    
    @scala.inline
    def controlNoResultsDisplayMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_NoResultsDisplayMode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_NoResultsEditMode")
    @js.native
    def controlNoResultsEditMode: String = js.native
    
    @scala.inline
    def controlNoResultsEditMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_NoResultsEditMode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_RollupPage_NoResultsDisplayMode")
    @js.native
    def controlRollupPageNoResultsDisplayMode: String = js.native
    
    @scala.inline
    def controlRollupPageNoResultsDisplayMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_RollupPage_NoResultsDisplayMode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ct_Folder")
    @js.native
    def ctFolder: String = js.native
    
    @scala.inline
    def ctFolder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ct_Folder")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ct_Image")
    @js.native
    def ctImage: String = js.native
    
    @scala.inline
    def ctImage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ct_Image")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.dp_ScriptLoadFailed")
    @js.native
    def dpScriptLoadFailed: String = js.native
    
    @scala.inline
    def dpScriptLoadFailed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dp_ScriptLoadFailed")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edisc_ControlPagingFormat")
    @js.native
    def ediscControlPagingFormat: String = js.native
    
    @scala.inline
    def ediscControlPagingFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edisc_ControlPagingFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edisc_MultiValueFormat")
    @js.native
    def ediscMultiValueFormat: String = js.native
    
    @scala.inline
    def ediscMultiValueFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edisc_MultiValueFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edisc_NoSubject")
    @js.native
    def ediscNoSubject: String = js.native
    
    @scala.inline
    def ediscNoSubject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edisc_NoSubject")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentCategory")
    @js.native
    def eduAssignmentCategory: String = js.native
    
    @scala.inline
    def eduAssignmentCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentCategory")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormat")
    @js.native
    def eduAssignmentFormat: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormatInClass")
    @js.native
    def eduAssignmentFormatInClass: String = js.native
    
    @scala.inline
    def eduAssignmentFormatInClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormatInClass")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormatNone")
    @js.native
    def eduAssignmentFormatNone: String = js.native
    
    @scala.inline
    def eduAssignmentFormatNone_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormatNone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormatOnlineFile")
    @js.native
    def eduAssignmentFormatOnlineFile: String = js.native
    
    @scala.inline
    def eduAssignmentFormatOnlineFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormatOnlineFile")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormatOnlineQuiz")
    @js.native
    def eduAssignmentFormatOnlineQuiz: String = js.native
    
    @scala.inline
    def eduAssignmentFormatOnlineQuiz_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormatOnlineQuiz")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormatUnknown")
    @js.native
    def eduAssignmentFormatUnknown: String = js.native
    
    @scala.inline
    def eduAssignmentFormatUnknown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormatUnknown")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def eduAssignmentFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentLabel")
    @js.native
    def eduAssignmentLabel: String = js.native
    
    @scala.inline
    def eduAssignmentLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentLabel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentMaxPoints")
    @js.native
    def eduAssignmentMaxPoints: String = js.native
    
    @scala.inline
    def eduAssignmentMaxPoints_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentMaxPoints")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookAuthor")
    @js.native
    def eduBookAuthor: String = js.native
    
    @scala.inline
    def eduBookAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookCategory")
    @js.native
    def eduBookCategory: String = js.native
    
    @scala.inline
    def eduBookCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookCategory")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookHomePageLink")
    @js.native
    def eduBookHomePageLink: String = js.native
    
    @scala.inline
    def eduBookHomePageLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookHomePageLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookLabel")
    @js.native
    def eduBookLabel: String = js.native
    
    @scala.inline
    def eduBookLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookLabel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookReleaseDate")
    @js.native
    def eduBookReleaseDate: String = js.native
    
    @scala.inline
    def eduBookReleaseDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookReleaseDate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookRights")
    @js.native
    def eduBookRights: String = js.native
    
    @scala.inline
    def eduBookRights_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookRights")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_Class")
    @js.native
    def eduClass: String = js.native
    
    @scala.inline
    def eduClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_Class")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_DueDate")
    @js.native
    def eduDueDate: String = js.native
    
    @scala.inline
    def eduDueDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_DueDate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_EnableScriptPermission")
    @js.native
    def eduEnableScriptPermission: String = js.native
    
    @scala.inline
    def eduEnableScriptPermission_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_EnableScriptPermission")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_LessonLabel")
    @js.native
    def eduLessonLabel: String = js.native
    
    @scala.inline
    def eduLessonLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_LessonLabel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_PrintPermission")
    @js.native
    def eduPrintPermission: String = js.native
    
    @scala.inline
    def eduPrintPermission_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_PrintPermission")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_ReadPermission")
    @js.native
    def eduReadPermission: String = js.native
    
    @scala.inline
    def eduReadPermission_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_ReadPermission")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_WritePermission")
    @js.native
    def eduWritePermission: String = js.native
    
    @scala.inline
    def eduWritePermission_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_WritePermission")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Access")
    @js.native
    def fileAccess: String = js.native
    
    @scala.inline
    def fileAccess_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Access")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Audio")
    @js.native
    def fileAudio: String = js.native
    
    @scala.inline
    def fileAudio_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Audio")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_CSS")
    @js.native
    def fileCSS: String = js.native
    
    @scala.inline
    def fileCSS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_CSS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Document")
    @js.native
    def fileDocument: String = js.native
    
    @scala.inline
    def fileDocument_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Document")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Excel")
    @js.native
    def fileExcel: String = js.native
    
    @scala.inline
    def fileExcel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Excel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Help")
    @js.native
    def fileHelp: String = js.native
    
    @scala.inline
    def fileHelp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Help")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_InfoPath")
    @js.native
    def fileInfoPath: String = js.native
    
    @scala.inline
    def fileInfoPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_InfoPath")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Installer")
    @js.native
    def fileInstaller: String = js.native
    
    @scala.inline
    def fileInstaller_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Installer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_JavaScript")
    @js.native
    def fileJavaScript: String = js.native
    
    @scala.inline
    def fileJavaScript_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_JavaScript")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Log")
    @js.native
    def fileLog: String = js.native
    
    @scala.inline
    def fileLog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Log")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Mail")
    @js.native
    def fileMail: String = js.native
    
    @scala.inline
    def fileMail_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Mail")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_OneNote")
    @js.native
    def fileOneNote: String = js.native
    
    @scala.inline
    def fileOneNote_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_OneNote")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_PowerPoint")
    @js.native
    def filePowerPoint: String = js.native
    
    @scala.inline
    def filePowerPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_PowerPoint")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Project")
    @js.native
    def fileProject: String = js.native
    
    @scala.inline
    def fileProject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Project")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Publisher")
    @js.native
    def filePublisher: String = js.native
    
    @scala.inline
    def filePublisher_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Publisher")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_RTF")
    @js.native
    def fileRTF: String = js.native
    
    @scala.inline
    def fileRTF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_RTF")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_SPDesigner")
    @js.native
    def fileSPDesigner: String = js.native
    
    @scala.inline
    def fileSPDesigner_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_SPDesigner")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Text")
    @js.native
    def fileText: String = js.native
    
    @scala.inline
    def fileText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Text")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Visio")
    @js.native
    def fileVisio: String = js.native
    
    @scala.inline
    def fileVisio_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Visio")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_WebPage")
    @js.native
    def fileWebPage: String = js.native
    
    @scala.inline
    def fileWebPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_WebPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Word")
    @js.native
    def fileWord: String = js.native
    
    @scala.inline
    def fileWord_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Word")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_XML")
    @js.native
    def fileXML: String = js.native
    
    @scala.inline
    def fileXML_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_XML")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_XPS")
    @js.native
    def fileXPS: String = js.native
    
    @scala.inline
    def fileXPS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_XPS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_XSL")
    @js.native
    def fileXSL: String = js.native
    
    @scala.inline
    def fileXSL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_XSL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Zip")
    @js.native
    def fileZip: String = js.native
    
    @scala.inline
    def fileZip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Zip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Alt_ImagePreview")
    @js.native
    def hpAltImagePreview: String = js.native
    
    @scala.inline
    def hpAltImagePreview_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Alt_ImagePreview")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Alt_SiteLogo")
    @js.native
    def hpAltSiteLogo: String = js.native
    
    @scala.inline
    def hpAltSiteLogo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Alt_SiteLogo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Authors2")
    @js.native
    def hpAuthors2: String = js.native
    
    @scala.inline
    def hpAuthors2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Authors2")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Authors3")
    @js.native
    def hpAuthors3: String = js.native
    
    @scala.inline
    def hpAuthors3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Authors3")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Authors4")
    @js.native
    def hpAuthors4: String = js.native
    
    @scala.inline
    def hpAuthors4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Authors4")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Authors5Plural")
    @js.native
    def hpAuthors5Plural: String = js.native
    
    @scala.inline
    def hpAuthors5Plural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Authors5Plural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Authors5Singular")
    @js.native
    def hpAuthors5Singular: String = js.native
    
    @scala.inline
    def hpAuthors5Singular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Authors5Singular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ChangedByAuthorDate")
    @js.native
    def hpChangedByAuthorDate: String = js.native
    
    @scala.inline
    def hpChangedByAuthorDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ChangedByAuthorDate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Community")
    @js.native
    def hpCommunity: String = js.native
    
    @scala.inline
    def hpCommunity_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Community")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_DateTaken")
    @js.native
    def hpDateTaken: String = js.native
    
    @scala.inline
    def hpDateTaken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_DateTaken")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Discussion")
    @js.native
    def hpDiscussion: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_DiscussionCategory")
    @js.native
    def hpDiscussionCategory: String = js.native
    
    @scala.inline
    def hpDiscussionCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_DiscussionCategory")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpDiscussion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Discussion")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Duration")
    @js.native
    def hpDuration: String = js.native
    
    @scala.inline
    def hpDuration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Duration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_EDisc_AttachmentsTooltip")
    @js.native
    def hpEDiscAttachmentsTooltip: String = js.native
    
    @scala.inline
    def hpEDiscAttachmentsTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_EDisc_AttachmentsTooltip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_EDisc_Bcc")
    @js.native
    def hpEDiscBcc: String = js.native
    
    @scala.inline
    def hpEDiscBcc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_EDisc_Bcc")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_EDisc_Cc")
    @js.native
    def hpEDiscCc: String = js.native
    
    @scala.inline
    def hpEDiscCc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_EDisc_Cc")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_EDisc_From")
    @js.native
    def hpEDiscFrom: String = js.native
    
    @scala.inline
    def hpEDiscFrom_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_EDisc_From")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_EDisc_To")
    @js.native
    def hpEDiscTo: String = js.native
    
    @scala.inline
    def hpEDiscTo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_EDisc_To")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Edit")
    @js.native
    def hpEdit: String = js.native
    
    @scala.inline
    def hpEdit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Edit")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Follow")
    @js.native
    def hpFollow: String = js.native
    
    @scala.inline
    def hpFollow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Follow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_GoToVideoPage")
    @js.native
    def hpGoToVideoPage: String = js.native
    
    @scala.inline
    def hpGoToVideoPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_GoToVideoPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_LastModified")
    @js.native
    def hpLastModified: String = js.native
    
    @scala.inline
    def hpLastModified_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_LastModified")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_MicroBlog")
    @js.native
    def hpMicroBlog: String = js.native
    
    @scala.inline
    def hpMicroBlog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_MicroBlog")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NoData")
    @js.native
    def hpNoData: String = js.native
    
    @scala.inline
    def hpNoData_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NoData")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_DaysAgo")
    @js.native
    def hpNowDateTimeDaysAgo: String = js.native
    
    @scala.inline
    def hpNowDateTimeDaysAgo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_DaysAgo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_MonthAgo")
    @js.native
    def hpNowDateTimeMonthAgo: String = js.native
    
    @scala.inline
    def hpNowDateTimeMonthAgo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_MonthAgo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_MonthsAgo")
    @js.native
    def hpNowDateTimeMonthsAgo: String = js.native
    
    @scala.inline
    def hpNowDateTimeMonthsAgo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_MonthsAgo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_Today")
    @js.native
    def hpNowDateTimeToday: String = js.native
    
    @scala.inline
    def hpNowDateTimeToday_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_Today")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_YearAgo")
    @js.native
    def hpNowDateTimeYearAgo: String = js.native
    
    @scala.inline
    def hpNowDateTimeYearAgo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_YearAgo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_YearsAgo")
    @js.native
    def hpNowDateTimeYearsAgo: String = js.native
    
    @scala.inline
    def hpNowDateTimeYearsAgo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_YearsAgo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_Yesterday")
    @js.native
    def hpNowDateTimeYesterday: String = js.native
    
    @scala.inline
    def hpNowDateTimeYesterday_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_Yesterday")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Open")
    @js.native
    def hpOpen: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_OpenInClient")
    @js.native
    def hpOpenInClient: String = js.native
    
    @scala.inline
    def hpOpenInClient_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_OpenInClient")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpOpen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Open")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_OriginalPost")
    @js.native
    def hpOriginalPost: String = js.native
    
    @scala.inline
    def hpOriginalPost_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_OriginalPost")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleInVideo")
    @js.native
    def hpPeopleInVideo: String = js.native
    
    @scala.inline
    def hpPeopleInVideo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleInVideo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Authorship")
    @js.native
    def hpPeopleItemAuthorship: String = js.native
    
    @scala.inline
    def hpPeopleItemAuthorship_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Authorship")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Interests")
    @js.native
    def hpPeopleItemInterests: String = js.native
    
    @scala.inline
    def hpPeopleItemInterests_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Interests")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Memberships")
    @js.native
    def hpPeopleItemMemberships: String = js.native
    
    @scala.inline
    def hpPeopleItemMemberships_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Memberships")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_MoreItems")
    @js.native
    def hpPeopleItemMoreItems: String = js.native
    
    @scala.inline
    def hpPeopleItemMoreItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_MoreItems")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_NoInformationAvailable")
    @js.native
    def hpPeopleItemNoInformationAvailable: String = js.native
    
    @scala.inline
    def hpPeopleItemNoInformationAvailable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_NoInformationAvailable")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_PastProjects")
    @js.native
    def hpPeopleItemPastProjects: String = js.native
    
    @scala.inline
    def hpPeopleItemPastProjects_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_PastProjects")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Related")
    @js.native
    def hpPeopleItemRelated: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_RelatedThrough")
    @js.native
    def hpPeopleItemRelatedThrough: String = js.native
    
    @scala.inline
    def hpPeopleItemRelatedThrough_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_RelatedThrough")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpPeopleItemRelated_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Related")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Schools")
    @js.native
    def hpPeopleItemSchools: String = js.native
    
    @scala.inline
    def hpPeopleItemSchools_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Schools")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Skills")
    @js.native
    def hpPeopleItemSkills: String = js.native
    
    @scala.inline
    def hpPeopleItemSkills_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Skills")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Summary")
    @js.native
    def hpPeopleItemSummary: String = js.native
    
    @scala.inline
    def hpPeopleItemSummary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Summary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_ViewProfile")
    @js.native
    def hpPeopleItemViewProfile: String = js.native
    
    @scala.inline
    def hpPeopleItemViewProfile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_ViewProfile")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PictureDimensions")
    @js.native
    def hpPictureDimensions: String = js.native
    
    @scala.inline
    def hpPictureDimensions_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PictureDimensions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PictureHeightWidth")
    @js.native
    def hpPictureHeightWidth: String = js.native
    
    @scala.inline
    def hpPictureHeightWidth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PictureHeightWidth")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularDiscussions")
    @js.native
    def hpPopularDiscussions: String = js.native
    
    @scala.inline
    def hpPopularDiscussions_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularDiscussions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Popularity")
    @js.native
    def hpPopularity: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularityLifeTimePlural")
    @js.native
    def hpPopularityLifeTimePlural: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularityLifeTimePluralAndRecentPlural")
    @js.native
    def hpPopularityLifeTimePluralAndRecentPlural: String = js.native
    
    @scala.inline
    def hpPopularityLifeTimePluralAndRecentPlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularityLifeTimePluralAndRecentPlural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularityLifeTimePluralAndRecentSingular")
    @js.native
    def hpPopularityLifeTimePluralAndRecentSingular: String = js.native
    
    @scala.inline
    def hpPopularityLifeTimePluralAndRecentSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularityLifeTimePluralAndRecentSingular")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpPopularityLifeTimePlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularityLifeTimePlural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularityLifeTimeSingular")
    @js.native
    def hpPopularityLifeTimeSingular: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularityLifeTimeSingularAndRecentSingular")
    @js.native
    def hpPopularityLifeTimeSingularAndRecentSingular: String = js.native
    
    @scala.inline
    def hpPopularityLifeTimeSingularAndRecentSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularityLifeTimeSingularAndRecentSingular")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpPopularityLifeTimeSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularityLifeTimeSingular")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpPopularity_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Popularity")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Post")
    @js.native
    def hpPost: String = js.native
    
    @scala.inline
    def hpPost_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Post")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PostedBy")
    @js.native
    def hpPostedBy: String = js.native
    
    @scala.inline
    def hpPostedBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PostedBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Preview_LoadingImgAlt")
    @js.native
    def hpPreviewLoadingImgAlt: String = js.native
    
    @scala.inline
    def hpPreviewLoadingImgAlt_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Preview_LoadingImgAlt")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_RecentReplies")
    @js.native
    def hpRecentReplies: String = js.native
    
    @scala.inline
    def hpRecentReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_RecentReplies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_RecentlyEdited")
    @js.native
    def hpRecentlyEdited: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_RecentlyEdited_eDiscovery")
    @js.native
    def hpRecentlyEditedEDiscovery: String = js.native
    
    @scala.inline
    def hpRecentlyEditedEDiscovery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_RecentlyEdited_eDiscovery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_RecentlyEdited_More")
    @js.native
    def hpRecentlyEditedMore: String = js.native
    
    @scala.inline
    def hpRecentlyEditedMore_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_RecentlyEdited_More")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpRecentlyEdited_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_RecentlyEdited")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Reply")
    @js.native
    def hpReply: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ReplyCategory")
    @js.native
    def hpReplyCategory: String = js.native
    
    @scala.inline
    def hpReplyCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ReplyCategory")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpReply_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Reply")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_SectionHeadings")
    @js.native
    def hpSectionHeadings: String = js.native
    
    @scala.inline
    def hpSectionHeadings_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_SectionHeadings")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send")
    @js.native
    def hpSend: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send_Open")
    @js.native
    def hpSendOpen: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send_OpenInClient")
    @js.native
    def hpSendOpenInClient: String = js.native
    
    @scala.inline
    def hpSendOpenInClient_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send_OpenInClient")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send_OpenInWeb")
    @js.native
    def hpSendOpenInWeb: String = js.native
    
    @scala.inline
    def hpSendOpenInWeb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send_OpenInWeb")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpSendOpen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send_Open")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send_Title")
    @js.native
    def hpSendTitle: String = js.native
    
    @scala.inline
    def hpSendTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send_Title")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send_ViewRelated")
    @js.native
    def hpSendViewRelated: String = js.native
    
    @scala.inline
    def hpSendViewRelated_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send_ViewRelated")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpSend_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_SiteDescription")
    @js.native
    def hpSiteDescription: String = js.native
    
    @scala.inline
    def hpSiteDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_SiteDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Size")
    @js.native
    def hpSize: String = js.native
    
    @scala.inline
    def hpSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Size")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Summary")
    @js.native
    def hpSummary: String = js.native
    
    @scala.inline
    def hpSummary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Summary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Close")
    @js.native
    def hpTooltipClose: String = js.native
    
    @scala.inline
    def hpTooltipClose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Close")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Contributors")
    @js.native
    def hpTooltipContributors: String = js.native
    
    @scala.inline
    def hpTooltipContributors_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Contributors")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Follow")
    @js.native
    def hpTooltipFollow: String = js.native
    
    @scala.inline
    def hpTooltipFollow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Follow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_LastModified")
    @js.native
    def hpTooltipLastModified: String = js.native
    
    @scala.inline
    def hpTooltipLastModified_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_LastModified")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Open")
    @js.native
    def hpTooltipOpen: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_OpenInClient")
    @js.native
    def hpTooltipOpenInClient: String = js.native
    
    @scala.inline
    def hpTooltipOpenInClient_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_OpenInClient")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpTooltipOpen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Open")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Post")
    @js.native
    def hpTooltipPost: String = js.native
    
    @scala.inline
    def hpTooltipPost_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Post")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_RecentlyEdited_More")
    @js.native
    def hpTooltipRecentlyEditedMore: String = js.native
    
    @scala.inline
    def hpTooltipRecentlyEditedMore_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_RecentlyEdited_More")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Send")
    @js.native
    def hpTooltipSend: String = js.native
    
    @scala.inline
    def hpTooltipSend_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Send")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_StopFollowing")
    @js.native
    def hpTooltipStopFollowing: String = js.native
    
    @scala.inline
    def hpTooltipStopFollowing_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_StopFollowing")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_ViewDuplicates")
    @js.native
    def hpTooltipViewDuplicates: String = js.native
    
    @scala.inline
    def hpTooltipViewDuplicates_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_ViewDuplicates")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_ViewLibrary")
    @js.native
    def hpTooltipViewLibrary: String = js.native
    
    @scala.inline
    def hpTooltipViewLibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_ViewLibrary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Views")
    @js.native
    def hpTooltipViews: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_ViewsLifeTime")
    @js.native
    def hpTooltipViewsLifeTime: String = js.native
    
    @scala.inline
    def hpTooltipViewsLifeTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_ViewsLifeTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_ViewsRecent")
    @js.native
    def hpTooltipViewsRecent: String = js.native
    
    @scala.inline
    def hpTooltipViewsRecent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_ViewsRecent")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hpTooltipViews_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Views")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_VideoDescription")
    @js.native
    def hpVideoDescription: String = js.native
    
    @scala.inline
    def hpVideoDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_VideoDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ViewConversation")
    @js.native
    def hpViewConversation: String = js.native
    
    @scala.inline
    def hpViewConversation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ViewConversation")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ViewDiscussion")
    @js.native
    def hpViewDiscussion: String = js.native
    
    @scala.inline
    def hpViewDiscussion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ViewDiscussion")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ViewDuplicates")
    @js.native
    def hpViewDuplicates: String = js.native
    
    @scala.inline
    def hpViewDuplicates_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ViewDuplicates")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ViewLibrary")
    @js.native
    def hpViewLibrary: String = js.native
    
    @scala.inline
    def hpViewLibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ViewLibrary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ViewsLifeTime")
    @js.native
    def hpViewsLifeTime: String = js.native
    
    @scala.inline
    def hpViewsLifeTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ViewsLifeTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Views_Plural")
    @js.native
    def hpViewsPlural: String = js.native
    
    @scala.inline
    def hpViewsPlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Views_Plural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Views_Singular")
    @js.native
    def hpViewsSingular: String = js.native
    
    @scala.inline
    def hpViewsSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Views_Singular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_VisitCommunity")
    @js.native
    def hpVisitCommunity: String = js.native
    
    @scala.inline
    def hpVisitCommunity_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_VisitCommunity")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_WebPageItem_MoreResults_Label")
    @js.native
    def hpWebPageItemMoreResultsLabel: String = js.native
    
    @scala.inline
    def hpWebPageItemMoreResultsLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_WebPageItem_MoreResults_Label")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_WebPageItem_Results")
    @js.native
    def hpWebPageItemResults: String = js.native
    
    @scala.inline
    def hpWebPageItemResults_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_WebPageItem_Results")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Alt_Preview")
    @js.native
    def itemAltPreview: String = js.native
    
    @scala.inline
    def itemAltPreview_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Alt_Preview")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_BestReply")
    @js.native
    def itemBestReply: String = js.native
    
    @scala.inline
    def itemBestReply_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_BestReply")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_Discussion")
    @js.native
    def itemCommunityDiscussion: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_DiscussionLabel")
    @js.native
    def itemCommunityDiscussionLabel: String = js.native
    
    @scala.inline
    def itemCommunityDiscussionLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_DiscussionLabel")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def itemCommunityDiscussion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_Discussion")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_Discussions")
    @js.native
    def itemCommunityDiscussions: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_DiscussionsLabel")
    @js.native
    def itemCommunityDiscussionsLabel: String = js.native
    
    @scala.inline
    def itemCommunityDiscussionsLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_DiscussionsLabel")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def itemCommunityDiscussions_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_Discussions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_Member")
    @js.native
    def itemCommunityMember: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_MemberLabel")
    @js.native
    def itemCommunityMemberLabel: String = js.native
    
    @scala.inline
    def itemCommunityMemberLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_MemberLabel")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def itemCommunityMember_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_Member")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_Members")
    @js.native
    def itemCommunityMembers: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_MembersLabel")
    @js.native
    def itemCommunityMembersLabel: String = js.native
    
    @scala.inline
    def itemCommunityMembersLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_MembersLabel")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def itemCommunityMembers_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_Members")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_Date")
    @js.native
    def itemCommunityPortalDate: String = js.native
    
    @scala.inline
    def itemCommunityPortalDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_Date")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_DetailsDiscussions")
    @js.native
    def itemCommunityPortalDetailsDiscussions: String = js.native
    
    @scala.inline
    def itemCommunityPortalDetailsDiscussions_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_DetailsDiscussions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_DetailsIntervals")
    @js.native
    def itemCommunityPortalDetailsIntervals: String = js.native
    
    @scala.inline
    def itemCommunityPortalDetailsIntervals_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_DetailsIntervals")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_DetailsMembers")
    @js.native
    def itemCommunityPortalDetailsMembers: String = js.native
    
    @scala.inline
    def itemCommunityPortalDetailsMembers_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_DetailsMembers")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_DetailsReplies")
    @js.native
    def itemCommunityPortalDetailsReplies: String = js.native
    
    @scala.inline
    def itemCommunityPortalDetailsReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_DetailsReplies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_MoreDetails")
    @js.native
    def itemCommunityPortalMoreDetails: String = js.native
    
    @scala.inline
    def itemCommunityPortalMoreDetails_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_MoreDetails")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Content_GenericNoImageSymbol")
    @js.native
    def itemContentGenericNoImageSymbol: String = js.native
    
    @scala.inline
    def itemContentGenericNoImageSymbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Content_GenericNoImageSymbol")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CopyLink")
    @js.native
    def itemCopyLink: String = js.native
    
    @scala.inline
    def itemCopyLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CopyLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_DefaultTitle")
    @js.native
    def itemDefaultTitle: String = js.native
    
    @scala.inline
    def itemDefaultTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_DefaultTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_ItemTitleFormat")
    @js.native
    def itemDiagnosticItemTitleFormat: String = js.native
    
    @scala.inline
    def itemDiagnosticItemTitleFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_ItemTitleFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_MappedManagedProperty")
    @js.native
    def itemDiagnosticMappedManagedProperty: String = js.native
    
    @scala.inline
    def itemDiagnosticMappedManagedProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_MappedManagedProperty")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_PathSlot")
    @js.native
    def itemDiagnosticPathSlot: String = js.native
    
    @scala.inline
    def itemDiagnosticPathSlot_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_PathSlot")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_PictureSlot")
    @js.native
    def itemDiagnosticPictureSlot: String = js.native
    
    @scala.inline
    def itemDiagnosticPictureSlot_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_PictureSlot")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_Preview")
    @js.native
    def itemDiagnosticPreview: String = js.native
    
    @scala.inline
    def itemDiagnosticPreview_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_Preview")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_PropertyMappings")
    @js.native
    def itemDiagnosticPropertyMappings: String = js.native
    
    @scala.inline
    def itemDiagnosticPropertyMappings_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_PropertyMappings")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_SlotNameFormat")
    @js.native
    def itemDiagnosticSlotNameFormat: String = js.native
    
    @scala.inline
    def itemDiagnosticSlotNameFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_SlotNameFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_Value")
    @js.native
    def itemDiagnosticValue: String = js.native
    
    @scala.inline
    def itemDiagnosticValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_Value")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Generic_OpenCalloutTooltip")
    @js.native
    def itemGenericOpenCalloutTooltip: String = js.native
    
    @scala.inline
    def itemGenericOpenCalloutTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Generic_OpenCalloutTooltip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Like")
    @js.native
    def itemLike: String = js.native
    
    @scala.inline
    def itemLike_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Like")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Likes")
    @js.native
    def itemLikes: String = js.native
    
    @scala.inline
    def itemLikes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Likes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_Like")
    @js.native
    def itemMicroBlogLike: String = js.native
    
    @scala.inline
    def itemMicroBlogLike_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_Like")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_Likes")
    @js.native
    def itemMicroBlogLikes: String = js.native
    
    @scala.inline
    def itemMicroBlogLikes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_Likes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_NoReplies")
    @js.native
    def itemMicroBlogNoReplies: String = js.native
    
    @scala.inline
    def itemMicroBlogNoReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_NoReplies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_Replies")
    @js.native
    def itemMicroBlogReplies: String = js.native
    
    @scala.inline
    def itemMicroBlogReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_Replies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_Reply")
    @js.native
    def itemMicroBlogReply: String = js.native
    
    @scala.inline
    def itemMicroBlogReply_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_Reply")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_RootPostTitle")
    @js.native
    def itemMicroBlogRootPostTitle: String = js.native
    
    @scala.inline
    def itemMicroBlogRootPostTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_RootPostTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_SeeFullConversation")
    @js.native
    def itemMicroBlogSeeFullConversation: String = js.native
    
    @scala.inline
    def itemMicroBlogSeeFullConversation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_SeeFullConversation")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MoreThan")
    @js.native
    def itemMoreThan: String = js.native
    
    @scala.inline
    def itemMoreThan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MoreThan")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_NoImageMessage")
    @js.native
    def itemNoImageMessage: String = js.native
    
    @scala.inline
    def itemNoImageMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_NoImageMessage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_NoLikes")
    @js.native
    def itemNoLikes: String = js.native
    
    @scala.inline
    def itemNoLikes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_NoLikes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_NoReplies")
    @js.native
    def itemNoReplies: String = js.native
    
    @scala.inline
    def itemNoReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_NoReplies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_EditProfileLink")
    @js.native
    def itemPeopleEditProfileLink: String = js.native
    
    @scala.inline
    def itemPeopleEditProfileLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_EditProfileLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_Interests")
    @js.native
    def itemPeopleInterests: String = js.native
    
    @scala.inline
    def itemPeopleInterests_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_Interests")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_LastModified")
    @js.native
    def itemPeopleLastModified: String = js.native
    
    @scala.inline
    def itemPeopleLastModified_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_LastModified")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_Memberships")
    @js.native
    def itemPeopleMemberships: String = js.native
    
    @scala.inline
    def itemPeopleMemberships_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_Memberships")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_NoPresenceAvailable")
    @js.native
    def itemPeopleNoPresenceAvailable: String = js.native
    
    @scala.inline
    def itemPeopleNoPresenceAvailable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_NoPresenceAvailable")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_PastProjects")
    @js.native
    def itemPeoplePastProjects: String = js.native
    
    @scala.inline
    def itemPeoplePastProjects_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_PastProjects")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_Responsibilities")
    @js.native
    def itemPeopleResponsibilities: String = js.native
    
    @scala.inline
    def itemPeopleResponsibilities_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_Responsibilities")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_Schools")
    @js.native
    def itemPeopleSchools: String = js.native
    
    @scala.inline
    def itemPeopleSchools_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_Schools")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchFrequency")
    @js.native
    def itemPeopleSelfSearchFrequency: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchFrequency_ViewsMonths_Plural")
    @js.native
    def itemPeopleSelfSearchFrequencyViewsMonthsPlural: String = js.native
    
    @scala.inline
    def itemPeopleSelfSearchFrequencyViewsMonthsPlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchFrequency_ViewsMonths_Plural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchFrequency_ViewsMonths_Singular")
    @js.native
    def itemPeopleSelfSearchFrequencyViewsMonthsSingular: String = js.native
    
    @scala.inline
    def itemPeopleSelfSearchFrequencyViewsMonthsSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchFrequency_ViewsMonths_Singular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchFrequency_ViewsWeeks_Plural")
    @js.native
    def itemPeopleSelfSearchFrequencyViewsWeeksPlural: String = js.native
    
    @scala.inline
    def itemPeopleSelfSearchFrequencyViewsWeeksPlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchFrequency_ViewsWeeks_Plural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchFrequency_ViewsWeeks_Singular")
    @js.native
    def itemPeopleSelfSearchFrequencyViewsWeeksSingular: String = js.native
    
    @scala.inline
    def itemPeopleSelfSearchFrequencyViewsWeeksSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchFrequency_ViewsWeeks_Singular")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def itemPeopleSelfSearchFrequency_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchFrequency")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchKeywords")
    @js.native
    def itemPeopleSelfSearchKeywords: String = js.native
    
    @scala.inline
    def itemPeopleSelfSearchKeywords_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchKeywords")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_Skills")
    @js.native
    def itemPeopleSkills: String = js.native
    
    @scala.inline
    def itemPeopleSkills_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_Skills")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_postAuthor")
    @js.native
    def itemPostAuthor: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_postAuthorDate")
    @js.native
    def itemPostAuthorDate: String = js.native
    
    @scala.inline
    def itemPostAuthorDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_postAuthorDate")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def itemPostAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_postAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_postDate")
    @js.native
    def itemPostDate: String = js.native
    
    @scala.inline
    def itemPostDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_postDate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Replies")
    @js.native
    def itemReplies: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_RepliesAndLikes")
    @js.native
    def itemRepliesAndLikes: String = js.native
    
    @scala.inline
    def itemRepliesAndLikes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_RepliesAndLikes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_RepliesLabel")
    @js.native
    def itemRepliesLabel: String = js.native
    
    @scala.inline
    def itemRepliesLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_RepliesLabel")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def itemReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Replies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Reply")
    @js.native
    def itemReply: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_replyAuthor")
    @js.native
    def itemReplyAuthor: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_replyAuthorDate")
    @js.native
    def itemReplyAuthorDate: String = js.native
    
    @scala.inline
    def itemReplyAuthorDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_replyAuthorDate")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def itemReplyAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_replyAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_replyDate")
    @js.native
    def itemReplyDate: String = js.native
    
    @scala.inline
    def itemReplyDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_replyDate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_ReplyLabel")
    @js.native
    def itemReplyLabel: String = js.native
    
    @scala.inline
    def itemReplyLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_ReplyLabel")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def itemReply_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Reply")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Tooltip_CopyLink")
    @js.native
    def itemTooltipCopyLink: String = js.native
    
    @scala.inline
    def itemTooltipCopyLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Tooltip_CopyLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.pkr_CatalogPickerMoreLink")
    @js.native
    def pkrCatalogPickerMoreLink: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.pkr_CatalogPickerMoreLinkToolTip")
    @js.native
    def pkrCatalogPickerMoreLinkToolTip: String = js.native
    
    @scala.inline
    def pkrCatalogPickerMoreLinkToolTip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pkr_CatalogPickerMoreLinkToolTip")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def pkrCatalogPickerMoreLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pkr_CatalogPickerMoreLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.pkr_CatalogPickerSelectLinkToolTip")
    @js.native
    def pkrCatalogPickerSelectLinkToolTip: String = js.native
    
    @scala.inline
    def pkrCatalogPickerSelectLinkToolTip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pkr_CatalogPickerSelectLinkToolTip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_CatalogPicker_Title")
    @js.native
    def qbCatalogPickerTitle: String = js.native
    
    @scala.inline
    def qbCatalogPickerTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_CatalogPicker_Title")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ComplexObject")
    @js.native
    def qbComplexObject: String = js.native
    
    @scala.inline
    def qbComplexObject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ComplexObject")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Article")
    @js.native
    def qbContentTypeArticle: String = js.native
    
    @scala.inline
    def qbContentTypeArticle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Article")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Audio")
    @js.native
    def qbContentTypeAudio: String = js.native
    
    @scala.inline
    def qbContentTypeAudio_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Audio")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_DocSet")
    @js.native
    def qbContentTypeDocSet: String = js.native
    
    @scala.inline
    def qbContentTypeDocSet_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_DocSet")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Page")
    @js.native
    def qbContentTypePage: String = js.native
    
    @scala.inline
    def qbContentTypePage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Page")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Picture")
    @js.native
    def qbContentTypePicture: String = js.native
    
    @scala.inline
    def qbContentTypePicture_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Picture")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Report")
    @js.native
    def qbContentTypeReport: String = js.native
    
    @scala.inline
    def qbContentTypeReport_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Report")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Task")
    @js.native
    def qbContentTypeTask: String = js.native
    
    @scala.inline
    def qbContentTypeTask_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Task")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Video")
    @js.native
    def qbContentTypeVideo: String = js.native
    
    @scala.inline
    def qbContentTypeVideo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Video")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_WikiPage")
    @js.native
    def qbContentTypeWikiPage: String = js.native
    
    @scala.inline
    def qbContentTypeWikiPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_WikiPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Error_SourceIdInvalid")
    @js.native
    def qbErrorSourceIdInvalid: String = js.native
    
    @scala.inline
    def qbErrorSourceIdInvalid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Error_SourceIdInvalid")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_FallbackResultTitle")
    @js.native
    def qbFallbackResultTitle: String = js.native
    
    @scala.inline
    def qbFallbackResultTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_FallbackResultTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_FillInKeywords")
    @js.native
    def qbFillInKeywords: String = js.native
    
    @scala.inline
    def qbFillInKeywords_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_FillInKeywords")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_FillInPopular")
    @js.native
    def qbFillInPopular: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_FillInPopularScope")
    @js.native
    def qbFillInPopularScope: String = js.native
    
    @scala.inline
    def qbFillInPopularScope_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_FillInPopularScope")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def qbFillInPopular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_FillInPopular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_GetFillIn")
    @js.native
    def qbGetFillIn: String = js.native
    
    @scala.inline
    def qbGetFillIn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_GetFillIn")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_GetRecItems")
    @js.native
    def qbGetRecItems: String = js.native
    
    @scala.inline
    def qbGetRecItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_GetRecItems")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_NoCollapseString")
    @js.native
    def qbNoCollapseString: String = js.native
    
    @scala.inline
    def qbNoCollapseString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_NoCollapseString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_NotApplicable")
    @js.native
    def qbNotApplicable: String = js.native
    
    @scala.inline
    def qbNotApplicable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_NotApplicable")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_Catalog")
    @js.native
    def qbPathCatalog: String = js.native
    
    @scala.inline
    def qbPathCatalog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_Catalog")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseQueryString")
    @js.native
    def qbPathControlChooseQueryString: String = js.native
    
    @scala.inline
    def qbPathControlChooseQueryString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseQueryString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseTag")
    @js.native
    def qbPathControlChooseTag: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseTag_None")
    @js.native
    def qbPathControlChooseTagNone: String = js.native
    
    @scala.inline
    def qbPathControlChooseTagNone_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseTag_None")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseTag_SubTopic")
    @js.native
    def qbPathControlChooseTagSubTopic: String = js.native
    
    @scala.inline
    def qbPathControlChooseTagSubTopic_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseTag_SubTopic")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseTag_ThisTag")
    @js.native
    def qbPathControlChooseTagThisTag: String = js.native
    
    @scala.inline
    def qbPathControlChooseTagThisTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseTag_ThisTag")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseTag_Topic")
    @js.native
    def qbPathControlChooseTagTopic: String = js.native
    
    @scala.inline
    def qbPathControlChooseTagTopic_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseTag_Topic")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def qbPathControlChooseTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseTag")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseURL")
    @js.native
    def qbPathControlChooseURL: String = js.native
    
    @scala.inline
    def qbPathControlChooseURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseURL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_List")
    @js.native
    def qbPathList: String = js.native
    
    @scala.inline
    def qbPathList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_List")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_None")
    @js.native
    def qbPathNone: String = js.native
    
    @scala.inline
    def qbPathNone_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_None")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_Page")
    @js.native
    def qbPathPage: String = js.native
    
    @scala.inline
    def qbPathPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_Page")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_QueryString")
    @js.native
    def qbPathQueryString: String = js.native
    
    @scala.inline
    def qbPathQueryString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_QueryString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_Site")
    @js.native
    def qbPathSite: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_SiteCollection")
    @js.native
    def qbPathSiteCollection: String = js.native
    
    @scala.inline
    def qbPathSiteCollection_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_SiteCollection")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def qbPathSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_Site")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_URL")
    @js.native
    def qbPathURL: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_URL_token")
    @js.native
    def qbPathURLToken: String = js.native
    
    @scala.inline
    def qbPathURLToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_URL_token")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def qbPathURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_URL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PreviewResult_CouldNotResolveTemplateVariables")
    @js.native
    def qbPreviewResultCouldNotResolveTemplateVariables: String = js.native
    
    @scala.inline
    def qbPreviewResultCouldNotResolveTemplateVariables_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PreviewResult_CouldNotResolveTemplateVariables")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PreviewResult_EmptyQuery")
    @js.native
    def qbPreviewResultEmptyQuery: String = js.native
    
    @scala.inline
    def qbPreviewResultEmptyQuery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PreviewResult_EmptyQuery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PreviewResult_ErrorExpandTokens")
    @js.native
    def qbPreviewResultErrorExpandTokens: String = js.native
    
    @scala.inline
    def qbPreviewResultErrorExpandTokens_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PreviewResult_ErrorExpandTokens")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PreviewResult_NoTemplateVariables")
    @js.native
    def qbPreviewResultNoTemplateVariables: String = js.native
    
    @scala.inline
    def qbPreviewResultNoTemplateVariables_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PreviewResult_NoTemplateVariables")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_Catalog")
    @js.native
    def qbQueryTypeCatalog: String = js.native
    
    @scala.inline
    def qbQueryTypeCatalog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_Catalog")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_ContentType")
    @js.native
    def qbQueryTypeContentType: String = js.native
    
    @scala.inline
    def qbQueryTypeContentType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_ContentType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_Latest")
    @js.native
    def qbQueryTypeLatest: String = js.native
    
    @scala.inline
    def qbQueryTypeLatest_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_Latest")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_Popular")
    @js.native
    def qbQueryTypePopular: String = js.native
    
    @scala.inline
    def qbQueryTypePopular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_Popular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_RecommendedItems")
    @js.native
    def qbQueryTypeRecommendedItems: String = js.native
    
    @scala.inline
    def qbQueryTypeRecommendedItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_RecommendedItems")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_UserQuery")
    @js.native
    def qbQueryTypeUserQuery: String = js.native
    
    @scala.inline
    def qbQueryTypeUserQuery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_UserQuery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_Video")
    @js.native
    def qbQueryTypeVideo: String = js.native
    
    @scala.inline
    def qbQueryTypeVideo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_Video")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_RecsFromURLToken")
    @js.native
    def qbRecsFromURLToken: String = js.native
    
    @scala.inline
    def qbRecsFromURLToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_RecsFromURLToken")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Remove")
    @js.native
    def qbRemove: String = js.native
    
    @scala.inline
    def qbRemove_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Remove")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ScopeRecItems")
    @js.native
    def qbScopeRecItems: String = js.native
    
    @scala.inline
    def qbScopeRecItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ScopeRecItems")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ShowAllCollapseString")
    @js.native
    def qbShowAllCollapseString: String = js.native
    
    @scala.inline
    def qbShowAllCollapseString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ShowAllCollapseString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ShowRecsOnly")
    @js.native
    def qbShowRecsOnly: String = js.native
    
    @scala.inline
    def qbShowRecsOnly_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ShowRecsOnly")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ShowRefinersOnly")
    @js.native
    def qbShowRefinersOnly: String = js.native
    
    @scala.inline
    def qbShowRefinersOnly_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ShowRefinersOnly")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_SortTab_ChangeRankingWhen")
    @js.native
    def qbSortTabChangeRankingWhen: String = js.native
    
    @scala.inline
    def qbSortTabChangeRankingWhen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_SortTab_ChangeRankingWhen")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_SortTab_OrWhen")
    @js.native
    def qbSortTabOrWhen: String = js.native
    
    @scala.inline
    def qbSortTabOrWhen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_SortTab_OrWhen")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_SortTab_ThenBy")
    @js.native
    def qbSortTabThenBy: String = js.native
    
    @scala.inline
    def qbSortTabThenBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_SortTab_ThenBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Tab_FilterBy")
    @js.native
    def qbTabFilterBy: String = js.native
    
    @scala.inline
    def qbTabFilterBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Tab_FilterBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Tab_QueryHelper")
    @js.native
    def qbTabQueryHelper: String = js.native
    
    @scala.inline
    def qbTabQueryHelper_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Tab_QueryHelper")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Tab_Settings")
    @js.native
    def qbTabSettings: String = js.native
    
    @scala.inline
    def qbTabSettings_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Tab_Settings")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Tab_SortBy")
    @js.native
    def qbTabSortBy: String = js.native
    
    @scala.inline
    def qbTabSortBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Tab_SortBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Tab_TestQuery")
    @js.native
    def qbTabTestQuery: String = js.native
    
    @scala.inline
    def qbTabTestQuery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Tab_TestQuery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_TestQueryTab_HideAdvanced")
    @js.native
    def qbTestQueryTabHideAdvanced: String = js.native
    
    @scala.inline
    def qbTestQueryTabHideAdvanced_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_TestQueryTab_HideAdvanced")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_TestQueryTab_ShowAdvanced")
    @js.native
    def qbTestQueryTabShowAdvanced: String = js.native
    
    @scala.inline
    def qbTestQueryTabShowAdvanced_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_TestQueryTab_ShowAdvanced")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Contains")
    @js.native
    def qbTokenContains: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_ContainsStartsWith")
    @js.native
    def qbTokenContainsStartsWith: String = js.native
    
    @scala.inline
    def qbTokenContainsStartsWith_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_ContainsStartsWith")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def qbTokenContains_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Contains")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Date")
    @js.native
    def qbTokenDate: String = js.native
    
    @scala.inline
    def qbTokenDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Date")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_DisplayLanguage")
    @js.native
    def qbTokenDisplayLanguage: String = js.native
    
    @scala.inline
    def qbTokenDisplayLanguage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_DisplayLanguage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Equals")
    @js.native
    def qbTokenEquals: String = js.native
    
    @scala.inline
    def qbTokenEquals_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Equals")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_GreaterThan")
    @js.native
    def qbTokenGreaterThan: String = js.native
    
    @scala.inline
    def qbTokenGreaterThan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_GreaterThan")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_LessThan")
    @js.native
    def qbTokenLessThan: String = js.native
    
    @scala.inline
    def qbTokenLessThan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_LessThan")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_NotContains")
    @js.native
    def qbTokenNotContains: String = js.native
    
    @scala.inline
    def qbTokenNotContains_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_NotContains")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_NotEquals")
    @js.native
    def qbTokenNotEquals: String = js.native
    
    @scala.inline
    def qbTokenNotEquals_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_NotEquals")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_NotStartsWith")
    @js.native
    def qbTokenNotStartsWith: String = js.native
    
    @scala.inline
    def qbTokenNotStartsWith_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_NotStartsWith")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_OnlyListItems")
    @js.native
    def qbTokenOnlyListItems: String = js.native
    
    @scala.inline
    def qbTokenOnlyListItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_OnlyListItems")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_OnlyLists")
    @js.native
    def qbTokenOnlyLists: String = js.native
    
    @scala.inline
    def qbTokenOnlyLists_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_OnlyLists")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_OnlySites")
    @js.native
    def qbTokenOnlySites: String = js.native
    
    @scala.inline
    def qbTokenOnlySites_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_OnlySites")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Page")
    @js.native
    def qbTokenPage: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_PageField")
    @js.native
    def qbTokenPageField: String = js.native
    
    @scala.inline
    def qbTokenPageField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_PageField")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def qbTokenPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Page")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_PreferredContentLanguage")
    @js.native
    def qbTokenPreferredContentLanguage: String = js.native
    
    @scala.inline
    def qbTokenPreferredContentLanguage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_PreferredContentLanguage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_QueryString")
    @js.native
    def qbTokenQueryString: String = js.native
    
    @scala.inline
    def qbTokenQueryString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_QueryString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_SearchBoxQuery")
    @js.native
    def qbTokenSearchBoxQuery: String = js.native
    
    @scala.inline
    def qbTokenSearchBoxQuery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_SearchBoxQuery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_SearchTerms")
    @js.native
    def qbTokenSearchTerms: String = js.native
    
    @scala.inline
    def qbTokenSearchTerms_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_SearchTerms")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Site")
    @js.native
    def qbTokenSite: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_SiteColletion")
    @js.native
    def qbTokenSiteColletion: String = js.native
    
    @scala.inline
    def qbTokenSiteColletion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_SiteColletion")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_SiteLocale")
    @js.native
    def qbTokenSiteLocale: String = js.native
    
    @scala.inline
    def qbTokenSiteLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_SiteLocale")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def qbTokenSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Site")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_StartsWith")
    @js.native
    def qbTokenStartsWith: String = js.native
    
    @scala.inline
    def qbTokenStartsWith_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_StartsWith")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Topic")
    @js.native
    def qbTokenTopic: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_TopicIdWithChildren")
    @js.native
    def qbTokenTopicIdWithChildren: String = js.native
    
    @scala.inline
    def qbTokenTopicIdWithChildren_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_TopicIdWithChildren")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def qbTokenTopic_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Topic")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_URLToken")
    @js.native
    def qbTokenURLToken: String = js.native
    
    @scala.inline
    def qbTokenURLToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_URLToken")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_UserName")
    @js.native
    def qbTokenUserName: String = js.native
    
    @scala.inline
    def qbTokenUserName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_UserName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UseDefinedSort")
    @js.native
    def qbUseDefinedSort: String = js.native
    
    @scala.inline
    def qbUseDefinedSort_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UseDefinedSort")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_AddAdditionalFilter")
    @js.native
    def qbUserQueryAddAdditionalFilter: String = js.native
    
    @scala.inline
    def qbUserQueryAddAdditionalFilter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_AddAdditionalFilter")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_AddToken")
    @js.native
    def qbUserQueryAddToken: String = js.native
    
    @scala.inline
    def qbUserQueryAddToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_AddToken")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_ChooseContentType")
    @js.native
    def qbUserQueryChooseContentType: String = js.native
    
    @scala.inline
    def qbUserQueryChooseContentType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_ChooseContentType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_ChooseSort")
    @js.native
    def qbUserQueryChooseSort: String = js.native
    
    @scala.inline
    def qbUserQueryChooseSort_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_ChooseSort")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_ConfigureCatalog")
    @js.native
    def qbUserQueryConfigureCatalog: String = js.native
    
    @scala.inline
    def qbUserQueryConfigureCatalog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_ConfigureCatalog")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_ManualValue")
    @js.native
    def qbUserQueryManualValue: String = js.native
    
    @scala.inline
    def qbUserQueryManualValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_ManualValue")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_PickCatalog2")
    @js.native
    def qbUserQueryPickCatalog2: String = js.native
    
    @scala.inline
    def qbUserQueryPickCatalog2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_PickCatalog2")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_Properties")
    @js.native
    def qbUserQueryProperties: String = js.native
    
    @scala.inline
    def qbUserQueryProperties_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_Properties")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_SelectProperty")
    @js.native
    def qbUserQuerySelectProperty: String = js.native
    
    @scala.inline
    def qbUserQuerySelectProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_SelectProperty")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_SelectValue")
    @js.native
    def qbUserQuerySelectValue: String = js.native
    
    @scala.inline
    def qbUserQuerySelectValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_SelectValue")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_ShowAllProperties")
    @js.native
    def qbUserQueryShowAllProperties: String = js.native
    
    @scala.inline
    def qbUserQueryShowAllProperties_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_ShowAllProperties")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_TypeQuery")
    @js.native
    def qbUserQueryTypeQuery: String = js.native
    
    @scala.inline
    def qbUserQueryTypeQuery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_TypeQuery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qs_NameSuggestionsTitle")
    @js.native
    def qsNameSuggestionsTitle: String = js.native
    
    @scala.inline
    def qsNameSuggestionsTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs_NameSuggestionsTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qs_PersonalResultTitlePlural")
    @js.native
    def qsPersonalResultTitlePlural: String = js.native
    
    @scala.inline
    def qsPersonalResultTitlePlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs_PersonalResultTitlePlural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qs_PersonalResultTitleSingular")
    @js.native
    def qsPersonalResultTitleSingular: String = js.native
    
    @scala.inline
    def qsPersonalResultTitleSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs_PersonalResultTitleSingular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qs_SuggestionListAriaLabel")
    @js.native
    def qsSuggestionListAriaLabel: String = js.native
    
    @scala.inline
    def qsSuggestionListAriaLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs_SuggestionListAriaLabel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_AltIcon")
    @js.native
    def recsAltIcon: String = js.native
    
    @scala.inline
    def recsAltIcon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_AltIcon")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_ControlTitle")
    @js.native
    def recsControlTitle: String = js.native
    
    @scala.inline
    def recsControlTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_ControlTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_Fillin")
    @js.native
    def recsFillin: String = js.native
    
    @scala.inline
    def recsFillin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_Fillin")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_LastEditedBy")
    @js.native
    def recsLastEditedBy: String = js.native
    
    @scala.inline
    def recsLastEditedBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_LastEditedBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_Location")
    @js.native
    def recsLocation: String = js.native
    
    @scala.inline
    def recsLocation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_Location")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_Open")
    @js.native
    def recsOpen: String = js.native
    
    @scala.inline
    def recsOpen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_Open")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_Recommended")
    @js.native
    def recsRecommended: String = js.native
    
    @scala.inline
    def recsRecommended_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_Recommended")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_SaveLink")
    @js.native
    def recsSaveLink: String = js.native
    
    @scala.inline
    def recsSaveLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_SaveLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_ShowDetails")
    @js.native
    def recsShowDetails: String = js.native
    
    @scala.inline
    def recsShowDetails_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_ShowDetails")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_FacetedNavigationProgressTitle")
    @js.native
    def refconfDCRFacetedNavigationProgressTitle: String = js.native
    
    @scala.inline
    def refconfDCRFacetedNavigationProgressTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_FacetedNavigationProgressTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_No")
    @js.native
    def refconfDCRNo: String = js.native
    
    @scala.inline
    def refconfDCRNo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_No")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialog_InvalidSelectedRefiner_Warning")
    @js.native
    def refconfDCRRefinementConfigurationDialogInvalidSelectedRefinerWarning: String = js.native
    
    @scala.inline
    def refconfDCRRefinementConfigurationDialogInvalidSelectedRefinerWarning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialog_InvalidSelectedRefiner_Warning")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltip")
    @js.native
    def refconfDCRRefinementConfigurationDialogManagedPropertyTooltip: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltipNoAliases")
    @js.native
    def refconfDCRRefinementConfigurationDialogManagedPropertyTooltipNoAliases: String = js.native
    
    @scala.inline
    def refconfDCRRefinementConfigurationDialogManagedPropertyTooltipNoAliases_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltipNoAliases")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltipSeparator")
    @js.native
    def refconfDCRRefinementConfigurationDialogManagedPropertyTooltipSeparator: String = js.native
    
    @scala.inline
    def refconfDCRRefinementConfigurationDialogManagedPropertyTooltipSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltipSeparator")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def refconfDCRRefinementConfigurationDialogManagedPropertyTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialog_NoSuggestedRefiners_Warning")
    @js.native
    def refconfDCRRefinementConfigurationDialogNoSuggestedRefinersWarning: String = js.native
    
    @scala.inline
    def refconfDCRRefinementConfigurationDialogNoSuggestedRefinersWarning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialog_NoSuggestedRefiners_Warning")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialogProgressTitle")
    @js.native
    def refconfDCRRefinementConfigurationDialogProgressTitle: String = js.native
    
    @scala.inline
    def refconfDCRRefinementConfigurationDialogProgressTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialogProgressTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialog_TooManyRefiners_Error")
    @js.native
    def refconfDCRRefinementConfigurationDialogTooManyRefinersError: String = js.native
    
    @scala.inline
    def refconfDCRRefinementConfigurationDialogTooManyRefinersError_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialog_TooManyRefiners_Error")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialog_TooManyRefiners_Warning")
    @js.native
    def refconfDCRRefinementConfigurationDialogTooManyRefinersWarning: String = js.native
    
    @scala.inline
    def refconfDCRRefinementConfigurationDialogTooManyRefinersWarning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialog_TooManyRefiners_Warning")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_Yes")
    @js.native
    def refconfDCRYes: String = js.native
    
    @scala.inline
    def refconfDCRYes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_Yes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_Error_FailedToRestoreConfiguration")
    @js.native
    def refconfErrorFailedToRestoreConfiguration: String = js.native
    
    @scala.inline
    def refconfErrorFailedToRestoreConfiguration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_Error_FailedToRestoreConfiguration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_ConfigurationLoadFailure")
    @js.native
    def refconfFNTConfigurationLoadFailure: String = js.native
    
    @scala.inline
    def refconfFNTConfigurationLoadFailure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_ConfigurationLoadFailure")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_ConfigurationLoadWarning")
    @js.native
    def refconfFNTConfigurationLoadWarning: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_ConfigurationLoadWarningNullResponse")
    @js.native
    def refconfFNTConfigurationLoadWarningNullResponse: String = js.native
    
    @scala.inline
    def refconfFNTConfigurationLoadWarningNullResponse_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_ConfigurationLoadWarningNullResponse")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def refconfFNTConfigurationLoadWarning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_ConfigurationLoadWarning")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_CustomRefiners")
    @js.native
    def refconfFNTDCRCustomRefiners: String = js.native
    
    @scala.inline
    def refconfFNTDCRCustomRefiners_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_CustomRefiners")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_DescendantInfo_ChildTermsNotInheriting")
    @js.native
    def refconfFNTDCRDescendantInfoChildTermsNotInheriting: String = js.native
    
    @scala.inline
    def refconfFNTDCRDescendantInfoChildTermsNotInheriting_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_DescendantInfo_ChildTermsNotInheriting")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_DescendantInfo_ChildTermsStoppingInheriting")
    @js.native
    def refconfFNTDCRDescendantInfoChildTermsStoppingInheriting: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_DescendantInfo_ChildTermsStoppingInheritingLinkAnchor")
    @js.native
    def refconfFNTDCRDescendantInfoChildTermsStoppingInheritingLinkAnchor: String = js.native
    
    @scala.inline
    def refconfFNTDCRDescendantInfoChildTermsStoppingInheritingLinkAnchor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_DescendantInfo_ChildTermsStoppingInheritingLinkAnchor")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def refconfFNTDCRDescendantInfoChildTermsStoppingInheriting_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_DescendantInfo_ChildTermsStoppingInheriting")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_DescendantInfo_ChildTermsTotal")
    @js.native
    def refconfFNTDCRDescendantInfoChildTermsTotal: String = js.native
    
    @scala.inline
    def refconfFNTDCRDescendantInfoChildTermsTotal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_DescendantInfo_ChildTermsTotal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_DescendantStoppingInheritancePopupTitle")
    @js.native
    def refconfFNTDCRDescendantStoppingInheritancePopupTitle: String = js.native
    
    @scala.inline
    def refconfFNTDCRDescendantStoppingInheritancePopupTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_DescendantStoppingInheritancePopupTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_GeneratingPreview")
    @js.native
    def refconfFNTDCRGeneratingPreview: String = js.native
    
    @scala.inline
    def refconfFNTDCRGeneratingPreview_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_GeneratingPreview")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_InheritModeAnotherTermset")
    @js.native
    def refconfFNTDCRInheritModeAnotherTermset: String = js.native
    
    @scala.inline
    def refconfFNTDCRInheritModeAnotherTermset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_InheritModeAnotherTermset")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_InheritPopupTitle")
    @js.native
    def refconfFNTDCRInheritPopupTitle: String = js.native
    
    @scala.inline
    def refconfFNTDCRInheritPopupTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_InheritPopupTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_LoadingConfiguration")
    @js.native
    def refconfFNTDCRLoadingConfiguration: String = js.native
    
    @scala.inline
    def refconfFNTDCRLoadingConfiguration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_LoadingConfiguration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_PropertiesFor")
    @js.native
    def refconfFNTDCRPropertiesFor: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_PropertiesForFriendly")
    @js.native
    def refconfFNTDCRPropertiesForFriendly: String = js.native
    
    @scala.inline
    def refconfFNTDCRPropertiesForFriendly_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_PropertiesForFriendly")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def refconfFNTDCRPropertiesFor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_PropertiesFor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_RefinementConfigurationDialogTitle")
    @js.native
    def refconfFNTDCRRefinementConfigurationDialogTitle: String = js.native
    
    @scala.inline
    def refconfFNTDCRRefinementConfigurationDialogTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_RefinementConfigurationDialogTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_RefinementPreviewPopupTitle")
    @js.native
    def refconfFNTDCRRefinementPreviewPopupTitle: String = js.native
    
    @scala.inline
    def refconfFNTDCRRefinementPreviewPopupTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_RefinementPreviewPopupTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_StopInheritingPopupTitle")
    @js.native
    def refconfFNTDCRStopInheritingPopupTitle: String = js.native
    
    @scala.inline
    def refconfFNTDCRStopInheritingPopupTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_StopInheritingPopupTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_TotalResultsTooltip")
    @js.native
    def refconfFNTDCRTotalResultsTooltip: String = js.native
    
    @scala.inline
    def refconfFNTDCRTotalResultsTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_TotalResultsTooltip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_UseManualIntervals")
    @js.native
    def refconfFNTDCRUseManualIntervals: String = js.native
    
    @scala.inline
    def refconfFNTDCRUseManualIntervals_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_UseManualIntervals")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_InheritModeTermInfoSingularFormatString")
    @js.native
    def refconfFNTInheritModeTermInfoSingularFormatString: String = js.native
    
    @scala.inline
    def refconfFNTInheritModeTermInfoSingularFormatString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_InheritModeTermInfoSingularFormatString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_NoSampleValues")
    @js.native
    def refconfNoSampleValues: String = js.native
    
    @scala.inline
    def refconfNoSampleValues_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_NoSampleValues")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_ResultsWithValues")
    @js.native
    def refconfResultsWithValues: String = js.native
    
    @scala.inline
    def refconfResultsWithValues_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_ResultsWithValues")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SampleValuesDialog_Title")
    @js.native
    def refconfSampleValuesDialogTitle: String = js.native
    
    @scala.inline
    def refconfSampleValuesDialogTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SampleValuesDialog_Title")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_Section_OtherRefiners")
    @js.native
    def refconfSectionOtherRefiners: String = js.native
    
    @scala.inline
    def refconfSectionOtherRefiners_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_Section_OtherRefiners")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_Section_Separator")
    @js.native
    def refconfSectionSeparator: String = js.native
    
    @scala.inline
    def refconfSectionSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_Section_Separator")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_Section_SuggestedRefiners")
    @js.native
    def refconfSectionSuggestedRefiners: String = js.native
    
    @scala.inline
    def refconfSectionSuggestedRefiners_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_Section_SuggestedRefiners")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SortBy_Count")
    @js.native
    def refconfSortByCount: String = js.native
    
    @scala.inline
    def refconfSortByCount_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SortBy_Count")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SortBy_Name")
    @js.native
    def refconfSortByName: String = js.native
    
    @scala.inline
    def refconfSortByName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SortBy_Name")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SortBy_Number")
    @js.native
    def refconfSortByNumber: String = js.native
    
    @scala.inline
    def refconfSortByNumber_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SortBy_Number")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SortDirection_Ascending")
    @js.native
    def refconfSortDirectionAscending: String = js.native
    
    @scala.inline
    def refconfSortDirectionAscending_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SortDirection_Ascending")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SortDirection_Descending")
    @js.native
    def refconfSortDirectionDescending: String = js.native
    
    @scala.inline
    def refconfSortDirectionDescending_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SortDirection_Descending")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_TotalResults")
    @js.native
    def refconfTotalResults: String = js.native
    
    @scala.inline
    def refconfTotalResults_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_TotalResults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_AddProperty")
    @js.native
    def rfAddProperty: String = js.native
    
    @scala.inline
    def rfAddProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_AddProperty")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_All")
    @js.native
    def rfAll: String = js.native
    
    @scala.inline
    def rfAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_All")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_Apply")
    @js.native
    def rfApply: String = js.native
    
    @scala.inline
    def rfApply_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_Apply")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ClearAll")
    @js.native
    def rfClearAll: String = js.native
    
    @scala.inline
    def rfClearAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ClearAll")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateBoundaryLabels_0")
    @js.native
    def rfDefaultDateBoundaryLabels0: String = js.native
    
    @scala.inline
    def rfDefaultDateBoundaryLabels0_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateBoundaryLabels_0")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateBoundaryLabels_1")
    @js.native
    def rfDefaultDateBoundaryLabels1: String = js.native
    
    @scala.inline
    def rfDefaultDateBoundaryLabels1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateBoundaryLabels_1")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateBoundaryLabels_2")
    @js.native
    def rfDefaultDateBoundaryLabels2: String = js.native
    
    @scala.inline
    def rfDefaultDateBoundaryLabels2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateBoundaryLabels_2")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateBoundaryLabels_3")
    @js.native
    def rfDefaultDateBoundaryLabels3: String = js.native
    
    @scala.inline
    def rfDefaultDateBoundaryLabels3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateBoundaryLabels_3")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateRangeLabels_max")
    @js.native
    def rfDefaultDateRangeLabelsMax: String = js.native
    
    @scala.inline
    def rfDefaultDateRangeLabelsMax_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateRangeLabels_max")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateRangeLabels_min")
    @js.native
    def rfDefaultDateRangeLabelsMin: String = js.native
    
    @scala.inline
    def rfDefaultDateRangeLabelsMin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateRangeLabels_min")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateRangeLabels_range")
    @js.native
    def rfDefaultDateRangeLabelsRange: String = js.native
    
    @scala.inline
    def rfDefaultDateRangeLabelsRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateRangeLabels_range")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateRangeLabels_value")
    @js.native
    def rfDefaultDateRangeLabelsValue: String = js.native
    
    @scala.inline
    def rfDefaultDateRangeLabelsValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateRangeLabels_value")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultMinutesLabels_max")
    @js.native
    def rfDefaultMinutesLabelsMax: String = js.native
    
    @scala.inline
    def rfDefaultMinutesLabelsMax_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultMinutesLabels_max")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultMinutesLabels_min")
    @js.native
    def rfDefaultMinutesLabelsMin: String = js.native
    
    @scala.inline
    def rfDefaultMinutesLabelsMin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultMinutesLabels_min")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultMinutesLabels_range")
    @js.native
    def rfDefaultMinutesLabelsRange: String = js.native
    
    @scala.inline
    def rfDefaultMinutesLabelsRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultMinutesLabels_range")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultMinutesLabels_value")
    @js.native
    def rfDefaultMinutesLabelsValue: String = js.native
    
    @scala.inline
    def rfDefaultMinutesLabelsValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultMinutesLabels_value")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultNumberLabels_max")
    @js.native
    def rfDefaultNumberLabelsMax: String = js.native
    
    @scala.inline
    def rfDefaultNumberLabelsMax_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultNumberLabels_max")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultNumberLabels_min")
    @js.native
    def rfDefaultNumberLabelsMin: String = js.native
    
    @scala.inline
    def rfDefaultNumberLabelsMin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultNumberLabels_min")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultNumberLabels_range")
    @js.native
    def rfDefaultNumberLabelsRange: String = js.native
    
    @scala.inline
    def rfDefaultNumberLabelsRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultNumberLabels_range")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultNumberLabels_value")
    @js.native
    def rfDefaultNumberLabelsValue: String = js.native
    
    @scala.inline
    def rfDefaultNumberLabelsValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultNumberLabels_value")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Contacts")
    @js.native
    def rfEDiscExTypeRefinerValueContacts: String = js.native
    
    @scala.inline
    def rfEDiscExTypeRefinerValueContacts_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Contacts")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Documents")
    @js.native
    def rfEDiscExTypeRefinerValueDocuments: String = js.native
    
    @scala.inline
    def rfEDiscExTypeRefinerValueDocuments_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Documents")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Email")
    @js.native
    def rfEDiscExTypeRefinerValueEmail: String = js.native
    
    @scala.inline
    def rfEDiscExTypeRefinerValueEmail_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Email")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_IM")
    @js.native
    def rfEDiscExTypeRefinerValueIM: String = js.native
    
    @scala.inline
    def rfEDiscExTypeRefinerValueIM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_IM")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Journal")
    @js.native
    def rfEDiscExTypeRefinerValueJournal: String = js.native
    
    @scala.inline
    def rfEDiscExTypeRefinerValueJournal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Journal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Meetings")
    @js.native
    def rfEDiscExTypeRefinerValueMeetings: String = js.native
    
    @scala.inline
    def rfEDiscExTypeRefinerValueMeetings_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Meetings")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Notes")
    @js.native
    def rfEDiscExTypeRefinerValueNotes: String = js.native
    
    @scala.inline
    def rfEDiscExTypeRefinerValueNotes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Notes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Tasks")
    @js.native
    def rfEDiscExTypeRefinerValueTasks: String = js.native
    
    @scala.inline
    def rfEDiscExTypeRefinerValueTasks_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Tasks")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EmptyRefinement")
    @js.native
    def rfEmptyRefinement: String = js.native
    
    @scala.inline
    def rfEmptyRefinement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EmptyRefinement")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_OtherValue")
    @js.native
    def rfOtherValue: String = js.native
    
    @scala.inline
    def rfOtherValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_OtherValue")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RangeBoundariesAnyValue")
    @js.native
    def rfRangeBoundariesAnyValue: String = js.native
    
    @scala.inline
    def rfRangeBoundariesAnyValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RangeBoundariesAnyValue")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefineBy")
    @js.native
    def rfRefineBy: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefineByAuthorGoButton")
    @js.native
    def rfRefineByAuthorGoButton: String = js.native
    
    @scala.inline
    def rfRefineByAuthorGoButton_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefineByAuthorGoButton")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rfRefineBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefineBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementLabel_EnterName")
    @js.native
    def rfRefinementLabelEnterName: String = js.native
    
    @scala.inline
    def rfRefinementLabelEnterName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementLabel_EnterName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementLabel_Less")
    @js.native
    def rfRefinementLabelLess: String = js.native
    
    @scala.inline
    def rfRefinementLabelLess_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementLabel_Less")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementLabel_More")
    @js.native
    def rfRefinementLabelMore: String = js.native
    
    @scala.inline
    def rfRefinementLabelMore_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementLabel_More")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle")
    @js.native
    def rfRefinementTitle: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_AttachmentType")
    @js.native
    def rfRefinementTitleAttachmentType: String = js.native
    
    @scala.inline
    def rfRefinementTitleAttachmentType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_AttachmentType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Author")
    @js.native
    def rfRefinementTitleAuthor: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_AuthorOWSUSER")
    @js.native
    def rfRefinementTitleAuthorOWSUSER: String = js.native
    
    @scala.inline
    def rfRefinementTitleAuthorOWSUSER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_AuthorOWSUSER")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rfRefinementTitleAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Author")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_BaseOfficeLocation")
    @js.native
    def rfRefinementTitleBaseOfficeLocation: String = js.native
    
    @scala.inline
    def rfRefinementTitleBaseOfficeLocation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_BaseOfficeLocation")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_companies")
    @js.native
    def rfRefinementTitleCompanies: String = js.native
    
    @scala.inline
    def rfRefinementTitleCompanies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_companies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_ContentClass")
    @js.native
    def rfRefinementTitleContentClass: String = js.native
    
    @scala.inline
    def rfRefinementTitleContentClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_ContentClass")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_ContentType")
    @js.native
    def rfRefinementTitleContentType: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_ContentTypeId")
    @js.native
    def rfRefinementTitleContentTypeId: String = js.native
    
    @scala.inline
    def rfRefinementTitleContentTypeId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_ContentTypeId")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rfRefinementTitleContentType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_ContentType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Created")
    @js.native
    def rfRefinementTitleCreated: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_CreatedBy")
    @js.native
    def rfRefinementTitleCreatedBy: String = js.native
    
    @scala.inline
    def rfRefinementTitleCreatedBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_CreatedBy")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rfRefinementTitleCreated_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Created")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_DMSCategory")
    @js.native
    def rfRefinementTitleDMSCategory: String = js.native
    
    @scala.inline
    def rfRefinementTitleDMSCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_DMSCategory")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_DMSDocAuthor")
    @js.native
    def rfRefinementTitleDMSDocAuthor: String = js.native
    
    @scala.inline
    def rfRefinementTitleDMSDocAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_DMSDocAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Department")
    @js.native
    def rfRefinementTitleDepartment: String = js.native
    
    @scala.inline
    def rfRefinementTitleDepartment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Department")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_DisplayAuthor")
    @js.native
    def rfRefinementTitleDisplayAuthor: String = js.native
    
    @scala.inline
    def rfRefinementTitleDisplayAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_DisplayAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_EDiscSpecifyProperty")
    @js.native
    def rfRefinementTitleEDiscSpecifyProperty: String = js.native
    
    @scala.inline
    def rfRefinementTitleEDiscSpecifyProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_EDiscSpecifyProperty")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_FileExtension")
    @js.native
    def rfRefinementTitleFileExtension: String = js.native
    
    @scala.inline
    def rfRefinementTitleFileExtension_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_FileExtension")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_FileType")
    @js.native
    def rfRefinementTitleFileType: String = js.native
    
    @scala.inline
    def rfRefinementTitleFileType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_FileType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_format")
    @js.native
    def rfRefinementTitleFormat: String = js.native
    
    @scala.inline
    def rfRefinementTitleFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_format")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_from")
    @js.native
    def rfRefinementTitleFrom: String = js.native
    
    @scala.inline
    def rfRefinementTitleFrom_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_from")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_ImageDateCreated")
    @js.native
    def rfRefinementTitleImageDateCreated: String = js.native
    
    @scala.inline
    def rfRefinementTitleImageDateCreated_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_ImageDateCreated")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_JobTitle")
    @js.native
    def rfRefinementTitleJobTitle: String = js.native
    
    @scala.inline
    def rfRefinementTitleJobTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_JobTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Kind")
    @js.native
    def rfRefinementTitleKind: String = js.native
    
    @scala.inline
    def rfRefinementTitleKind_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Kind")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_languages")
    @js.native
    def rfRefinementTitleLanguages: String = js.native
    
    @scala.inline
    def rfRefinementTitleLanguages_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_languages")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_LastModifiedTime")
    @js.native
    def rfRefinementTitleLastModifiedTime: String = js.native
    
    @scala.inline
    def rfRefinementTitleLastModifiedTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_LastModifiedTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Location")
    @js.native
    def rfRefinementTitleLocation: String = js.native
    
    @scala.inline
    def rfRefinementTitleLocation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Location")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_locations")
    @js.native
    def rfRefinementTitleLocations: String = js.native
    
    @scala.inline
    def rfRefinementTitleLocations_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_locations")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_ManagedProperties")
    @js.native
    def rfRefinementTitleManagedProperties: String = js.native
    
    @scala.inline
    def rfRefinementTitleManagedProperties_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_ManagedProperties")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_MediaDuration")
    @js.native
    def rfRefinementTitleMediaDuration: String = js.native
    
    @scala.inline
    def rfRefinementTitleMediaDuration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_MediaDuration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_owsmetadatafacetinfo")
    @js.native
    def rfRefinementTitleOwsmetadatafacetinfo: String = js.native
    
    @scala.inline
    def rfRefinementTitleOwsmetadatafacetinfo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_owsmetadatafacetinfo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_owstaxidmetadataalltagsinfo")
    @js.native
    def rfRefinementTitleOwstaxidmetadataalltagsinfo: String = js.native
    
    @scala.inline
    def rfRefinementTitleOwstaxidmetadataalltagsinfo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_owstaxidmetadataalltagsinfo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_participants")
    @js.native
    def rfRefinementTitleParticipants: String = js.native
    
    @scala.inline
    def rfRefinementTitleParticipants_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_participants")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_People")
    @js.native
    def rfRefinementTitlePeople: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_PeopleInMedia")
    @js.native
    def rfRefinementTitlePeopleInMedia: String = js.native
    
    @scala.inline
    def rfRefinementTitlePeopleInMedia_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_PeopleInMedia")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_PeopleKeywords")
    @js.native
    def rfRefinementTitlePeopleKeywords: String = js.native
    
    @scala.inline
    def rfRefinementTitlePeopleKeywords_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_PeopleKeywords")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rfRefinementTitlePeople_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_People")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_personnames")
    @js.native
    def rfRefinementTitlePersonnames: String = js.native
    
    @scala.inline
    def rfRefinementTitlePersonnames_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_personnames")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_PictureHeight")
    @js.native
    def rfRefinementTitlePictureHeight: String = js.native
    
    @scala.inline
    def rfRefinementTitlePictureHeight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_PictureHeight")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_PictureWidth")
    @js.native
    def rfRefinementTitlePictureWidth: String = js.native
    
    @scala.inline
    def rfRefinementTitlePictureWidth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_PictureWidth")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_PostAuthor")
    @js.native
    def rfRefinementTitlePostAuthor: String = js.native
    
    @scala.inline
    def rfRefinementTitlePostAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_PostAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_recipients")
    @js.native
    def rfRefinementTitleRecipients: String = js.native
    
    @scala.inline
    def rfRefinementTitleRecipients_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_recipients")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_recommendedfor")
    @js.native
    def rfRefinementTitleRecommendedfor: String = js.native
    
    @scala.inline
    def rfRefinementTitleRecommendedfor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_recommendedfor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Responsibilities")
    @js.native
    def rfRefinementTitleResponsibilities: String = js.native
    
    @scala.inline
    def rfRefinementTitleResponsibilities_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Responsibilities")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_SharedWithInternal")
    @js.native
    def rfRefinementTitleSharedWithInternal: String = js.native
    
    @scala.inline
    def rfRefinementTitleSharedWithInternal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_SharedWithInternal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Site")
    @js.native
    def rfRefinementTitleSite: String = js.native
    
    @scala.inline
    def rfRefinementTitleSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Site")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_sitename")
    @js.native
    def rfRefinementTitleSitename: String = js.native
    
    @scala.inline
    def rfRefinementTitleSitename_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_sitename")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Size")
    @js.native
    def rfRefinementTitleSize: String = js.native
    
    @scala.inline
    def rfRefinementTitleSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Size")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_subject")
    @js.native
    def rfRefinementTitleSubject: String = js.native
    
    @scala.inline
    def rfRefinementTitleSubject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_subject")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Tags")
    @js.native
    def rfRefinementTitleTags: String = js.native
    
    @scala.inline
    def rfRefinementTitleTags_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Tags")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Title")
    @js.native
    def rfRefinementTitleTitle: String = js.native
    
    @scala.inline
    def rfRefinementTitleTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Title")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_UrlDepth")
    @js.native
    def rfRefinementTitleUrlDepth: String = js.native
    
    @scala.inline
    def rfRefinementTitleUrlDepth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_UrlDepth")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_WebTemplate")
    @js.native
    def rfRefinementTitleWebTemplate: String = js.native
    
    @scala.inline
    def rfRefinementTitleWebTemplate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_WebTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Write")
    @js.native
    def rfRefinementTitleWrite: String = js.native
    
    @scala.inline
    def rfRefinementTitleWrite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Write")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rfRefinementTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_AdobePDF")
    @js.native
    def rfResultTypeRefinerValueAdobePDF: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueAdobePDF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_AdobePDF")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Archive")
    @js.native
    def rfResultTypeRefinerValueArchive: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueArchive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Archive")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Assignment")
    @js.native
    def rfResultTypeRefinerValueAssignment: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueAssignment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Assignment")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Blog")
    @js.native
    def rfResultTypeRefinerValueBlog: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueBlog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Blog")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Book")
    @js.native
    def rfResultTypeRefinerValueBook: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueBook_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Book")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Community")
    @js.native
    def rfResultTypeRefinerValueCommunity: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueCommunity_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Community")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Course")
    @js.native
    def rfResultTypeRefinerValueCourse: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueCourse_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Course")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Discussion")
    @js.native
    def rfResultTypeRefinerValueDiscussion: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueDiscussion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Discussion")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Email")
    @js.native
    def rfResultTypeRefinerValueEmail: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueEmail_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Email")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Image")
    @js.native
    def rfResultTypeRefinerValueImage: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueImage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Image")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Lesson")
    @js.native
    def rfResultTypeRefinerValueLesson: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueLesson_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Lesson")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_LotusNotes")
    @js.native
    def rfResultTypeRefinerValueLotusNotes: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueLotusNotes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_LotusNotes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSAccess")
    @js.native
    def rfResultTypeRefinerValueMSAccess: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueMSAccess_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSAccess")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSExcel")
    @js.native
    def rfResultTypeRefinerValueMSExcel: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueMSExcel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSExcel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSOneNote")
    @js.native
    def rfResultTypeRefinerValueMSOneNote: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueMSOneNote_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSOneNote")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSPowerPoint")
    @js.native
    def rfResultTypeRefinerValueMSPowerPoint: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueMSPowerPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSPowerPoint")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSProject")
    @js.native
    def rfResultTypeRefinerValueMSProject: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueMSProject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSProject")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSPublisher")
    @js.native
    def rfResultTypeRefinerValueMSPublisher: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueMSPublisher_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSPublisher")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSWord")
    @js.native
    def rfResultTypeRefinerValueMSWord: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueMSWord_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSWord")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_NewsfeedPost")
    @js.native
    def rfResultTypeRefinerValueNewsfeedPost: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueNewsfeedPost_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_NewsfeedPost")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_SharePointSite")
    @js.native
    def rfResultTypeRefinerValueSharePointSite: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueSharePointSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_SharePointSite")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Task")
    @js.native
    def rfResultTypeRefinerValueTask: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueTask_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Task")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_TeamSite")
    @js.native
    def rfResultTypeRefinerValueTeamSite: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueTeamSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_TeamSite")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Text")
    @js.native
    def rfResultTypeRefinerValueText: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Text")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Video")
    @js.native
    def rfResultTypeRefinerValueVideo: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueVideo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Video")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Visio")
    @js.native
    def rfResultTypeRefinerValueVisio: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueVisio_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Visio")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Webpage")
    @js.native
    def rfResultTypeRefinerValueWebpage: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueWebpage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Webpage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Wiki")
    @js.native
    def rfResultTypeRefinerValueWiki: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueWiki_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Wiki")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_XML")
    @js.native
    def rfResultTypeRefinerValueXML: String = js.native
    
    @scala.inline
    def rfResultTypeRefinerValueXML_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_XML")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ShowMoreResults_Tooltip")
    @js.native
    def rfShowMoreResultsTooltip: String = js.native
    
    @scala.inline
    def rfShowMoreResultsTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ShowMoreResults_Tooltip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Advanced")
    @js.native
    def rsAdvanced: String = js.native
    
    @scala.inline
    def rsAdvanced_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Advanced")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_AlertMe")
    @js.native
    def rsAlertMe: String = js.native
    
    @scala.inline
    def rsAlertMe_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_AlertMe")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_ApproximateResultCount")
    @js.native
    def rsApproximateResultCount: String = js.native
    
    @scala.inline
    def rsApproximateResultCount_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_ApproximateResultCount")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_DidYouMean")
    @js.native
    def rsDidYouMean: String = js.native
    
    @scala.inline
    def rsDidYouMean_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_DidYouMean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_EdiscoveryTopResultCount")
    @js.native
    def rsEdiscoveryTopResultCount: String = js.native
    
    @scala.inline
    def rsEdiscoveryTopResultCount_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_EdiscoveryTopResultCount")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ConfigureSearchResults")
    @js.native
    def rsEditConfigureSearchResults: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ConfigureSearchResults_Link")
    @js.native
    def rsEditConfigureSearchResultsLink: String = js.native
    
    @scala.inline
    def rsEditConfigureSearchResultsLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ConfigureSearchResults_Link")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rsEditConfigureSearchResults_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ConfigureSearchResults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_DisplayTemplate")
    @js.native
    def rsEditDisplayTemplate: String = js.native
    
    @scala.inline
    def rsEditDisplayTemplate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_DisplayTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_PromotedDescription")
    @js.native
    def rsEditPromotedDescription: String = js.native
    
    @scala.inline
    def rsEditPromotedDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_PromotedDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_PromotedTitle")
    @js.native
    def rsEditPromotedTitle: String = js.native
    
    @scala.inline
    def rsEditPromotedTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_PromotedTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_QueryRules")
    @js.native
    def rsEditQueryRules: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_QueryRulesDescription")
    @js.native
    def rsEditQueryRulesDescription: String = js.native
    
    @scala.inline
    def rsEditQueryRulesDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_QueryRulesDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_QueryRulesTitle")
    @js.native
    def rsEditQueryRulesTitle: String = js.native
    
    @scala.inline
    def rsEditQueryRulesTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_QueryRulesTitle")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rsEditQueryRules_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_QueryRules")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_RankedDescription")
    @js.native
    def rsEditRankedDescription: String = js.native
    
    @scala.inline
    def rsEditRankedDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_RankedDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_RankedTitle")
    @js.native
    def rsEditRankedTitle: String = js.native
    
    @scala.inline
    def rsEditRankedTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_RankedTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultSources")
    @js.native
    def rsEditResultSources: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultSourcesDescription")
    @js.native
    def rsEditResultSourcesDescription: String = js.native
    
    @scala.inline
    def rsEditResultSourcesDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultSourcesDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultSourcesTitle")
    @js.native
    def rsEditResultSourcesTitle: String = js.native
    
    @scala.inline
    def rsEditResultSourcesTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultSourcesTitle")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rsEditResultSources_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultSources")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultType")
    @js.native
    def rsEditResultType: String = js.native
    
    @scala.inline
    def rsEditResultType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultTypesDescription")
    @js.native
    def rsEditResultTypesDescription: String = js.native
    
    @scala.inline
    def rsEditResultTypesDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultTypesDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultTypesTitle")
    @js.native
    def rsEditResultTypesTitle: String = js.native
    
    @scala.inline
    def rsEditResultTypesTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultTypesTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_GroupMoreLink")
    @js.native
    def rsGroupMoreLink: String = js.native
    
    @scala.inline
    def rsGroupMoreLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_GroupMoreLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_HasParseExceptionWarning_Line1")
    @js.native
    def rsHasParseExceptionWarningLine1: String = js.native
    
    @scala.inline
    def rsHasParseExceptionWarningLine1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_HasParseExceptionWarning_Line1")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_HasParseExceptionWarning_Line2")
    @js.native
    def rsHasParseExceptionWarningLine2: String = js.native
    
    @scala.inline
    def rsHasParseExceptionWarningLine2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_HasParseExceptionWarning_Line2")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Hide_Results")
    @js.native
    def rsHideResults: String = js.native
    
    @scala.inline
    def rsHideResults_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Hide_Results")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_LanguageDescription")
    @js.native
    def rsLanguageDescription: String = js.native
    
    @scala.inline
    def rsLanguageDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_LanguageDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_LanguagePreferences")
    @js.native
    def rsLanguagePreferences: String = js.native
    
    @scala.inline
    def rsLanguagePreferences_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_LanguagePreferences")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_MoreLanguages")
    @js.native
    def rsMoreLanguages: String = js.native
    
    @scala.inline
    def rsMoreLanguages_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_MoreLanguages")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_MoveToNextPage")
    @js.native
    def rsMoveToNextPage: String = js.native
    
    @scala.inline
    def rsMoveToNextPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_MoveToNextPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_MoveToPage")
    @js.native
    def rsMoveToPage: String = js.native
    
    @scala.inline
    def rsMoveToPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_MoveToPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_MoveToPrevPage")
    @js.native
    def rsMoveToPrevPage: String = js.native
    
    @scala.inline
    def rsMoveToPrevPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_MoveToPrevPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResult")
    @js.native
    def rsNoResult: String = js.native
    
    @scala.inline
    def rsNoResult_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResult")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsDifferentTerms")
    @js.native
    def rsNoResultsDifferentTerms: String = js.native
    
    @scala.inline
    def rsNoResultsDifferentTerms_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsDifferentTerms")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsFewerTerms")
    @js.native
    def rsNoResultsFewerTerms: String = js.native
    
    @scala.inline
    def rsNoResultsFewerTerms_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsFewerTerms")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsGeneralTerms")
    @js.native
    def rsNoResultsGeneralTerms: String = js.native
    
    @scala.inline
    def rsNoResultsGeneralTerms_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsGeneralTerms")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsMessageWhenSearchSkipped")
    @js.native
    def rsNoResultsMessageWhenSearchSkipped: String = js.native
    
    @scala.inline
    def rsNoResultsMessageWhenSearchSkipped_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsMessageWhenSearchSkipped")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsRefiners")
    @js.native
    def rsNoResultsRefiners: String = js.native
    
    @scala.inline
    def rsNoResultsRefiners_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsRefiners")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsSpelling")
    @js.native
    def rsNoResultsSpelling: String = js.native
    
    @scala.inline
    def rsNoResultsSpelling_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsSpelling")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsSuggestions")
    @js.native
    def rsNoResultsSuggestions: String = js.native
    
    @scala.inline
    def rsNoResultsSuggestions_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsSuggestions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsTips")
    @js.native
    def rsNoResultsTips: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsTips_Link")
    @js.native
    def rsNoResultsTipsLink: String = js.native
    
    @scala.inline
    def rsNoResultsTipsLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsTips_Link")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rsNoResultsTips_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsTips")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsTitle")
    @js.native
    def rsNoResultsTitle: String = js.native
    
    @scala.inline
    def rsNoResultsTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_PartialResultWarning_Line1")
    @js.native
    def rsPartialResultWarningLine1: String = js.native
    
    @scala.inline
    def rsPartialResultWarningLine1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_PartialResultWarning_Line1")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_PartialResultWarning_Line2")
    @js.native
    def rsPartialResultWarningLine2: String = js.native
    
    @scala.inline
    def rsPartialResultWarningLine2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_PartialResultWarning_Line2")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Preferences")
    @js.native
    def rsPreferences: String = js.native
    
    @scala.inline
    def rsPreferences_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Preferences")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_PreferredSearchLanguage")
    @js.native
    def rsPreferredSearchLanguage: String = js.native
    
    @scala.inline
    def rsPreferredSearchLanguage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_PreferredSearchLanguage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_ResultCount")
    @js.native
    def rsResultCount: String = js.native
    
    @scala.inline
    def rsResultCount_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_ResultCount")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_ResultsTitle")
    @js.native
    def rsResultsTitle: String = js.native
    
    @scala.inline
    def rsResultsTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_ResultsTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SearchScope")
    @js.native
    def rsSearchScope: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SearchScopeTooltip")
    @js.native
    def rsSearchScopeTooltip: String = js.native
    
    @scala.inline
    def rsSearchScopeTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SearchScopeTooltip")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rsSearchScope_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SearchScope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SelectPreferredSearchLanguage")
    @js.native
    def rsSelectPreferredSearchLanguage: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SelectPreferredSearchLanguage_Language")
    @js.native
    def rsSelectPreferredSearchLanguageLanguage: String = js.native
    
    @scala.inline
    def rsSelectPreferredSearchLanguageLanguage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SelectPreferredSearchLanguage_Language")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rsSelectPreferredSearchLanguage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SelectPreferredSearchLanguage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SingleResultCount")
    @js.native
    def rsSingleResultCount: String = js.native
    
    @scala.inline
    def rsSingleResultCount_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SingleResultCount")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SocialDistanceSort")
    @js.native
    def rsSocialDistanceSort: String = js.native
    
    @scala.inline
    def rsSocialDistanceSort_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SocialDistanceSort")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SortDescription")
    @js.native
    def rsSortDescription: String = js.native
    
    @scala.inline
    def rsSortDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SortDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_UpScopeActionPhrase")
    @js.native
    def rsUpScopeActionPhrase: String = js.native
    
    @scala.inline
    def rsUpScopeActionPhrase_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_UpScopeActionPhrase")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Upscope")
    @js.native
    def rsUpscope: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_UpscopeTitle")
    @js.native
    def rsUpscopeTitle: String = js.native
    
    @scala.inline
    def rsUpscopeTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_UpscopeTitle")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rsUpscope_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Upscope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_AccessKey")
    @js.native
    def sbAccessKey: String = js.native
    
    @scala.inline
    def sbAccessKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_AccessKey")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_AdvancedLink")
    @js.native
    def sbAdvancedLink: String = js.native
    
    @scala.inline
    def sbAdvancedLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_AdvancedLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_EmptyQueryWarning")
    @js.native
    def sbEmptyQueryWarning: String = js.native
    
    @scala.inline
    def sbEmptyQueryWarning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_EmptyQueryWarning")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_GoNav")
    @js.native
    def sbGoNav: String = js.native
    
    @scala.inline
    def sbGoNav_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_GoNav")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_GoSearch")
    @js.native
    def sbGoSearch: String = js.native
    
    @scala.inline
    def sbGoSearch_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_GoSearch")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_InvalidResultPageURL")
    @js.native
    def sbInvalidResultPageURL: String = js.native
    
    @scala.inline
    def sbInvalidResultPageURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_InvalidResultPageURL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_PreferencesLink")
    @js.native
    def sbPreferencesLink: String = js.native
    
    @scala.inline
    def sbPreferencesLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_PreferencesLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_Prompt")
    @js.native
    def sbPrompt: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.sb_Prompt_NavNode")
    @js.native
    def sbPromptNavNode: String = js.native
    
    @scala.inline
    def sbPromptNavNode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_Prompt_NavNode")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def sbPrompt_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_Prompt")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_ResultsPageTitle")
    @js.native
    def sbResultsPageTitle: String = js.native
    
    @scala.inline
    def sbResultsPageTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_ResultsPageTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_SearchInProgress")
    @js.native
    def sbSearchInProgress: String = js.native
    
    @scala.inline
    def sbSearchInProgress_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_SearchInProgress")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_SitePrompt")
    @js.native
    def sbSitePrompt: String = js.native
    
    @scala.inline
    def sbSitePrompt_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_SitePrompt")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.searchResult_NoResult")
    @js.native
    def searchResultNoResult: String = js.native
    
    @scala.inline
    def searchResultNoResult_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("searchResult_NoResult")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.tprprt_excel_report_entrypoint")
    @js.native
    def tprprtExcelReportEntrypoint: String = js.native
    
    @scala.inline
    def tprprtExcelReportEntrypoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tprprt_excel_report_entrypoint")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.tprprt_Lifetime")
    @js.native
    def tprprtLifetime: String = js.native
    
    @scala.inline
    def tprprtLifetime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tprprt_Lifetime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.tprprt_Recent")
    @js.native
    def tprprtRecent: String = js.native
    
    @scala.inline
    def tprprtRecent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tprprt_Recent")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.u_ScriptLoadFail")
    @js.native
    def uScriptLoadFail: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.u_ScriptLoadFailForViewer")
    @js.native
    def uScriptLoadFailForViewer: String = js.native
    
    @scala.inline
    def uScriptLoadFailForViewer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("u_ScriptLoadFailForViewer")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def uScriptLoadFail_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("u_ScriptLoadFail")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.us_NoTerm_Error")
    @js.native
    def usNoTermError: String = js.native
    
    @scala.inline
    def usNoTermError_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("us_NoTerm_Error")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Srch.Result")
  @js.native
  class Result protected ()
    extends typingsSlinky.sharepoint.Srch.Result {
    def this(elem: Element) = this()
  }
  object Result {
    
    /* static member */
    @JSGlobal("Srch.Result.getSelectedPropertiesFromMappingDictionary")
    @js.native
    def getSelectedPropertiesFromMappingDictionary(propMappings: js.Any): js.Array[_] = js.native
    
    /* static member */
    @JSGlobal("Srch.Result.parsePropertyMappingWithSlotDisplayNames")
    @js.native
    def parsePropertyMappingWithSlotDisplayNames(mappings: js.Any): StringDictionary[js.Any] = js.native
    
    /* static member */
    @JSGlobal("Srch.Result.parsePropertyMappingsString")
    @js.native
    def parsePropertyMappingsString(mappings: js.Any): StringDictionary[js.Any] = js.native
  }
  
  @JSGlobal("Srch.ScriptApplicationManager")
  @js.native
  class ScriptApplicationManager ()
    extends typingsSlinky.sharepoint.Srch.ScriptApplicationManager
  object ScriptApplicationManager {
    
    /* static member */
    @JSGlobal("Srch.ScriptApplicationManager.get_clientRuntimeContext")
    @js.native
    def getClientRuntimeContext(): ClientRuntimeContext = js.native
    
    /* static member */
    @JSGlobal("Srch.ScriptApplicationManager.get_current")
    @js.native
    def getCurrent(): typingsSlinky.sharepoint.Srch.ScriptApplicationManager = js.native
  }
  
  /** Represents the search box control */
  @JSGlobal("Srch.SearchBox")
  @js.native
  class SearchBox protected ()
    extends typingsSlinky.sharepoint.Srch.SearchBox {
    def this(elem: Element) = this()
  }
  
  @JSGlobal("Srch.U")
  @js.native
  class U ()
    extends typingsSlinky.sharepoint.Srch.U
  object U {
    
    @JSGlobal("Srch.U")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Srch.U.Ids")
    @js.native
    class Ids ()
      extends typingsSlinky.sharepoint.Srch.U.Ids
    object Ids {
      
      @JSGlobal("Srch.U.Ids")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Srch.U.Ids.body")
      @js.native
      def body: _itemBody = js.native
      @scala.inline
      def body_=(x: _itemBody): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("body")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.deepLinks")
      @js.native
      def deepLinks: _deepLinks = js.native
      @scala.inline
      def deepLinks_=(x: _deepLinks): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deepLinks")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.discussions")
      @js.native
      def discussions: _discussions = js.native
      @scala.inline
      def discussions_=(x: _discussions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("discussions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.group")
      @js.native
      def group: _group = js.native
      
      /* static member */
      @JSGlobal("Srch.U.Ids.groupContent")
      @js.native
      def groupContent: _groupContent = js.native
      @scala.inline
      def groupContent_=(x: _groupContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupContent")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.groupLink")
      @js.native
      def groupLink: _groupLink = js.native
      @scala.inline
      def groupLink_=(x: _groupLink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupLink")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.groupTitle")
      @js.native
      def groupTitle: _groupTitle = js.native
      @scala.inline
      def groupTitle_=(x: _groupTitle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupTitle")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def group_=(x: _group): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("group")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.hover")
      @js.native
      def hover: _hover = js.native
      @scala.inline
      def hover_=(x: _hover): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hover")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.icon")
      @js.native
      def icon: _itemIcon = js.native
      @scala.inline
      def icon_=(x: _itemIcon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.item")
      @js.native
      def item: _item = js.native
      @scala.inline
      def item_=(x: _item): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.likes")
      @js.native
      def likes: _likes = js.native
      @scala.inline
      def likes_=(x: _likes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("likes")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.members")
      @js.native
      def members: _members = js.native
      @scala.inline
      def members_=(x: _members): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("members")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.path")
      @js.native
      def path: _itemPath = js.native
      @scala.inline
      def path_=(x: _itemPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.postInfo")
      @js.native
      def postInfo: _postInfo = js.native
      @scala.inline
      def postInfo_=(x: _postInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postInfo")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.preview")
      @js.native
      def preview: _itemPreview = js.native
      @scala.inline
      def preview_=(x: _itemPreview): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preview")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.replies")
      @js.native
      def replies: _replies = js.native
      @scala.inline
      def replies_=(x: _replies): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replies")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.summary")
      @js.native
      def summary: _itemSummary = js.native
      @scala.inline
      def summary_=(x: _itemSummary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summary")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.title")
      @js.native
      def title: _itemTitle = js.native
      
      /* static member */
      @JSGlobal("Srch.U.Ids.titleLink")
      @js.native
      def titleLink: _itemTitleLink = js.native
      @scala.inline
      def titleLink_=(x: _itemTitleLink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLink")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def title_=(x: _itemTitle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.visualBestBet")
      @js.native
      def visualBestBet: _visualBestBet = js.native
      @scala.inline
      def visualBestBet_=(x: _visualBestBet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visualBestBet")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Srch.U.LoadScriptsProgress")
    @js.native
    object LoadScriptsProgress extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.Srch.U.LoadScriptsProgress with Double] = js.native
      
      /* 2 */ val failure: typingsSlinky.sharepoint.Srch.U.LoadScriptsProgress.failure with Double = js.native
      
      /* 0 */ val loading: typingsSlinky.sharepoint.Srch.U.LoadScriptsProgress.loading with Double = js.native
      
      /* 1 */ val success: typingsSlinky.sharepoint.Srch.U.LoadScriptsProgress.success with Double = js.native
    }
    
    @JSGlobal("Srch.U.LoadScriptsState")
    @js.native
    class LoadScriptsState ()
      extends typingsSlinky.sharepoint.Srch.U.LoadScriptsState
    
    @JSGlobal("Srch.U.PropNames")
    @js.native
    class PropNames ()
      extends typingsSlinky.sharepoint.Srch.U.PropNames
    object PropNames {
      
      @JSGlobal("Srch.U.PropNames")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.isFirstPinnedBlock")
      @js.native
      def isFirstPinnedBlock: IsFirstPinnedResultBlock = js.native
      @scala.inline
      def isFirstPinnedBlock_=(x: IsFirstPinnedResultBlock): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFirstPinnedBlock")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.isFirstRankedBlock")
      @js.native
      def isFirstRankedBlock: IsFirstRankedResultBlock = js.native
      @scala.inline
      def isFirstRankedBlock_=(x: IsFirstRankedResultBlock): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFirstRankedBlock")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.parentTableReference")
      @js.native
      def parentTableReference: ParentTableReference = js.native
      @scala.inline
      def parentTableReference_=(x: ParentTableReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentTableReference")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.properties")
      @js.native
      def properties: Properties = js.native
      @scala.inline
      def properties_=(x: Properties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.queryErrors")
      @js.native
      def queryErrors: QueryErrors = js.native
      @scala.inline
      def queryErrors_=(x: QueryErrors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryErrors")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.queryId")
      @js.native
      def queryId: QueryId = js.native
      @scala.inline
      def queryId_=(x: QueryId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryId")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.queryRuleId")
      @js.native
      def queryRuleId: QueryRuleId = js.native
      @scala.inline
      def queryRuleId_=(x: QueryRuleId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryRuleId")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.renderTemplateId")
      @js.native
      def renderTemplateId: RenderTemplateId = js.native
      @scala.inline
      def renderTemplateId_=(x: RenderTemplateId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderTemplateId")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.renderTemplates")
      @js.native
      def renderTemplates: RenderTemplates = js.native
      @scala.inline
      def renderTemplates_=(x: RenderTemplates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderTemplates")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.resultRows")
      @js.native
      def resultRows: ResultRows = js.native
      @scala.inline
      def resultRows_=(x: ResultRows): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resultRows")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.resultTables")
      @js.native
      def resultTables: ResultTables = js.native
      @scala.inline
      def resultTables_=(x: ResultTables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resultTables")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.rowCount")
      @js.native
      def rowCount: RowCount = js.native
      @scala.inline
      def rowCount_=(x: RowCount): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.tableType")
      @js.native
      def tableType: TableType = js.native
      @scala.inline
      def tableType_=(x: TableType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tableType")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.totalRows")
      @js.native
      def totalRows: TotalRows = js.native
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.totalRowsIncludingDuplicates")
      @js.native
      def totalRowsIncludingDuplicates: TotalRowsIncludingDuplicates = js.native
      @scala.inline
      def totalRowsIncludingDuplicates_=(x: TotalRowsIncludingDuplicates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("totalRowsIncludingDuplicates")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def totalRows_=(x: TotalRows): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("totalRows")(x.asInstanceOf[js.Any])
    }
    
    /** Same as $addHandler with safety checks */
    /* static member */
    @JSGlobal("Srch.U.addHandler")
    @js.native
    def addHandler(
      element: Element,
      eventName: String,
      handler: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, Unit]
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.addRenderContextCallback")
    @js.native
    def addRenderContextCallback(
      renderCtx: js.Any,
      callbackType: js.Any,
      callbackFunction: js.Any,
      enforceUnique: js.Any,
      templateFunction: js.Any
    ): Unit = js.native
    
    /** Uses SPAnimation to animate an element */
    /* static member */
    @JSGlobal("Srch.U.animate")
    @js.native
    def animate(element: Element, animationID: js.Any, finishFunc: js.Any): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.animateResults")
    @js.native
    def animateResults(result: typingsSlinky.sharepoint.Srch.Result, userAction: js.Any): Unit = js.native
    
    /** Safely pushes item to array (does nothing if the array is null or undefined) */
    /* static member */
    @JSGlobal("Srch.U.appendArray")
    @js.native
    def appendArray(array: js.Array[_], item: js.Any): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.appendScriptsToLoad")
    @js.native
    def appendScriptsToLoad(scripts: js.Array[String], script: String): Unit = js.native
    
    /** Appends specified parameter key and value string to the specified URL */
    /* static member */
    @JSGlobal("Srch.U.appendUrlParameter")
    @js.native
    def appendUrlParameter(url: String, keyAndValue: String): String = js.native
    
    /** Prevents default event action and stops further propagation of the event in the DOM */
    /* static member */
    @JSGlobal("Srch.U.cancelEvent")
    @js.native
    def cancelEvent(e: Event): Unit = js.native
    
    /** Prevents default event action or/and stops further propagation of the event in the DOM */
    /* static member */
    @JSGlobal("Srch.U.cancelEventEx")
    @js.native
    def cancelEventEx(e: Event, preventDefault: Boolean, stopPropagation: Boolean): Unit = js.native
    
    /** Returns HTML for collapsible refiner title */
    /* static member */
    @JSGlobal("Srch.U.collapsibleRefinerTitle")
    @js.native
    def collapsibleRefinerTitle(
      propertyName: String,
      idPrefix: String,
      title: String,
      iconClass: String,
      customOnClick: String,
      isExpanded: String
    ): String = js.native
    @JSGlobal("Srch.U.collapsibleRefinerTitle")
    @js.native
    def collapsibleRefinerTitle(
      propertyName: String,
      idPrefix: String,
      title: String,
      iconClass: String,
      customOnClick: Null,
      isExpanded: String
    ): String = js.native
    
    /** Concatenates two URL fragments and returns resulting URL */
    /* static member */
    @JSGlobal("Srch.U.concatUrl")
    @js.native
    def concatUrl(firstPart: String, secondPart: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.contentFixedWidthLength")
    @js.native
    def contentFixedWidthLength: Double = js.native
    @scala.inline
    def contentFixedWidthLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentFixedWidthLength")(x.asInstanceOf[js.Any])
    
    /** Returns copy of the passed source dictionary */
    /* static member */
    @JSGlobal("Srch.U.copyDictionary")
    @js.native
    def copyDictionary(source: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
    
    /** Copies the specified string to clipboard, if possible */
    /* static member */
    @JSGlobal("Srch.U.copyLink")
    @js.native
    def copyLink(link: String): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.createBehavior")
    @js.native
    def createBehavior(id: String, `type`: js.Any, properties: js.Any, targetElementId: String): js.Any = js.native
    
    /* static member */
    @JSGlobal("Srch.U.createErrorObjectWithExecContext")
    @js.native
    def createErrorObjectWithExecContext(messageText: js.Any, operationName: js.Any, templateFuncOrRenderCtx: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("Srch.U.createFileIconAltText")
    @js.native
    def createFileIconAltText(container: Boolean, b: js.Any): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.createXMLDocument")
    @js.native
    def createXMLDocument(xml: String): XMLDocument = js.native
    
    /** Returns true if the value parameter is null or empty string */
    /* static member */
    @JSGlobal("Srch.U.e")
    @js.native
    def e(value: String): Boolean = js.native
    
    /** Ensures that the given URL protocol value is allowed. Returns the specified URL value if the protocol is allowed; empty string otherwise. */
    /* static member */
    @JSGlobal("Srch.U.ensureAllowedProtocol")
    @js.native
    def ensureAllowedProtocol(value: String): String = js.native
    
    /** Adds the specified CSS class to element (if not there already) */
    /* static member */
    @JSGlobal("Srch.U.ensureCSSClassNameExist")
    @js.native
    def ensureCSSClassNameExist(e: Element, className: String): Unit = js.native
    
    /** Removes the specified CSS class from the element */
    /* static member */
    @JSGlobal("Srch.U.ensureCSSClassNameNotExist")
    @js.native
    def ensureCSSClassNameNotExist(e: Element, className: String): Unit = js.native
    
    /** Ensures that the given value is not null, undefined or empty; throws an exception otherwise. */
    /* static member */
    @JSGlobal("Srch.U.ensureNotNullOrEmptyString")
    @js.native
    def ensureNotNullOrEmptyString(value: String, context: js.Any, methodName: String, paraName: String): Unit = js.native
    
    /** Ensures that the given value is not null or undefined; throws an exception otherwise. */
    /* static member */
    @JSGlobal("Srch.U.ensureNotNullOrUndefined")
    @js.native
    def ensureNotNullOrUndefined(value: js.Any, context: js.Any, methodName: String, paraName: String): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.extractReplyTitleFromSummary")
    @js.native
    def extractReplyTitleFromSummary(hitHighlightedSummary: String, titleLength: Double): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.fillKeywordQuery")
    @js.native
    def fillKeywordQuery(query: js.Any, dp: js.Any): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.findResultObjectFromDOM")
    @js.native
    def findResultObjectFromDOM(e: Element, `type`: String): js.Any = js.native
    
    /** Parses SharePoint array field value and returns array of strings */
    /* static member */
    @JSGlobal("Srch.U.getArray")
    @js.native
    def getArray(value: String): js.Array[String] = js.native
    
    /** Gets calendar type according to the current regional settings */
    /* static member */
    @JSGlobal("Srch.U.getCalendarType")
    @js.native
    def getCalendarType(): js.Any = js.native
    
    /** Returns the ClientControl associated with specified DOM element */
    /* static member */
    @JSGlobal("Srch.U.getClientComponent")
    @js.native
    def getClientComponent(e: Element): typingsSlinky.sharepoint.Srch.ClientControl = js.native
    
    /** Gets cookie by name */
    /* static member */
    @JSGlobal("Srch.U.getCookie")
    @js.native
    def getCookie(name: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.getDeepLinks")
    @js.native
    def getDeepLinks(deeplinks: String, maxRows: Double): String = js.native
    
    /** Parses user display name out from SharePoint user field value */
    /* static member */
    @JSGlobal("Srch.U.getDisplayNameFromAuthorField")
    @js.native
    def getDisplayNameFromAuthorField(authorField: String): String = js.native
    
    /** Safely gets field of an object (returns null if object is null or undefined) */
    /* static member */
    @JSGlobal("Srch.U.getFieldOnObject")
    @js.native
    def getFieldOnObject(targetObject: js.Any, fieldName: String): js.Any = js.native
    
    /** Returns URL to the folder.gif image */
    /* static member */
    @JSGlobal("Srch.U.getFolderIconUrl")
    @js.native
    def getFolderIconUrl(): String = js.native
    
    /** Returns formatted time string from seconds string, which contains a number that represents amount of seconds passed since 00:00:00 today */
    /* static member */
    @JSGlobal("Srch.U.getFormattedTimeFromSeconds")
    @js.native
    def getFormattedTimeFromSeconds(secondsStr: String): String = js.native
    
    /** Converts file extension to a more friendly representation, e.g. 'doc' => 'file_Word' */
    /* static member */
    @JSGlobal("Srch.U.getFriendlyNameForFileExtension")
    @js.native
    def getFriendlyNameForFileExtension(fileExtension: String): String = js.native
    
    /** Returns human-friendly representation of the datetime value, e.g. "A few seconds ago"" */
    /* static member */
    @JSGlobal("Srch.U.getFriendlyTimeInterval")
    @js.native
    def getFriendlyTimeInterval(dateTimeSince: js.Date, calendarType: Double): String = js.native
    
    /** Returns string that contains safe call to HP.Hide */
    /* static member */
    @JSGlobal("Srch.U.getHideHoverPanelCallback")
    @js.native
    def getHideHoverPanelCallback(): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.getHighlightedProperty")
    @js.native
    def getHighlightedProperty(key: String, result: js.Any, property: String): js.Any = js.native
    
    /** Returns the hostname of current page */
    /* static member */
    @JSGlobal("Srch.U.getHostName")
    @js.native
    def getHostName(): String = js.native
    
    /** Returns URL to the html16.png image */
    /* static member */
    @JSGlobal("Srch.U.getIconUrl")
    @js.native
    def getIconUrl(): String = js.native
    
    /** Returns URL of the appropriate file image based on the file type identifier (see getFriendlyNameForFileExtension) */
    /* static member */
    @JSGlobal("Srch.U.getIconUrlByFileExtension")
    @js.native
    def getIconUrlByFileExtension(item: String): String = js.native
    @JSGlobal("Srch.U.getIconUrlByFileExtension")
    @js.native
    def getIconUrlByFileExtension(item: String, defaultIconPath: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.getImageSourceWithRendition")
    @js.native
    def getImageSourceWithRendition(imageInfo: js.Any, width: Double, height: Double): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.getMultipleHHXMLNodeValues")
    @js.native
    def getMultipleHHXMLNodeValues(xmlDoc: XMLDocument, nodeName: String, numItems: Double, rawDelimiter: String): String = js.native
    
    /** Safely gets field of an object or creates it if it is null or undefined */
    /* static member */
    @JSGlobal("Srch.U.getOrCreateFieldOnObject")
    @js.native
    def getOrCreateFieldOnObject(targetObject: js.Any, fieldName: String, defaultValue: js.Any): js.Any = js.native
    
    /** Returns specified by attributeName attribute of startingElement or of it's closest parent who has it */
    /* static member */
    @JSGlobal("Srch.U.getParentAttributeByName")
    @js.native
    def getParentAttributeByName(startingElement: Element, attributeName: String): String = js.native
    
    /** Returns the closest to startingElement parent of the specified tag name */
    /* static member */
    @JSGlobal("Srch.U.getParentElementByName")
    @js.native
    def getParentElementByName(startingElement: Element, tagName: String): Element = js.native
    
    /** Returns display template registered (can be either string or function) */
    /* static member */
    @JSGlobal("Srch.U.getRenderTemplateByName")
    @js.native
    def getRenderTemplateByName(name: String, renderCtx: js.Any): String | RenderFunction = js.native
    
    /* static member */
    @JSGlobal("Srch.U.getResultObject")
    @js.native
    def getResultObject(id: String): js.Any = js.native
    
    /** Returns string that contains safe call to HP.Show, passing over the itemId, hpContainerId and templateUrl parameters, and supplying false for wide parameter. */
    /* static member */
    @JSGlobal("Srch.U.getShowHoverPanelCallback")
    @js.native
    def getShowHoverPanelCallback(itemId: String, hpContainerId: String, templateUrl: String): String = js.native
    
    /** Returns string that contains safe call to HP.Show, passing over the itemId, hpContainerId and templateUrl parameters, and supplying true for wide parameter. */
    /* static member */
    @JSGlobal("Srch.U.getShowHoverPanelCallbackWide")
    @js.native
    def getShowHoverPanelCallbackWide(itemId: String, hpContainerId: String, templateUrl: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.getSingleHHXMLNodeValue")
    @js.native
    def getSingleHHXMLNodeValue(xmlDoc: XMLDocument, nodeName: String): String = js.native
    
    /** Safely gets field of an object (returns empty string instead of null as "getFieldOnObject") */
    /* static member */
    @JSGlobal("Srch.U.getStringFieldOnObject")
    @js.native
    def getStringFieldOnObject(targetObject: js.Any, fieldName: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.getTableOfType")
    @js.native
    def getTableOfType(tableCollection: ResultTableCollection, tableTypeName: String): ResultTable = js.native
    
    /** Gets a value from 'Properties' field object of the specified parent object */
    /* static member */
    @JSGlobal("Srch.U.getTableProperty")
    @js.native
    def getTableProperty(parent: js.Any, propName: String): js.Any = js.native
    
    /** Gets the URL of template based on display template function or the rendering context */
    /* static member */
    @JSGlobal("Srch.U.getTemplateUrlFromFunctionOrRenderCtx")
    @js.native
    def getTemplateUrlFromFunctionOrRenderCtx(templateFunctionOrRenderCtx: js.Any): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.getTrimmedProcessedHHXMLString")
    @js.native
    def getTrimmedProcessedHHXMLString(value: String, cutOff: Double): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.getTrimmedString")
    @js.native
    def getTrimmedString(value: String, cutOff: Double): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.getUnEncodedMultiValuedResults")
    @js.native
    def getUnEncodedMultiValuedResults(multiValue: String, maxItems: Double, rawDelimiter: String): String = js.native
    
    /** Parses username out from SharePoint user field value */
    /* static member */
    @JSGlobal("Srch.U.getUsernameFromAuthorField")
    @js.native
    def getUsernameFromAuthorField(authorField: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.getVideoImageWithFallbackSource")
    @js.native
    def getVideoImageWithFallbackSource(valueObject: js.Any, width: Double, height: Double): String = js.native
    
    /** Returns the #s4-workspace element or if not found, then the fallback element */
    /* static member */
    @JSGlobal("Srch.U.getWorkspace")
    @js.native
    def getWorkspace(fallback: Element): Element = js.native
    
    /* static member */
    @JSGlobal("Srch.U.hideElement")
    @js.native
    def hideElement(element: Element): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.hitHighlightingCloseTag")
    @js.native
    def hitHighlightingCloseTag: String = js.native
    @scala.inline
    def hitHighlightingCloseTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitHighlightingCloseTag")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.hitHighlightingOpenTag")
    @js.native
    def hitHighlightingOpenTag: String = js.native
    @scala.inline
    def hitHighlightingOpenTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitHighlightingOpenTag")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.htmlEncodeNonBase64ImageUrl")
    @js.native
    def htmlEncodeNonBase64ImageUrl(url: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.includeCSS")
    @js.native
    def includeCSS(templateLink: String, relativeLink: String): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.includeLanguageScript")
    @js.native
    def includeLanguageScript(templateLink: String, scriptLink: String): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.includeScript")
    @js.native
    def includeScript(templateLink: String, scriptLink: String): Unit = js.native
    
    /** Returns true if the obj parameter is array */
    /* static member */
    @JSGlobal("Srch.U.isArray")
    @js.native
    def isArray(obj: js.Any): Boolean = js.native
    
    /** Returns true if specified by logoUrl image is one of default site logos */
    /* static member */
    @JSGlobal("Srch.U.isDefaultSiteLogo")
    @js.native
    def isDefaultSiteLogo(logoUrl: String): Boolean = js.native
    
    /** Returns true if current page is osssearchresults.aspx */
    /* static member */
    @JSGlobal("Srch.U.isDefaultSiteSearchPage")
    @js.native
    def isDefaultSiteSearchPage(): Boolean = js.native
    
    /** Returns true if the specified element is a descendant of the container element */
    /* static member */
    @JSGlobal("Srch.U.isDescendant")
    @js.native
    def isDescendant(element: Element, container: Element): Boolean = js.native
    
    /** Returns true if the keyCode is \n or \r */
    /* static member */
    @JSGlobal("Srch.U.isEnterKey")
    @js.native
    def isEnterKey(keyCode: js.Any): Boolean = js.native
    
    /* static member */
    @JSGlobal("Srch.U.isFirstPromotedBlock")
    @js.native
    def isFirstPromotedBlock(resultTable: ResultTable): Boolean = js.native
    
    /* static member */
    @JSGlobal("Srch.U.isFirstRankedBlock")
    @js.native
    def isFirstRankedBlock(resultTable: ResultTable): Boolean = js.native
    
    /** Returns true if the specified item is found in the specified array (uses '===' for comparing) */
    /* static member */
    @JSGlobal("Srch.U.isInArray")
    @js.native
    def isInArray(array: js.Array[_], item: js.Any): Boolean = js.native
    
    /* static member */
    @JSGlobal("Srch.U.isIntentTable")
    @js.native
    def isIntentTable(resultTable: ResultTable): Boolean = js.native
    
    /** Returns true if current page is in edit mode */
    /* static member */
    @JSGlobal("Srch.U.isPageInEditMode")
    @js.native
    def isPageInEditMode(): Boolean = js.native
    
    /** Returns true if current page is displayed in the Minimal Download Strategy (MDS) mode */
    /* static member */
    @JSGlobal("Srch.U.isPageInMdsMode")
    @js.native
    def isPageInMdsMode(): Boolean = js.native
    
    /* static member */
    @JSGlobal("Srch.U.isPagePartialLoad")
    @js.native
    def isPagePartialLoad(): Boolean = js.native
    
    /** Returns true if the obj parameter is null, undefined, number or string */
    /* static member */
    @JSGlobal("Srch.U.isPrimitive")
    @js.native
    def isPrimitive(obj: js.Any): Boolean = js.native
    
    /** Indicates whether the specified protocol is allowed. */
    /* static member */
    @JSGlobal("Srch.U.isProtocolAllowed")
    @js.native
    def isProtocolAllowed(value: String, allowRelativeUrl: Boolean): Boolean = js.native
    
    /** Returns true if the current page uses right-to-left mode (RTL) */
    /* static member */
    @JSGlobal("Srch.U.isRTL")
    @js.native
    def isRTL(): Boolean = js.native
    
    /* static member */
    @JSGlobal("Srch.U.isSPFSKU")
    @js.native
    def isSPFSKU(): Boolean = js.native
    
    /** Returns true if the specified URL belongs to the specified host name */
    /* static member */
    @JSGlobal("Srch.U.isSameHost")
    @js.native
    def isSameHost(url: String, hostName: String): Boolean = js.native
    
    /* static member */
    @JSGlobal("Srch.U.isSubstrateTable")
    @js.native
    def isSubstrateTable(resultTable: js.Any): Boolean = js.native
    
    /* static member */
    @JSGlobal("Srch.U.isTableTypeof")
    @js.native
    def isTableTypeof(resultTable: js.Any, tableTypeName: String): Boolean = js.native
    
    /** Returns true if the URL is a relative URL, but not a server-relative URL */
    /* static member */
    @JSGlobal("Srch.U.isUrlPagelRelative")
    @js.native
    def isUrlPagelRelative(url: String): Boolean = js.native
    
    /** Returns true if the URL is a relative URL */
    /* static member */
    @JSGlobal("Srch.U.isUrlRelative")
    @js.native
    def isUrlRelative(url: String): Boolean = js.native
    
    /** Returns true if the URL is a server-relative URL (i.e. starts with '/') */
    /* static member */
    @JSGlobal("Srch.U.isUrlServerRelative")
    @js.native
    def isUrlServerRelative(url: String): Boolean = js.native
    
    /** Returns true if the fileExtension belongs to a webpage, e.g. 'ascx', 'aspx', 'html', 'php', etc.  */
    /* static member */
    @JSGlobal("Srch.U.isWebPage")
    @js.native
    def isWebPage(fileExtension: String): Boolean = js.native
    
    /** Retrieves localized string with the specified id */
    /* static member */
    @JSGlobal("Srch.U.loadResource")
    @js.native
    def loadResource(id: String): String = js.native
    
    /** Retrieves localized string with the specified id */
    /* static member */
    @JSGlobal("Srch.U.loadResourceForTemplate")
    @js.native
    def loadResourceForTemplate(id: String, templateFunc: js.Function1[/* ctx */ js.Any, String]): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.loadScripts")
    @js.native
    def loadScripts(scriptReferences: js.Array[String], success: js.Any, failure: js.Any, timeout: Double): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.logClick")
    @js.native
    def logClick(e: js.Any, clickType: js.Any): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.logRenderingErrorMessageToContext")
    @js.native
    def logRenderingErrorMessageToContext(renderCtx: js.Any, messageText: js.Any, operationName: js.Any): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.maximumSocialMetadataValue")
    @js.native
    def maximumSocialMetadataValue: Double = js.native
    @scala.inline
    def maximumSocialMetadataValue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maximumSocialMetadataValue")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.modifyMediaDurationRefinementName")
    @js.native
    def modifyMediaDurationRefinementName(resultRow: js.Any): Unit = js.native
    
    /** Returns true if the value parameter is null or undefined */
    /* static member */
    @JSGlobal("Srch.U.n")
    @js.native
    def n(value: js.Any): Boolean = js.native
    
    /* static member */
    @JSGlobal("Srch.U.parseTypedRangeToken")
    @js.native
    def parseTypedRangeToken(rangeFilterToken: String, objToStoreFilterTokenType: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("Srch.U.pathTruncationLength")
    @js.native
    def pathTruncationLength: Double = js.native
    
    /* static member */
    @JSGlobal("Srch.U.pathTruncationLengthWithMetadata")
    @js.native
    def pathTruncationLengthWithMetadata: Double = js.native
    @scala.inline
    def pathTruncationLengthWithMetadata_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathTruncationLengthWithMetadata")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.pathTruncationLengthWithPreview")
    @js.native
    def pathTruncationLengthWithPreview: Double = js.native
    @scala.inline
    def pathTruncationLengthWithPreview_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathTruncationLengthWithPreview")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def pathTruncationLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathTruncationLength")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.personaControlRenderedThreshold")
    @js.native
    def personaControlRenderedThreshold: Double = js.native
    @scala.inline
    def personaControlRenderedThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("personaControlRenderedThreshold")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.positionElement")
    @js.native
    def positionElement(element: Element, offset: String): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.processHHXML")
    @js.native
    def processHHXML(pre: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.registerLoadedScripts")
    @js.native
    def registerLoadedScripts(scripts: js.Array[String]): Unit = js.native
    
    /** Registers display template function in the system.
      *  @param name Identifier of the template. Usually template is registered twice: by URL and by name.
      *  @param template The display template. It can be either string, or function, that gets the CSR context object and returns HTML string
      */
    /* static member */
    @JSGlobal("Srch.U.registerRenderTemplateByName")
    @js.native
    def registerRenderTemplateByName(name: String, templateFunction: String): Unit = js.native
    @JSGlobal("Srch.U.registerRenderTemplateByName")
    @js.native
    def registerRenderTemplateByName(name: String, templateFunction: RenderFunction): Unit = js.native
    
    /** Registers in system resources defined by the dictionary object */
    /* static member */
    @JSGlobal("Srch.U.registerResourceDictionary")
    @js.native
    def registerResourceDictionary(locale: String, dict: StringDictionary[String]): Unit = js.native
    
    /** Removes the specified item from the specified array and returns array that has the deleted item */
    /* static member */
    @JSGlobal("Srch.U.removeArray")
    @js.native
    def removeArray(array: js.Array[_], item: js.Any): js.Array[_] = js.native
    
    /** Same as $removeHandler with safety checks */
    /* static member */
    @JSGlobal("Srch.U.removeHandler")
    @js.native
    def removeHandler(
      element: Element,
      eventName: String,
      handler: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, Unit]
    ): Unit = js.native
    
    /** Renders datetime value in friendly format into element specified by targetElementID */
    /* static member */
    @JSGlobal("Srch.U.renderFriendlyTimeIntervalString")
    @js.native
    def renderFriendlyTimeIntervalString(dateTimeSinceUTC: js.Date, targetElementID: String): Unit = js.native
    @JSGlobal("Srch.U.renderFriendlyTimeIntervalString")
    @js.native
    def renderFriendlyTimeIntervalString(dateTimeSinceUTC: js.Date, targetElementID: String, calendarType: Double): Unit = js.native
    
    /** Replaces tokens {searchcenterurl}, {contexturl}, {resultsurl}, {defaultpageslistname}, {Locale} and others, and converts URL to server-relative */
    /* static member */
    @JSGlobal("Srch.U.replaceUrlTokens")
    @js.native
    def replaceUrlTokens(url: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.resetElement")
    @js.native
    def resetElement(element: Element): Unit = js.native
    
    @JSGlobal("Srch.U.resolveRenderTemplate")
    @js.native
    def resolveRenderTemplate_Body(renderCtx: js.Any, component: typingsSlinky.sharepoint.Srch.ClientControl, level: Body): String | RenderFunction = js.native
    @JSGlobal("Srch.U.resolveRenderTemplate")
    @js.native
    def resolveRenderTemplate_Group(renderCtx: js.Any, component: typingsSlinky.sharepoint.Srch.ClientControl, level: Group): String | RenderFunction = js.native
    /** Returns the CSR template that was previously registered using 'registerRenderTemplateByName' based on CSR template level */
    /* static member */
    @JSGlobal("Srch.U.resolveRenderTemplate")
    @js.native
    def resolveRenderTemplate_Item(renderCtx: js.Any, component: typingsSlinky.sharepoint.Srch.ClientControl, level: Item): String | RenderFunction = js.native
    @JSGlobal("Srch.U.resolveRenderTemplate")
    @js.native
    def resolveRenderTemplate_View(renderCtx: js.Any, component: typingsSlinky.sharepoint.Srch.ClientControl, level: View): String | RenderFunction = js.native
    
    /* static member */
    @JSGlobal("Srch.U.restorePath")
    @js.native
    def restorePath(el: Element, originalText: String, selectText: String): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.restoreText")
    @js.native
    def restoreText(el: Element, originalText: String, selectText: String): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.selectPath")
    @js.native
    def selectPath(text: String, el: Element): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.selectText")
    @js.native
    def selectText(text: String, el: Element): Unit = js.native
    
    /** Adds cookie with specified parameters */
    /* static member */
    @JSGlobal("Srch.U.setCookie")
    @js.native
    def setCookie(name: String, value: String): Unit = js.native
    @JSGlobal("Srch.U.setCookie")
    @js.native
    def setCookie(
      name: String,
      value: String,
      expires: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      path: String
    ): Unit = js.native
    @JSGlobal("Srch.U.setCookie")
    @js.native
    def setCookie(name: String, value: String, expires: js.UndefOr[scala.Nothing], domain: String): Unit = js.native
    @JSGlobal("Srch.U.setCookie")
    @js.native
    def setCookie(name: String, value: String, expires: js.UndefOr[scala.Nothing], domain: String, path: String): Unit = js.native
    @JSGlobal("Srch.U.setCookie")
    @js.native
    def setCookie(name: String, value: String, expires: js.Date): Unit = js.native
    @JSGlobal("Srch.U.setCookie")
    @js.native
    def setCookie(name: String, value: String, expires: js.Date, domain: js.UndefOr[scala.Nothing], path: String): Unit = js.native
    @JSGlobal("Srch.U.setCookie")
    @js.native
    def setCookie(name: String, value: String, expires: js.Date, domain: String): Unit = js.native
    @JSGlobal("Srch.U.setCookie")
    @js.native
    def setCookie(name: String, value: String, expires: js.Date, domain: String, path: String): Unit = js.native
    
    /** Safely sets field of an object (does nothing if either object or fieldName is null/empty); returns true if value was set */
    /* static member */
    @JSGlobal("Srch.U.setFieldOnObject")
    @js.native
    def setFieldOnObject(targetObject: js.Any, fieldName: String, fieldValue: js.Any): Boolean = js.native
    
    /* static member */
    @JSGlobal("Srch.U.setItemRenderWrapper")
    @js.native
    def setItemRenderWrapper(renderCtx: js.Any, itemRenderWrapperFunction: js.Any, templateFunction: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("Srch.U.setPath")
    @js.native
    def setPath(e: Event, el: Element, text: String, originalText: String): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.setResultObject")
    @js.native
    def setResultObject(id: String, resultObject: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("Srch.U.shouldAnimate")
    @js.native
    def shouldAnimate(dp: js.Any): Boolean = js.native
    
    /* static member */
    @JSGlobal("Srch.U.showElement")
    @js.native
    def showElement(element: Element): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.summaryTruncationLength")
    @js.native
    def summaryTruncationLength: Double = js.native
    
    /* static member */
    @JSGlobal("Srch.U.summaryTruncationLengthWithPreview")
    @js.native
    def summaryTruncationLengthWithPreview: Double = js.native
    @scala.inline
    def summaryTruncationLengthWithPreview_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summaryTruncationLengthWithPreview")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def summaryTruncationLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summaryTruncationLength")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.titleTruncationLength")
    @js.native
    def titleTruncationLength: Double = js.native
    
    /* static member */
    @JSGlobal("Srch.U.titleTruncationLengthWithMetadata")
    @js.native
    def titleTruncationLengthWithMetadata: Double = js.native
    @scala.inline
    def titleTruncationLengthWithMetadata_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleTruncationLengthWithMetadata")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.titleTruncationLengthWithPreview")
    @js.native
    def titleTruncationLengthWithPreview: Double = js.native
    @scala.inline
    def titleTruncationLengthWithPreview_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleTruncationLengthWithPreview")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def titleTruncationLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleTruncationLength")(x.asInstanceOf[js.Any])
    
    /** Returns human-readable size in kilobytes/megabytes etc. (the captions are localized) */
    /* static member */
    @JSGlobal("Srch.U.toFileSizeDisplay")
    @js.native
    def toFileSizeDisplay(numberOfBytes: Double, showDecimalPart: Boolean): String = js.native
    
    /** Returns formatted date */
    /* static member */
    @JSGlobal("Srch.U.toFormattedDate")
    @js.native
    def toFormattedDate(dateValue: js.Date): String = js.native
    @JSGlobal("Srch.U.toFormattedDate")
    @js.native
    def toFormattedDate(dateValue: js.Date, dateTimeFormatId: String): String = js.native
    
    /** Returns formatted number */
    /* static member */
    @JSGlobal("Srch.U.toFormattedNumber")
    @js.native
    def toFormattedNumber(num: Double, defaultDecimalPlacesIfNotInt: Double): String = js.native
    
    /** If number is more than 1000, rounds up three last digits, e.g. 72389 => '72,000+'. If number is more than 100000, returns '100,000+' */
    /* static member */
    @JSGlobal("Srch.U.toFriendlyNumber")
    @js.native
    def toFriendlyNumber(num: Double): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.trace")
    @js.native
    def trace(c: typingsSlinky.sharepoint.Srch.ClientControl, method: String, message: String): Unit = js.native
    
    /* static member */
    @JSGlobal("Srch.U.traceFormatted")
    @js.native
    def traceFormatted(c: typingsSlinky.sharepoint.Srch.ClientControl, method: String, format: String, values: String*): Unit = js.native
    
    /** Removes trailing spaces and also replaces double spaces inside string to single spaces */
    /* static member */
    @JSGlobal("Srch.U.trimExtraSpaces")
    @js.native
    def trimExtraSpaces(value: String): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.trimTitle")
    @js.native
    def trimTitle(title: String, maximumLengthInChars: Double, numberOfTermsToUse: Double): String = js.native
    
    /** Truncates the string to specified maximum allowed amount of characters (if max amount is not exceeded - does nothing) */
    /* static member */
    @JSGlobal("Srch.U.truncateEnd")
    @js.native
    def truncateEnd(original: String, maxChars: Double): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.truncateHighlightedUrl")
    @js.native
    def truncateHighlightedUrl(url: String, maxChars: Double): String = js.native
    
    /* static member */
    @JSGlobal("Srch.U.truncateUrl")
    @js.native
    def truncateUrl(url: String, maxChars: Double): String = js.native
    
    /** Adds ctag parameter to the URL and replaces URL tokens */
    /* static member */
    @JSGlobal("Srch.U.urlTokenExpansion")
    @js.native
    def urlTokenExpansion(jsLink: String): String = js.native
    
    /** Returns true if the value parameter is empty string */
    /* static member */
    @JSGlobal("Srch.U.w")
    @js.native
    def w(value: js.Any): Boolean = js.native
  }
  
  @JSGlobal("Srch.UserActionType")
  @js.native
  object UserActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.Srch.UserActionType with Double] = js.native
    
    /* 5 */ val filterLanguage: typingsSlinky.sharepoint.Srch.UserActionType.filterLanguage with Double = js.native
    
    /* 1 */ val pageNext: typingsSlinky.sharepoint.Srch.UserActionType.pageNext with Double = js.native
    
    /* 2 */ val pagePrev: typingsSlinky.sharepoint.Srch.UserActionType.pagePrev with Double = js.native
    
    /* 3 */ val refine: typingsSlinky.sharepoint.Srch.UserActionType.refine with Double = js.native
    
    /* 0 */ val search: typingsSlinky.sharepoint.Srch.UserActionType.search with Double = js.native
    
    /* 4 */ val sort: typingsSlinky.sharepoint.Srch.UserActionType.sort with Double = js.native
  }
}
