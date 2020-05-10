package typingsSlinky.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPixelDataProvider extends js.Object {
  def detachPixelData(): js.typedarray.Uint8Array = js.native
}

object IPixelDataProvider {
  @scala.inline
  def apply(detachPixelData: () => js.typedarray.Uint8Array): IPixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = js.Any.fromFunction0(detachPixelData))
    __obj.asInstanceOf[IPixelDataProvider]
  }
  @scala.inline
  implicit class IPixelDataProviderOps[Self <: IPixelDataProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetachPixelData(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachPixelData")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

