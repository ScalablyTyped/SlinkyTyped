package typingsSlinky.wouter.anon

import typingsSlinky.wouter.useLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HrefTo extends StObject {
  
  var href: js.UndefOr[scala.Nothing] = js.native
  
  var to: Path = js.native
}
object HrefTo {
  
  @scala.inline
  def apply(to: Path): HrefTo = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[HrefTo]
  }
  
  @scala.inline
  implicit class HrefToMutableBuilder[Self <: HrefTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTo(value: Path): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
