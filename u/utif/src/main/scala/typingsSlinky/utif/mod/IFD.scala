package typingsSlinky.utif.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFD extends /* property */ StringDictionary[TiffTag | Double | Uint8Array] {
  var data: scala.scalajs.js.typedarray.Uint8Array
  var height: Double
  var width: Double
}

object IFD {
  @scala.inline
  def apply(
    data: scala.scalajs.js.typedarray.Uint8Array,
    height: Double,
    width: Double,
    StringDictionary: /* property */ StringDictionary[TiffTag | Double | scala.scalajs.js.typedarray.Uint8Array] = null
  ): IFD = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IFD]
  }
}

