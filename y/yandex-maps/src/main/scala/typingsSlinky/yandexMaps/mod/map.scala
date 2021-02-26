package typingsSlinky.yandexMaps.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.yandexMaps.anon.TrafficImageZIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object map {
  
  @JSImport("yandex-maps", "map.Balloon")
  @js.native
  class Balloon protected ()
    extends IBalloonManager[typingsSlinky.yandexMaps.mod.map.Balloon] {
    def this(map: Map_) = this()
  }
  
  @JSImport("yandex-maps", "map.Container")
  @js.native
  class Container protected () extends IEventEmitter {
    def this(parentElement: String) = this()
    def this(parentElement: HTMLElement) = this()
    
    def enterFullscreen(): Unit = js.native
    
    def exitFullscreen(): Unit = js.native
    
    def fitToViewport(): Unit = js.native
    def fitToViewport(preservePixelPosition: Boolean): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def getOffset(): js.Array[Double] = js.native
    
    def getParentElement(): HTMLElement = js.native
    
    def getSize(): js.Array[Double] = js.native
    
    def isFullscreen(): Boolean = js.native
  }
  
  @JSImport("yandex-maps", "map.Converter")
  @js.native
  class Converter protected () extends StObject {
    def this(map: Map_) = this()
    
    def globalToPage(globalPixelPoint: js.Array[Double]): js.Array[Double] = js.native
    
    def pageToGlobal(pagePixelPoint: js.Array[Double]): js.Array[Double] = js.native
  }
  
  @JSImport("yandex-maps", "map.Copyrights")
  @js.native
  class Copyrights protected () extends StObject {
    def this(map: Map_) = this()
    
    def add(customCopyrights: String): ICopyrightsAccessor = js.native
    def add(customCopyrights: js.Array[String | HTMLElement]): ICopyrightsAccessor = js.native
    def add(customCopyrights: HTMLElement): ICopyrightsAccessor = js.native
    
    def addProvider(provider: ICopyrightsProvider): this.type = js.native
    
    def get(): js.Promise[js.Array[String | HTMLElement]] = js.native
    def get(point: js.UndefOr[scala.Nothing], zoom: Double): js.Promise[js.Array[String | HTMLElement]] = js.native
    def get(point: js.Array[Double]): js.Promise[js.Array[String | HTMLElement]] = js.native
    def get(point: js.Array[Double], zoom: Double): js.Promise[js.Array[String | HTMLElement]] = js.native
    
    def getPromoLink(): String = js.native
    
    def removeProvider(provider: ICopyrightsProvider): this.type = js.native
  }
  
  @JSImport("yandex-maps", "map.GeoObjects")
  @js.native
  class GeoObjects protected () extends IGeoObjectCollection {
    def this(map: Map_) = this()
    def this(map: Map_, options: js.Object) = this()
    
    def add(child: ObjectManager_): this.type = js.native
    def add(child: ObjectManager_, index: Double): this.type = js.native
    
    def remove(child: ObjectManager_): this.type = js.native
  }
  
  @JSImport("yandex-maps", "map.Hint")
  @js.native
  class Hint protected () extends IPopupManager[Hint] {
    def this(map: Map_) = this()
  }
  
  @JSImport("yandex-maps", "map.ZoomRange")
  @js.native
  class ZoomRange protected () extends IEventEmitter {
    def this(map: Map_, constraints: js.Array[Double]) = this()
    
    def get(): js.Promise[js.Array[Double]] = js.native
    def get(coords: js.Array[Double]): js.Promise[js.Array[Double]] = js.native
    
    def getCurrent(): js.Array[Double] = js.native
  }
  
  object action {
    
    @JSImport("yandex-maps", "map.action.Manager")
    @js.native
    class Manager protected () extends IEventEmitter {
      def this(map: Map_) = this()
      
      def breakTick(): Unit = js.native
      
      def execute(action: IMapAction): Unit = js.native
      
      def getCurrentState(): js.Object = js.native
      
      def getMap(): Map_ = js.native
      
      def setCorrection(userFunction: js.Function0[Unit]): Unit = js.native
      
      def stop(): Unit = js.native
    }
  }
  
  object behavior {
    
    @JSImport("yandex-maps", "map.behavior.Manager")
    @js.native
    class Manager protected ()
      extends ICustomizable
         with IParentOnMap {
      def this(map: Map_) = this()
      def this(map: Map_, behaviors: js.Array[js.Array[String] | String]) = this()
      def this(map: Map_, behaviors: js.UndefOr[scala.Nothing], options: js.Object) = this()
      def this(map: Map_, behaviors: js.Array[js.Array[String] | String], options: js.Object) = this()
      
      def disable(behaviors: String): this.type = js.native
      def disable(behaviors: js.Array[js.Array[String] | String]): this.type = js.native
      
      def enable(behaviors: String): this.type = js.native
      def enable(behaviors: js.Array[js.Array[String] | String]): this.type = js.native
      
      def get(behaviorName: String): IBehavior = js.native
      
      def isEnabled(behaviorName: String): Boolean = js.native
    }
  }
  
  object layer {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.yandexMaps.mod.IEventEmitter because Already inherited
    - typingsSlinky.yandexMaps.mod.ICustomizable because Already inherited
    - typingsSlinky.yandexMaps.mod.IChild because var conflicts: events. Inlined getParent, setParent, setParent
    - typingsSlinky.yandexMaps.mod.ILayer because var conflicts: events, options. Inlined getBrightness, getCopyrights, getZoomRange */ @JSImport("yandex-maps", "map.layer.Manager")
    @js.native
    class Manager protected () extends IMapObjectCollection {
      def this(map: Map_) = this()
      def this(map: Map_, options: TrafficImageZIndex) = this()
      
      def each(callback: js.Function1[/* layer */ ILayer, Unit]): Unit = js.native
      def each(callback: js.Function1[/* layer */ ILayer, Unit], context: js.Object): Unit = js.native
      
      def getAll(): js.Array[Collection_[Layer]] = js.native
      
      var getBrightness: js.UndefOr[js.Function0[Double]] = js.native
      
      var getCopyrights: js.UndefOr[
            js.Function2[
              /* coords */ js.Array[Double], 
              /* zoom */ Double, 
              js.Promise[js.Array[String | HTMLElement]]
            ]
          ] = js.native
      
      def getParent(): Null | IControlParent = js.native
      
      var getZoomRange: js.UndefOr[js.Function1[/* point */ js.Array[Double], js.Promise[js.Array[Double]]]] = js.native
      
      def setParent(): this.type = js.native
      def setParent(parent: js.Object): this.type = js.native
      def setParent(parent: IControlParent): this.type = js.native
    }
  }
  
  object margin {
    
    @JSImport("yandex-maps", "map.margin.Accessor")
    @js.native
    class Accessor protected () extends StObject {
      def this(screenArea: js.Object) = this()
      
      def getArea(): js.Object = js.native
      
      def remove(): this.type = js.native
      
      def setArea(screenArea: js.Object): this.type = js.native
    }
    
    @JSImport("yandex-maps", "map.margin.Manager")
    @js.native
    class Manager protected () extends StObject {
      def this(map: Map_) = this()
      
      def addArea(screenArea: js.Object): Accessor = js.native
      
      def destroy(): this.type = js.native
      
      def getMargin(): js.Array[Double] = js.native
      
      def getOffset(): js.Array[Double] = js.native
      
      def setDefaultMargin(margin: js.Array[js.Array[Double] | Double]): Unit = js.native
      def setDefaultMargin(margin: Double): Unit = js.native
    }
  }
  
  object pane {
    
    @JSImport("yandex-maps", "map.pane.Manager")
    @js.native
    class Manager protected () extends StObject {
      def this(map: Map_) = this()
      
      def append(key: String, pane: IPane): Unit = js.native
      
      def destroy(): Unit = js.native
      
      def get(key: String): IPane | Null = js.native
      
      def getLower(): String = js.native
      
      def getUpper(): String = js.native
      
      def insertBefore(key: String, pane: IPane, referenceKey: String): Unit = js.native
      
      def remove(pane: IPane): Unit = js.native
    }
  }
}
