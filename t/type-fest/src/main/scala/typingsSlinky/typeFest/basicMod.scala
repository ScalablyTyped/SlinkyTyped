package typingsSlinky.typeFest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Array
import typingsSlinky.std.BigInt64Array
import typingsSlinky.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicMod {
  
  type Class[T, Arguments /* <: js.Array[_] */] = Instantiable1[/* arguments_ */ Arguments, T]
  
  @js.native
  trait JsonArray
    extends Array[JsonValue]
       with _JsonValue
  
  @js.native
  trait JsonObject
    extends /* key */ StringDictionary[JsonValue]
       with _JsonValue
  object JsonObject {
    
    @scala.inline
    def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typingsSlinky.typeFest.basicMod.JsonObject
    - typingsSlinky.typeFest.basicMod.JsonArray
  */
  type JsonValue = _JsonValue | String | Double | Boolean | Null
  
  @js.native
  trait ObservableLike extends StObject {
    
    def subscribe(observer: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  }
  
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol | js.BigInt]
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | BigInt64Array | BigUint64Array
  
  trait _JsonValue extends StObject
  
  object global {
    
    @js.native
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol = js.native
    }
    object SymbolConstructor {
      
      @scala.inline
      def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      @scala.inline
      implicit class SymbolConstructorMutableBuilder[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
  }
}
