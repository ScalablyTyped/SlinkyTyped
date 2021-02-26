package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.markMod.Compare
import typingsSlinky.vegaTypings.vegaTypingsStrings.collect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectTransform extends _Transforms {
  
  var sort: Compare = js.native
  
  var `type`: collect = js.native
}
object CollectTransform {
  
  @scala.inline
  def apply(sort: Compare, `type`: collect): CollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectTransform]
  }
  
  @scala.inline
  implicit class CollectTransformMutableBuilder[Self <: CollectTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: collect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
