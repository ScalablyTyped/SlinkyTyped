package typingsSlinky.walkdir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type WalkEventListener = js.ThisFunction3[
    /* this */ typingsSlinky.walkdir.mod.WalkEmitter, 
    /* path */ java.lang.String, 
    /* stat */ typingsSlinky.node.fsMod.Stats, 
    /* ignore */ js.Function1[/* path */ java.lang.String | js.Array[java.lang.String], scala.Unit], 
    scala.Unit
  ]
}
