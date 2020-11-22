package typingsSlinky.tuyaPanelKit.mod

import typingsSlinky.tuyaPanelKit.anon.Add
import typingsSlinky.tuyaPanelKit.anon.C2f
import typingsSlinky.tuyaPanelKit.anon.Camelize
import typingsSlinky.tuyaPanelKit.anon.Chunk
import typingsSlinky.tuyaPanelKit.anon.Convert
import typingsSlinky.tuyaPanelKit.anon.DateFormat
import typingsSlinky.tuyaPanelKit.anon.DeepMerge
import typingsSlinky.tuyaPanelKit.anon.HslToRgb
import typingsSlinky.tuyaPanelKit.anon.ParseJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Utils")
@js.native
object Utils extends js.Object {
  
  var ColorUtils: HslToRgb = js.native
  
  var CoreUtils: Chunk = js.native
  
  var JsonUtils: ParseJSON = js.native
  
  var NumberUtils: Add = js.native
  
  var RatioUtils: Convert = js.native
  
  var StringUtils: Camelize = js.native
  
  var TemperatureUtils: C2f = js.native
  
  var ThemeUtils: DeepMerge = js.native
  
  var TimeUtils: DateFormat = js.native
}
