package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "data")
@js.native
object data extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze */ @js.native
  class Manager () extends IDataManager {
    def this(data: js.Object) = this()
    
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    
    def fire(`type`: String, eventobject: js.Object): this.type = js.native
    def fire(`type`: String, eventobject: IEvent[js.Object, js.Object]): this.type = js.native
    
    def freeze(): IFreezable = js.native
    
    def getAll(): js.Object = js.native
    
    def getParent(): IEventManager[js.Object] | Null = js.native
    
    def group(): IEventGroup = js.native
    
    def isFrozen(): Boolean = js.native
    
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
    ): this.type = js.native
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    
    def set(path: String): this.type = js.native
    def set(path: String, value: String): this.type = js.native
    def set(path: String, value: js.Object): this.type = js.native
    def set(path: String, value: Double): this.type = js.native
    def set(path: js.Object): this.type = js.native
    def set(path: js.Object, value: String): this.type = js.native
    def set(path: js.Object, value: js.Object): this.type = js.native
    def set(path: js.Object, value: Double): this.type = js.native
    
    def setAll(): this.type = js.native
    
    def setParent(): this.type = js.native
    def setParent(parent: IEventManager[js.Object]): this.type = js.native
    
    def unfreeze(): IFreezable = js.native
    
    def unset(path: String): this.type = js.native
    def unset(path: js.Object): this.type = js.native
    
    def unsetAll(): this.type = js.native
  }
}
