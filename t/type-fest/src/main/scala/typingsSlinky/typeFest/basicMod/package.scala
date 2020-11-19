package typingsSlinky.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object basicMod {
  
  type Class[T, Arguments /* <: js.Array[_] */] = org.scalablytyped.runtime.Instantiable1[/* arguments_ */ Arguments, T]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typingsSlinky.typeFest.basicMod.JsonObject
    - typingsSlinky.typeFest.basicMod.JsonArray
  */
  type JsonValue = typingsSlinky.typeFest.basicMod._JsonValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  
  type Primitive = js.UndefOr[
    scala.Null | java.lang.String | scala.Double | scala.Boolean | js.Symbol | js.BigInt
  ]
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | typingsSlinky.std.BigInt64Array | typingsSlinky.std.BigUint64Array
}
