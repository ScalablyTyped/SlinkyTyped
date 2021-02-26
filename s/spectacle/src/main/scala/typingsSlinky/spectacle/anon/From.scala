package typingsSlinky.spectacle.anon

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait From extends StObject {
  
  var from: Record[String, Double | String] = js.native
  
  var to: Record[String, Double | String] = js.native
}
object From {
  
  @scala.inline
  def apply(from: Record[String, Double | String], to: Record[String, Double | String]): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Record[String, Double | String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Record[String, Double | String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
