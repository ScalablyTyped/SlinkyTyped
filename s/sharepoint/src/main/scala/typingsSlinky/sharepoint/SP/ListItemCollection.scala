package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemCollection[T] extends ClientObjectCollection[ListItem[T]] {
  
  def getById(id: String): ListItem[T] = js.native
  def getById(id: Double): ListItem[T] = js.native
  
  def get_item(index: Double): ListItem[T] = js.native
  
  def get_listItemCollectionPosition(): ListItemCollectionPosition = js.native
  
  def itemAt(index: Double): ListItem[T] = js.native
}
