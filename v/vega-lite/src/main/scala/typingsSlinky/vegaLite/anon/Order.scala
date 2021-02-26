package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.vegaLiteStrings.color
import typingsSlinky.vegaLite.vegaLiteStrings.fill
import typingsSlinky.vegaLite.vegaLiteStrings.fillOpacity
import typingsSlinky.vegaLite.vegaLiteStrings.opacity
import typingsSlinky.vegaLite.vegaLiteStrings.shape
import typingsSlinky.vegaLite.vegaLiteStrings.size
import typingsSlinky.vegaLite.vegaLiteStrings.stroke
import typingsSlinky.vegaLite.vegaLiteStrings.strokeOpacity
import typingsSlinky.vegaLite.vegaLiteStrings.strokeWidth
import typingsSlinky.vegaLite.vegaLiteStrings.text
import typingsSlinky.vegaLite.vegaLiteStrings.x
import typingsSlinky.vegaLite.vegaLiteStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order extends StObject {
  
  var encoding: text | fill | stroke | color | shape | x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size = js.native
  
  var order: String = js.native
}
object Order {
  
  @scala.inline
  def apply(
    encoding: text | fill | stroke | color | shape | x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size,
    order: String
  ): Order = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit class OrderMutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(
      value: text | fill | stroke | color | shape | typingsSlinky.vegaLite.vegaLiteStrings.x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
