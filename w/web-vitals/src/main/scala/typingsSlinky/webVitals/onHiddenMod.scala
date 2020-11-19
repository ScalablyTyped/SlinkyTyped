package typingsSlinky.webVitals

import typingsSlinky.webVitals.anon.IsUnloading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-vitals/dist/lib/onHidden", JSImport.Namespace)
@js.native
object onHiddenMod extends js.Object {
  
  def onHidden(cb: OnHiddenCallback): Unit = js.native
  def onHidden(cb: OnHiddenCallback, once: Boolean): Unit = js.native
  
  type OnHiddenCallback = js.Function1[/* hasTimeStampIsUnloading */ IsUnloading, Unit]
}
