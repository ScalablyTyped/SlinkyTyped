package typingsSlinky.watsonDeveloperCloud.v3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** Behavior. */
@js.native
trait Behavior extends StObject {
  
  /** The category of the characteristic: `behavior` for temporal data. */
  var category: String = js.native
  
  /** The user-visible, localized name of the characteristic. */
  var name: String = js.native
  
  /** For JSON content that is timestamped, the percentage of timestamped input data that occurred during that day of the week or hour of the day. The range is 0 to 1. */
  var percentage: Double = js.native
  
  /** The unique, non-localized identifier of the characteristic to which the results pertain. IDs have the form `behavior_{value}`. */
  var trait_id: String = js.native
}
object Behavior {
  
  @scala.inline
  def apply(category: String, name: String, percentage: Double, trait_id: String): Behavior = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], trait_id = trait_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behavior]
  }
  
  @scala.inline
  implicit class BehaviorMutableBuilder[Self <: Behavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrait_id(value: String): Self = StObject.set(x, "trait_id", value.asInstanceOf[js.Any])
  }
}
