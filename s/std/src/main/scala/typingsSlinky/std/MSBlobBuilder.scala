package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSBlobBuilder extends js.Object {
  
  def append(data: js.Any): Unit = js.native
  def append(data: js.Any, endings: java.lang.String): Unit = js.native
  
  def getBlob(): org.scalajs.dom.raw.Blob = js.native
  def getBlob(contentType: java.lang.String): org.scalajs.dom.raw.Blob = js.native
}
