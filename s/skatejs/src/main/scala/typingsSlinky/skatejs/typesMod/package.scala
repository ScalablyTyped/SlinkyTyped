package typingsSlinky.skatejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ComponentProps[T, E] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: skatejs.skatejs/types.PropOptions<T[P]>}
    */ typingsSlinky.skatejs.skatejsStrings.ComponentProps with org.scalablytyped.runtime.TopLevel[T]
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type HTMLElementClass = typingsSlinky.skatejs.anon.Instantiable with org.scalablytyped.runtime.Instantiable0[org.scalajs.dom.raw.HTMLElement]
  type Maybe[T] = js.UndefOr[T | scala.Null]
  type Mixed = js.Object
  type PropOptionsAttribute = typingsSlinky.skatejs.typesMod.PropOptionsAttributeIdentifier | typingsSlinky.skatejs.typesMod.PropOptionsAttributeIdentifierMap
  type PropOptionsAttributeIdentifier = scala.Boolean | java.lang.String
}
