package typingsSlinky.stormReactDiagrams.baseEntityMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stormReactDiagrams.anon.Id
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/BaseEntity", "BaseEntity")
@js.native
class BaseEntity[T /* <: BaseListener[_] */] () extends js.Object {
  def this(id: String) = this()
  
  def addListener(listener: T): String = js.native
  
  def clearListeners(): Unit = js.native
  
  def clone(lookupTable: StringDictionary[js.Any]): js.Any = js.native
  
  def deSerialize(data: StringDictionary[js.Any], engine: DiagramEngine): Unit = js.native
  
  def doClone(lookupTable: StringDictionary[js.Any], clone: js.Any): Unit = js.native
  
  def getID(): String = js.native
  
  var id: String = js.native
  
  def isLocked(): Boolean = js.native
  
  def iterateListeners(cb: js.Function2[/* t */ T, /* event */ BaseEvent[_], _]): Unit = js.native
  
  var listeners: StringDictionary[T] = js.native
  
  var locked: Boolean = js.native
  
  def removeListener(listener: String): Boolean = js.native
  
  def serialize(): Id = js.native
  
  def setLocked(): Unit = js.native
  def setLocked(locked: Boolean): Unit = js.native
}
