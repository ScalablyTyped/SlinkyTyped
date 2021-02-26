package typingsSlinky.stripe.anon

import typingsSlinky.node.Buffer
import typingsSlinky.stripe.stripeStrings.`applicationSlashoctet-stream`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var data: String | Buffer = js.native
  
  var name: String = js.native
  
  var `type`: String | `applicationSlashoctet-stream` = js.native
}
object Data {
  
  @scala.inline
  def apply(data: String | Buffer, name: String, `type`: String | `applicationSlashoctet-stream`): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String | `applicationSlashoctet-stream`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
