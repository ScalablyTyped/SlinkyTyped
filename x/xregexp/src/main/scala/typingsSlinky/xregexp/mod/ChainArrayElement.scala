package typingsSlinky.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is an element in the `XRegExpMatchChainArray` that also specifies a specific back reference.
  */
@js.native
trait ChainArrayElement extends StObject {
  
  /**
    * The specific backreference.
    */
  var backref: Double | String = js.native
  
  /**
    * The `RegExp` to use.
    */
  var regexp: js.RegExp = js.native
}
object ChainArrayElement {
  
  @scala.inline
  def apply(backref: Double | String, regexp: js.RegExp): ChainArrayElement = {
    val __obj = js.Dynamic.literal(backref = backref.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainArrayElement]
  }
  
  @scala.inline
  implicit class ChainArrayElementMutableBuilder[Self <: ChainArrayElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackref(value: Double | String): Self = StObject.set(x, "backref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexp(value: js.RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
  }
}
