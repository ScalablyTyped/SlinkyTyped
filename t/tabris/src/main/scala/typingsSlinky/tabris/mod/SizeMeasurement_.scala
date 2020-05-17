package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "SizeMeasurement")
@js.native
class SizeMeasurement_ protected () extends NativeObject {
  /**
    * Measures the given text. The method returns a `Promise` which resolves to an array of `{width:
    * number, height: number}`.
    * @param configs The text configurations to measure. A text configuration has to provide at least a `text` and `fontSize` property.
    * @provisional
    */
  def measureTexts(configs: js.Array[typingsSlinky.tabris.anon.Font]): js.Promise[Width] = js.native
  /**
    * Measures the given text. The method returns an array of `{width: number, height: number}`.
    * @param configs The text configurations to measure. A text configuration has to provide at least a `text` and `fontSize` property.
    * @provisional
    */
  def measureTextsSync(configs: js.Array[typingsSlinky.tabris.anon.Font]): js.Array[Width] = js.native
}

