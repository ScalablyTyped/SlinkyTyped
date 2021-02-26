package typingsSlinky.tinajsTinaRedux

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tinajs/tina-redux", JSImport.Namespace)
  @js.native
  class ^[S, A /* <: Action[_] */] protected () extends TinaRedux[S, A] {
    def this(reduxStore: Store[S, A]) = this()
  }
  
  @js.native
  trait HOC extends StObject {
    
    var methods: js.Object = js.native
    
    def onLoad(): Unit = js.native
    
    def onUnload(): Unit = js.native
  }
  object HOC {
    
    @scala.inline
    def apply(methods: js.Object, onLoad: () => Unit, onUnload: () => Unit): HOC = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], onLoad = js.Any.fromFunction0(onLoad), onUnload = js.Any.fromFunction0(onUnload))
      __obj.asInstanceOf[HOC]
    }
    
    @scala.inline
    implicit class HOCMutableBuilder[Self <: HOC] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethods(value: js.Object): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnload(value: () => Unit): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
    }
  }
  
  type MapStateToProps = js.Function1[/* state */ js.Any, js.Any]
  
  @js.native
  trait TinaRedux[S, A /* <: Action[_] */] extends StObject {
    
    def connect(): HOC = js.native
    def connect(mapState: js.UndefOr[scala.Nothing], mapDispatch: mapDispatchToProps): HOC = js.native
    def connect(mapState: MapStateToProps): HOC = js.native
    def connect(mapState: MapStateToProps, mapDispatch: mapDispatchToProps): HOC = js.native
  }
  
  type mapDispatchToProps = js.Function1[/* dispatch */ Dispatch[AnyAction], js.Any]
}
