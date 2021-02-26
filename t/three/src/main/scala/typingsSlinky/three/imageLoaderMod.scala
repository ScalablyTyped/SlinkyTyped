package typingsSlinky.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.three.loaderMod.Loader
import typingsSlinky.three.loadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageLoaderMod {
  
  @JSImport("three/src/loaders/ImageLoader", "ImageLoader")
  @js.native
  class ImageLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String): HTMLImageElement = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): HTMLImageElement = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): HTMLImageElement = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): HTMLImageElement = js.native
    def load(url: String, onLoad: js.Function1[/* image */ HTMLImageElement, Unit]): HTMLImageElement = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): HTMLImageElement = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): HTMLImageElement = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): HTMLImageElement = js.native
  }
}
