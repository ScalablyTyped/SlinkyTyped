package typingsSlinky.sipJs.mod.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grammar {
  
  /**
    * Parse the given string and returns a SIP.URI instance or undefined if
    * it is an invalid URI.
    * @param uri -
    */
  @JSImport("sip.js", "Core.Grammar.URIParse")
  @js.native
  def URIParse(uri: String): js.UndefOr[typingsSlinky.sipJs.uriMod.URI] = js.native
  
  /**
    * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
    * it is an invalid NameAddrHeader.
    * @param name_addr_header -
    */
  @JSImport("sip.js", "Core.Grammar.nameAddrHeaderParse")
  @js.native
  def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[typingsSlinky.sipJs.nameAddrHeaderMod.NameAddrHeader] = js.native
  
  /**
    * Parse.
    * @param input -
    * @param startRule -
    */
  @JSImport("sip.js", "Core.Grammar.parse")
  @js.native
  def parse(input: String, startRule: String): js.Any = js.native
}
