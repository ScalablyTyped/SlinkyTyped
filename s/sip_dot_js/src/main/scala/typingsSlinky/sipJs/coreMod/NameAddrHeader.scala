package typingsSlinky.sipJs.coreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "NameAddrHeader")
@js.native
class NameAddrHeader protected ()
  extends typingsSlinky.sipJs.messagesMod.NameAddrHeader {
  /**
    * Constructor
    * @param uri -
    * @param displayName -
    * @param parameters -
    */
  def this(uri: typingsSlinky.sipJs.uriMod.URI, displayName: String, parameters: StringDictionary[String]) = this()
}

