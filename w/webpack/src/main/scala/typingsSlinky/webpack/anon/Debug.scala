package typingsSlinky.webpack.anon

import typingsSlinky.webpack.webpackOptionsMod.FilterItemTypes
import typingsSlinky.webpack.webpackOptionsMod.FilterTypes
import typingsSlinky.webpack.webpackStrings.error
import typingsSlinky.webpack.webpackStrings.info
import typingsSlinky.webpack.webpackStrings.log
import typingsSlinky.webpack.webpackStrings.none
import typingsSlinky.webpack.webpackStrings.verbose
import typingsSlinky.webpack.webpackStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends StObject {
  
  /**
  		 * Enable debug logging for specific loggers
  		 */
  var debug: js.UndefOr[FilterTypes | Boolean] = js.native
  
  /**
  		 * Log level
  		 */
  var level: js.UndefOr[none | error | warn | info | log | verbose] = js.native
}
object Debug {
  
  @scala.inline
  def apply(): Debug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: FilterTypes | Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebugRegExp(value: js.RegExp): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDebugVarargs(value: FilterItemTypes*): Self = StObject.set(x, "debug", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: none | error | warn | info | log | verbose): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
