package typingsSlinky.three

import typingsSlinky.std.ErrorEvent
import typingsSlinky.std.EventTarget
import typingsSlinky.std.ProgressEvent
import typingsSlinky.three.srcLoadersLoaderMod.Loader
import typingsSlinky.three.srcLoadersLoadingManagerMod.LoadingManager
import typingsSlinky.three.srcTexturesCubeTextureMod.CubeTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/CubeTextureLoader", JSImport.Namespace)
@js.native
object srcLoadersCubeTextureLoaderMod extends js.Object {
  @js.native
  class CubeTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(urls: js.Array[String]): CubeTexture = js.native
    def load(urls: js.Array[String], onLoad: js.Function1[/* texture */ CubeTexture, Unit]): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
  }
  
}

