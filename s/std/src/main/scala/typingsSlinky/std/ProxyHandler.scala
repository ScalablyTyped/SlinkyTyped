package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyHandler[T /* <: js.Object */] extends StObject {
  
  @JSName("apply")
  var apply: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any], _]
  ] = js.native
  
  var construct: js.UndefOr[
    js.Function3[/* target */ T, /* argArray */ js.Any, /* newTarget */ js.UndefOr[js.Any], js.Object]
  ] = js.native
  
  var defineProperty: js.UndefOr[
    js.Function3[
      /* target */ T, 
      /* p */ PropertyKey, 
      /* attributes */ js.PropertyDescriptor, 
      scala.Boolean
    ]
  ] = js.native
  
  var deleteProperty: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean]] = js.native
  
  var get: js.UndefOr[js.Function3[/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any, _]] = js.native
  
  var getOwnPropertyDescriptor: js.UndefOr[
    js.Function2[/* target */ T, /* p */ PropertyKey, js.UndefOr[js.PropertyDescriptor]]
  ] = js.native
  
  var getPrototypeOf: js.UndefOr[js.Function1[/* target */ T, js.Object | Null]] = js.native
  
  var has: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean]] = js.native
  
  var isExtensible: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.native
  
  var ownKeys: js.UndefOr[js.Function1[/* target */ T, js.Array[PropertyKey]]] = js.native
  
  var preventExtensions: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.native
  
  var set: js.UndefOr[
    js.Function4[
      /* target */ T, 
      /* p */ PropertyKey, 
      /* value */ js.Any, 
      /* receiver */ js.Any, 
      scala.Boolean
    ]
  ] = js.native
  
  var setPrototypeOf: js.UndefOr[js.Function2[/* target */ T, /* v */ js.Any, scala.Boolean]] = js.native
}
object ProxyHandler {
  
  @scala.inline
  def apply[T /* <: js.Object */](): ProxyHandler[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyHandler[T]]
  }
  
  @scala.inline
  implicit class ProxyHandlerMutableBuilder[Self <: ProxyHandler[_], T /* <: js.Object */] (val x: Self with ProxyHandler[T]) extends AnyVal {
    
    @scala.inline
    def setApply(value: (/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "apply", js.Any.fromFunction3(value))
    
    @scala.inline
    def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    @scala.inline
    def setConstruct(value: (/* target */ T, /* argArray */ js.Any, /* newTarget */ js.UndefOr[js.Any]) => js.Object): Self = StObject.set(x, "construct", js.Any.fromFunction3(value))
    
    @scala.inline
    def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
    
    @scala.inline
    def setDefineProperty(
      value: (/* target */ T, /* p */ PropertyKey, /* attributes */ js.PropertyDescriptor) => scala.Boolean
    ): Self = StObject.set(x, "defineProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDefinePropertyUndefined: Self = StObject.set(x, "defineProperty", js.undefined)
    
    @scala.inline
    def setDeleteProperty(value: (/* target */ T, /* p */ PropertyKey) => scala.Boolean): Self = StObject.set(x, "deleteProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeletePropertyUndefined: Self = StObject.set(x, "deleteProperty", js.undefined)
    
    @scala.inline
    def setGet(value: (/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any) => _): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetOwnPropertyDescriptor(value: (/* target */ T, /* p */ PropertyKey) => js.UndefOr[js.PropertyDescriptor]): Self = StObject.set(x, "getOwnPropertyDescriptor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetOwnPropertyDescriptorUndefined: Self = StObject.set(x, "getOwnPropertyDescriptor", js.undefined)
    
    @scala.inline
    def setGetPrototypeOf(value: /* target */ T => js.Object | Null): Self = StObject.set(x, "getPrototypeOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPrototypeOfUndefined: Self = StObject.set(x, "getPrototypeOf", js.undefined)
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setHas(value: (/* target */ T, /* p */ PropertyKey) => scala.Boolean): Self = StObject.set(x, "has", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
    
    @scala.inline
    def setIsExtensible(value: /* target */ T => scala.Boolean): Self = StObject.set(x, "isExtensible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsExtensibleUndefined: Self = StObject.set(x, "isExtensible", js.undefined)
    
    @scala.inline
    def setOwnKeys(value: /* target */ T => js.Array[PropertyKey]): Self = StObject.set(x, "ownKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOwnKeysUndefined: Self = StObject.set(x, "ownKeys", js.undefined)
    
    @scala.inline
    def setPreventExtensions(value: /* target */ T => scala.Boolean): Self = StObject.set(x, "preventExtensions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreventExtensionsUndefined: Self = StObject.set(x, "preventExtensions", js.undefined)
    
    @scala.inline
    def setSet(
      value: (/* target */ T, /* p */ PropertyKey, /* value */ js.Any, /* receiver */ js.Any) => scala.Boolean
    ): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetPrototypeOf(value: (/* target */ T, /* v */ js.Any) => scala.Boolean): Self = StObject.set(x, "setPrototypeOf", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPrototypeOfUndefined: Self = StObject.set(x, "setPrototypeOf", js.undefined)
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
