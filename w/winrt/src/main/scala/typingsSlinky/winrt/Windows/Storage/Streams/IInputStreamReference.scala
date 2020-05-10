package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputStreamReference extends js.Object {
  def openSequentialReadAsync(): IAsyncOperation[IInputStream] = js.native
}

object IInputStreamReference {
  @scala.inline
  def apply(openSequentialReadAsync: () => IAsyncOperation[IInputStream]): IInputStreamReference = {
    val __obj = js.Dynamic.literal(openSequentialReadAsync = js.Any.fromFunction0(openSequentialReadAsync))
    __obj.asInstanceOf[IInputStreamReference]
  }
  @scala.inline
  implicit class IInputStreamReferenceOps[Self <: IInputStreamReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenSequentialReadAsync(value: () => IAsyncOperation[IInputStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openSequentialReadAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

