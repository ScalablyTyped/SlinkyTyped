package typingsSlinky.twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function3[
    /* error */ js.Any, 
    /* data */ typingsSlinky.twitter.mod.ResponseData, 
    /* response */ typingsSlinky.request.mod.Response, 
    scala.Unit
  ]
  
  type ResponseData = org.scalablytyped.runtime.StringDictionary[js.Any]
}
