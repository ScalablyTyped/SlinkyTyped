package typingsSlinky.sockjsClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CLOSED = typingsSlinky.sockjsClient.sockjsClientNumbers.`3`
  
  type CLOSING = typingsSlinky.sockjsClient.sockjsClientNumbers.`2`
  
  type CONNECTING = typingsSlinky.sockjsClient.sockjsClientNumbers.`0`
  
  type OPEN = typingsSlinky.sockjsClient.sockjsClientNumbers.`1`
  
  type OpenEvent = typingsSlinky.sockjsClient.mod.BaseEvent
  
  type SessionGenerator = js.Function0[java.lang.String]
  
  type State = typingsSlinky.sockjsClient.mod.CONNECTING | typingsSlinky.sockjsClient.mod.OPEN | typingsSlinky.sockjsClient.mod.CLOSING | typingsSlinky.sockjsClient.mod.CLOSED
}
