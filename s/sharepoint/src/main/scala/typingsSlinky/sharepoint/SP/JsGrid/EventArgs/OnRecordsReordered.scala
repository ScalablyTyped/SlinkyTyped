package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IChangeKey
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRecordsReordered extends IEventArgs {
  var changeKey: IChangeKey
  var reorderedKeys: js.Array[String]
}

object OnRecordsReordered {
  @scala.inline
  def apply(changeKey: IChangeKey, reorderedKeys: js.Array[String]): OnRecordsReordered = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], reorderedKeys = reorderedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRecordsReordered]
  }
}

