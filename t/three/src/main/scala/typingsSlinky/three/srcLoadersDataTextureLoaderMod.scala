package typingsSlinky.three

import typingsSlinky.std.ErrorEvent
import typingsSlinky.std.EventTarget
import typingsSlinky.std.ProgressEvent
import typingsSlinky.three.srcLoadersLoaderMod.Loader
import typingsSlinky.three.srcLoadersLoadingManagerMod.LoadingManager
import typingsSlinky.three.srcTexturesDataTextureMod.DataTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/DataTextureLoader", JSImport.Namespace)
@js.native
object srcLoadersDataTextureLoaderMod extends js.Object {
  @js.native
  class DataTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String, onLoad: js.Function1[/* dataTexture */ DataTexture, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* dataTexture */ DataTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* dataTexture */ DataTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
  }
  
}

