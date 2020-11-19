package typingsSlinky.uriTemplates

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uri-templates", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(template: String): URITemplate = js.native
  
  @js.native
  trait URITemplate extends js.Object {
    
    def fill(callback: js.Function1[/* varName */ String, String]): String = js.native
    def fill(vars: StringDictionary[String | StringDictionary[String]]): String = js.native
    
    def fillFromObject(vars: StringDictionary[String | StringDictionary[String]]): String = js.native
    
    def fromUri(uri: String): StringDictionary[String] = js.native
    
    var template: String = js.native
    
    var varNames: js.Array[String] = js.native
  }
}
