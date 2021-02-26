package typingsSlinky.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.three.cubeTextureMod.CubeTexture
import typingsSlinky.three.loaderMod.Loader
import typingsSlinky.three.loadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cubeTextureLoaderMod {
  
  @JSImport("three/src/loaders/CubeTextureLoader", "CubeTextureLoader")
  @js.native
  class CubeTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(urls: js.Array[String]): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
    def load(urls: js.Array[String], onLoad: js.Function1[/* texture */ CubeTexture, Unit]): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
  }
}
