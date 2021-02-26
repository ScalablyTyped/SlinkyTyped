package typingsSlinky.webpack.anon

import typingsSlinky.webpack.webpackOptionsMod.RuleSetLoader
import typingsSlinky.webpack.webpackOptionsMod.RuleSetQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ident extends StObject {
  
  /**
  			 * Unique loader identifier
  			 */
  var ident: js.UndefOr[String] = js.native
  
  /**
  			 * Loader name
  			 */
  var loader: js.UndefOr[RuleSetLoader] = js.native
  
  /**
  			 * Loader options
  			 */
  var options: js.UndefOr[RuleSetQuery] = js.native
  
  /**
  			 * Loader query
  			 */
  var query: js.UndefOr[RuleSetQuery] = js.native
}
object Ident {
  
  @scala.inline
  def apply(): Ident = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ident]
  }
  
  @scala.inline
  implicit class IdentMutableBuilder[Self <: Ident] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
    
    @scala.inline
    def setLoader(value: RuleSetLoader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    @scala.inline
    def setOptions(value: RuleSetQuery): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setQuery(value: RuleSetQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
