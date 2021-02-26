package typingsSlinky.useSidecar

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.useSidecar.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderPropMod {
  
  @JSImport("use-sidecar/dist/es5/renderProp", "renderCar")
  @js.native
  def renderCar[T /* <: js.Array[_] */, K](WrappedComponent: RenderPropComponent[T, K], defaults: js.Function1[/* props */ K, T]): js.Function1[/* props */ CombinedProps[T, K], ReactElement] = js.native
  @JSImport("use-sidecar/dist/es5/renderProp", "renderCar")
  @js.native
  def renderCar[T /* <: js.Array[_] */, K](
    WrappedComponent: RenderPropComponent[T, K],
    defaults: js.Function1[/* props */ K, T],
    options: Options
  ): js.Function1[/* props */ CombinedProps[T, K], ReactElement] = js.native
  
  type CombinedProps[T /* <: js.Array[_] */, K] = Children[T] with K
  
  @js.native
  trait Options extends StObject {
    
    var pure: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    }
  }
  
  type RenderPropComponent[T /* <: js.Array[_] */, K] = ReactComponentClass[CombinedProps[T, K]]
}
