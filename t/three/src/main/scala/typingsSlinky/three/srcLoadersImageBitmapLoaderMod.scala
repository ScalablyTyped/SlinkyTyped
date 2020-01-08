package typingsSlinky.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
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
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | scala.scalajs.js.typedarray.ArrayBuffer, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | scala.scalajs.js.typedarray.ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | scala.scalajs.js.typedarray.ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def setOptions(options: js.Object): ImageBitmapLoader = js.native
  }
  
}

