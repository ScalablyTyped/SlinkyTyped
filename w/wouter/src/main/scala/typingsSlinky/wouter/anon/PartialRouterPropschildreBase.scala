package typingsSlinky.wouter.anon

import typingsSlinky.preact.mod.ComponentChild
import typingsSlinky.preact.mod.ComponentChildren
import typingsSlinky.wouter.preactMatcherMod.DefaultParams
import typingsSlinky.wouter.preactMatcherMod.Match
import typingsSlinky.wouter.preactMatcherMod.MatcherFn
import typingsSlinky.wouter.useLocationMod.BaseLocationHook
import typingsSlinky.wouter.useLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wouter.wouter/preact.RouterProps> & {  children :preact.preact.ComponentChildren} */
@js.native
trait PartialRouterPropschildreBase extends StObject {
  
  var base: js.UndefOr[Path] = js.native
  
  var children: ComponentChildren = js.native
  
  var hook: js.UndefOr[BaseLocationHook] = js.native
  
  var matcher: js.UndefOr[MatcherFn] = js.native
}
object PartialRouterPropschildreBase {
  
  @scala.inline
  def apply(): PartialRouterPropschildreBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouterPropschildreBase]
  }
  
  @scala.inline
  implicit class PartialRouterPropschildreBaseMutableBuilder[Self <: PartialRouterPropschildreBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Path): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value :_*))
    
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
