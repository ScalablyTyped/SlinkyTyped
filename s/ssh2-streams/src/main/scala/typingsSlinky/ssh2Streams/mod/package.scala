package typingsSlinky.ssh2Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.ssh2Streams.mod.PublicKeyAuthMethodData
    - typingsSlinky.ssh2Streams.mod.HostbasedAuthMethodData
  */
  type AuthMethodData = typingsSlinky.ssh2Streams.mod._AuthMethodData | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ssh2Streams.mod.TcpipForwardGlobalRequest
    - typingsSlinky.ssh2Streams.mod.opensshStreamLocalForwardGlobalRequest
    - typingsSlinky.node.Buffer
  */
  type GlobalRequest = typingsSlinky.ssh2Streams.mod._GlobalRequest | typingsSlinky.node.Buffer
  
  type HostKeys = org.scalablytyped.runtime.StringDictionary[typingsSlinky.ssh2Streams.mod.HostKey]
}
