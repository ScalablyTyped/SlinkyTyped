package typingsSlinky.winrt.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Storage.Streams.IContentTypeProvider
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.ImageStream")
@js.native
class ImageStream ()
  extends IRandomAccessStream
     with IContentTypeProvider {
  def dispose(): Unit = js.native
}

