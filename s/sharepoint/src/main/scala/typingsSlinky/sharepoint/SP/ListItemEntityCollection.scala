package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemEntityCollection[T]
  extends ClientObjectCollection[typingsSlinky.sharepoint.SP.ListItem[T]] {
  def get_item(index: Double): typingsSlinky.sharepoint.SP.ListItem[T] = js.native
  def itemAt(index: Double): typingsSlinky.sharepoint.SP.ListItem[T] = js.native
}

