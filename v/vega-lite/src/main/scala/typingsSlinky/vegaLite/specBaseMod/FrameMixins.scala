package typingsSlinky.vegaLite.specBaseMod

import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameMixins[ES /* <: ExprRef | SignalRef */] extends LayoutSizeMixins {
  
  /**
    * An object defining the view background's fill and stroke.
    *
    * __Default value:__ none (transparent)
    */
  var view: js.UndefOr[ViewBackground[ES]] = js.native
}
object FrameMixins {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): FrameMixins[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameMixins[ES]]
  }
  
  @scala.inline
  implicit class FrameMixinsMutableBuilder[Self <: FrameMixins[_], ES /* <: ExprRef | SignalRef */] (val x: Self with FrameMixins[ES]) extends AnyVal {
    
    @scala.inline
    def setView(value: ViewBackground[ES]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
