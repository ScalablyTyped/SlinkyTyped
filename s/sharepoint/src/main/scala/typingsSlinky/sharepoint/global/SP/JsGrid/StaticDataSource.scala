package typingsSlinky.sharepoint.global.SP.JsGrid

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharepoint.SP.JsGrid.IGridData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.StaticDataSource")
@js.native
class StaticDataSource protected ()
  extends typingsSlinky.sharepoint.SP.JsGrid.StaticDataSource {
  def this(jsGridData: IGridData) = this()
  def this(
    jsGridData: IGridData,
    optFnGetPropType: js.Function3[
        /* recordKey */ String, 
        /* key */ String, 
        /* dataPropMap */ StringDictionary[js.Any], 
        _
      ]
  ) = this()
}

