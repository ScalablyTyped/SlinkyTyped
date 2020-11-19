package typingsSlinky.teenyRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type RequestCallback[T] = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* response */ typingsSlinky.teenyRequest.mod.Response[js.Any], 
    /* body */ js.UndefOr[T], 
    scala.Unit
  ]
}
