package typingsSlinky.weixinApp.anon

import typingsSlinky.weixinApp.weixinAppNumbers.`-90`
import typingsSlinky.weixinApp.weixinAppNumbers.`90`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direction extends StObject {
  
  var direction: typingsSlinky.weixinApp.weixinAppNumbers.`0` | `90` | `-90` = js.native
}
object Direction {
  
  @scala.inline
  def apply(direction: typingsSlinky.weixinApp.weixinAppNumbers.`0` | `90` | `-90`): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: typingsSlinky.weixinApp.weixinAppNumbers.`0` | `90` | `-90`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
