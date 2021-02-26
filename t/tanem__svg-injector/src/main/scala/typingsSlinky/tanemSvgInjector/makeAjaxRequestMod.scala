package typingsSlinky.tanemSvgInjector

import org.scalajs.dom.raw.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeAjaxRequestMod {
  
  @JSImport("@tanem/svg-injector/dist/make-ajax-request", JSImport.Default)
  @js.native
  def default(
    url: String,
    callback: js.Function2[/* error */ js.Error | Null, /* httpRequest */ XMLHttpRequest, Unit]
  ): Unit = js.native
}
