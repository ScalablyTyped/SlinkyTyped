package typingsSlinky.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object clientMod {
  
  type MessageCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* message */ typingsSlinky.stompit.clientMod.Message, 
    scala.Unit
  ]
}
