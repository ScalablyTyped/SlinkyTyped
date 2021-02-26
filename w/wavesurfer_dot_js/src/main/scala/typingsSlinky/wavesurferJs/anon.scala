package typingsSlinky.wavesurferJs

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.wavesurferJs.mod.WaveRenderer
import typingsSlinky.wavesurferJs.mod.WaveSurfer
import typingsSlinky.wavesurferJs.mod.WaveSurferParams
import typingsSlinky.wavesurferJs.mod.WaveSurferPlugin
import typingsSlinky.wavesurferJs.mod.XHROptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable extends Instantiable2[/* container */ HTMLElement, /* params */ WaveSurferParams, WaveRenderer]
  
  @js.native
  trait InstantiableWaveSurferPlugin
    extends Instantiable2[/* params */ js.Object, /* ws */ WaveSurfer, WaveSurferPlugin]
  
  @js.native
  trait Xhr extends StObject {
    
    var xhr: js.UndefOr[XHROptions] = js.native
  }
  object Xhr {
    
    @scala.inline
    def apply(): Xhr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Xhr]
    }
    
    @scala.inline
    implicit class XhrMutableBuilder[Self <: Xhr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXhr(value: XHROptions): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
}
