package typingsSlinky.wxServerSdk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictfieldName
  extends /* fieldName */ StringDictionary[js.Any] {
  
  var _id: js.Any = js.native
}
object DictfieldName {
  
  @scala.inline
  def apply(_id: js.Any): DictfieldName = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictfieldName]
  }
  
  @scala.inline
  implicit class DictfieldNameMutableBuilder[Self <: DictfieldName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_id(value: js.Any): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
