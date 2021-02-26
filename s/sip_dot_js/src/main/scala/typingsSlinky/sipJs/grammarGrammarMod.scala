package typingsSlinky.sipJs

import typingsSlinky.sipJs.nameAddrHeaderMod.NameAddrHeader
import typingsSlinky.sipJs.uriMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grammarGrammarMod {
  
  object Grammar {
    
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    @JSImport("sip.js/lib/grammar/grammar", "Grammar.URIParse")
    @js.native
    def URIParse(uri: String): js.UndefOr[URI] = js.native
    
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    @JSImport("sip.js/lib/grammar/grammar", "Grammar.nameAddrHeaderParse")
    @js.native
    def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[NameAddrHeader] = js.native
    
    /**
      * Parse.
      * @param input -
      * @param startRule -
      */
    @JSImport("sip.js/lib/grammar/grammar", "Grammar.parse")
    @js.native
    def parse(input: String, startRule: String): js.Any = js.native
  }
}
