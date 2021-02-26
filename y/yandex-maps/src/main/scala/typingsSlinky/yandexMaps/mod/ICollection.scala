package typingsSlinky.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollection extends IEventEmitter {
  
  def add(`object`: js.Object): this.type = js.native
  
  def getIterator(): IIterator = js.native
  
  def remove(`object`: js.Object): this.type = js.native
}
object ICollection {
  
  @scala.inline
  def apply(
    add: js.Object => ICollection,
    events: IEventManager[js.Object],
    getIterator: () => IIterator,
    remove: js.Object => ICollection
  ): ICollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), events = events.asInstanceOf[js.Any], getIterator = js.Any.fromFunction0(getIterator), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ICollection]
  }
  
  @scala.inline
  implicit class ICollectionMutableBuilder[Self <: ICollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Object => ICollection): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIterator(value: () => IIterator): Self = StObject.set(x, "getIterator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: js.Object => ICollection): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
