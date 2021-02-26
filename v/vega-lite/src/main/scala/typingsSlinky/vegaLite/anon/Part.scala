package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.vegaLiteStrings.axis
import typingsSlinky.vegaLite.vegaLiteStrings.domain
import typingsSlinky.vegaLite.vegaLiteStrings.grid
import typingsSlinky.vegaLite.vegaLiteStrings.labels
import typingsSlinky.vegaLite.vegaLiteStrings.ticks
import typingsSlinky.vegaLite.vegaLiteStrings.title
import typingsSlinky.vegaLite.vegaSchemaMod.VgEncodeChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Part extends StObject {
  
  var part: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain = js.native
  
  var vgProp: VgEncodeChannel = js.native
}
object Part {
  
  @scala.inline
  def apply(
    part: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain,
    vgProp: VgEncodeChannel
  ): Part = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any], vgProp = vgProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
  
  @scala.inline
  implicit class PartMutableBuilder[Self <: Part] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPart(
      value: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain
    ): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVgProp(value: VgEncodeChannel): Self = StObject.set(x, "vgProp", value.asInstanceOf[js.Any])
  }
}
