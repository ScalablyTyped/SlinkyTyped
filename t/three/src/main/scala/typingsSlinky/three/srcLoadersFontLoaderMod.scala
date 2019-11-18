package typingsSlinky.three

import typingsSlinky.std.ErrorEvent
import typingsSlinky.std.EventTarget
import typingsSlinky.std.ProgressEvent
import typingsSlinky.three.srcExtrasCoreFontMod.Font
import typingsSlinky.three.srcLoadersLoaderMod.Loader
import typingsSlinky.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/FontLoader", JSImport.Namespace)
@js.native
object srcLoadersFontLoaderMod extends js.Object {
  @js.native
  class FontLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String): Unit = js.native
    def load(url: String, onLoad: js.Function1[/* responseFont */ Font, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* responseFont */ Font, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* responseFont */ Font, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def parse(json: js.Any): Font = js.native
  }
  
}

