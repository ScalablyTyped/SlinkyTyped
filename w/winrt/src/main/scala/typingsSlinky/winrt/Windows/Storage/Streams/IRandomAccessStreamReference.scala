package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRandomAccessStreamReference extends js.Object {
  def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
}

object IRandomAccessStreamReference {
  @scala.inline
  def apply(openReadAsync: () => IAsyncOperation[IRandomAccessStreamWithContentType]): IRandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = js.Any.fromFunction0(openReadAsync))
    __obj.asInstanceOf[IRandomAccessStreamReference]
  }
  @scala.inline
  implicit class IRandomAccessStreamReferenceOps[Self <: IRandomAccessStreamReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenReadAsync(value: () => IAsyncOperation[IRandomAccessStreamWithContentType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openReadAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

