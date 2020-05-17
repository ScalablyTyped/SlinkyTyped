package typingsSlinky.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Class[T] = org.scalablytyped.runtime.Instantiable1[/* arguments_ (repeated) */ js.Any, T]
  type Merge[FirstType, SecondType] = (typingsSlinky.typeFest.mod.Omit[
    FirstType, 
    typingsSlinky.std.Extract[/* keyof FirstType */ java.lang.String, /* keyof SecondType */ java.lang.String]
  ]) with SecondType
  type Omit[ObjectType, KeysType /* <: /* keyof ObjectType */ java.lang.String */] = typingsSlinky.std.Pick[
    ObjectType, 
    typingsSlinky.std.Exclude[/* keyof ObjectType */ java.lang.String, KeysType]
  ]
  type RequireAtLeastOne[ObjectType, KeysType /* <: /* keyof ObjectType */ java.lang.String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in KeysType ]: // …by picking that Key's type and making it required
  std.Required<std.Pick<ObjectType, Key>>}[KeysType] */ js.Any) with (typingsSlinky.typeFest.mod.Omit[ObjectType, KeysType])
  // Helper type. Not useful on its own.
  type Without[FirstType, SecondType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in std.Exclude<keyof FirstType, keyof SecondType> ]:? never}
    */ typingsSlinky.typeFest.typeFestStrings.Without with org.scalablytyped.runtime.TopLevel[js.Any]
}
