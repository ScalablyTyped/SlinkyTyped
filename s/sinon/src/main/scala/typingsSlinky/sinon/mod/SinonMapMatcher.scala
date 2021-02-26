package typingsSlinky.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonMapMatcher extends SinonMatcher {
  
  /**
    * Requires a Map to contain each one of the items the given map has.
    */
  def contains(expected: SimplifiedMap): SinonMatcher = js.native
  
  /**
    * Requires a Map to be deep equal another one.
    */
  def deepEquals(expected: SimplifiedMap): SinonMatcher = js.native
}
object SinonMapMatcher {
  
  @scala.inline
  def apply(
    and: SinonMatcher => SinonMatcher,
    contains: SimplifiedMap => SinonMatcher,
    deepEquals: SimplifiedMap => SinonMatcher,
    or: SinonMatcher => SinonMatcher,
    test: js.Any => Boolean
  ): SinonMapMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), or = js.Any.fromFunction1(or), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SinonMapMatcher]
  }
  
  @scala.inline
  implicit class SinonMapMatcherMutableBuilder[Self <: SinonMapMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: SimplifiedMap => SinonMatcher): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeepEquals(value: SimplifiedMap => SinonMatcher): Self = StObject.set(x, "deepEquals", js.Any.fromFunction1(value))
  }
}
