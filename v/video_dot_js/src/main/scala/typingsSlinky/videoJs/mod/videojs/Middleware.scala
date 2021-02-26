package typingsSlinky.videoJs.mod.videojs

import typingsSlinky.videoJs.mod.videojs.Tech.SourceObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Middleware extends StObject {
  
  /**
    *
    * @param src
    * @param next
    */
  def setSource(
    src: SourceObject,
    next: js.Function2[/* err */ js.Any, /* next */ js.Function1[/* src */ SourceObject, Unit], Unit]
  ): Unit = js.native
}
object Middleware {
  
  @scala.inline
  def apply(
    setSource: (SourceObject, js.Function2[/* err */ js.Any, /* next */ js.Function1[/* src */ SourceObject, Unit], Unit]) => Unit
  ): Middleware = {
    val __obj = js.Dynamic.literal(setSource = js.Any.fromFunction2(setSource))
    __obj.asInstanceOf[Middleware]
  }
  
  @scala.inline
  implicit class MiddlewareMutableBuilder[Self <: Middleware] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetSource(
      value: (SourceObject, js.Function2[/* err */ js.Any, /* next */ js.Function1[/* src */ SourceObject, Unit], Unit]) => Unit
    ): Self = StObject.set(x, "setSource", js.Any.fromFunction2(value))
  }
}
