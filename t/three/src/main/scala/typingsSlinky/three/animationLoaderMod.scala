package typingsSlinky.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.three.animationClipMod.AnimationClip
import typingsSlinky.three.loaderMod.Loader
import typingsSlinky.three.loadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationLoaderMod {
  
  @JSImport("three/src/loaders/AnimationLoader", "AnimationLoader")
  @js.native
  class AnimationLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* response */ js.Array[AnimationClip], Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ js.Array[AnimationClip], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ js.Array[AnimationClip], Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ js.Array[AnimationClip], Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(json: js.Any): js.Array[AnimationClip] = js.native
  }
}
