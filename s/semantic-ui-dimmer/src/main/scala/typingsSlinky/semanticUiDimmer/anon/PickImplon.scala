package typingsSlinky.semanticUiDimmer.anon

import typingsSlinky.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.click
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'on'> */
@js.native
trait PickImplon extends js.Object {
  
  var on: `false` | hover | click = js.native
}
object PickImplon {
  
  @scala.inline
  def apply(on: `false` | hover | click): PickImplon = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplon]
  }
  
  @scala.inline
  implicit class PickImplonOps[Self <: PickImplon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOn(value: `false` | hover | click): Self = this.set("on", value.asInstanceOf[js.Any])
  }
}
