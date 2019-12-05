package typingsSlinky.typeDashFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeDashFestMod {
  import org.scalablytyped.runtime.Instantiable1
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Extract
  import typingsSlinky.std.Pick

  type Class[T] = Instantiable1[/* arguments_ (repeated) */ js.Any, T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typings.typeDashFest.typeDashFestMod.JsonObject
    - typings.typeDashFest.typeDashFestMod.JsonArray
  */
  type JsonValue = _JsonValue | String | Double | Boolean | Null
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: Primitive */] = LiteralType | (BaseType with js.Object)
  type Merge[FirstType, SecondType] = (Omit[FirstType, Extract[String, String]]) with SecondType
  type MergeExclusive[FirstType, SecondType] = FirstType | SecondType | ((Without[FirstType, SecondType]) with SecondType) | ((Without[SecondType, FirstType]) with FirstType)
  type Omit[ObjectType, KeysType /* <: String */] = Pick[ObjectType, Exclude[String, KeysType]]
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol]
  type RequireAtLeastOne[ObjectType, KeysType /* <: String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in KeysType ]: // …by picking that Key's type and making it required
  std.Required<std.Pick<ObjectType, Key>>}[KeysType] */ js.Any) with (Omit[ObjectType, KeysType])
  type TypedArray = scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
  // Helper type. Not useful on its own.
  type Without[FirstType, SecondType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in std.Exclude<keyof FirstType, keyof SecondType> ]:? never}
    */ typingsSlinky.typeDashFest.typeDashFestStrings.Without with js.Any
}
