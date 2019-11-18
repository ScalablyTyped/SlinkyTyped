package typingsSlinky.three

import typingsSlinky.std.ErrorEvent
import typingsSlinky.std.EventTarget
import typingsSlinky.std.ProgressEvent
import typingsSlinky.three.srcLoadersLoaderMod.Loader
import typingsSlinky.three.srcLoadersLoadingManagerMod.LoadingManager
import typingsSlinky.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/TextureLoader", JSImport.Namespace)
@js.native
object srcLoadersTextureLoaderMod extends js.Object {
  @js.native
  class TextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String): Texture = js.native
    def load(url: String, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Texture = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Texture = js.native
  }
  
}

