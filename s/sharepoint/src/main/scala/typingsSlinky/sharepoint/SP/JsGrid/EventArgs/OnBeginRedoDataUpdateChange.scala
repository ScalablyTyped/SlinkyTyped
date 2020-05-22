package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IChangeKey
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeginRedoDataUpdateChange extends IEventArgs {
  var changeKey: IChangeKey
}

object OnBeginRedoDataUpdateChange {
  @scala.inline
  def apply(changeKey: IChangeKey): OnBeginRedoDataUpdateChange = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeginRedoDataUpdateChange]
  }
}

