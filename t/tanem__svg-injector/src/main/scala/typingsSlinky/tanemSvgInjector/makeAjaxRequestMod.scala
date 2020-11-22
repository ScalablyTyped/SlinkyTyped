package typingsSlinky.tanemSvgInjector

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tanem/svg-injector/dist/make-ajax-request", JSImport.Namespace)
@js.native
object makeAjaxRequestMod extends js.Object {
  
  def default(
    url: String,
    callback: js.Function2[/* error */ js.Error | Null, /* httpRequest */ XMLHttpRequest, Unit]
  ): Unit = js.native
}
