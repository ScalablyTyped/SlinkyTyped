package typingsSlinky.tmp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DirCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* name */ java.lang.String, 
    /* removeCallback */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  
  type FileCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* name */ java.lang.String, 
    /* fd */ scala.Double, 
    /* removeCallback */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  
  type TmpNameCallback = js.Function2[/* err */ js.Error | scala.Null, /* name */ java.lang.String, scala.Unit]
}
