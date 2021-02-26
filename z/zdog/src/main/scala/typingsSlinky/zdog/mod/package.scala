package typingsSlinky.zdog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DragEndListener = js.ThisFunction0[/* this */ typingsSlinky.zdog.mod.Dragger, scala.Unit]
  
  type DragMoveListener = js.ThisFunction3[
    /* this */ typingsSlinky.zdog.mod.Dragger, 
    /* pointer */ typingsSlinky.zdog.mod.PointerPosition, 
    /* moveX */ scala.Double, 
    /* moveY */ scala.Double, 
    scala.Unit
  ]
  
  type DragStartListener = js.ThisFunction1[
    /* this */ typingsSlinky.zdog.mod.Dragger, 
    /* pointer */ typingsSlinky.zdog.mod.PointerPosition, 
    scala.Unit
  ]
  
  type PrerenderListener = js.ThisFunction1[
    /* this */ typingsSlinky.zdog.mod.Illustration, 
    /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D | org.scalajs.dom.raw.SVGSVGElement, 
    scala.Unit
  ]
  
  type ResizeListener = js.ThisFunction2[
    /* this */ typingsSlinky.zdog.mod.Illustration, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ]
  
  @scala.inline
  def TAU: scala.Double = typingsSlinky.zdog.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TAU").asInstanceOf[scala.Double]
  
  @scala.inline
  def easeInOut(alpha: scala.Double): scala.Double = typingsSlinky.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(alpha.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  @scala.inline
  def easeInOut(alpha: scala.Double, power: scala.Double): scala.Double = (typingsSlinky.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(alpha.asInstanceOf[js.Any], power.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def extend[T](a: T): T = typingsSlinky.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def extend[T](a: T, b: T): T = (typingsSlinky.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def lerp(a: scala.Double, b: scala.Double, alpha: scala.Double): scala.Double = (typingsSlinky.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def modulo(a: scala.Double, b: scala.Double): scala.Double = (typingsSlinky.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
}
