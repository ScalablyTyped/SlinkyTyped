package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSMediaKeySession extends EventTarget {
  
  def close(): Unit = js.native
  
  val error: MSMediaKeyError | Null = js.native
  
  val keySystem: java.lang.String = js.native
  
  val sessionId: java.lang.String = js.native
  
  def update(key: js.typedarray.Uint8Array): Unit = js.native
}
