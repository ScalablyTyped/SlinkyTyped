package typingsSlinky.socketioJwtAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type verifyFunc = js.Function2[
    /* payload */ js.Any, 
    /* done */ js.Function3[
      /* err */ js.UndefOr[js.Error | scala.Null], 
      /* user */ js.UndefOr[js.Any], 
      /* message */ js.UndefOr[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
