package typingsSlinky.xmlpoke

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XmlPoke {
  
  @js.native
  trait API extends StObject {
    
    def add(map: PathToValueMap): API = js.native
    def add(xpath: String, value: Value): API = js.native
    
    def addNamespace(prefix: String, uri: String): API = js.native
    
    def clear(xpath: String): API = js.native
    
    def ensure(xpath: String): API = js.native
    
    def errorOnNoMatches(): API = js.native
    
    def remove(xpath: String): API = js.native
    
    def set(map: PathToValueMap): API = js.native
    def set(xpath: String, value: Value): API = js.native
    
    def setOrAdd(map: PathToValueMap): API = js.native
    def setOrAdd(xpath: String, value: Value): API = js.native
    
    def withBasePath(xpath: String): API = js.native
  }
  
  @js.native
  trait CDataValue extends _Value {
    
    var value: String = js.native
  }
  object CDataValue {
    
    @scala.inline
    def apply(value: String): CDataValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CDataValue]
    }
    
    @scala.inline
    implicit class CDataValueMutableBuilder[Self <: CDataValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PathToValueMap
    extends /* xpath */ StringDictionary[Value]
       with _Value
  object PathToValueMap {
    
    @scala.inline
    def apply(): PathToValueMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathToValueMap]
    }
  }
  
  // ghost module
  @js.native
  trait Transform extends _Value {
    
    def apply(node: Node, value: String): Value = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Boolean
    - scala.Double
    - typingsSlinky.xmlpoke.XmlPoke.XmlValue
    - typingsSlinky.xmlpoke.XmlPoke.CDataValue
    - typingsSlinky.xmlpoke.XmlPoke.PathToValueMap
    - typingsSlinky.xmlpoke.XmlPoke.Transform
  */
  type Value = _Value | String | Boolean | Double
  
  @js.native
  trait XmlValue extends _Value {
    
    var value: String = js.native
  }
  object XmlValue {
    
    @scala.inline
    def apply(value: String): XmlValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlValue]
    }
    
    @scala.inline
    implicit class XmlValueMutableBuilder[Self <: XmlValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Value extends StObject
}
