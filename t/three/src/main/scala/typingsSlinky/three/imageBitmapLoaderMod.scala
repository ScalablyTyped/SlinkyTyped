package typingsSlinky.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.std.ImageBitmap
import typingsSlinky.three.loaderMod.Loader
import typingsSlinky.three.loadingManagerMod.LoadingManager
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageBitmapLoaderMod {
  
  @JSImport("three/src/loaders/ImageBitmapLoader", "ImageBitmapLoader")
  @js.native
  class ImageBitmapLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    val isImageBitmapLoader: `true` = js.native
    
    def load(url: String): js.Any = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(url: String, onLoad: js.Function1[/* response */ ImageBitmap, Unit]): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ ImageBitmap, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ ImageBitmap, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ ImageBitmap, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    
    /**
    	 * @default { premultiplyAlpha: 'none' }
    	 */
    var options: js.UndefOr[js.Object] = js.native
    
    def setOptions(options: js.Object): ImageBitmapLoader = js.native
  }
}
