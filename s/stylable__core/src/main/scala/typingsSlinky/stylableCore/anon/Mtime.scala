package typingsSlinky.stylableCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mtime extends StObject {
  
  var mtime: js.Date = js.native
}
object Mtime {
  
  @scala.inline
  def apply(mtime: js.Date): Mtime = {
    val __obj = js.Dynamic.literal(mtime = mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mtime]
  }
  
  @scala.inline
  implicit class MtimeMutableBuilder[Self <: Mtime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
  }
}
