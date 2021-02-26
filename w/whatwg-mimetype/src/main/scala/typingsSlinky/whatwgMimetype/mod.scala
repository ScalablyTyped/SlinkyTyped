package typingsSlinky.whatwgMimetype

import typingsSlinky.std.Map
import typingsSlinky.whatwgMimetype.anon.AllowParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("whatwg-mimetype", JSImport.Namespace)
  @js.native
  class ^ protected () extends MIMEType {
    def this(s: String) = this()
  }
  
  /* static member */
  @JSImport("whatwg-mimetype", "parse")
  @js.native
  def parse(s: String): MIMEType | Null = js.native
  
  @js.native
  trait MIMEType extends StObject {
    
    val essence: String = js.native
    
    def isHTML(): Boolean = js.native
    
    def isJavaScript(): Boolean = js.native
    def isJavaScript(opts: AllowParameters): Boolean = js.native
    
    def isXML(): Boolean = js.native
    
    val parameters: Map[String, String] = js.native
    
    var subtype: String = js.native
    
    var `type`: String = js.native
  }
}
