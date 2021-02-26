package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequestEventMap extends XMLHttpRequestEventTargetEventMap {
  
  var readystatechange: org.scalajs.dom.raw.Event = js.native
}
object XMLHttpRequestEventMap {
  
  @scala.inline
  def apply(
    abort: org.scalajs.dom.raw.ProgressEvent,
    error: org.scalajs.dom.raw.ProgressEvent,
    load: org.scalajs.dom.raw.ProgressEvent,
    loadend: org.scalajs.dom.raw.ProgressEvent,
    loadstart: org.scalajs.dom.raw.ProgressEvent,
    progress: org.scalajs.dom.raw.ProgressEvent,
    readystatechange: org.scalajs.dom.raw.Event,
    timeout: org.scalajs.dom.raw.ProgressEvent
  ): XMLHttpRequestEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventMap]
  }
  
  @scala.inline
  implicit class XMLHttpRequestEventMapMutableBuilder[Self <: XMLHttpRequestEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadystatechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "readystatechange", value.asInstanceOf[js.Any])
  }
}
