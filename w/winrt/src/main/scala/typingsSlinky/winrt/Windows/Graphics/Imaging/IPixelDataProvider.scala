package typingsSlinky.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelDataProvider extends js.Object {
  def detachPixelData(): js.typedarray.Uint8Array
}

object IPixelDataProvider {
  @scala.inline
  def apply(detachPixelData: () => js.typedarray.Uint8Array): IPixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = js.Any.fromFunction0(detachPixelData))
    __obj.asInstanceOf[IPixelDataProvider]
  }
}

