package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRandomAccessStreamReferenceStatics extends js.Object {
  def createFromFile(file: IStorageFile): RandomAccessStreamReference = js.native
  def createFromStream(stream: IRandomAccessStream): RandomAccessStreamReference = js.native
  def createFromUri(uri: Uri): RandomAccessStreamReference = js.native
}

object IRandomAccessStreamReferenceStatics {
  @scala.inline
  def apply(
    createFromFile: IStorageFile => RandomAccessStreamReference,
    createFromStream: IRandomAccessStream => RandomAccessStreamReference,
    createFromUri: Uri => RandomAccessStreamReference
  ): IRandomAccessStreamReferenceStatics = {
    val __obj = js.Dynamic.literal(createFromFile = js.Any.fromFunction1(createFromFile), createFromStream = js.Any.fromFunction1(createFromStream), createFromUri = js.Any.fromFunction1(createFromUri))
    __obj.asInstanceOf[IRandomAccessStreamReferenceStatics]
  }
  @scala.inline
  implicit class IRandomAccessStreamReferenceStaticsOps[Self <: IRandomAccessStreamReferenceStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateFromFile(value: IStorageFile => RandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateFromStream(value: IRandomAccessStream => RandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromStream")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateFromUri(value: Uri => RandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromUri")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

