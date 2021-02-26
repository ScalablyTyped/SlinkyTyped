package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.markMod._Clip
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sphere extends _Clip {
  
  var sphere: String | SignalRef = js.native
}
object Sphere {
  
  @scala.inline
  def apply(sphere: String | SignalRef): Sphere = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sphere]
  }
  
  @scala.inline
  implicit class SphereMutableBuilder[Self <: Sphere] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSphere(value: String | SignalRef): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
  }
}
