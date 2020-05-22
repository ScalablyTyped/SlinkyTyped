package typingsSlinky.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webidlConversions.mod.Options
import typingsSlinky.whatwgUrl.anon.DoNotStripQMark
import typingsSlinky.whatwgUrl.urlImplMod.implementation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-url/webidl2js-wrapper", JSImport.Namespace)
@js.native
object webidl2jsWrapperMod extends js.Object {
  @js.native
  object URL extends js.Object {
    def convert(obj: js.Any): implementation = js.native
    def convert(obj: js.Any, options: Options): implementation = js.native
    def create(globalObject: js.Object): org.scalajs.dom.experimental.URL = js.native
    def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): org.scalajs.dom.experimental.URL = js.native
    def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): org.scalajs.dom.experimental.URL = js.native
    def createImpl(globalObject: js.Object): implementation = js.native
    def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): implementation = js.native
    def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): implementation = js.native
    def install(globalObject: js.Object): Unit = js.native
    def is(obj: js.Any): /* is std.URL */ Boolean = js.native
    def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean = js.native
    def setup[T /* <: org.scalajs.dom.experimental.URL */](obj: T, globalObject: js.Object): T = js.native
    def setup[T /* <: org.scalajs.dom.experimental.URL */](obj: T, globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): T = js.native
    def setup[T /* <: org.scalajs.dom.experimental.URL */](
      obj: T,
      globalObject: js.Object,
      hasUrlBase: js.Tuple2[String, js.UndefOr[String]],
      privateData: js.Object
    ): T = js.native
  }
  
  @js.native
  object URLSearchParams extends js.Object {
    def convert(obj: js.Any): typingsSlinky.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    def convert(obj: js.Any, options: Options): typingsSlinky.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    def create(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): typingsSlinky.std.URLSearchParams = js.native
    def create(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): typingsSlinky.std.URLSearchParams = js.native
    def createImpl(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): typingsSlinky.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    def createImpl(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): typingsSlinky.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    def install(globalObject: js.Object): Unit = js.native
    def is(obj: js.Any): /* is std.URLSearchParams */ Boolean = js.native
    def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean = js.native
    def setup[T /* <: typingsSlinky.std.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): T = js.native
    def setup[T /* <: typingsSlinky.std.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): T = js.native
  }
  
}

