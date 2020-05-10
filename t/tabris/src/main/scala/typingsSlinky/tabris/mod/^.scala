package typingsSlinky.tabris.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tabris.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("Crypto")
  var Crypto_ : Instantiable0[typingsSlinky.tabris.Crypto_] = js.native
  var Headers: Instantiable1[
    js.UndefOr[
      typingsSlinky.tabris.Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String]
    ], 
    typingsSlinky.tabris.Headers
  ] = js.native
  var ImageData: Instantiable3[
    /* data */ js.typedarray.Uint8ClampedArray, 
    /* width */ Double, 
    js.UndefOr[/* height */ Double], 
    typingsSlinky.tabris.ImageData
  ] = js.native
  var Request: Instantiable2[
    /* input */ String | typingsSlinky.tabris.Request, 
    js.UndefOr[/* init */ RequestInit], 
    typingsSlinky.tabris.Request
  ] = js.native
  var Storage: Instantiable0[typingsSlinky.tabris.Storage] = js.native
  var crypto: typingsSlinky.tabris.Crypto_ = js.native
  var fetch: js.Function2[
    /* url */ String | typingsSlinky.tabris.Request, 
    /* init */ js.UndefOr[RequestInit], 
    js.Promise[typingsSlinky.tabris.Response]
  ] = js.native
}

