package typingsSlinky.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flags extends StObject {
  
  var flags: Autokeep = js.native
  
  var id: Double = js.native
  
  var name: java.lang.String = js.native
  
  var raw: String = js.native
  
  var thresh: Double = js.native
  
  var value: Double = js.native
  
  var when_failed: java.lang.String = js.native
  
  var worst: Double = js.native
}
object Flags {
  
  @scala.inline
  def apply(
    flags: Autokeep,
    id: Double,
    name: java.lang.String,
    raw: String,
    thresh: Double,
    value: Double,
    when_failed: java.lang.String,
    worst: Double
  ): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], thresh = thresh.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], when_failed = when_failed.asInstanceOf[js.Any], worst = worst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  
  @scala.inline
  implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: Autokeep): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresh(value: Double): Self = StObject.set(x, "thresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhen_failed(value: java.lang.String): Self = StObject.set(x, "when_failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorst(value: Double): Self = StObject.set(x, "worst", value.asInstanceOf[js.Any])
  }
}
