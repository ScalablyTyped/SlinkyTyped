package typingsSlinky.walk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type WalkNamesEventCallback = js.Function3[
    /* base */ java.lang.String, 
    /* names */ js.Array[java.lang.String], 
    /* next */ typingsSlinky.walk.mod.WalkNext, 
    scala.Unit
  ]
  
  type WalkNext = js.Function0[scala.Unit]
  
  type WalkStatArrayEventCallback = js.Function3[
    /* base */ java.lang.String, 
    /* names */ js.Array[typingsSlinky.walk.mod.WalkStats], 
    /* next */ typingsSlinky.walk.mod.WalkNext, 
    scala.Unit
  ]
  
  type WalkStatEventCallback = js.Function3[
    /* base */ java.lang.String, 
    /* names */ typingsSlinky.walk.mod.WalkStats, 
    /* next */ typingsSlinky.walk.mod.WalkNext, 
    scala.Unit
  ]
}
