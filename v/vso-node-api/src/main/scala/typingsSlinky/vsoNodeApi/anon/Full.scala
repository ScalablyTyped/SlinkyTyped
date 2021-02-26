package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Full extends StObject {
  
  var full: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var oneLevel: scala.Double = js.native
  
  var oneLevelPlusNestedEmptyFolders: scala.Double = js.native
}
object Full {
  
  @scala.inline
  def apply(
    full: scala.Double,
    none: scala.Double,
    oneLevel: scala.Double,
    oneLevelPlusNestedEmptyFolders: scala.Double
  ): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], oneLevel = oneLevel.asInstanceOf[js.Any], oneLevelPlusNestedEmptyFolders = oneLevelPlusNestedEmptyFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  
  @scala.inline
  implicit class FullMutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: scala.Double): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneLevel(value: scala.Double): Self = StObject.set(x, "oneLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneLevelPlusNestedEmptyFolders(value: scala.Double): Self = StObject.set(x, "oneLevelPlusNestedEmptyFolders", value.asInstanceOf[js.Any])
  }
}
