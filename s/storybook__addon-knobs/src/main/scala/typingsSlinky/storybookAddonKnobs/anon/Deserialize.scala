package typingsSlinky.storybookAddonKnobs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deserialize extends StObject {
  
  def deserialize(v: js.Any): js.Any = js.native
  
  def serialize(v: js.Any): js.Any = js.native
}
object Deserialize {
  
  @scala.inline
  def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): Deserialize = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[Deserialize]
  }
  
  @scala.inline
  implicit class DeserializeMutableBuilder[Self <: Deserialize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeserialize(value: js.Any => js.Any): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerialize(value: js.Any => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
