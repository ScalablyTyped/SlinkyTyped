package typingsSlinky.scrollBehavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ScrollPosition = js.Tuple2[scala.Double, scala.Double]
  
  type ScrollTarget = js.UndefOr[
    typingsSlinky.scrollBehavior.mod.ScrollPosition | java.lang.String | scala.Boolean | scala.Null
  ]
  
  type ShouldUpdateScroll[TContext] = js.Function2[
    /* prevContext */ TContext | scala.Null, 
    /* context */ TContext, 
    typingsSlinky.scrollBehavior.mod.ScrollTarget
  ]
  
  type TransitionHook = js.Function0[scala.Unit]
}
