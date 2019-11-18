package typingsSlinky.three

import typingsSlinky.std.ArrayBuffer
import typingsSlinky.std.ErrorEvent
import typingsSlinky.std.EventTarget
import typingsSlinky.std.ProgressEvent
import typingsSlinky.three.srcLoadersImageBitmapLoaderMod.ImageBitmapLoader
import typingsSlinky.three.srcLoadersLoaderMod.Loader
import typingsSlinky.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/ImageBitmapLoader", JSImport.Namespace)
@js.native
object srcLoadersImageBitmapLoaderMod extends js.Object {
  @js.native
  class ImageBitmapLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    var options: js.UndefOr[js.Object] = js.native
    def load(url: String): js.Any = js.native
    def load(url: String, onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit]): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def setOptions(options: js.Object): ImageBitmapLoader = js.native
  }
  
}

