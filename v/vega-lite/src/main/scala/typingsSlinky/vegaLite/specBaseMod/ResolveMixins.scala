package typingsSlinky.vegaLite.specBaseMod

import typingsSlinky.vegaLite.srcResolveMod.Resolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveMixins extends StObject {
  
  /**
    * Scale, axis, and legend resolutions for view composition specifications.
    */
  var resolve: js.UndefOr[Resolve] = js.native
}
object ResolveMixins {
  
  @scala.inline
  def apply(): ResolveMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveMixins]
  }
  
  @scala.inline
  implicit class ResolveMixinsMutableBuilder[Self <: ResolveMixins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
  }
}
