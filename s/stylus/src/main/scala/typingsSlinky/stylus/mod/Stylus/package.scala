package typingsSlinky.stylus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Stylus {
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Middleware = js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* repeated */ js.Any, js.Any], 
    scala.Unit
  ]
  
  type RenderCallback = js.Function3[/* err */ js.Error, /* css */ java.lang.String, /* js */ java.lang.String, scala.Unit]
}
