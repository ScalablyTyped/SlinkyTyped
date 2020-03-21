package typingsSlinky.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Class[T] = org.scalablytyped.runtime.Instantiable1[/* arguments_ (repeated) */ js.Any, T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typingsSlinky.typeFest.mod.JsonObject
    - typingsSlinky.typeFest.mod.JsonArray
  */
  type JsonValue = typingsSlinky.typeFest.mod._JsonValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: typingsSlinky.typeFest.mod.Primitive */] = LiteralType | (BaseType with js.Object)
  type Merge[FirstType, SecondType] = (typingsSlinky.typeFest.mod.Omit[FirstType, typingsSlinky.std.Extract[java.lang.String, java.lang.String]]) with SecondType
  type MergeExclusive[FirstType, SecondType] = FirstType | SecondType | ((typingsSlinky.typeFest.mod.Without[FirstType, SecondType]) with SecondType) | ((typingsSlinky.typeFest.mod.Without[SecondType, FirstType]) with FirstType)
  type Omit[ObjectType, KeysType /* <: java.lang.String */] = typingsSlinky.std.Pick[ObjectType, typingsSlinky.std.Exclude[java.lang.String, KeysType]]
  type Primitive = js.UndefOr[scala.Null | java.lang.String | scala.Double | scala.Boolean | js.Symbol]
  type RequireAtLeastOne[ObjectType, KeysType /* <: java.lang.String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in KeysType ]: // …by picking that Key's type and making it required
  std.Required<std.Pick<ObjectType, Key>>}[KeysType] */ js.Any) with (typingsSlinky.typeFest.mod.Omit[ObjectType, KeysType])
  type TypedArray = scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
  // Helper type. Not useful on its own.
  type Without[FirstType, SecondType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in std.Exclude<keyof FirstType, keyof SecondType> ]:? never}
    */ typingsSlinky.typeFest.typeFestStrings.Without with js.Any
}
