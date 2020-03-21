package typingsSlinky.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.three.fontMod.Font
import typingsSlinky.three.loaderMod.Loader
import typingsSlinky.three.loadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/FontLoader", JSImport.Namespace)
@js.native
object fontLoaderMod extends js.Object {
  @js.native
  class FontLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String): Unit = js.native
    def load(url: String, onLoad: js.Function1[/* responseFont */ Font, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* responseFont */ Font, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* responseFont */ Font, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def parse(json: js.Any): Font = js.native
  }
  
}

