package typingsSlinky.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.three.animationClipMod.AnimationClip
import typingsSlinky.three.loaderMod.Loader
import typingsSlinky.three.loadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/AnimationLoader", JSImport.Namespace)
@js.native
object animationLoaderMod extends js.Object {
  @js.native
  class AnimationLoader () extends Loader {
    def this(manager: LoadingManager) = this()
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
    def parse(json: js.Any): js.Array[AnimationClip] = js.native
  }
  
}

