package typingsSlinky.xmlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AssocArray[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type ISelectResult = js.Array[org.scalajs.dom.raw.Node] | org.scalajs.dom.raw.Node | scala.Boolean | scala.Double | java.lang.String
  
  type IXmlSerializableConstructor = org.scalablytyped.runtime.Instantiable0[typingsSlinky.xmlCore.typesMod.IXmlSerializable]
  
  type XmlAttributeType[T] = typingsSlinky.xmlCore.typesMod.XmlSchemaItem[T]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.xmlCore.xmlCoreStrings.utf8
    - typingsSlinky.xmlCore.xmlCoreStrings.binary
    - typingsSlinky.xmlCore.xmlCoreStrings.hex
    - typingsSlinky.xmlCore.xmlCoreStrings.base64
    - typingsSlinky.xmlCore.xmlCoreStrings.base64url
  */
  type XmlBufferEncoding = typingsSlinky.xmlCore.typesMod._XmlBufferEncoding | java.lang.String
}
