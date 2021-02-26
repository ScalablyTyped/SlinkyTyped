package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.vegaLiteStrings.`type`
import typingsSlinky.vegaLite.vegaLiteStrings.scale
import typingsSlinky.vegaLite.vegaLiteStrings.translate
import typingsSlinky.vegaTypings.projectionMod.BaseProjection
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionMod {
  
  @JSImport("vega-lite/build/src/projection", "PROJECTION_PROPERTIES")
  @js.native
  val PROJECTION_PROPERTIES: js.Array[`type` | scale | translate] = js.native
  
  @js.native
  trait Projection extends BaseProjection {
    
    /**
      * The projection’s translation offset as a two-element array `[tx, ty]`.
      */
    @JSName("translate")
    var translate_Projection: js.UndefOr[Vector2[Double] | SignalRef] = js.native
  }
  object Projection {
    
    @scala.inline
    def apply(): Projection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTranslate(value: Vector2[Double] | SignalRef): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    }
  }
  
  type ProjectionConfig = Projection
}
