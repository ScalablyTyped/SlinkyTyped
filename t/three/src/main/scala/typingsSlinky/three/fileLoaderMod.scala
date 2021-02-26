package typingsSlinky.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.std.MimeType
import typingsSlinky.three.loaderMod.Loader
import typingsSlinky.three.loadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileLoaderMod {
  
  @JSImport("three/src/loaders/FileLoader", "FileLoader")
  @js.native
  class FileLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
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
    def load(url: String, onLoad: js.Function1[/* response */ String | js.typedarray.ArrayBuffer, Unit]): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    
    var mimeType: js.UndefOr[MimeType] = js.native
    
    var responseType: js.UndefOr[String] = js.native
    
    def setMimeType(mimeType: MimeType): FileLoader = js.native
    
    def setResponseType(responseType: String): FileLoader = js.native
  }
}
