package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSMediaKeys extends js.Object {
  val keySystem: java.lang.String = js.native
  def createSession(`type`: java.lang.String, initData: js.typedarray.Uint8Array): MSMediaKeySession = js.native
  def createSession(`type`: java.lang.String, initData: js.typedarray.Uint8Array, cdmData: js.typedarray.Uint8Array): MSMediaKeySession = js.native
}

