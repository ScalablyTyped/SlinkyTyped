package typingsSlinky.xhr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type XhrCallback = js.Function3[
    /* error */ js.Error, 
    /* response */ typingsSlinky.xhr.mod.XhrResponse, 
    /* body */ js.Any, 
    scala.Unit
  ]
  
  type XhrHeaders = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
