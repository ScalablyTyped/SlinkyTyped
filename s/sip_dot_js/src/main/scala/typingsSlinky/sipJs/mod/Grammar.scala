package typingsSlinky.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Grammar")
@js.native
object Grammar extends js.Object {
  /**
    * Parse the given string and returns a SIP.URI instance or undefined if
    * it is an invalid URI.
    * @param uri -
    */
  def URIParse(uri: String): js.UndefOr[typingsSlinky.sipJs.uriMod.URI] = js.native
  /**
    * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
    * it is an invalid NameAddrHeader.
    * @param name_addr_header -
    */
  def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[typingsSlinky.sipJs.nameAddrHeaderMod.NameAddrHeader] = js.native
  /**
    * Parse.
    * @param input -
    * @param startRule -
    */
  def parse(input: String, startRule: String): js.Any = js.native
}

