package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.anon.AddViaPoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object router {
  
  @JSImport("yandex-maps", "router.Editor")
  @js.native
  class Editor () extends ICustomizable {
    
    def start(): Unit = js.native
    def start(options: AddViaPoints): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @JSImport("yandex-maps", "router.Route")
  @js.native
  abstract class Route () extends IGeoObject[IGeometry] {
    
    var editor: Editor = js.native
    
    def getHumanJamsTime(): String = js.native
    
    def getHumanLength(): String = js.native
    
    def getHumanTime(): String = js.native
    
    def getJamsTime(): Double = js.native
    
    def getLength(): Double = js.native
    
    def getPaths(): GeoObjectCollection = js.native
    
    def getTime(): Double = js.native
    
    def getViaPoints(): GeoObjectCollection = js.native
    
    def getWayPoints(): GeoObjectCollection = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
}
