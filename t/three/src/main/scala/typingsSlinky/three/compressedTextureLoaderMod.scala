package typingsSlinky.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.three.compressedTextureMod.CompressedTexture
import typingsSlinky.three.loaderMod.Loader
import typingsSlinky.three.loadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compressedTextureLoaderMod {
  
  @JSImport("three/src/loaders/CompressedTextureLoader", "CompressedTextureLoader")
  @js.native
  class CompressedTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* texture */ CompressedTexture, Unit]): CompressedTexture = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CompressedTexture = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): CompressedTexture = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CompressedTexture = js.native
  }
}
