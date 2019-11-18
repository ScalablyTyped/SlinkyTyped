package typingsSlinky.three

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.ArrayBuffer
import typingsSlinky.std.ErrorEvent
import typingsSlinky.std.EventTarget
import typingsSlinky.std.MimeType
import typingsSlinky.std.ProgressEvent
import typingsSlinky.three.srcLoadersFileLoaderMod.FileLoader
import typingsSlinky.three.srcLoadersLoaderMod.Loader
import typingsSlinky.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/FileLoader", JSImport.Namespace)
@js.native
object srcLoadersFileLoaderMod extends js.Object {
  @js.native
  class FileLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    var mimeType: js.UndefOr[MimeType] = js.native
    var requestHeader: js.UndefOr[StringDictionary[String]] = js.native
    var responseType: js.UndefOr[String] = js.native
    var withCredentials: js.UndefOr[String] = js.native
    def load(url: String): js.Any = js.native
    def load(url: String, onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit]): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def setMimeType(mimeType: MimeType): FileLoader = js.native
    def setRequestHeader(value: StringDictionary[String]): FileLoader = js.native
    def setResponseType(responseType: String): FileLoader = js.native
    def setWithCredentials(value: String): FileLoader = js.native
  }
  
}

