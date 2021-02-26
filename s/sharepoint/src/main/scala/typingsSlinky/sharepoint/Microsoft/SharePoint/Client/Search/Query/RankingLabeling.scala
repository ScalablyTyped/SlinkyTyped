package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.JsonObjectResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RankingLabeling extends ClientObject {
  
  def addJudgment(userQuery: String, url: String, labelId: Double): Unit = js.native
  
  def getJudgementsForQuery(query: String): JsonObjectResult = js.native
  
  def normalizeResultUrl(url: String): JsonObjectResult = js.native
}
