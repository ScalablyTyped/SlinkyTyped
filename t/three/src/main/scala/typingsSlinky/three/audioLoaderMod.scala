package typingsSlinky.three

import org.scalajs.dom.raw.AudioBuffer
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.three.loaderMod.Loader
import typingsSlinky.three.loadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioLoaderMod {
  
  @JSImport("three/src/loaders/AudioLoader", "AudioLoader")
  @js.native
  class AudioLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* audioBuffer */ AudioBuffer, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* audioBuffer */ AudioBuffer, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* audioBuffer */ AudioBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* audioBuffer */ AudioBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
  }
}
