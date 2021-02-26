package typingsSlinky.wouter

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.wouter.anon.Children
import typingsSlinky.wouter.anon.Href
import typingsSlinky.wouter.anon.OmitAnchorHTMLAttributesH
import typingsSlinky.wouter.anon.PartialRouterPropschildre
import typingsSlinky.wouter.anon.To
import typingsSlinky.wouter.matcherMod.DefaultParams
import typingsSlinky.wouter.matcherMod.Match
import typingsSlinky.wouter.matcherMod.MatcherFn
import typingsSlinky.wouter.matcherMod.Params
import typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook
import typingsSlinky.wouter.wouterUseLocationMod.HookNavigationOptions
import typingsSlinky.wouter.wouterUseLocationMod.HookReturnValue
import typingsSlinky.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wouter", "Link")
  @js.native
  def Link[H /* <: BaseLocationHook */](props: PropsWithChildren[LinkProps[H]]): ReactElement | Null = js.native
  @JSImport("wouter", "Link")
  @js.native
  def Link[H /* <: BaseLocationHook */](props: PropsWithChildren[LinkProps[H]], context: js.Any): ReactElement | Null = js.native
  
  @JSImport("wouter", "Redirect")
  @js.native
  def Redirect[H /* <: BaseLocationHook */](props: PropsWithChildren[RedirectProps[H]]): ReactElement | Null = js.native
  @JSImport("wouter", "Redirect")
  @js.native
  def Redirect[H /* <: BaseLocationHook */](props: PropsWithChildren[RedirectProps[H]], context: js.Any): ReactElement | Null = js.native
  
  @JSImport("wouter", "Route")
  @js.native
  def Route[T /* <: DefaultParams */](props: RouteProps[T]): ReactElement | Null = js.native
  
  @JSImport("wouter", "Router")
  @js.native
  val Router: ReactComponentClass[PartialRouterPropschildre] = js.native
  
  @JSImport("wouter", "Switch")
  @js.native
  val Switch: ReactComponentClass[SwitchProps] = js.native
  
  @JSImport("wouter", "useLocation")
  @js.native
  def useLocation[H /* <: BaseLocationHook */](): HookReturnValue[H] = js.native
  
  @JSImport("wouter", "useRoute")
  @js.native
  def useRoute[T /* <: DefaultParams */](pattern: Path): Match[T] = js.native
  
  @JSImport("wouter", "useRouter")
  @js.native
  def useRouter(): RouterProps = js.native
  
  type LinkProps[H /* <: BaseLocationHook */] = OmitAnchorHTMLAttributesH with NavigationalProps[H]
  
  type NavigationalProps[H /* <: BaseLocationHook */] = (Href | To) with HookNavigationOptions[H]
  
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
    
    var children: js.UndefOr[(js.Function1[/* params */ Params[T], ReactElement]) | ReactElement] = js.native
    
    var component: js.UndefOr[ReactComponentClass[RouteComponentProps[T]]] = js.native
    
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
      def setChildren(value: (js.Function1[/* params */ Params[T], ReactElement]) | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* params */ Params[T] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponent(value: ReactComponentClass[RouteComponentProps[T]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentComponentClass(value: ReactComponentClass[RouteComponentProps[T]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunctionComponent(value: ReactComponentClass[RouteComponentProps[T]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
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
    
    var children: js.Array[ReactElement] = js.native
    
    var location: js.UndefOr[String] = js.native
  }
  object SwitchProps {
    
    @scala.inline
    def apply(children: js.Array[ReactElement]): SwitchProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit class SwitchPropsMutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
