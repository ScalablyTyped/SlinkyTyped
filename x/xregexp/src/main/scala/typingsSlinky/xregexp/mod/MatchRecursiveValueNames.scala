package typingsSlinky.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Value names for recursive matching parts.
  */
@js.native
trait MatchRecursiveValueNames extends StObject {
  
  /**
    * Name for the unmatched portion of string leading up to `left` delimiter.
    */
  var `0`: String | Null = js.native
  
  /**
    * Name for the `left` delimiter.
    */
  var `1`: String | Null = js.native
  
  /**
    * Name for the portion of the string inside the `left` and `right` delimiters.
    */
  var `2`: String | Null = js.native
  
  /**
    * Name for the `right` delimiter.
    */
  var `3`: String | Null = js.native
}
object MatchRecursiveValueNames {
  
  @scala.inline
  def apply(): MatchRecursiveValueNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchRecursiveValueNames]
  }
  
  @scala.inline
  implicit class MatchRecursiveValueNamesMutableBuilder[Self <: MatchRecursiveValueNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set0Null: Self = StObject.set(x, "0", null)
    
    @scala.inline
    def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1Null: Self = StObject.set(x, "1", null)
    
    @scala.inline
    def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2Null: Self = StObject.set(x, "2", null)
    
    @scala.inline
    def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3Null: Self = StObject.set(x, "3", null)
  }
}
