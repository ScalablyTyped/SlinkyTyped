package typingsSlinky.three

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.three.loaderMod.Loader
import typingsSlinky.three.loadingManagerMod.LoadingManager
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialLoaderMod {
  
  @JSImport("three/src/loaders/MaterialLoader", "MaterialLoader")
  @js.native
  class MaterialLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* material */ Material, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* material */ Material, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* material */ Material, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* material */ Material, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(json: js.Any): Material = js.native
    
    def setTextures(textures: StringDictionary[Texture]): this.type = js.native
    
    /**
    	 * @default {}
    	 */
    var textures: StringDictionary[Texture] = js.native
  }
}
