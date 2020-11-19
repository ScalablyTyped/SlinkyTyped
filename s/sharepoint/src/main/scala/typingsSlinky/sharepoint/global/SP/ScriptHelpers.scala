package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.sharepoint.SPClientTemplates.FieldSchema
import typingsSlinky.sharepoint.SPClientTemplates.ListSchema
import typingsSlinky.sharepoint.SPClientTemplates.RenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ScriptHelpers")
@js.native
class ScriptHelpers ()
  extends typingsSlinky.sharepoint.SP.ScriptHelpers
/* static members */
@JSGlobal("SP.ScriptHelpers")
@js.native
object ScriptHelpers extends js.Object {
  
  def disableWebpartSelection(context: RenderContext): Unit = js.native
  
  def getDocumentQueryPairs(): StringDictionary[String] = js.native
  
  def getFieldFromSchema(schema: ListSchema, fieldName: String): FieldSchema = js.native
  
  def getLayoutsPageUrl(pageName: String, webServerRelativeUrl: String): String = js.native
  
  def getListLevelPermissionMask(jsonItem: String): Double = js.native
  
  def getTextAreaElementValue(textAreaElement: HTMLTextAreaElement): String = js.native
  
  def getUrlQueryPairs(docUrl: String): StringDictionary[String] = js.native
  
  def getUserFieldProperty(item: typingsSlinky.sharepoint.SP.ListItem[_], fieldName: String, propertyName: String): js.Any = js.native
  
  def hasPermission(listPermissionMask: Double, listPermission: typingsSlinky.sharepoint.SP.ListLevelPermissionMask): Boolean = js.native
  
  def isNullOrEmptyString(str: String): Boolean = js.native
  
  def isNullOrUndefined(obj: js.Any): Boolean = js.native
  
  def isNullOrUndefinedOrEmpty(str: String): Boolean = js.native
  
  def isUndefined(obj: js.Any): Boolean = js.native
  
  def newGuid(): typingsSlinky.sharepoint.SP.Guid = js.native
  
  def removeHtml(str: String): String = js.native
  
  def removeHtmlAndTrimStringWithEllipsis(str: String, maxLength: Double): String = js.native
  
  def removeStyleChildren(element: HTMLElement): Unit = js.native
  
  def replaceOrAddQueryString(url: String, key: String, value: String): String = js.native
  
  def resizeImageToSquareLength(imgElement: HTMLImageElement, squareLength: Double): Unit = js.native
  
  def setTextAreaElementValue(textAreaElement: HTMLTextAreaElement, newValue: String): Unit = js.native
  
  def truncateToInt(n: Double): Double = js.native
  
  def urlCombine(path1: String, path2: String): String = js.native
}
