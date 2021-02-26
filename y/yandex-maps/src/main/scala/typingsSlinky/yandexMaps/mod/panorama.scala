package typingsSlinky.yandexMaps.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.yandexMaps.anon.AutoFitToViewport
import typingsSlinky.yandexMaps.anon.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panorama {
  
  @JSImport("yandex-maps", "panorama.Manager")
  @js.native
  class Manager () extends IEventEmitter {
    
    def closePlayer(): Unit = js.native
    
    def disableLookup(): Unit = js.native
    
    def enableLookup(): Unit = js.native
    
    def getPlayer(): Player = js.native
    
    def isLookupEnabled(): Boolean = js.native
    
    def openPlayer(panorama: js.Array[IPanorama]): js.Promise[Unit] = js.native
    def openPlayer(panorama: Double): js.Promise[Unit] = js.native
  }
  
  @JSImport("yandex-maps", "panorama.Player")
  @js.native
  class Player protected () extends IEventEmitter {
    def this(element: String, panorama: IPanorama) = this()
    def this(element: HTMLElement, panorama: IPanorama) = this()
    def this(element: String, panorama: IPanorama, options: AutoFitToViewport) = this()
    def this(element: HTMLElement, panorama: IPanorama, options: AutoFitToViewport) = this()
    
    def destroy(): Unit = js.native
    
    def fitToViewport(): Unit = js.native
    
    def getDirection(): js.Array[Double] = js.native
    
    def getPanorama(): IPanorama = js.native
    
    def getSpan(): js.Array[Double] = js.native
    
    def lookAt(point: js.Array[Double]): this.type = js.native
    
    def moveTo(point: js.Array[Double]): js.Promise[Unit] = js.native
    def moveTo(point: js.Array[Double], options: Direction): js.Promise[Unit] = js.native
    
    def setDirection(direction: String): this.type = js.native
    def setDirection(direction: js.Array[Double]): this.type = js.native
    
    def setPanorama(panorama: IPanorama): this.type = js.native
    
    def setSpan(span: String): this.type = js.native
    def setSpan(span: js.Array[Double]): this.type = js.native
  }
}
