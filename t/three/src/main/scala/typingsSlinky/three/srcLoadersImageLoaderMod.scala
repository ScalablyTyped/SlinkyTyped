package typingsSlinky.three

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.std.ErrorEvent
import typingsSlinky.std.EventTarget
import typingsSlinky.std.ProgressEvent
import typingsSlinky.three.srcLoadersLoaderMod.Loader
import typingsSlinky.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/ImageLoader", JSImport.Namespace)
@js.native
object srcLoadersImageLoaderMod extends js.Object {
  @js.native
  class ImageLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String): HTMLImageElement = js.native
    def load(url: String, onLoad: js.Function1[/* image */ typingsSlinky.std.HTMLImageElement, Unit]): HTMLImageElement = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* image */ typingsSlinky.std.HTMLImageElement, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): HTMLImageElement = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* image */ typingsSlinky.std.HTMLImageElement, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): HTMLImageElement = js.native
  }
  
}

