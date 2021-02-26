package typingsSlinky.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Merge extends StObject {
  
  var key: String = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  var merge: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[scala.Nothing] = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  var params: js.UndefOr[js.Object] = js.native
}
object Merge {
  
  @scala.inline
  def apply(key: String): Merge = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Merge]
  }
  
  @scala.inline
  implicit class MergeMutableBuilder[Self <: Merge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
