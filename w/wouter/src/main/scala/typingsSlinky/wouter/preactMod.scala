package typingsSlinky.wouter

import typingsSlinky.preact.mod.ComponentChild
import typingsSlinky.preact.mod.ComponentChildren
import typingsSlinky.preact.mod.ComponentType
import typingsSlinky.preact.mod.FunctionComponent
import typingsSlinky.preact.mod.VNode
import typingsSlinky.wouter.anon.Children
import typingsSlinky.wouter.anon.HrefPath
import typingsSlinky.wouter.anon.HrefTo
import typingsSlinky.wouter.anon.OmitHTMLAttributesEventTa
import typingsSlinky.wouter.anon.PartialRouterPropschildreBase
import typingsSlinky.wouter.preactMatcherMod.DefaultParams
import typingsSlinky.wouter.preactMatcherMod.Match
import typingsSlinky.wouter.preactMatcherMod.MatcherFn
import typingsSlinky.wouter.preactMatcherMod.Params
import typingsSlinky.wouter.useLocationMod.BaseLocationHook
import typingsSlinky.wouter.useLocationMod.HookNavigationOptions
import typingsSlinky.wouter.useLocationMod.HookReturnValue
import typingsSlinky.wouter.useLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preactMod {
  
  @JSImport("wouter/preact", "Link")
  @js.native
  def Link[H /* <: BaseLocationHook */](props: LinkProps[H]): VNode[_] | Null = js.native
  
  @JSImport("wouter/preact", "Redirect")
  @js.native
  def Redirect[H /* <: BaseLocationHook */](props: RedirectProps[H]): VNode[_] | Null = js.native
  
  @JSImport("wouter/preact", "Route")
  @js.native
  def Route[T /* <: DefaultParams */](props: RouteProps[T]): VNode[_] | Null = js.native
  
  @JSImport("wouter/preact", "Router")
  @js.native
  val Router: FunctionComponent[PartialRouterPropschildreBase] = js.native
  
  @JSImport("wouter/preact", "Switch")
  @js.native
  val Switch: FunctionComponent[SwitchProps] = js.native
  
  @JSImport("wouter/preact", "useLocation")
  @js.native
  def useLocation[H /* <: BaseLocationHook */](): HookReturnValue[H] = js.native
  
  @JSImport("wouter/preact", "useRoute")
  @js.native
  def useRoute[T /* <: DefaultParams */](pattern: Path): Match[T] = js.native
  
  @JSImport("wouter/preact", "useRouter")
  @js.native
  def useRouter(): RouterProps = js.native
  
  type LinkProps[H /* <: BaseLocationHook */] = OmitHTMLAttributesEventTa with NavigationalProps[H]
  
  type NavigationalProps[H /* <: BaseLocationHook */] = (HrefTo | HrefPath) with HookNavigationOptions[H]
  
  type RedirectProps[H /* <: BaseLocationHook */] = NavigationalProps[H] with Children
  
  @js.native
  trait RouteComponentProps[T /* <: DefaultParams */] extends StObject {
    
    var params: T = js.native
  }
  object RouteComponentProps {
    
    @scala.inline
    def apply[T /* <: DefaultParams */](params: T): RouteComponentProps[T] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteComponentProps[T]]
    }
    
    @scala.inline
    implicit class RouteComponentPropsMutableBuilder[Self <: RouteComponentProps[_], T /* <: DefaultParams */] (val x: Self with RouteComponentProps[T]) extends AnyVal {
      
      @scala.inline
      def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteProps[T /* <: DefaultParams */] extends StObject {
    
    var children: js.UndefOr[(js.Function1[/* params */ Params[T], ComponentChildren]) | ComponentChildren] = js.native
    
    var component: js.UndefOr[ComponentType[RouteComponentProps[T]]] = js.native
    
    var path: js.UndefOr[Path] = js.native
  }
  object RouteProps {
    
    @scala.inline
    def apply[T /* <: DefaultParams */](): RouteProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteProps[T]]
    }
    
    @scala.inline
    implicit class RoutePropsMutableBuilder[Self <: RouteProps[_], T /* <: DefaultParams */] (val x: Self with RouteProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (js.Function1[/* params */ Params[T], ComponentChildren]) | ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* params */ Params[T] => ComponentChildren): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setComponent(value: ComponentType[RouteComponentProps[T]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait RouterProps extends StObject {
    
    var base: Path = js.native
    
    var hook: BaseLocationHook = js.native
    
    var matcher: MatcherFn = js.native
  }
  object RouterProps {
    
    @scala.inline
    def apply(
      base: Path,
      hook: /* repeated */ js.Any => js.Tuple2[Path, js.Function2[/* path */ Path, /* repeated */ js.Any, js.Any]],
      matcher: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]
    ): RouterProps = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], hook = js.Any.fromFunction1(hook), matcher = js.Any.fromFunction2(matcher))
      __obj.asInstanceOf[RouterProps]
    }
    
    @scala.inline
    implicit class RouterPropsMutableBuilder[Self <: RouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: Path): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHook(
        value: /* repeated */ js.Any => js.Tuple2[Path, js.Function2[/* path */ Path, /* repeated */ js.Any, js.Any]]
      ): Self = StObject.set(x, "hook", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatcher(value: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): Self = StObject.set(x, "matcher", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SwitchProps extends StObject {
    
    var children: js.Array[VNode[RouteProps[DefaultParams]]] = js.native
    
    var location: js.UndefOr[String] = js.native
  }
  object SwitchProps {
    
    @scala.inline
    def apply(children: js.Array[VNode[RouteProps[DefaultParams]]]): SwitchProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit class SwitchPropsMutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[VNode[RouteProps[DefaultParams]]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: VNode[RouteProps[DefaultParams]]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
