package typingsSlinky.wouter.anon

import slinky.core.facade.ReactElement
import typingsSlinky.wouter.matcherMod.DefaultParams
import typingsSlinky.wouter.matcherMod.Match
import typingsSlinky.wouter.matcherMod.MatcherFn
import typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook
import typingsSlinky.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wouter.wouter.RouterProps> & {  children :react.react.ReactNode} */
@js.native
trait PartialRouterPropschildre extends StObject {
  
  var base: js.UndefOr[Path] = js.native
  
  var children: ReactElement = js.native
  
  var hook: js.UndefOr[BaseLocationHook] = js.native
  
  var matcher: js.UndefOr[MatcherFn] = js.native
}
object PartialRouterPropschildre {
  
  @scala.inline
  def apply(): PartialRouterPropschildre = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouterPropschildre]
  }
  
  @scala.inline
  implicit class PartialRouterPropschildreMutableBuilder[Self <: PartialRouterPropschildre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Path): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setHook(
      value: /* repeated */ js.Any => js.Tuple2[Path, js.Function2[/* path */ Path, /* repeated */ js.Any, js.Any]]
    ): Self = StObject.set(x, "hook", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
    
    @scala.inline
    def setMatcher(value: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): Self = StObject.set(x, "matcher", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
  }
}
