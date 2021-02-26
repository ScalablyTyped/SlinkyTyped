package typingsSlinky.webpack.anon

import typingsSlinky.webpack.webpackOptionsMod.RuleSetConditionOrConditions
import typingsSlinky.webpack.webpackOptionsMod.RuleSetConditions
import typingsSlinky.webpack.webpackOptionsMod._RuleSetCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait And extends _RuleSetCondition {
  
  /**
  			 * Logical AND
  			 */
  var and: js.UndefOr[RuleSetConditions] = js.native
  
  /**
  			 * Exclude all modules matching any of these conditions
  			 */
  var exclude: js.UndefOr[RuleSetConditionOrConditions] = js.native
  
  /**
  			 * Exclude all modules matching not any of these conditions
  			 */
  var include: js.UndefOr[RuleSetConditionOrConditions] = js.native
  
  /**
  			 * Logical NOT
  			 */
  var not: js.UndefOr[RuleSetConditions] = js.native
  
  /**
  			 * Logical OR
  			 */
  var or: js.UndefOr[RuleSetConditions] = js.native
  
  /**
  			 * Exclude all modules matching any of these conditions
  			 */
  var test: js.UndefOr[RuleSetConditionOrConditions] = js.native
}
object And {
  
  @scala.inline
  def apply(): And = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And]
  }
  
  @scala.inline
  implicit class AndMutableBuilder[Self <: And] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(value: RuleSetConditions): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    @scala.inline
    def setExclude(value: RuleSetConditionOrConditions): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcludeRegExp(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setInclude(value: RuleSetConditionOrConditions): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludeRegExp(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setNot(value: RuleSetConditions): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setOr(value: RuleSetConditions): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
    
    @scala.inline
    def setTest(value: RuleSetConditionOrConditions): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTestRegExp(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
