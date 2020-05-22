package typingsSlinky.sharepoint.global.SP.JsGrid

import typingsSlinky.sharepoint.SP.JsGrid.IRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.RecordFactory")
@js.native
class RecordFactory protected ()
  extends typingsSlinky.sharepoint.SP.JsGrid.RecordFactory {
  def this(gridFieldMap: js.Any, keyColumnName: String, fnGetPropType: js.Any) = this()
  /* CompleteClass */
  override var gridFieldMap: js.Any = js.native
  /** Create a new record */
  /* CompleteClass */
  override def MakeRecord(dataPropMap: js.Any, localizedPropMap: js.Any, bKeepRawData: Boolean): IRecord = js.native
}

