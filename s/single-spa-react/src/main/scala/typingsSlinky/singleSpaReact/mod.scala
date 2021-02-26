package typingsSlinky.singleSpaReact

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.singleSpaReact.anon.TypeofReact
import typingsSlinky.singleSpaReact.anon.TypeofReactDOM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("single-spa-react", JSImport.Namespace)
  @js.native
  def apply(opts: Options): Lifecycles = js.native
  
  @js.native
  trait Lifecycles extends StObject {
    
    def bootstrap(props: js.Any): js.Promise[Unit] = js.native
    
    def mount(props: js.Any): js.Promise[Unit] = js.native
    
    def unmount(props: js.Any): js.Promise[Unit] = js.native
    
    var update: js.UndefOr[js.Function1[/* props */ js.Any, js.Promise[Unit]]] = js.native
  }
  object Lifecycles {
    
    @scala.inline
    def apply(
      bootstrap: js.Any => js.Promise[Unit],
      mount: js.Any => js.Promise[Unit],
      unmount: js.Any => js.Promise[Unit]
    ): Lifecycles = {
      val __obj = js.Dynamic.literal(bootstrap = js.Any.fromFunction1(bootstrap), mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount))
      __obj.asInstanceOf[Lifecycles]
    }
    
    @scala.inline
    implicit class LifecyclesMutableBuilder[Self <: Lifecycles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBootstrap(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "bootstrap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMount(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnmount(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "unmount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: /* props */ js.Any => js.Promise[Unit]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var React: TypeofReact = js.native
    
    var ReactDOM: TypeofReactDOM = js.native
    
    var domElementGetter: js.UndefOr[js.Function0[Element]] = js.native
    
    var loadRootComponent: js.UndefOr[js.Function0[js.Promise[ReactComponentClass[_]]]] = js.native
    
    var parcelCanUpdate: js.UndefOr[Boolean] = js.native
    
    var rootComponent: js.UndefOr[ReactComponentClass[_]] = js.native
    
    var suppressComponentDidCatchWarning: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(React: TypeofReact, ReactDOM: TypeofReactDOM): Options = {
      val __obj = js.Dynamic.literal(React = React.asInstanceOf[js.Any], ReactDOM = ReactDOM.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomElementGetter(value: () => Element): Self = StObject.set(x, "domElementGetter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDomElementGetterUndefined: Self = StObject.set(x, "domElementGetter", js.undefined)
      
      @scala.inline
      def setLoadRootComponent(value: () => js.Promise[ReactComponentClass[_]]): Self = StObject.set(x, "loadRootComponent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadRootComponentUndefined: Self = StObject.set(x, "loadRootComponent", js.undefined)
      
      @scala.inline
      def setParcelCanUpdate(value: Boolean): Self = StObject.set(x, "parcelCanUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParcelCanUpdateUndefined: Self = StObject.set(x, "parcelCanUpdate", js.undefined)
      
      @scala.inline
      def setReact(value: TypeofReact): Self = StObject.set(x, "React", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactDOM(value: TypeofReactDOM): Self = StObject.set(x, "ReactDOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "rootComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "rootComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "rootComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootComponentUndefined: Self = StObject.set(x, "rootComponent", js.undefined)
      
      @scala.inline
      def setSuppressComponentDidCatchWarning(value: Boolean): Self = StObject.set(x, "suppressComponentDidCatchWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressComponentDidCatchWarningUndefined: Self = StObject.set(x, "suppressComponentDidCatchWarning", js.undefined)
    }
  }
}
