package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyframeAnimationOptions extends KeyframeEffectOptions {
  
  var id: js.UndefOr[java.lang.String] = js.native
}
object KeyframeAnimationOptions {
  
  @scala.inline
  def apply(): KeyframeAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframeAnimationOptions]
  }
  
  @scala.inline
  implicit class KeyframeAnimationOptionsMutableBuilder[Self <: KeyframeAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
