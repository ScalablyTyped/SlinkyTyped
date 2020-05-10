package typingsSlinky.sharepoint

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("HP")
@js.native
object HP extends TopLevel[HP]

