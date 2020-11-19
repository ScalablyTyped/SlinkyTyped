package typingsSlinky.zdog

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
}
