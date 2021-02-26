package typingsSlinky.sigmajs.SigmaJs

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGObject[T] extends StObject {
  
  def create(`object`: T, a: js.Any*): Element = js.native
  
  def update(`object`: T, a: js.Any*): Unit = js.native
}
object SVGObject {
  
  @scala.inline
  def apply[T](create: (T, /* repeated */ js.Any) => Element, update: (T, /* repeated */ js.Any) => Unit): SVGObject[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[SVGObject[T]]
  }
  
  @scala.inline
  implicit class SVGObjectMutableBuilder[Self <: SVGObject[_], T] (val x: Self with SVGObject[T]) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (T, /* repeated */ js.Any) => Element): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: (T, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
