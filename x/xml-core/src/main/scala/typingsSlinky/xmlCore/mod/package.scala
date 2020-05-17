package typingsSlinky.xmlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Base type for associated arrays
    *
    * @interface AssocArray
    * @template T
    */
  type AssocArray[T] = org.scalablytyped.runtime.StringDictionary[T]
  type IXmlSerializableConstructor = org.scalablytyped.runtime.Instantiable0[typingsSlinky.xmlCore.mod.IXmlSerializable]
  type SelectNodes = js.Function2[
    /* node */ org.scalajs.dom.raw.Node, 
    /* xPath */ java.lang.String, 
    js.Array[org.scalajs.dom.raw.Node]
  ]
  type XmlAttributeType[T] = typingsSlinky.xmlCore.mod.XmlSchemaItem[T]
}
