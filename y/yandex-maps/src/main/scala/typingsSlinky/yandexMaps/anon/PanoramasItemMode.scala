package typingsSlinky.yandexMaps.anon

import typingsSlinky.yandexMaps.yandexMapsStrings.ifMercator
import typingsSlinky.yandexMaps.yandexMapsStrings.off
import typingsSlinky.yandexMaps.yandexMapsStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramasItemMode extends StObject {
  
  var panoramasItemMode: on | off | ifMercator = js.native
}
object PanoramasItemMode {
  
  @scala.inline
  def apply(panoramasItemMode: on | off | ifMercator): PanoramasItemMode = {
    val __obj = js.Dynamic.literal(panoramasItemMode = panoramasItemMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramasItemMode]
  }
  
  @scala.inline
  implicit class PanoramasItemModeMutableBuilder[Self <: PanoramasItemMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPanoramasItemMode(value: on | off | ifMercator): Self = StObject.set(x, "panoramasItemMode", value.asInstanceOf[js.Any])
  }
}
