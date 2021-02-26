package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.keyInfosMod.KeyInfoClause
import typingsSlinky.xmldsigjs.xmlObjectMod.XmlSignatureCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyInfoMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_info", "KeyInfo")
  @js.native
  class KeyInfo () extends XmlSignatureCollection[KeyInfoClause] {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
  }
}
