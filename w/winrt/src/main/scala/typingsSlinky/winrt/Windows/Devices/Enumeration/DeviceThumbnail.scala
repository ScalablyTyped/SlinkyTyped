package typingsSlinky.winrt.Windows.Devices.Enumeration

import typingsSlinky.winrt.Windows.Storage.Streams.IContentTypeProvider
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration.DeviceThumbnail")
@js.native
class DeviceThumbnail ()
  extends IRandomAccessStream
     with IContentTypeProvider {
  def dispose(): Unit = js.native
}

