package typingsSlinky.thenRequest

import typingsSlinky.httpBasic.httpVerbMod.HttpVerb
import typingsSlinky.thenRequest.optionsMod.Options
import typingsSlinky.thenRequest.responsePromiseMod.ResponsePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestFnMod {
  
  type RequestFn = js.Function3[
    /* method */ HttpVerb, 
    /* url */ String, 
    /* options */ js.UndefOr[Options], 
    ResponsePromise
  ]
}
