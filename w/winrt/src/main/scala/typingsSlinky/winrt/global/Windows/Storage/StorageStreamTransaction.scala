package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageStreamTransaction")
@js.native
class StorageStreamTransaction ()
  extends typingsSlinky.winrt.Windows.Storage.StorageStreamTransaction {
  /* CompleteClass */
  override var stream: IRandomAccessStream = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def commitAsync(): IAsyncAction = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

