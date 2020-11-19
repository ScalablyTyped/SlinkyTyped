package typingsSlinky.xml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type XmlAtom = java.lang.String | scala.Double | scala.Boolean | scala.Null
  
  type XmlAttrs = org.scalablytyped.runtime.StringDictionary[typingsSlinky.xml.mod.XmlAtom]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.xml.anon.Attr
    - typingsSlinky.xml.anon.Cdata
    - typingsSlinky.xml.anon.AttrCdata
    - typingsSlinky.xml.mod.XmlAtom
    - js.Array[typingsSlinky.xml.mod.XmlAtom]
    - typingsSlinky.xml.mod.XmlDescArray
  */
  type XmlDesc = typingsSlinky.xml.mod._XmlDesc | js.Array[typingsSlinky.xml.mod.XmlAtom] | typingsSlinky.xml.mod.XmlAtom
  
  type XmlObject = (org.scalablytyped.runtime.StringDictionary[typingsSlinky.xml.mod.ElementObject | typingsSlinky.xml.mod.XmlDesc]) | typingsSlinky.xml.mod.XmlDesc
}
