package typingsSlinky.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webidlConversions.mod.Options
import typingsSlinky.whatwgUrl.anon.DoNotStripQMark
import typingsSlinky.whatwgUrl.urlImplMod.implementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webidl2jsWrapperMod {
  
  object URL {
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.convert")
    @js.native
    def convert(obj: js.Any): implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.convert")
    @js.native
    def convert(obj: js.Any, options: Options): implementation = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.create")
    @js.native
    def create(globalObject: js.Object): org.scalajs.dom.experimental.URL = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.create")
    @js.native
    def create(globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): org.scalajs.dom.experimental.URL = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.create")
    @js.native
    def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): org.scalajs.dom.experimental.URL = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.create")
    @js.native
    def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): org.scalajs.dom.experimental.URL = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.createImpl")
    @js.native
    def createImpl(globalObject: js.Object): implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.createImpl")
    @js.native
    def createImpl(globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.createImpl")
    @js.native
    def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.createImpl")
    @js.native
    def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): implementation = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.install")
    @js.native
    def install(globalObject: js.Object): Unit = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.is")
    @js.native
    def is(obj: js.Any): /* is std.URL */ Boolean = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.isImpl")
    @js.native
    def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.setup")
    @js.native
    def setup[T /* <: org.scalajs.dom.experimental.URL */](obj: T, globalObject: js.Object): T = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.setup")
    @js.native
    def setup[T /* <: org.scalajs.dom.experimental.URL */](obj: T, globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): T = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.setup")
    @js.native
    def setup[T /* <: org.scalajs.dom.experimental.URL */](obj: T, globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): T = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.setup")
    @js.native
    def setup[T /* <: org.scalajs.dom.experimental.URL */](
      obj: T,
      globalObject: js.Object,
      hasUrlBase: js.Tuple2[String, js.UndefOr[String]],
      privateData: js.Object
    ): T = js.native
  }
  
  object URLSearchParams {
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.convert")
    @js.native
    def convert(obj: js.Any): typingsSlinky.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.convert")
    @js.native
    def convert(obj: js.Any, options: Options): typingsSlinky.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.create")
    @js.native
    def create(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): typingsSlinky.std.URLSearchParams = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.create")
    @js.native
    def create(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): typingsSlinky.std.URLSearchParams = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.createImpl")
    @js.native
    def createImpl(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): typingsSlinky.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.createImpl")
    @js.native
    def createImpl(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): typingsSlinky.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.install")
    @js.native
    def install(globalObject: js.Object): Unit = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.is")
    @js.native
    def is(obj: js.Any): /* is std.URLSearchParams */ Boolean = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.isImpl")
    @js.native
    def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.setup")
    @js.native
    def setup[T /* <: typingsSlinky.std.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): T = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.setup")
    @js.native
    def setup[T /* <: typingsSlinky.std.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): T = js.native
  }
}
