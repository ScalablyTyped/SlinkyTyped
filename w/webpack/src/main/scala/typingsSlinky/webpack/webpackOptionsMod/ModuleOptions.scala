package typingsSlinky.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleOptions extends StObject {
  
  /**
  	 * An array of rules applied by default for modules.
  	 */
  var defaultRules: js.UndefOr[RuleSetRules] = js.native
  
  /**
  	 * Enable warnings for full dynamic dependencies
  	 */
  var exprContextCritical: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable recursive directory lookup for full dynamic dependencies
  	 */
  var exprContextRecursive: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Sets the default regular expression for full dynamic dependencies
  	 */
  var exprContextRegExp: js.UndefOr[Boolean | js.RegExp] = js.native
  
  /**
  	 * Set the default request for full dynamic dependencies
  	 */
  var exprContextRequest: js.UndefOr[String] = js.native
  
  /**
  	 * Don't parse files matching. It's matched against the full resolved request.
  	 */
  var noParse: js.UndefOr[(js.Array[js.RegExp | String]) | js.RegExp | js.Function | String] = js.native
  
  /**
  	 * An array of rules applied for modules.
  	 */
  var rules: js.UndefOr[RuleSetRules] = js.native
  
  /**
  	 * Emit errors instead of warnings when imported names don't exist in imported module
  	 */
  var strictExportPresence: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Handle the this context correctly according to the spec for namespace objects
  	 */
  var strictThisContextOnImports: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable warnings when using the require function in a not statically analyse-able way
  	 */
  var unknownContextCritical: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable recursive directory lookup when using the require function in a not statically analyse-able way
  	 */
  var unknownContextRecursive: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Sets the regular expression when using the require function in a not statically analyse-able way
  	 */
  var unknownContextRegExp: js.UndefOr[Boolean | js.RegExp] = js.native
  
  /**
  	 * Sets the request when using the require function in a not statically analyse-able way
  	 */
  var unknownContextRequest: js.UndefOr[String] = js.native
  
  /**
  	 * Cache the resolving of module requests
  	 */
  var unsafeCache: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
  	 * Enable warnings for partial dynamic dependencies
  	 */
  var wrappedContextCritical: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable recursive directory lookup for partial dynamic dependencies
  	 */
  var wrappedContextRecursive: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Set the inner regular expression for partial dynamic dependencies
  	 */
  var wrappedContextRegExp: js.UndefOr[js.RegExp] = js.native
}
object ModuleOptions {
  
  @scala.inline
  def apply(): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleOptions]
  }
  
  @scala.inline
  implicit class ModuleOptionsMutableBuilder[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRules(value: RuleSetRules): Self = StObject.set(x, "defaultRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRulesUndefined: Self = StObject.set(x, "defaultRules", js.undefined)
    
    @scala.inline
    def setDefaultRulesVarargs(value: RuleSetRule*): Self = StObject.set(x, "defaultRules", js.Array(value :_*))
    
    @scala.inline
    def setExprContextCritical(value: Boolean): Self = StObject.set(x, "exprContextCritical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprContextCriticalUndefined: Self = StObject.set(x, "exprContextCritical", js.undefined)
    
    @scala.inline
    def setExprContextRecursive(value: Boolean): Self = StObject.set(x, "exprContextRecursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprContextRecursiveUndefined: Self = StObject.set(x, "exprContextRecursive", js.undefined)
    
    @scala.inline
    def setExprContextRegExp(value: Boolean | js.RegExp): Self = StObject.set(x, "exprContextRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprContextRegExpRegExp(value: js.RegExp): Self = StObject.set(x, "exprContextRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprContextRegExpUndefined: Self = StObject.set(x, "exprContextRegExp", js.undefined)
    
    @scala.inline
    def setExprContextRequest(value: String): Self = StObject.set(x, "exprContextRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprContextRequestUndefined: Self = StObject.set(x, "exprContextRequest", js.undefined)
    
    @scala.inline
    def setNoParse(value: (js.Array[js.RegExp | String]) | js.RegExp | js.Function | String): Self = StObject.set(x, "noParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoParseRegExp(value: js.RegExp): Self = StObject.set(x, "noParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoParseUndefined: Self = StObject.set(x, "noParse", js.undefined)
    
    @scala.inline
    def setNoParseVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "noParse", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: RuleSetRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: RuleSetRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setStrictExportPresence(value: Boolean): Self = StObject.set(x, "strictExportPresence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictExportPresenceUndefined: Self = StObject.set(x, "strictExportPresence", js.undefined)
    
    @scala.inline
    def setStrictThisContextOnImports(value: Boolean): Self = StObject.set(x, "strictThisContextOnImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictThisContextOnImportsUndefined: Self = StObject.set(x, "strictThisContextOnImports", js.undefined)
    
    @scala.inline
    def setUnknownContextCritical(value: Boolean): Self = StObject.set(x, "unknownContextCritical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownContextCriticalUndefined: Self = StObject.set(x, "unknownContextCritical", js.undefined)
    
    @scala.inline
    def setUnknownContextRecursive(value: Boolean): Self = StObject.set(x, "unknownContextRecursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownContextRecursiveUndefined: Self = StObject.set(x, "unknownContextRecursive", js.undefined)
    
    @scala.inline
    def setUnknownContextRegExp(value: Boolean | js.RegExp): Self = StObject.set(x, "unknownContextRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownContextRegExpRegExp(value: js.RegExp): Self = StObject.set(x, "unknownContextRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownContextRegExpUndefined: Self = StObject.set(x, "unknownContextRegExp", js.undefined)
    
    @scala.inline
    def setUnknownContextRequest(value: String): Self = StObject.set(x, "unknownContextRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownContextRequestUndefined: Self = StObject.set(x, "unknownContextRequest", js.undefined)
    
    @scala.inline
    def setUnsafeCache(value: Boolean | js.Function): Self = StObject.set(x, "unsafeCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsafeCacheUndefined: Self = StObject.set(x, "unsafeCache", js.undefined)
    
    @scala.inline
    def setWrappedContextCritical(value: Boolean): Self = StObject.set(x, "wrappedContextCritical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappedContextCriticalUndefined: Self = StObject.set(x, "wrappedContextCritical", js.undefined)
    
    @scala.inline
    def setWrappedContextRecursive(value: Boolean): Self = StObject.set(x, "wrappedContextRecursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappedContextRecursiveUndefined: Self = StObject.set(x, "wrappedContextRecursive", js.undefined)
    
    @scala.inline
    def setWrappedContextRegExp(value: js.RegExp): Self = StObject.set(x, "wrappedContextRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappedContextRegExpUndefined: Self = StObject.set(x, "wrappedContextRegExp", js.undefined)
  }
}
