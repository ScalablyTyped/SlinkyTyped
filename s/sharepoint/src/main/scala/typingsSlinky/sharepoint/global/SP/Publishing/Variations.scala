package typingsSlinky.sharepoint.global.SP.Publishing

import typingsSlinky.sharepoint.SP.ClientContext
import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.ClientObjectList
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Publishing.Variations")
@js.native
class Variations () extends ClientObject
/* static members */
@JSGlobal("SP.Publishing.Variations")
@js.native
object Variations extends js.Object {
  
  def getLabels(context: ClientContext): ClientObjectList[typingsSlinky.sharepoint.SP.Publishing.VariationLabel] = js.native
  
  def getPeerUrl(context: ClientContext, currentUrl: String, labelTitle: String): StringResult = js.native
  
  def updateListItems(context: ClientContext, listId: Guid, itemIds: js.Array[Double]): Unit = js.native
}
