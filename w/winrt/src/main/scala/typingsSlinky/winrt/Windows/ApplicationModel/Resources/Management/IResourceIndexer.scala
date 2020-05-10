package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceIndexer extends js.Object {
  def indexFileContentsAsync(file: Uri): IAsyncOperation[IVectorView[IndexedResourceCandidate]] = js.native
  def indexFilePath(filePath: Uri): IndexedResourceCandidate = js.native
}

object IResourceIndexer {
  @scala.inline
  def apply(
    indexFileContentsAsync: Uri => IAsyncOperation[IVectorView[IndexedResourceCandidate]],
    indexFilePath: Uri => IndexedResourceCandidate
  ): IResourceIndexer = {
    val __obj = js.Dynamic.literal(indexFileContentsAsync = js.Any.fromFunction1(indexFileContentsAsync), indexFilePath = js.Any.fromFunction1(indexFilePath))
    __obj.asInstanceOf[IResourceIndexer]
  }
  @scala.inline
  implicit class IResourceIndexerOps[Self <: IResourceIndexer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexFileContentsAsync(value: Uri => IAsyncOperation[IVectorView[IndexedResourceCandidate]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexFileContentsAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndexFilePath(value: Uri => IndexedResourceCandidate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexFilePath")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

