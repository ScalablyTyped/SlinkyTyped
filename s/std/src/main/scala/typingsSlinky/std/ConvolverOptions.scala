package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvolverOptions extends AudioNodeOptions {
  
  var buffer: js.UndefOr[org.scalajs.dom.raw.AudioBuffer | Null] = js.native
  
  var disableNormalization: js.UndefOr[scala.Boolean] = js.native
}
object ConvolverOptions {
  
  @scala.inline
  def apply(): ConvolverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvolverOptions]
  }
  
  @scala.inline
  implicit class ConvolverOptionsMutableBuilder[Self <: ConvolverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: org.scalajs.dom.raw.AudioBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferNull: Self = StObject.set(x, "buffer", null)
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setDisableNormalization(value: scala.Boolean): Self = StObject.set(x, "disableNormalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableNormalizationUndefined: Self = StObject.set(x, "disableNormalization", js.undefined)
  }
}
