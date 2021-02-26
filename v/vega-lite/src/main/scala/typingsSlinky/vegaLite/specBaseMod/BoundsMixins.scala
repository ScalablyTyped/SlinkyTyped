package typingsSlinky.vegaLite.specBaseMod

import typingsSlinky.vegaLite.vegaLiteStrings.flush
import typingsSlinky.vegaLite.vegaLiteStrings.full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundsMixins extends StObject {
  
  /**
    * The bounds calculation method to use for determining the extent of a sub-plot. One of `full` (the default) or `flush`.
    *
    * - If set to `full`, the entire calculated bounds (including axes, title, and legend) will be used.
    * - If set to `flush`, only the specified width and height values for the sub-view will be used. The `flush` setting can be useful when attempting to place sub-plots without axes or legends into a uniform grid structure.
    *
    * __Default value:__ `"full"`
    */
  var bounds: js.UndefOr[full | flush] = js.native
}
object BoundsMixins {
  
  @scala.inline
  def apply(): BoundsMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundsMixins]
  }
  
  @scala.inline
  implicit class BoundsMixinsMutableBuilder[Self <: BoundsMixins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: full | flush): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
  }
}
