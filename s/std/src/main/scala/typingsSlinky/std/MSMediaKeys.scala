package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSMediaKeys extends js.Object {
  
  def createSession(`type`: java.lang.String, initData: js.typedarray.Uint8Array): MSMediaKeySession = js.native
  def createSession(`type`: java.lang.String, initData: js.typedarray.Uint8Array, cdmData: js.typedarray.Uint8Array): MSMediaKeySession = js.native
  
  val keySystem: java.lang.String = js.native
}
