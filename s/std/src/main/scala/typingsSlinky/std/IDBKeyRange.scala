package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A key range can be a single value or a range with upper and lower bounds or endpoints. If the key range has both upper and lower bounds, then it is bounded; if it has no bounds, it is unbounded. A bounded key range can either be open (the endpoints are excluded) or closed (the endpoints are included). To retrieve all keys within a certain range, you can use the following code constructs: */
@js.native
trait IDBKeyRange extends StObject {
  
  /**
    * Returns true if key is included in the range, and false otherwise.
    */
  def includes(key: js.Any): scala.Boolean = js.native
  
  /**
    * Returns lower bound, or undefined if none.
    */
  val lower: js.Any = js.native
  
  /**
    * Returns true if the lower open flag is set, and false otherwise.
    */
  val lowerOpen: scala.Boolean = js.native
  
  /**
    * Returns upper bound, or undefined if none.
    */
  val upper: js.Any = js.native
  
  /**
    * Returns true if the upper open flag is set, and false otherwise.
    */
  val upperOpen: scala.Boolean = js.native
}
object IDBKeyRange {
  
  @scala.inline
  def apply(
    includes: js.Any => scala.Boolean,
    lower: js.Any,
    lowerOpen: scala.Boolean,
    upper: js.Any,
    upperOpen: scala.Boolean
  ): org.scalajs.dom.raw.IDBKeyRange = {
    val __obj = js.Dynamic.literal(includes = js.Any.fromFunction1(includes), lower = lower.asInstanceOf[js.Any], lowerOpen = lowerOpen.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any], upperOpen = upperOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.IDBKeyRange]
  }
  
  @scala.inline
  implicit class IDBKeyRangeMutableBuilder[Self <: org.scalajs.dom.raw.IDBKeyRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludes(value: js.Any => scala.Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLower(value: js.Any): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerOpen(value: scala.Boolean): Self = StObject.set(x, "lowerOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpper(value: js.Any): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperOpen(value: scala.Boolean): Self = StObject.set(x, "upperOpen", value.asInstanceOf[js.Any])
  }
}
