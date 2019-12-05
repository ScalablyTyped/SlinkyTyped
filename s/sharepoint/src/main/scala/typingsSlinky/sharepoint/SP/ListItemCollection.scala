package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemCollection[T]
  extends ClientObjectCollection[typingsSlinky.sharepoint.SP.ListItem[T]] {
  def getById(id: String): typingsSlinky.sharepoint.SP.ListItem[T] = js.native
  def getById(id: Double): typingsSlinky.sharepoint.SP.ListItem[T] = js.native
  def get_item(index: Double): typingsSlinky.sharepoint.SP.ListItem[T] = js.native
  def get_listItemCollectionPosition(): ListItemCollectionPosition = js.native
  def itemAt(index: Double): typingsSlinky.sharepoint.SP.ListItem[T] = js.native
}

