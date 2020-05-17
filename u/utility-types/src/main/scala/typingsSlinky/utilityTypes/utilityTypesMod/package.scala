package typingsSlinky.utilityTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilityTypesMod {
  type Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type Diff[T /* <: U */, U /* <: js.Object */] = typingsSlinky.std.Pick[
    T, 
    typingsSlinky.utilityTypes.mappedTypesMod.SetComplement[/* keyof T */ java.lang.String, /* keyof U */ java.lang.String]
  ]
  type ElementType[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K & any ]: any}
    */ typingsSlinky.utilityTypes.utilityTypesStrings.$ElementType with org.scalablytyped.runtime.TopLevel[js.Any] */, K /* <: (/* keyof T */ java.lang.String) | scala.Double */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  type Keys[T /* <: js.Object */] = /* keyof T */ java.lang.String
  type PropertyType[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  type ReadOnly[T /* <: js.Object */] = typingsSlinky.utilityTypes.mappedTypesMod.DeepReadonly[T]
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
