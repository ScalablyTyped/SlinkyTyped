package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCacheEventMap extends StObject {
  
  var cached: org.scalajs.dom.raw.Event = js.native
  
  var checking: org.scalajs.dom.raw.Event = js.native
  
  var downloading: org.scalajs.dom.raw.Event = js.native
  
  var error: org.scalajs.dom.raw.Event = js.native
  
  var noupdate: org.scalajs.dom.raw.Event = js.native
  
  var obsolete: org.scalajs.dom.raw.Event = js.native
  
  var progress: org.scalajs.dom.raw.ProgressEvent = js.native
  
  var updateready: org.scalajs.dom.raw.Event = js.native
}
object ApplicationCacheEventMap {
  
  @scala.inline
  def apply(
    cached: org.scalajs.dom.raw.Event,
    checking: org.scalajs.dom.raw.Event,
    downloading: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    noupdate: org.scalajs.dom.raw.Event,
    obsolete: org.scalajs.dom.raw.Event,
    progress: org.scalajs.dom.raw.ProgressEvent,
    updateready: org.scalajs.dom.raw.Event
  ): ApplicationCacheEventMap = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], checking = checking.asInstanceOf[js.Any], downloading = downloading.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], noupdate = noupdate.asInstanceOf[js.Any], obsolete = obsolete.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], updateready = updateready.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCacheEventMap]
  }
  
  @scala.inline
  implicit class ApplicationCacheEventMapMutableBuilder[Self <: ApplicationCacheEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCached(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecking(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "checking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloading(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "downloading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoupdate(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "noupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObsolete(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "obsolete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: org.scalajs.dom.raw.ProgressEvent): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateready(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "updateready", value.asInstanceOf[js.Any])
  }
}
