package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <number> basic data type. */
@js.native
trait SVGNumber extends StObject {
  
  var value: Double = js.native
}
object SVGNumber {
  
  @scala.inline
  def apply(value: Double): org.scalajs.dom.raw.SVGNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGNumber]
  }
  
  @scala.inline
  implicit class SVGNumberMutableBuilder[Self <: org.scalajs.dom.raw.SVGNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
