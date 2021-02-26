package typingsSlinky.wordpressBlocks.mod

import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.enter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformEnter[T /* <: Record[String, _] */] extends Transform[T] {
  
  var priority: js.UndefOr[Double] = js.native
  
  var regExp: js.RegExp = js.native
  
  def transform(): BlockInstance[Partial[T]] = js.native
  
  var `type`: enter = js.native
}
object TransformEnter {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](regExp: js.RegExp, transform: () => BlockInstance[Partial[T]], `type`: enter): TransformEnter[T] = {
    val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any], transform = js.Any.fromFunction0(transform))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformEnter[T]]
  }
  
  @scala.inline
  implicit class TransformEnterMutableBuilder[Self <: TransformEnter[_], T /* <: Record[String, _] */] (val x: Self with TransformEnter[T]) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setRegExp(value: js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: () => BlockInstance[Partial[T]]): Self = StObject.set(x, "transform", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: enter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
