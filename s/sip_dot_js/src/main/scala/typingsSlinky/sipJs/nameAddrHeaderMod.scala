package typingsSlinky.sipJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sipJs.parametersMod.Parameters
import typingsSlinky.sipJs.uriMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/grammar/name-addr-header", JSImport.Namespace)
@js.native
object nameAddrHeaderMod extends js.Object {
  @js.native
  class NameAddrHeader protected () extends Parameters {
    /**
      * Constructor
      * @param uri -
      * @param displayName -
      * @param parameters -
      */
    def this(uri: URI, displayName: String, parameters: StringDictionary[String]) = this()
    var _displayName: js.Any = js.native
    var uri: URI = js.native
    def displayName: String = js.native
    def displayName_=(value: String): Unit = js.native
    def friendlyName: String = js.native
  }
  
}

