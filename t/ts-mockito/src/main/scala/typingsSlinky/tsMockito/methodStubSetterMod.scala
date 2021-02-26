package typingsSlinky.tsMockito

import typingsSlinky.tsMockito.methodToStubMod.MethodToStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodStubSetterMod {
  
  @JSImport("ts-mockito/lib/MethodStubSetter", "MethodStubSetter")
  @js.native
  class MethodStubSetter[T, ResolveType, RejectType] protected () extends StObject {
    def this(methodToStub: MethodToStub) = this()
    
    var convertToPropertyIfIsNotAFunction: js.Any = js.native
    
    var groupIndex: js.Any = js.native
    
    var methodToStub: js.Any = js.native
    
    def thenCall(func: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    
    var thenDoNothing: js.Any = js.native
    
    def thenReject(rest: js.Error*): this.type = js.native
    
    def thenResolve(rest: ResolveType*): this.type = js.native
    
    def thenReturn(rest: T*): this.type = js.native
    
    def thenThrow(rest: js.Error*): this.type = js.native
  }
  /* static members */
  object MethodStubSetter {
    
    @JSImport("ts-mockito/lib/MethodStubSetter", "MethodStubSetter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ts-mockito/lib/MethodStubSetter", "MethodStubSetter.globalGroupIndex")
    @js.native
    def globalGroupIndex: js.Any = js.native
    @scala.inline
    def globalGroupIndex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalGroupIndex")(x.asInstanceOf[js.Any])
  }
}
