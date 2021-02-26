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
trait Encoding extends StObject {
  
  var encoding: text | fill | stroke | color | shape | x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size = js.native
  
  var order: js.UndefOr[scala.Nothing] = js.native
}
object Encoding {
  
  @scala.inline
  def apply(
    encoding: text | fill | stroke | color | shape | x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size
  ): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(
      value: text | fill | stroke | color | shape | typingsSlinky.vegaLite.vegaLiteStrings.x | y | opacity | fillOpacity | strokeOpacity | strokeWidth | size
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
