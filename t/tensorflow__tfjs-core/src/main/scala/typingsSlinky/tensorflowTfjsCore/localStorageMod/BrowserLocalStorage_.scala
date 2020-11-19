package typingsSlinky.tensorflowTfjsCore.localStorageMod

import org.scalajs.dom.raw.Storage
import typingsSlinky.tensorflowTfjsCore.typesMod.IOHandler
import typingsSlinky.tensorflowTfjsCore.typesMod.ModelArtifacts
import typingsSlinky.tensorflowTfjsCore.typesMod.SaveResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "BrowserLocalStorage")
@js.native
class BrowserLocalStorage_ protected () extends IOHandler {
  def this(modelPath: String) = this()
  
  val LS: Storage = js.native
  
  val keys: LocalStorageKeys = js.native
  
  /**
    * Load a model from local storage.
    *
    * See the documentation to `browserLocalStorage` for details on the saved
    * artifacts.
    *
    * @returns The loaded model (if loading succeeds).
    */
  @JSName("load")
  def load_MBrowserLocalStorage_(): js.Promise[ModelArtifacts] = js.native
  
  val modelPath: String = js.native
  
  /**
    * Save model artifacts to browser local storage.
    *
    * See the documentation to `browserLocalStorage` for details on the saved
    * artifacts.
    *
    * @param modelArtifacts The model artifacts to be stored.
    * @returns An instance of SaveResult.
    */
  @JSName("save")
  def save_MBrowserLocalStorage_(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/local_storage", "BrowserLocalStorage")
@js.native
object BrowserLocalStorage_ extends js.Object {
  
  val URL_SCHEME: /* "localstorage://" */ String = js.native
}
